package OOP.Enlite_OOP.OOP_01_ObjectCreation_set_get_methods;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student(18, 70, "John", "Smith");
        System.out.println(st1);
        System.out.println("-----------------------------");

        Student st2 = new Student();
        st2.setAge(17);
        st2.setWeight(65);
        st2.setName("Tom");
        st2.setSurname("Hunt");
        System.out.println(st2.getName() + " " + st2.getSurname() + " " + st2.getAge() + " " + st2.getWeight());
        System.out.println("-----------------------------");

        Student st3 = new Student("Ben","Dawson");
        System.out.println(st3.getName() + " " + st3.getSurname());
        System.out.println(st3);
    }
}
