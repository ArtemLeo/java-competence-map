package Regular_Expressions.Enlite_Regular_Expressions;

public class RegEx_01_how_the_point_is_used {
    public static void main(String[] args) {
        // RegEx ("." - point);
        String s = "Java";

        // Method equals;
        if (s.equals("Java!")) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }
        System.out.println("---------------------");

        // RegEx;
        if (s.matches("J..a")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
