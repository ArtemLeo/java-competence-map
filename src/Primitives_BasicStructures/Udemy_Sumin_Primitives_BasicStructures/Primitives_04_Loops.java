package Primitives_BasicStructures.Udemy_Sumin_Primitives_BasicStructures;

public class Primitives_04_Loops {
    public static void main(String[] args) {
        // while;
        int j = 0;
        while (j <= 5) {
            System.out.println("while: number is " + j);
            j++;
        }
        System.out.println("--------------------------");

        int x = 100;
        while (x >= 0) {
            if (x % 2 != 0) {
                System.out.println("while: number is even " + x);
            }
            x--;
            if (x == 80) {
                break;
            }
        }
        System.out.println("--------------------------");

        // while: arithmetic average (0 - 100);
        int count = 0;
        int sum = 0;
        float result;
        while (count <= 100) {
            sum += count;
            count++;
        }
        result = sum / (float) count;
        System.out.println("Arithmetic average (0 - 100) = " + result);
        System.out.println("--------------------------");

        // do-while;
        int a = 0;
        do {
            System.out.println("Hello, do-while!");
        } while (a > 0);
        // a !> 0 but we still output the "Hello!" string once, because we use loop do-while;
        System.out.println("--------------------------");

        // for;
        for (int i = 100; i < 1000; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("for: " + i);
            }
        }
    }
}
