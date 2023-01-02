package Primitives_BasicStructures.Udemy_Sumin_Primitives_BasicStructures;

public class Primitives_03_PrimitiveTypes {
    public static void main(String[] args) {
        // double | float
        double radius = 10.8;
        double pi = 3.14;
        double square = pi * radius * radius;
        System.out.println("Square = " + square);
        System.out.println("--------------------------");

        // char
        // ASCII - is a character encoding table
        char ch1 = 88;
        System.out.println("ASCII 88 = " + ch1);
        char ch2 = 'X';
        System.out.println("Character " + ch2);
        System.out.println("--------------------------");

        // boolean; < > >= <= == != (&&-and) (||-or)
        int temperature = 24;
        boolean hot = temperature > 22;
        double time = 22.30;
        boolean late = time > 21.00;

        if (hot || !late) {
            System.out.println("Conditioning is ON");
        } else if (!hot && late) {
            System.out.println("Conditioning is OFF");
        }
        System.out.println("--------------------------");

        // Homework;
        float timeIsIt = 06.01f;
        boolean toLate = timeIsIt >= 23.00 || timeIsIt <= 06.00;
        boolean weatherIsFine = false;

        if (toLate) {
            System.out.println("Sleep!");
        }
        if (!toLate && weatherIsFine) {
            System.out.println("Walk!");
        }
        if (!toLate && !weatherIsFine) {
            System.out.println("To read book!");
        }
    }
}
