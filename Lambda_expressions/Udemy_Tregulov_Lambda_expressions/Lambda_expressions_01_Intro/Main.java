package Lambda_expressions.Udemy_Tregulov_Lambda_expressions.Lambda_expressions_01_Intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Anna", 'f', 23, 3, 8.3);
        Student st2 = new Student("Den", 'm', 22, 2, 9.4);
        Student st3 = new Student("Zoe", 'f', 24, 4, 7.6);
        Student st4 = new Student("Artem", 'm', 21, 1, 9.1);
        Student st5 = new Student("Ted", 'm', 23, 3, 9.2);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);


        Student_Info info = new Student_Info();
        // Using methods;
        info.printStudentOverGrade(students, 8);
        System.out.println("------------------------------");
        info.printStudentUnderAge(students, 23);
        System.out.println("------------------------------");
        info.printStudentMixCondition(students, 20, 7, 'm');
        System.out.println("------------------------------");

        // Create a separate class that implements the interface;
        info.testStudents(students, new CheckOverGrade());
        System.out.println("------------------------------");

        // Anonymous class;
        info.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age < 30;
            }
        });
        System.out.println("------------------------------");

        // Lambda expressions;
        info.testStudents(students, (Student s) -> {
            return s.age < 30;
        });
        System.out.println("------------------------------");
        info.testStudents(students, (Student s) -> {
            return s.avgGrade > 8;
        });
        System.out.println("------------------------------");
        info.testStudents(students, (Student s) -> {
            return s.age > 20 && s.avgGrade < 9.3 && s.sex == 'f';
        });
        System.out.println("------------------------------");


        // Lambda (long);
        info.testStudents(students, (Student s) -> {
            return s.avgGrade > 8;
        });
        System.out.println("------------------------------");

        // Lambda (short);
        info.testStudents(students, s -> s.avgGrade > 8);
        System.out.println("------------------------------");

        // Присваивание переменной значение лямбда-выражения;
        StudentChecks sc = (Student s) -> {
            return s.avgGrade > 8;
        };
        info.testStudents(students, sc);
        System.out.println("------------------------------");


        // Sorting using an anonymous class;
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.course - s2.course;
            }
        });
        System.out.println(students);
        System.out.println("------------------------------");

        // Sorting with lambda expression;
        Collections.sort(students, (stud1, stud2) -> stud1.course - stud2.course);
        System.out.println(students);
        System.out.println("------------------------------");
    }
}
