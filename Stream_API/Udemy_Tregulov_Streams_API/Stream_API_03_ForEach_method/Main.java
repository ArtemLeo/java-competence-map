package Stream_API.Udemy_Tregulov_Streams_API.Stream_API_03_ForEach_method;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};

        // forEach method;
        Arrays.stream(array).forEach(element -> {
            element *= 2;
            System.out.println(element);
        });
        System.out.println("-----------------------------------");

        Arrays.stream(array).forEach(element -> System.out.println(element));
        System.out.println("-----------------------------------");

        // or short version;
        Arrays.stream(array).forEach(System.out::println);
        System.out.println("-----------------------------------");

        // Reference to the method;
        Arrays.stream(array).forEach(Utils::myMethod);
        System.out.println("-----------------------------------");
        // or
        Arrays.stream(array).forEach(e -> Utils.myMethod(e));
    }
}

class Utils {
    public static void myMethod(int a) {
        a = a + 5;
        System.out.println("Element = " + a);
    }
}
