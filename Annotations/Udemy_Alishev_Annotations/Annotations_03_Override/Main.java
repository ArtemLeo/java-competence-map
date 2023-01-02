package Annotations.Udemy_Alishev_Annotations.Annotations_03_Override;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        System.out.println("---------------------------");

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
    }
}
