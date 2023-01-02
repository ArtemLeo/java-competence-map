package Lambda_expressions.Udemy_Tregulov_Lambda_expressions.Lambda_expressions_02_Predicate_Interface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Zoe", 'f', 21, 2, 9.8);
        Student st3 = new Student("Tom", 'm', 23, 4, 7.2);
        Student st4 = new Student("Den", 'm', 21, 2, 8.1);
        Student st5 = new Student("Anna", 'f', 23, 4, 8.9);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);

        Student_Info info = new Student_Info();

        // Sorting with the Predicate interface;
        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
        Predicate<Student> p2 = student -> student.sex == 'm';
        System.out.println("--------------------------");

        // method "and" = combining two checks into one;
        info.testStudent(students, p1.and(p2));
        System.out.println("--------------------------");
        // method "or" = matching one of the checks;
        info.testStudent(students, p1.or(p2));
        System.out.println("--------------------------");
        // method "negate" = negation of the current check;
        info.testStudent(students, p1.negate());
        System.out.println("--------------------------");

    }
}

