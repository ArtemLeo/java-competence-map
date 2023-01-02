package Collection.Udemy_Alishev_Collections.Collection_07_Equals_Hashcode;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // HashCode - сопоставление объекта (с любым кол-вом полей) целому числу int, для его сравнения с другими объектами;

        /*
        Алгоритм проверки hashcode() + equals();
         1. Вызов метода hashcode() (он более быстрый):
           - если hashcode НЕ совпадает, то объекты точно разные;
           - если hashcode совпадает: объекты равны ИЛИ коллизия.
         2. Вызываем метод equals() (более медленный, но максимально точный);
        */

        Map<Integer, String> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        // Map - не хранит дубликаты ключей элементов;
        // Set - не хранит дубликаты элементов;

        map.put(1, "One");
        map.put(1, "One");  // Duplicate;
        set.add(1);
        set.add(1);         // Duplicate;
        System.out.println(map);
        System.out.println(set);
        System.out.println("---------------------------------");

        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(2, "Katy");
        Person person3 = new Person(1, "Mike");

        Map<Person, String> map1 = new HashMap<>();
        Set<Person> set1 = new HashSet<>();
        map1.put(person1, "no matter");
        map1.put(person2, "no matter");
        map1.put(person3, "no matter");
        set1.add(person1);
        set1.add(person2);
        set1.add(person3);

        System.out.println(map1);
        System.out.println(set1);


    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
