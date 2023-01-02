package Recursion.Enlite_Recursion;

public class RecurEx_01_Sum_of_numbers {
    public static void main(String[] args) {

        // Recursion;
        // if() return; - base step
        // method(); - recursive step;
        System.out.println(sum(10));
    }

    public static int sum(int n) {
        if (n == 1) {             // base step;
            return 1;
        }
        return n + sum(n - 1); // recursive step
    }
}
