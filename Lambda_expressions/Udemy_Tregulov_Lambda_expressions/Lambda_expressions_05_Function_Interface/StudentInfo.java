package Lambda_expressions.Udemy_Tregulov_Lambda_expressions.Lambda_expressions_05_Function_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {
    void testStudent(ArrayList<Student> arrayList, Predicate<Student> predicate) {
        for (Student s : arrayList) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Ilona", 'm', 22, 3, 8.3);
        Student st2 = new Student("Tom", 'f', 21, 2, 9.8);
        Student st3 = new Student("Den", 'm', 23, 4, 7.2);
        Student st4 = new Student("Anna", 'm', 21, 2, 8.1);
        Student st5 = new Student("Ilya", 'f', 23, 4, 8.9);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);
        System.out.println("------------------------------------");

        // Lambda expression using interface Function;
        Function<Student, Double> function = student -> student.avgGrade;

        // Method apply() - Arithmetic mean of all students' grades;
        double resultAvgGrade = avgSomething(students, student -> student.avgGrade);
        System.out.println(resultAvgGrade);
        System.out.println("------------------------------------");

        // Arithmetic mean of the course of all students;
        double resultCourse = avgSomething(students, student -> (double) student.course);
        System.out.println(resultCourse);
        System.out.println("------------------------------------");

        // Arithmetic mean of the ages of all students;
        double resultAge = avgSomething(students, student -> (double) student.age);
        System.out.println(resultAge);
        System.out.println("------------------------------------");
    }

    private static double avgSomething(List<Student> list, Function<Student, Double> function) {
        double result = 0;
        for (Student st : list) {
            result += function.apply(st);
        }
        result = result / list.size();
        return result;
    }
}
