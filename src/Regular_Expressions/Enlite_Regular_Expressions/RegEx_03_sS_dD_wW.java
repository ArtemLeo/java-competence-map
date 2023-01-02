package Regular_Expressions.Enlite_Regular_Expressions;

public class RegEx_03_sS_dD_wW {
    public static void main(String[] args) {
        // RegEx: \s (spase), \S (!space), \d (digital), \D (!digital), \w (word), \W (!word);
        String s = "Ja4 ";

        if (s.matches("J\\w\\d\\s")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
