package Exceptions.Enlite_Exceptions.Exceptions_01_Try_Catch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exception: declare -> catch -> handle
        // try -> catch

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            try {
                int div = a / b;
                System.out.println("a / b = " + div);
            } catch (ArithmeticException exception) {
                System.out.println("You are trying to divide by zero. Please enter new number");
            }
        }
    }
}
