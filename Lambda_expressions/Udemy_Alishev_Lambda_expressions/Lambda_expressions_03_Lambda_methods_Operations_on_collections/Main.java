package Lambda_expressions.Udemy_Alishev_Lambda_expressions.Lambda_expressions_03_Lambda_methods_Operations_on_collections;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        List<Integer> list = new ArrayList<>();

        fillArray(array);
        fillList(list);
        System.out.println("---------------------------");

        // Without lambda expression (*2);
        for (int i = 0; i < 10; i++) {
            array[i] = array[i] * 2;
            list.set(i, list.get(i) * 2);
        }
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("List = " + list);
        System.out.println("---------------------------");

        // With lambda expression (*2);
        // Method "map";
        array = Arrays.stream(array).map(operand -> operand * 2).toArray();
        list = list.stream().map(operand -> operand * 2).collect(Collectors.toList());
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("List = " + list);
        System.out.println("---------------------------");

        // Replace all elements by 3;
        array = Arrays.stream(array).map(operand -> 3).toArray();
        array = Arrays.stream(array).map(operand -> operand + 1).toArray();
        list = list.stream().map(operand -> 3).collect(Collectors.toList());
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("List = " + list);
        System.out.println("---------------------------");

        // Method "filter";
        int[] array1 = new int[10];
        List<Integer> list1 = new ArrayList<>();
        fillArray(array1);
        fillList(list1);

        // Leave only even numbers;
        array1 = Arrays.stream(array1).filter(operand -> operand % 2 == 0).toArray();
        list1 = list1.stream().filter(operand -> operand % 2 == 0).collect(Collectors.toList());
        System.out.println("Array = " + Arrays.toString(array1));
        System.out.println("List = " + list1);
        System.out.println("---------------------------");

        // Method "forEach";
        Arrays.stream(array1).forEach(a -> System.out.println(a));
        list1.stream().forEach(a -> System.out.println(a));
        System.out.println("---------------------------");

        // Method "reduce";
        int[] array2 = new int[10];
        List<Integer> list2 = new ArrayList<>();
        fillArray(array2);
        fillList(list2);
        System.out.println("---------------------------");

        int sumArray = Arrays.stream(array2).reduce((count, i) -> count + i).getAsInt();
        int sumList = list.stream().reduce((count, i) -> count * i).get();
        System.out.println("Array = " + sumArray);
        System.out.println("List = " + sumList);
        System.out.println("---------------------------");

        // Calling methods one by one;
        int[] array3 = new int[10];
        fillArray(array3);

        array3 = Arrays.stream(array3).filter(a -> a % 2 != 0).map(a -> a * 2).toArray();
        System.out.println(Arrays.toString(array3));
        System.out.println("---------------------------");

        // Calling methods on other collections (Set);
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(5);
        System.out.println("Before method \"map\" " + set);
        set = set.stream().map(a -> a * 3).collect(Collectors.toSet());
        System.out.println("After method \"map\" " + set);

    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
        System.out.println("Array = " + Arrays.toString(array));
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
        System.out.println("List = " + list);
    }
}
