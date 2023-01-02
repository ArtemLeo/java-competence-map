package Recursion.Enlite_Recursion;

public class RecurEx_06_Combination_with_repetition {
    public static void main(String[] args) {
        String s = "ABC";
        int n = 3;
        // AAA AAB AAC ABA ABC ... s.length() ^ n

        rec(s, n, "");
    }

    private static void rec(String s, int n, String curr) {
        if (curr.length() == n) {                    // base step
            count++;
            System.out.println(count + " " + curr);
            return;
        }
        for (int i = 0; i < s.length(); i++) {       // recursive step
            rec(s, n, curr + s.charAt(i));
        }
    }
    static int count = 0;
}
