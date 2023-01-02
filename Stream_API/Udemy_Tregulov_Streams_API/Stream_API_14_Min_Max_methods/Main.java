package Stream_API.Udemy_Tregulov_Streams_API.Stream_API_14_Min_Max_methods;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Tony", 'm', 22, 3, 8.4);
        Student st2 = new Student("Anna", 'f', 23, 5, 9.7);
        Student st3 = new Student("Denny", 'm', 21, 2, 7.3);
        Student st4 = new Student("Olga", 'f', 22, 3, 7.4);
        Student st5 = new Student("Kate", 'f', 24, 4, 6.9);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);
        System.out.println("--------------------");

        // Min - Max methods;
        Student min = students.stream().min((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println("Min age of list: " + min);

        Student max = students.stream().max((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println("Max age of list: " + max);
    }
}
