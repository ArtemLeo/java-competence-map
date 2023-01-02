package Primitives_BasicStructures.Udemy_Alishev_Primitives_BasicStructures;

import java.util.Scanner;

public class Primitives_08_DoWhile {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // The do-while loop helps avoid code duplication;

        // while
        System.out.println("Enter number 7 ...");
        int value = console.nextInt();
        while (value != 7) {
            System.out.println("Enter number 7 again ...");
            value = console.nextInt();
        }
        System.out.println("You entered number 7");
        System.out.println("---------------------------");

        // do-while
        do {
            System.out.println("Enter number 7 ...");
            value = console.nextInt();
        } while (value != 7);
        System.out.println("You entered number 7");
    }
}
