package Stream_API.Udemy_Tregulov_Streams_API.Stream_API_15_Limit_Skip_methods;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Tom", 'm', 22, 3, 8.4);
        Student st2 = new Student("Alina", 'f', 23, 5, 9.7);
        Student st3 = new Student("Den", 'm', 20, 1, 7.3);
        Student st4 = new Student("Oksana", 'f', 22, 3, 7.4);
        Student st5 = new Student("Kristina", 'f', 24, 4, 6.9);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);
        System.out.println("------------------------------");

        // Oll students > 21-year-old;
        students.stream().filter(e -> e.getAge() > 21).forEach(System.out::println);
        System.out.println("------------------------------");

        // Limit 2 students > 21-year-old;
        students.stream().filter(e -> e.getAge() > 21).limit(2).forEach(System.out::println);
        System.out.println("------------------------------");

        // Skip 2 students > 21-year-old;
        students.stream().filter(e -> e.getAge() > 21).skip(2).forEach(System.out::println);
    }
}
