package Regular_Expressions.Enlite_Regular_Expressions;

public class RegEx_06_quantity_ranges {
    public static void main(String[] args) {
        // RegEx quantity: {n} (n times), {n,} (n-infinity), {n,m} (n-m);
        String s = "fa9emJava949503";

        if (s.matches("[a-z0-9]{5,}Java[0-9]{2,9}")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
