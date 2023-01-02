package Regular_Expressions.Enlite_Regular_Expressions;

public class RegEx_04_AND_XOR {
    public static void main(String[] args) {
        // RegEx: &&(and), ^(besides);
        String s = "J_!a";

        if (s.matches("J[\\w&&[^_]].a")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
