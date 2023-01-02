package Interfaces.Udemy_Sumin_Interfaces.Interfaces_01_Intro_Upcast_Downcast;

public class Dog extends Animal implements CanRun {
    @Override
    public void eat() {
        System.out.println("Bone");
    }

    public void run() {
        System.out.println("Dog is running");
    }
}
