package Primitives_BasicStructures.Udemy_Alishev_Primitives_BasicStructures;

public class Primitives_09_Break_Continue {
    public static void main(String[] args) {
        // Break (operator);
        int i = 0;
        while (true) {
            if (i >= 5) {
                System.out.println("i = " + i);
                break;
            }
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("We're out of the cycle!");
        System.out.println("--------------------------");

        // Continue (operator);
        for (int j = 0; j <= 10; j++) {
            if (j % 2 == 0) {
                continue;
            }
            System.out.println("This number is odd = " + j);
        }
        System.out.println("--------------------------");

        for (int x = 0; x <= 10; x++) {
            if (x % 2 != 0) {
                continue;
            }
            System.out.println("This number is even = " + x);
        }
    }
}

