package OOP.Enlite_OOP.OOP_05_Method_toString;

public class Main {
    public static void main(String[] args) {
        String s = "Jack";
        System.out.println(s);
        System.out.println(s.toString());

        Example example = new Example("John",1);
        System.out.println(example.toString());
    }
}
