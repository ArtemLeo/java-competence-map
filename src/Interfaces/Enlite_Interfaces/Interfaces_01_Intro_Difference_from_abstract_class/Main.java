package Interfaces.Enlite_Interfaces.Interfaces_01_Intro_Difference_from_abstract_class;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sleep();
        animal.walk();
        System.out.println("---------------------------");

        // Upcast; The Upcast only has access to the methods of the parent class;
        Sleepable sleepable = new Animal();
        sleepable.sleep();
        // for (int i = 0; i < 100; i++) {
        // checkSleepable(i);
    }

    public static void checkSleepable(Sleepable a) {
        a.sleep();
    }
}
