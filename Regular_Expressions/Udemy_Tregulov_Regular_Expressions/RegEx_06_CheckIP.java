package Regular_Expressions.Udemy_Tregulov_Regular_Expressions;

import java.util.regex.Pattern;

public class RegEx_06_CheckIP {
    void checkIP(String ip) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        // 25[0-5]   |   2[0-4]\d   |   [01]?\d?\d   |  (\.) |   {3}
        // 250-255   |   200-249    |   0-199        |   .   |   repeat 3 times
        System.out.println(ip + "is OK? " + Pattern.matches(regex, ip));
    }


    public static void main(String[] args) {

        // 0-255.0-255.0-255.0-255
        String ip1 = "255.38.192.99";
        String ip2 = "182.262.91.05";
        RegEx_06_CheckIP r6 = new RegEx_06_CheckIP();
        r6.checkIP(ip1);
        r6.checkIP(ip2);
    }
}
