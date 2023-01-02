package OOP.Udemy_Alishev_OOP.OOP_04_Polymorphism;

public class Dog extends Animal {
    public void bark() {
        System.out.println("Only dog is barking");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");;
    }
}
