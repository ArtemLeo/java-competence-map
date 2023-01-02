package Stream_API.Udemy_Tregulov_Streams_API.Stream_API_06_Chaining_method;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        Student st1 = new Student("Tom", 'm', 22, 3, 8.4);
        Student st2 = new Student("Elena", 'f', 24, 5, 9.7);
        Student st3 = new Student("Artem", 'm', 21, 2, 7.3);
        Student st4 = new Student("Olga", 'f', 22, 3, 7.4);
        Student st5 = new Student("Den", 'm', 23, 4, 6.9);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);
        System.out.println("--------------------------");

        students.stream().map(element ->
                {
                    element.setName(element.getName().toUpperCase());
                    return element;
                })
                .filter(element -> element.getSex() == 'f')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .forEach(element -> System.out.println(element));
    }
}