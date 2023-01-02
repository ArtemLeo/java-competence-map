package Collection.Udemy_Tregulov_Collections.Collection_17_Intro_to_Queue_LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Queue-LinkedList;
        // FIFO - First In First Out;

        // add() - добавляет элемент (когда в Queue уже нет свободного места - выбрасывает ошибку);
        Queue<String> queue = new LinkedList<>();
        queue.add("Tom");
        queue.add("Den");
        queue.add("Anna");
        queue.add("Zoe");
        queue.add("Artem");
        System.out.println(queue);
        System.out.println("---------------------------");

        // offer() - добавляет элемент (когда в Queue уже нет свободного места - НЕ выбрасывает ошибку);
        queue.offer("Ben");
        System.out.println(queue);
        System.out.println("---------------------------");

        // remove() - если не указывать имя элемента, то удаляется первый по очереди (FIFO). Если элементов нет - выбрасывает ошибку;
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println("---------------------------");

        // poll() - удаляет элементы. При отсутствии элементов в Queue - возвращает null (НЕ выбрасывает ошибку);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println("---------------------------");

        // element() - находит/выводит на экран первый элемент в Queue. Если элементов нет - выбрасывает ошибку;
        System.out.println(queue.element());
        System.out.println("---------------------------");

        // peek() - находит/выводит на экран первый элемент в Queue. Если элементов нет - ошибку НЕ выбрасывает (null);
        System.out.println(queue.peek());
    }
}
