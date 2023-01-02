package Patterns.ITVDN_Patterns.Patterns_01_Singleton;

public class Singleton {
    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton() {
    }

    public void print() {
        System.out.println(this);
    }
}
