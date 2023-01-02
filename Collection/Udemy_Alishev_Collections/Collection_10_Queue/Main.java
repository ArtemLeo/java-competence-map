package Collection.Udemy_Alishev_Collections.Collection_10_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        // Queue = FIFO (First In First Out);

        //                         Insert: |  Remove: | Examine:
        // Throws exception:     |   add() | remove() | element()
        // Return special value: | offer() |  poll()  |  peek()

        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

        // add() -> (offer);
        Queue<Person> people = new LinkedList<>();
        people.add(person3);
        people.add(person2);
        people.add(person4);
        people.add(person1);

        // people3 <- people2 <- people4 <- people1;
        for (Person p : people) {
            System.out.println(p);
        }
        System.out.println("-------------------------------");

        Queue<Person> people1 = new ArrayBlockingQueue<>(10);
        people1.add(person3);
        people1.add(person2);
        people1.add(person4);
        people1.add(person1);

        // remove() -> (poll): Displays on the screen and delete;
        System.out.println(people1);
        System.out.println(people1.remove());
        System.out.println(people1);
        // element() -> (peek): Displays on the screen - does not delete;
        System.out.println(people1.element());
        System.out.println(people1);
        System.out.println("-------------------------------");
    }
}

class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
