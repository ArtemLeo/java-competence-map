package Regular_Expressions.Enlite_Regular_Expressions;

public class RegEx_07_OR_symbols_in_brackets {
    public static void main(String[] args) {
        // RegEx quantity: (a|b) a or b;
        // (abc) - the order of the symbols is important;
        // [abc] - the order of the symbols is not important;
        String s = "JavaABCbca";

        if (s.matches("J(av|bv).(ABC)[abc]*")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
