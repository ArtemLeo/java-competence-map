package Collection.Udemy_Tregulov_Collections.Collection_18_PriorityQueue;

import java.util.Objects;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);

        // Естественная сортировка: 1,4,7,8,10;
        System.out.println(priorityQueue);
        System.out.println("--------------------------");

        // peek() - находит/выводит на экран первый элемент в PriorityQueue. Если элементов нет - ошибку НЕ выбрасывает (null);
        System.out.println(priorityQueue.peek());
        System.out.println("--------------------------");

        // remove() - удаляется элемент с высшим приоритетом;
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue);
        System.out.println("--------------------------");

        PriorityQueue<Student> priorityQueue1 = new PriorityQueue<>();
        Student st1 = new Student("Anna", 1);
        Student st2 = new Student("Tom", 2);
        Student st3 = new Student("Zoe", 3);
        Student st4 = new Student("Den", 4);
        Student st5 = new Student("Artem", 5);
        priorityQueue1.add(st1);
        priorityQueue1.add(st2);
        priorityQueue1.add(st3);
        priorityQueue1.add(st4);
        priorityQueue1.add(st5);
        System.out.println(priorityQueue1);
        System.out.println("--------------------------");

        // poll() - удаляет элементы. При отсутствии элементов в priorityQueue - возвращает null (НЕ выбрасывает ошибку);
        System.out.println(priorityQueue1.poll());
        System.out.println(priorityQueue1.poll());
        System.out.println(priorityQueue1.poll());
        System.out.println(priorityQueue1.poll());
        System.out.println(priorityQueue1.poll());
        System.out.println(priorityQueue1.poll()); // null
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course; //&& Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }
}

