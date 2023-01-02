package Exceptions.Enlite_Exceptions.Exceptions_04_Nested_exception_handling;

public class Main {
    public static void main(String[] args) {
        try {
            method1();
            System.out.println("After method1");
        } catch (ArithmeticException ex1) {
            System.out.println("ArithmeticException is caught");
        }
    }

    private static void method1() {
        try {
            method2();
            System.out.println("After method2");
        } catch (ArithmeticException ex2) {
            System.out.println("ArithmeticException from method1 is caught");
        }
    }

    private static void method2() throws ArithmeticException {
        throw new ArithmeticException();
    }
}
