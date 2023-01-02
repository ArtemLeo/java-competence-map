package Stream_API.Udemy_Sumin_Stream_API.Stream_API_02_Stream_Intro_Methods_Map_Filter_Collect;

import Stream_API.Udemy_Sumin_Stream_API.Stream_API_01_Lambda_expression_Predicate_interface.Predicate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Interface Predicate and lambda expression;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 1000));
        }
        List<Integer> filtered = filter(numbers, element -> element > 0);
        List<String> mapped = map(filtered);
        for (String i : mapped) {
            System.out.println(i);
        }
        System.out.println("--------------------------------");

        // Stream API;
        List<String> list = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map((integer -> "Number: " + integer))
                .filter((string) -> string.endsWith("0"))
                .map((string) -> string + "!")
                .toList();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------------------------------");

        // Task;
        List<Integer> listNumbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listNumbers.add((int) (Math.random() * 100 + 100));
        }
        List<String> result = listNumbers.stream()
                .filter((n -> n % 2 == 0 && n % 5 == 0))
                .map((Math::sqrt))
                .map((sqrt) -> "Sqrt: " + sqrt)
                // or by the static method = .map(Main::mapToString)
                .toList();
        for (String s : result) {
            System.out.println(s);
        }
    }

    // .map((sqrt) -> "Sqrt: " + sqrt)
    private static String mapToString(double a) {
        return "Sqrt: " + a;
    }

    private static List<String> map(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        for (int number : numbers) {
            result.add("Number: " + number);
        }
        return result;
    }

    private static List<Integer> filter(List<Integer> list, Predicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (predicate.test(i)) {
                result.add(i);
            }
        }
        return result;
    }
}