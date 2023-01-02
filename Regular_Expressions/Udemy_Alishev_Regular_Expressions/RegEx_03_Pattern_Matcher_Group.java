package Regular_Expressions.Udemy_Alishev_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_03_Pattern_Matcher_Group {
    public static void main(String[] args) {
        String text = "Hello, Guys! I send you email joe@gmail.com so we can\n" +
                "keep in touch. Thank`s Joe! That`s cool. I am sending you\n" +
                "my address: tim@yandex.ru. Let`s stay in touch ...";

        Pattern email = Pattern.compile("\\w+@(gmail|yandex)\\.(ru|com)");
        Matcher matcher = email.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println("-----------------------------------------");

        // group;
        Pattern emailName = Pattern.compile("(\\w+)@(gmail|yandex)\\.(ru|com)");
        Matcher matcherName = emailName.matcher(text);
        while (matcherName.find()) {
            System.out.println(matcherName.group(1));
        }
    }
}
