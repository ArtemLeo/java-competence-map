package Interfaces.Udemy_Sumin_Interfaces.Interfaces_01_Intro_Upcast_Downcast;

public class Cat extends Animal implements CanRun{
    @Override
    public void eat() {
        System.out.println("Wiskas");
    }

    public void run() {
        System.out.println("Cat is running!");
    }
}
