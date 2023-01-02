package Recursion.Enlite_Recursion;

public class RecurEx_03_Reverse_String {
    public static void main(String[] args) {
        String s = "ABC";
        System.out.println(reverse(s));
    }

    public static String reverse(String s) {
        if (s.length() ==1) {                                                     // base step;
            return s;
        }
        return s.charAt(s.length() - 1) + reverse(s.substring(0,s.length()-1));   // recursive step
    }
}
