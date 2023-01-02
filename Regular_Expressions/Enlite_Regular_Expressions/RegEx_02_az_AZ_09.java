package Regular_Expressions.Enlite_Regular_Expressions;

public class RegEx_02_az_AZ_09 {
    public static void main(String[] args) {
        // RegEx [a-z] [A-Z] [0-9];
        String s = "Java";

        if (s.matches("J[a-z].a")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String s1 = "JAv1";
        if (s1.matches("J[a-zA-Z].[0-9]")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
