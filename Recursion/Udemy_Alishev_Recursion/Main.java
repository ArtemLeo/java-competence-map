package Recursion.Udemy_Alishev_Recursion;

public class Main {
    public static void main(String[] args) {
        someMethod();
        System.out.println("---------------------------------");
        counter(3);
        System.out.println("---------------------------------");

        // counter(3) -> counter(2) -> counter(1)
        // Все рекурсивные вызовы метода находятся в stack, который (в случае переполнения) может выбросить ошибку;

        System.out.println("Factorial = " + factorial(4));
    }

    public static void someMethod() {
        System.out.println("Recursion!)");
    }

    public static void counter(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("n = " + n);
        counter(n - 1);
    }

    public static int factorial(int i) {
        if (i == 1) {
            return 1;
        }
        return i * factorial(i - 1);
    }
}
