package Exceptions.Enlite_Exceptions.Exceptions_03_Try_repeatedly_Catch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Try and catch a few times
        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            try {
                int div = divide(a, b);
                System.out.println("a / b = " + div);
            } catch (ArithmeticException ex1) {
                System.out.println("You are trying to divide by zero. Please enter new number");
            }
            //catch (IOException ex2){}
            //catch (RuntimeException ex3){}
        }
    }

    public static int divide(int a, int b) throws ArithmeticException { // IOException,RuntimeException
        if (b == 0) throw new ArithmeticException();
        return a / b;
    }
}

