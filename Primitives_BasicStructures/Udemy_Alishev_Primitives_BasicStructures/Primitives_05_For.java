package Primitives_BasicStructures.Udemy_Alishev_Primitives_BasicStructures;

public class Primitives_05_For {
    static int count;

    public static void main(String[] args) {
        // for (int i = 0; i <= 5; i++);
        // for (initialization; condition; change);

        for (int i = 0; i <= 5; i++) {
            count = i;
            System.out.println("Count i = " + i);
        }
        System.out.println("-----------------------------");

        for (int i = 5; i >= 0; i--) {
            count = i;
            System.out.println("Count i = " + i);
        }
    }
}
