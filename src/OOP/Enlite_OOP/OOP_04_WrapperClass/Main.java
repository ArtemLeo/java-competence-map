package OOP.Enlite_OOP.OOP_04_WrapperClass;

public class Main {
    public static void main(String[] args) {
        // bite, short, int, long, float, double, char, boolean
        // Bite, Short, Integer, Long, Float, Double, Character, Boolean

        int a = 5;
        Integer b = 10;
        System.out.println("int = " + a);
        System.out.println("Integer = " + b);

        // Unboxing to int
        // int c = b.intValue()
        int c = b;
        System.out.println("Unboxing to int " + c);

        // Autoboxing to Integer
        Integer d = a;
        System.out.println("Autoboxing to Integer = " + d);
        System.out.println("------------------------------------");


        // Wrapper class methods: parseInt(), parseDouble() ... valueOf();
        // Only String to int:
        int i = Integer.parseInt("123");
        System.out.println(i);

        double j = Double.parseDouble("321");
        System.out.println(j);

        // valueOf = Unboxing;


    }
}
