package Regular_Expressions.Udemy_Tregulov_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_05_Compile_Find_Group {
    public static void main(String[] args) {

        // Card 03/25 2345 9584 9385 8372 (948);
        String myString = "375827468457693456932;" +
                "96850382579384579583254;" +
                "37584094730948578574930;";
        System.out.println(myString);
        System.out.println("-------------------------------------");

        // compile;
        Pattern pattern = Pattern.compile("(\\d{4}) (\\d{4}) (\\d{4}) (\\d{4}) (\\d{2}) (\\d{2}) (\\d{3})");
        Matcher matcher = pattern.matcher(myString);

        // replaceAll;
        String myNewString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
        System.out.println(myNewString);
        System.out.println("-------------------------------------");

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
