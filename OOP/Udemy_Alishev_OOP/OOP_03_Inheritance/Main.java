package OOP.Udemy_Alishev_OOP.OOP_03_Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        System.out.println("------------------------");

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.setName("Rex");
        System.out.println("Dog`s name is " + dog.getName());
    }
}
