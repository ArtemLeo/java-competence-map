package Collection.Udemy_Tregulov_Collections.Collection_13_HashTable;

import java.util.Hashtable;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        // HashTable - ключ и значение НЕ могут быть null;
        Hashtable<Double, Student> hashtable = new Hashtable<>();
        Student st1 = new Student("Tom", "Tom`s surname", 2);
        Student st2 = new Student("Anna", "Anna`s surname", 4);
        Student st3 = new Student("Zack", "Zack`s surname", 1);
        hashtable.put(7.6, st1);
        hashtable.put(8.7, st2);
        hashtable.put(7.0, st3);
        System.out.println(hashtable);

    }
}

final class Student implements Comparable<Student> {
    private final String name;
    private final String surname;
    private final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
