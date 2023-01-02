package Exceptions.Enlite_Exceptions.Exceptions_02_Throw_Throws;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // throw -> throws
        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            try {
                int div = divide(a, b);
                System.out.println("a / b = " + div);
            } catch (ArithmeticException exception) {
                System.out.println("You are trying to divide by zero. Please enter new number");
            }
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException();
        return a / b;
    }
}
