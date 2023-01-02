package Interfaces.Udemy_Sumin_Interfaces.Interfaces_02_Anonymous_classes;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Cooker cooker = new Cooker();
        director.force(cooker);
        System.out.println("---------------------------");

        // Anonymous class;
        director.force(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Cook is cooking!");
            }
        });
    }
}
