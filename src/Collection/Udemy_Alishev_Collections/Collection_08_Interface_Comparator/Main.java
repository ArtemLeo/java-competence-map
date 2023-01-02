package Collection.Udemy_Alishev_Collections.Collection_08_Interface_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Collections.sort();
        List<String> animals = new ArrayList<>();
        animals.add("frog");
        animals.add("qa");
        animals.add("dog");
        animals.add("cat");
        animals.add("x");
        animals.add("bird");
        Collections.sort(animals);
        System.out.println(animals);
        // Sort with Comparator;
        animals.sort(new StringLengthComparator());
        System.out.println(animals);
        System.out.println("-------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(5);
        numbers.add(500);
        numbers.add(100);
        Collections.sort(numbers);
        System.out.println(numbers);
        // Sort with Comparator;
        numbers.sort(new BackwardsIntegerComparator());
        System.out.println(numbers);
        // With the anonymous class;
        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else if (o1 < o2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(numbers);
        System.out.println("-------------------------");

        List<Person> people = new ArrayList<>();
        people.add(new Person(74, "Tom"));
        people.add(new Person(32, "Anna"));
        people.add(new Person(12, "Mike"));
        people.sort(new Person());
        System.out.println(people);
    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        /*
           o1 > o2 => 1;
           o1 < o2 => -1;
           o1 == o2 => 0;
        */
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class BackwardsIntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        } else if (o1 < o2) {
            return 1;
        } else {
            return 0;
        }
    }
}

class Person implements Comparator<Person> {
    private int id;
    private String name;


    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getId() > o2.getId()) {
            return 1;
        } else if (o1.getId() < o2.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
    public Person() {
    }

    public int getId() {
        return id;
    }
}