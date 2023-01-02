package Stream_API.Udemy_Tregulov_Streams_API.Stream_API_02_Filter_method;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.4);
        Student st2 = new Student("Artem", 'm', 24, 5, 9.7);
        Student st3 = new Student("Anna", 'f', 21, 2, 7.3);
        Student st4 = new Student("Tom", 'm', 22, 3, 7.4);
        Student st5 = new Student("Zoe", 'f', 23, 4, 6.9);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);
        System.out.println("------------------------------------------");


        // Filter method;
        students = students.stream().filter(element ->
                element.getAge() > 22 && element.getAvgGrade() < 7.2).collect(Collectors.toList());
        System.out.println(students);
        System.out.println("------------------------------------------");

        // Create new Stream;
        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
        List<Student> myList = myStream.filter(element -> element.getAge() > 22 && element.getAvgGrade() < 7.2).collect(Collectors.toList());
        System.out.println(myList);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}
