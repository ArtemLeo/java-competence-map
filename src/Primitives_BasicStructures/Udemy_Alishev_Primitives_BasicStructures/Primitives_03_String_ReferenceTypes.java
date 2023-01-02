package Primitives_BasicStructures.Udemy_Alishev_Primitives_BasicStructures;

public class Primitives_03_String_ReferenceTypes {
    public static void main(String[] args) {
        String someString = "Hello World!";
        System.out.println(someString);
        System.out.println("-------------------------");

        String a = "Hi";
        String b = " ";
        String c = "Java";
        String d = "!";
        System.out.println(a + b + c + d);
        // or
        System.out.println("Hi" + " " + "Java" + "!");
        System.out.println("-------------------------");

        int number = 5;
        String e = "My number is ";
        System.out.println(e + number);
    }
}
