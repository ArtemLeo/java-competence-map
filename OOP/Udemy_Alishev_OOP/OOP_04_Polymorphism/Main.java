package OOP.Udemy_Alishev_OOP.OOP_04_Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.eat();
        dog.eat();
        System.out.println("---------------------------");

        Animal animal1 = new Dog();
        animal1.eat();
        // animal.bark(); no method bark in animal1;
        Dog dog1 = new Dog();
        dog1.bark();
        System.out.println("---------------------------");

        Animal animal2 = new Animal();
        Dog dog2 = new Dog();
        Cat cat = new Cat();
        test(animal);
        test(dog);
        test(cat);
        System.out.println("---------------------------");
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
