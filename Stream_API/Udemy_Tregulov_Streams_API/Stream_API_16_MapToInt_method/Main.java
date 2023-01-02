package Stream_API.Udemy_Tregulov_Streams_API.Stream_API_16_MapToInt_method;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Ann", 'f', 22, 3, 8.4);
        Student st2 = new Student("Tony", 'm', 24, 5, 9.7);
        Student st3 = new Student("Denny", 'm', 21, 2, 7.3);
        Student st4 = new Student("Alex", 'm', 22, 3, 7.4);
        Student st5 = new Student("TJ", 'm', 23, 4, 6.9);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);
        System.out.println("------------------------------");

        // mapToInt + boxed();
        List<Integer> courses = students.stream()
                .mapToInt(e -> e.getCourse())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(courses);
        System.out.println("------------------------------");

        // mapToDouble + boxed();
        List<Double> courses1 = students.stream()
                .mapToDouble(e -> e.getAvgGrade())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(courses1);
        System.out.println("------------------------------");

        // MapToInt has it`s methods:
        // sum;
        int sum = students.stream().mapToInt(element-> element.getCourse()).sum();
        System.out.println(sum);
        System.out.println("------------------------------");

        // average;
        double average = students.stream().mapToDouble(element-> element.getCourse()).average().getAsDouble();
        System.out.println(average);
        System.out.println("------------------------------");

        // min;
        int min = students.stream().mapToInt(element-> element.getCourse()).min().getAsInt();
        System.out.println(min);
        System.out.println("------------------------------");

        // max;
        int max = students.stream().mapToInt(element-> element.getCourse()).max().getAsInt();
        System.out.println(max);
    }
}
