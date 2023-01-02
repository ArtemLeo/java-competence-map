package Regular_Expressions.Enlite_Regular_Expressions;

public class RegEx_05_quantity_symbols {
    public static void main(String[] args) {
        // RegEx quantity: * (0-infinity), + (1-infinity), ? (0,1);
        String s = "r1fjg9ns2oJavaexgerd";

        if (s.matches("[a-z0-9]*Java.+")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
