package Collection.Udemy_Tregulov_Collections.Collection_11_TreeMap;

import java.util.Objects;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Artem", "Artem`s surname", 3);
        Student st2 = new Student("Tom", "Tom`s surname", 2);
        Student st3 = new Student("Anna", "Anna`s surname", 4);
        Student st4 = new Student("Zack", "Zack`s surname", 1);
        Student st5 = new Student("Ben", "Ben`s surname", 2);
        Student st6 = new Student("Elena", "Elena`s surname", 3);
        Student st7 = new Student("Igor", "Igor`s surname", 4);
        treeMap.put(9.1, st1);
        treeMap.put(7.6, st7);
        treeMap.put(8.7, st5);
        treeMap.put(7.1, st4);
        treeMap.put(7.9, st2);
        treeMap.put(9.0, st6);
        treeMap.put(8.1, st3);
        System.out.println("TreeMap = " + treeMap);
        System.out.println("----------------------------------");

        // Class Student must implements interface Comparable;
        // Класс, который находится на месте KEY в TreeMap, должен имплементировать интерфейс Comparable;
        TreeMap<Student, Double> treeMap1 = new TreeMap<>();
        treeMap1.put(st1, 9.1);
        treeMap1.put(st7, 7.6);
        treeMap1.put(st2, 8.7);
        treeMap1.put(st4, 7.0);
        treeMap1.put(st3, 7.9);
        treeMap1.put(st6, 9.0);
        treeMap1.put(st5, 8.0);
        System.out.println("TreeMap1 = " + treeMap1);
        System.out.println("----------------------------------");

        // get - взять/вывести на экран элемент (по ключу);
        System.out.println(treeMap.get(9.1));
        System.out.println("----------------------------------");

        // remove - удаление (по ключу);
        treeMap.remove(7.6);
        System.out.println(treeMap);
        System.out.println("----------------------------------");

        // descendingMap - разворачивание treeMap в обратном порядке (ключ по убыванию);
        System.out.println(treeMap.descendingMap());
        System.out.println("----------------------------------");

        // tailMap - найти/вывести на экран все ключи выше (например) 7.2 (включительно);
        System.out.println(treeMap.tailMap(7.2));
        System.out.println("----------------------------------");

        // headMap - найти/вывести на экран все ключи ниже (например) 8.;
        System.out.println(treeMap.headMap(8.1));
        System.out.println("----------------------------------");

        // lastEntry - находит/выводит на экран элемент с самым большим значением ключа;
        System.out.println(treeMap.lastEntry());
        System.out.println("----------------------------------");

        // firstEntry - находит/выводит на экран элемент с самым маленьким значением ключа;
        System.out.println(treeMap.firstEntry());
        System.out.println("----------------------------------");
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
