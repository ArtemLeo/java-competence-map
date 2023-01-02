package Exceptions.Enlite_Exceptions.Exceptions_07_Rethrow;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            method(4, 0);
        } catch (IOException exception) {
            System.out.println("IOException is caught!");
        }
    }


    public static void method(int a, int b) throws ArithmeticException, IOException {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException is caught!");
            throw new IOException();
        }
    }
}
