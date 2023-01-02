package Stream_API.Udemy_Sumin_Stream_API.Stream_API_01_Lambda_expression_Predicate_interface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Thread takes a functional interface and implements it`s method;
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is the long variant");
                System.out.println("------------------------");
            }
        }).start();

        // Thread with lambda expression;
        new Thread(() -> System.out.println("This is the short variant\n")).start();

        // Example: Director - Worker;
        Director director = new Director();
        director.force(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Working...");
            }
            System.out.println("Finished!");
        });
        System.out.println("------------------------");

        // Interface Predicate and lambda expression;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 1000));
        }
        List<Integer> filtered = filter(numbers, element -> element % 2 == 0);
        for (int i : filtered) {
            System.out.println(i);
        }
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
