package Collection.Udemy_Tregulov_Collections.Collection_15_TreeSet;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // TreeSet НЕ хранит значения null;
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);
        System.out.println(treeSet);
        System.out.println("---------------------------");

        // remove();
        treeSet.remove(2);
        System.out.println(treeSet);
        System.out.println("---------------------------");

        // contains();
        System.out.println(treeSet.contains(1));
        System.out.println("---------------------------");


        TreeSet<Student> treeSet1 = new TreeSet<>();
        Student st1 = new Student("Tom", 1);
        Student st2 = new Student("Anna", 2);
        Student st3 = new Student("Artem", 3);
        Student st4 = new Student("Zoe", 4);
        Student st5 = new Student("Den", 5);
        treeSet1.add(st1);
        treeSet1.add(st2);
        treeSet1.add(st3);
        treeSet1.add(st4);
        treeSet1.add(st5);
        System.out.println(treeSet1);
        System.out.println("---------------------------");


        // first() - находит/выводит на экран первый элемент в treeSet;
        System.out.println(treeSet1.first());
        System.out.println("---------------------------");

        // last() - находит/выводит на экран последний элемент в treeSet;
        System.out.println(treeSet1.last());
        System.out.println("---------------------------");

        // headSet() - найти/вывести на экран всех студентов ниже (например) 5-го курса;
        Student st6 = new Student("Max", 4);
        System.out.println(treeSet1.headSet(st6));
        System.out.println("---------------------------");

        // tailSet() - найти/вывести на экран всех студентов выше (например) 1-го курса (включительно);
        System.out.println(treeSet1.tailSet(st6));
        System.out.println("---------------------------");

        // subSet() - найти/вывести на экран значения элементов, которые находятся между двух показателей (которые укажем);
        System.out.println(treeSet1.subSet(st1, st4));
        System.out.println("---------------------------");

        // Правило сравнения элементов;
        // a.equals(b) -> true;
        // a.compareTo(b) -> 0;
        // Количество элементов сравнения должно совпадать в (equals-hashCode-compareTo)
        // Например: сравнение только по курсу/имени и по нескольким элементам;

        System.out.println(st4.equals(st6)); // true
        System.out.println(st4.hashCode() == st6.hashCode()); // true
        System.out.println(st4.compareTo(st6)); // 0
    }
}

class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course; // && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
