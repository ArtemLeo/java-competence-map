package Regular_Expressions.Udemy_Tregulov_Regular_Expressions;

import java.util.Arrays;

public class RegEx_03_Matches_Split {
    public static void main(String[] args) {
        String s
                = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
                "email:ivanov@mail.ru, Postcode: AA99, Phone Number: +123459823;"
                + "Anna Zueva, Ukraine, Kiev, Yevtushenko street, 33, Flat 18," +
                "email:masha@gmail.com, Postcode: UKR6100, Phone Number: +309842311;"
                + "Tom Hurt, USA, Hollywood, All stars street, 847, Flat 21," +
                "email:tom@gmail.com, Postcode: USA409, Phone Number: +194342392;";

        // matches - comparison method;
        String s1 = "email:tom@gmail.com";
        boolean result = s1.matches("\\w+@\\w+\\.(com|ru)");
        System.out.println(result);

        // split - separation method;
        String [] array = s.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
