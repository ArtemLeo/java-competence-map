package Recursion.Enlite_Recursion;

public class RecurEx_04_Palindrome {
    public static void main(String[] args) {
        String s = "level";
        System.out.println(isPalindrome(s) ? "Yes" : "No");
    }

    private static boolean isPalindrome(String s) {
        if (s.length() == 1 || s.length() == 0) {         // base step;
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {    // recursive step
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }
}

