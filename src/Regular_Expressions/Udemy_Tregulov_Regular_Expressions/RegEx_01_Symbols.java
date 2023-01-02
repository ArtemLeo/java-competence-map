package Regular_Expressions.Udemy_Tregulov_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_01_Symbols {
    public static void main(String[] args) {
        String s
                = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
                "email:ivanov@mail.ru, Postcode: AA99, Phone Number: +123459823;"
                + "Anna Zueva, Ukraine, Kiev, Yevtushenko street, 33, Flat 18," +
                "email:masha@gmail.com, Postcode: UKR6100, Phone Number: +309842311;"
                + "Tom Hurt, USA, Hollywood, All stars street, 847, Flat 21," +
                "email:tom@gmail.com, Postcode: USA409, Phone Number: +194342392;";

        // 1. All words and numbers;
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
        System.out.println("-----------------------------------------");

        // 2. All double numbers; Where "\\b" - number or word border;
        Pattern pattern1 = Pattern.compile("\\b\\d{2}\\b");
        Matcher matcher1 = pattern1.matcher(s);
        while (matcher1.find()){
            System.out.println(matcher1.group());
        }
        System.out.println("-----------------------------------------");

        // 3. All phone numbers; Where "\\d{9}" - phone number length;
        Pattern pattern2 = Pattern.compile("\\+\\d{9}");
        Matcher matcher2 = pattern2.matcher(s);
        while (matcher2.find()){
            System.out.println(matcher2.group());
        }
        System.out.println("-----------------------------------------");

        // 4. All emails; Where "\\b" - number or word border;
        Pattern pattern3 = Pattern.compile("email:\\w+@\\w+\\.(ru|com)");
        Matcher matcher3 = pattern3.matcher(s);
        while (matcher3.find()){
            System.out.println(matcher3.group());
        }
        System.out.println("-----------------------------------------");
    }
}
