package Regular_Expressions.Enlite_Regular_Expressions;

public class RegEx_08_START_and_END_of_string {
    public static void main(String[] args) {
        // RegEx: ^ (indicates the beginning of the string), $ (indicates the end of the string);
        String s = "Java573Python";

        if (s.matches("^Java[0-9]+(Python)$")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
