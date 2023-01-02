package Regular_Expressions.Udemy_Tregulov_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_02_Symbols {
    public static void main(String[] args) {

        // 1. "ABC";
        String s1 = "ABCD ABCE ABCF ABCG ABCH";
        Pattern pattern1 = Pattern.compile("ABC");
        Matcher matcher = pattern1.matcher(s1);

        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + " " + matcher.group());
        }
        System.out.println("------------------------------------");

        // 2. "[ABC]";
        String s2 = "OPABMNCD";
        Pattern pattern2 = Pattern.compile("[ABC]");
        Matcher matcher2 = pattern2.matcher(s2);

        while (matcher2.find()) {
            System.out.println("Position: " + matcher2.start() + " " + matcher2.group());
        }
        System.out.println("------------------------------------");

        // 3. "AB[C-F]OP";
        String s3 = "ABCOPWEQE ABDO";
        Pattern pattern3 = Pattern.compile("AB[C-F]OP");
        Matcher matcher3 = pattern3.matcher(s3);

        while (matcher3.find()) {
            System.out.println("Position: " + matcher3.start() + " " + matcher3.group());
        }
        System.out.println("------------------------------------");

        // 4. "abc[^e-g4-7]"  Where "^" = not;
        String s4 = "ABcD aBce abc5 ABcg6 abcH";
        Pattern pattern4 = Pattern.compile("abc[^e-g4-7]");
        Matcher matcher4 = pattern4.matcher(s4);

        while (matcher4.find()) {
            System.out.println("Position: " + matcher4.start() + " " + matcher4.group());
        }
        System.out.println("------------------------------------");

        // 5. "abc(e|5)"  Where "|" = or;
        String s5 = "ABCD abce abc5 abcg6 ABchr";
        Pattern pattern5 = Pattern.compile("abc(e|5)");
        Matcher matcher5 = pattern5.matcher(s5);

        while (matcher5.find()) {
            System.out.println("Position: " + matcher5.start() + " " + matcher5.group());
        }
        System.out.println("------------------------------------");

        // 6. "abc."  Where "." = any symbol;
        String s6 = "ABCd AbCe abc5 abcG6 a4bch";
        Pattern pattern6 = Pattern.compile("abc.");
        Matcher matcher6 = pattern6.matcher(s6);

        while (matcher6.find()) {
            System.out.println("Position: " + matcher6.start() + " " + matcher6.group());
        }
        System.out.println("------------------------------------");

        // 7. "^ABC"  Where "^" = start of string;
        String s7 = "ABCdRF aBce abc5 abCg6 a4bChr";
        Pattern pattern7 = Pattern.compile("^ABC");
        Matcher matcher7 = pattern7.matcher(s7);

        while (matcher7.find()) {
            System.out.println("Position: " + matcher7.start() + " " + matcher7.group());
        }
        System.out.println("------------------------------------");

        // 8. "chr$"  Where "$" = end of string;
        String s8 = "aBCDRf abCe abc5 aBCg6 45chr";
        Pattern pattern8 = Pattern.compile("chr$");
        Matcher matcher8 = pattern8.matcher(s8);

        while (matcher8.find()) {
            System.out.println("Position: " + matcher8.start() + " " + matcher8.group());
        }
        System.out.println("------------------------------------");

        // 9. "\d"  Where "\d" = [0-9] any number search;
        String s9 = "ABcDRF aBce abc5 abCg6 a4bChr";
        Pattern pattern9 = Pattern.compile("\\d");
        Matcher matcher9 = pattern9.matcher(s9);

        while (matcher9.find()) {
            System.out.println("Position: " + matcher9.start() + " " + matcher9.group());
        }
        System.out.println("------------------------------------");

        // 10. "\D"  Where "\D" = [a-z] any not number search;
        String s10 = "ABcF aCg6 a4r";
        Pattern pattern10 = Pattern.compile("\\D");
        Matcher matcher10 = pattern10.matcher(s10);

        while (matcher10.find()) {
            System.out.println("Position: " + matcher10.start() + " " + matcher10.group());
        }
        System.out.println("------------------------------------");

        // 11. "\w"  Where "\w" = [A-Za-z0-9_] matches a letter, number, or underscore;
        String s11 = "AB a6 a4r";
        Pattern pattern11 = Pattern.compile("\\w");
        Matcher matcher11 = pattern11.matcher(s11);

        while (matcher11.find()) {
            System.out.println("Position: " + matcher11.start() + " " + matcher11.group());
        }
        System.out.println("------------------------------------");

        // 12. "\W"  Where "\W" = [^A-Za-z0-9_] not match a letter, number, or underscore;;
        String s12 = "AB@ =?a6r a4r";
        Pattern pattern12 = Pattern.compile("\\W");
        Matcher matcher12 = pattern12.matcher(s12);

        while (matcher12.find()) {
            System.out.println("Position: " + matcher12.start() + " " + matcher12.group());
        }
        System.out.println("------------------------------------");

        // 13. "+"  Where "+" = matches one or more iterations;
        String s13 = "AB@ a6r a4r";
        Pattern pattern13 = Pattern.compile("\\w+");
        Matcher matcher13 = pattern13.matcher(s13);

        while (matcher13.find()) {
            System.out.println("Position: " + matcher13.start() + " " + matcher13.group());
        }
        System.out.println("------------------------------------");

        // 14. "{n}"  Where "{n}" = matches {n} consecutive characters ;
        String s14 = "ABdRr a6324r a4r932wuf9484u3";
        Pattern pattern14 = Pattern.compile("\\w{4}");
        Matcher matcher14 = pattern14.matcher(s14);

        while (matcher14.find()) {
            System.out.println("Position: " + matcher14.start() + " " + matcher14.group());
        }
        System.out.println("------------------------------------");

        // 15. "s"  Where "s" = number of spaces;
        String s15 = "ABdRr     a624r    a4r932wuf  9484u3";
        Pattern pattern15 = Pattern.compile("\\w\\s+\\w");
        Matcher matcher15 = pattern15.matcher(s15);

        while (matcher15.find()) {
            System.out.println("Position: " + matcher15.start() + " " + matcher15.group());
        }
        System.out.println("------------------------------------");

        // 16. "S" Where "S" = any character except space;

        // 17. "\\D{2,6}"  Where "{2,6}" = range of repetitions of a given character;
        String s17 = "ABcd a6e24 a4r932wuf  9484u3";
        Pattern pattern17 = Pattern.compile("\\D{2,6}");
        Matcher matcher17 = pattern17.matcher(s17);

        while (matcher17.find()) {
            System.out.println("Position: " + matcher17.start() + " " + matcher17.group());
        }
        System.out.println("------------------------------------");

        // 18. "\\D(AB,){2}"
        String s18 = "ABD DBAFD DABABARTB DABABAF RDJTDABBAB";
        Pattern pattern18 = Pattern.compile("\\D(AB){2,}");
        Matcher matcher18 = pattern18.matcher(s18);

        while (matcher18.find()) {
            System.out.println("Position: " + matcher18.start() + " " + matcher18.group());
        }
        System.out.println("------------------------------------");

        // 19. "D(AB)?"
        String s19 = "ABD ABABFDAB ABABABABAFR JTDABABAB";
        Pattern pattern19 = Pattern.compile("D(AB)?");
        Matcher matcher19 = pattern19.matcher(s19);

        while (matcher19.find()) {
            System.out.println("Position: " + matcher19.start() + " " + matcher19.group());
        }
        System.out.println("------------------------------------");

        // 19. "D(AB)*"
        // 20. "\\A" = start of string
        // 21. "\\Z" = end of string
    }
}
