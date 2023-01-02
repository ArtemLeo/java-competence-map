package Regular_Expressions.Udemy_Alishev_Regular_Expressions;

import java.util.Arrays;

public class RegEx_02_Split_Replace {
    public static void main(String[] args) {

        // split;
        String a = "Hello there hey";
        String[] words = a.split(" ");
        System.out.println(Arrays.toString(words));

        // replace;
        String b = "Hello there hey";
        String newString = b.replace(" ",".");
        System.out.println(newString);

        // replace - takes a string as input;
        // replaceAll - takes a regular expression as input;
        // replaceFirst - takes a regular expression as input;
    }
}
