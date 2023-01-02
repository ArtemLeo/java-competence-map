package Primitives_BasicStructures.Udemy_Sumin_Primitives_BasicStructures;

public class Primitives_02_Casting_PrimitiveTypes {
    public static void main(String[] args) {
        int days = 100;
        int speed = 300000;
        long second = days * 24 * 60 * 60;
        long distance = speed * second;
        System.out.println(distance);
        System.out.println("------------------------");

        // Automatic type casting
        byte a = 10;
        int b = a;
        System.out.println("Casting byte -> int = " + b);

        // Manual type casting
        int c = 10;
        byte d = (byte) c;
        System.out.println("Casting int -> byte = " + d);
    }
}
