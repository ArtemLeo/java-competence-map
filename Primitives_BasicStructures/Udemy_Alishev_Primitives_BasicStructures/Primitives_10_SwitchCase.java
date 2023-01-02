package Primitives_BasicStructures.Udemy_Alishev_Primitives_BasicStructures;

import java.util.Scanner;

public class Primitives_10_SwitchCase {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your age ...");
        int age = console.nextInt();

        // Switch-Case can work with number variables (int ...) and with Strings (" ");
        switch (age) {
            case 0:
                System.out.println("You were born!");
                break;
            case 7:
                System.out.println("You went to school!");
                break;
            case 18:
                System.out.println("You graduated from school!");
                break;
            default:
                System.out.println("None of the options were right!");
        }
    }
}
