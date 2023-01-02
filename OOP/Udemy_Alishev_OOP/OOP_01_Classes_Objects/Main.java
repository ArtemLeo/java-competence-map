package OOP.Udemy_Alishev_OOP.OOP_01_Classes_Objects;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Tom";
        person1.age = 25;
        System.out.println("Hi! My name is " + person1.name + ". I`m " + person1.age + " years old.");

        Person person2 = new Person();
        person2.name = "Anna";
        person2.age = 21;
        System.out.println("Hi! My name is " + person2.name + ". I`m " + person2.age + " years old.");

    }
}

class Person {
    String name;
    int age;
}
