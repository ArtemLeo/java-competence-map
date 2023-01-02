package Stream_API.Udemy_Tregulov_Streams_API.Stream_API_05_Sorted_method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Array sorting and method "Sorted";
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("-----------------------------");

        Student st1 = new Student("Tom", 'm', 22, 3, 8.4);
        Student st2 = new Student("Anna", 'm', 24, 5, 9.7);
        Student st3 = new Student("Artem", 'f', 21, 2, 7.3);
        Student st4 = new Student("Zoe", 'm', 22, 3, 7.4);
        Student st5 = new Student("Den", 'f', 23, 4, 6.9);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);
        System.out.println("-----------------------------");

        // List sorting;
        // Sorting by Name, with method compareTo;
        students = students.stream().sorted((a, b) ->
                a.getName().compareTo(b.getName())).collect(Collectors.toList());
        System.out.println(students);
    }
}
