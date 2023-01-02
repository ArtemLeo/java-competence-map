package Interfaces.Udemy_Sumin_Interfaces.Interfaces_01_Intro_Upcast_Downcast;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();
        Bird bird = new Bird();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(fish);
        animals.add(bird);

        for (Animal animal : animals) {
            animal.eat();
        }

        // Upcast - object creation of a child class via an abstract parent class;
        Dog animal = new Dog();
        System.out.println("---------------------------");

        Dog dog1 = new Dog();
        dog1.run();
        // Reduction to a parental type;
        Animal animal1 = dog1;
        animal1.eat();
        // dog1.run(); NO run() method;
        // The Upcast only has access to the methods of the parent class;

        // Downcast;
        dog1 = (Dog) animal;
        dog1.run(); // run() method is here;
        System.out.println("---------------------------");

        // Interfaces;
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Bird bird2 = new Bird();
        Bird bird3 = new Bird();
        Fish fish2 = new Fish();

        ArrayList<CanRun> runAnimals = new ArrayList<>();
        runAnimals.add(dog2);
        runAnimals.add(dog3);
        runAnimals.add(cat2);
        runAnimals.add(cat3);
        runAnimals.add(bird2);
        runAnimals.add(bird3);
        // runAnimals.add(fish2);

        for (CanRun run: runAnimals){
            run.run();
        }
        System.out.println("---------------------------");

        Dog dog4 = new Dog();
        // Upcast; The Upcast only has access to the methods of the parent class;
        CanRun canRun = dog4;
        // canRun.eat(); NO eat() method;
        // Downcast;
        dog4 = (Dog) canRun;
        System.out.println("---------------------------");

        Flyable flyable = new Bird();
        flyable.fly();
    }
}
