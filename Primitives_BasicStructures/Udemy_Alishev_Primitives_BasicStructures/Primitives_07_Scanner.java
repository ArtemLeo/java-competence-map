package Primitives_BasicStructures.Udemy_Alishev_Primitives_BasicStructures;

import java.util.Scanner;

public class Primitives_07_Scanner {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Enter your username and password;
        System.out.println("Enter your username:");
        String username = console.nextLine();
        System.out.println("You entered: " + username);
        System.out.println("------------------------");

        System.out.println("Enter your password:");
        int password = console.nextInt();
        System.out.println("You entered: " + password);
    }
}
