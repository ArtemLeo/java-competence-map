package Collection.Udemy_Tregulov_Collections.Collection_02_ArrayList_Methods.Methods_02_Remove_duplicate_withEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Tom", 'm', 22, 3, 8.3);
        Student st2 = new Student("Elena", 'f', 18, 2, 6.6);
        Student st3 = new Student("Anna", 'f', 20, 1, 7.9);
        Student st4 = new Student("Den", 'm', 24, 5, 9.1);
        Student st5 = new Student("Yana", 'f', 21, 4, 7.2);

        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        System.out.println(studentList);
        System.out.println("------------------------------------");

        // Removing duplicate objects by comparing the method @Override equals() st5 == st6;
        Student st6 = new Student("Yana", 'f', 21, 4, 7.2);
        studentList.remove(st6);
        System.out.println(studentList);
        System.out.println("------------------------------------");

        // Search and output the element by its index with equals();
        Student st7 = new Student("Den", 'm', 24, 5, 9.1);
        int index = studentList.indexOf(st7);
        System.out.println(index);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                age == student.age &&
                course == student.course &&
                Double.compare(student.avgGrade, avgGrade) == 0 &&
                Objects.equals(name, student.name);
    }
}
