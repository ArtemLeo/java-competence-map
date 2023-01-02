package Recursion.Enlite_Recursion;

public class RecurEx_05_Fibonacci {
    public static void main(String[] args) {
        // Fibonacci: 0 1 1 2 3 5 8 13 21 34 55 89 ...

        System.out.println(fibonacci(8));
    }

    private static int fibonacci(int n) {
        if (n == 1 || n == 0) {                             // base step
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // recursive step
    }
}
