package Recursion.Enlite_Recursion;

public class RecurEx_02_Factorial {
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        if (n == 1) {                       // base step;
            return 1;
        }
        return n * factorial(n - 1);     // recursive step
    }
}
