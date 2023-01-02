package Interfaces.Udemy_Sumin_Interfaces.Interfaces_01_Intro_Upcast_Downcast;

public class Bird extends Animal implements CanRun, Flyable {
    @Override
    public void run() {
        System.out.println("Bird is running");
    }

    @Override
    public void eat() {
        System.out.println("Bird food");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
