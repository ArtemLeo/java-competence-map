package Interfaces.Udemy_Alishev_Interfaces;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        animal1.sleep();
        person1.sayHello();
        System.out.println("--------------------------");
        animal1.showInfo();
        person1.showInfo();
        System.out.println("--------------------------");
        outputInfo(animal1);
        outputInfo(person1);
        System.out.println("--------------------------");

        // Creating an object with an interface (the class must implement the interface);
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");
        info1.showInfo();
        info2.showInfo();
        System.out.println("--------------------------");

        // With static method;
        outputInfo(info1);
        outputInfo(info2);
        System.out.println("--------------------------");
    }

    public static  void outputInfo(Info info){
        info.showInfo();
    }
}
