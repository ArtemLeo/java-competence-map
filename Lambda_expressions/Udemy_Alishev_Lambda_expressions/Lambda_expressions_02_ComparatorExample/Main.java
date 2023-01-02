package Lambda_expressions.Udemy_Alishev_Lambda_expressions.Lambda_expressions_02_ComparatorExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Goodbye");
        list.add("a");
        list.add("abc");

        // Comparison of strings by length using an Anonymous class;
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(list);
        System.out.println("--------------------------");

        // Comparison of strings by length using a Lambda expression;
        list.sort((o1, o2) -> {
            if (o1.length() > o2.length()) {
                return 1;
            } else if (o1.length() < o2.length()) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println(list);
        System.out.println("--------------------------");

        // Comparison of strings by length using a Lambda (Integer.compare);
        list.sort((o1, o2) -> {
            return Integer.compare(o1.length(), o2.length());
        });
        System.out.println(list);
        System.out.println("--------------------------");

        // Assigning lambda to a variable "comparator";
        Comparator<String> comparator = ((o1, o2) -> {
            if (o1.length() > o2.length()) {
                return 1;
            } else if (o1.length() < o2.length()) {
                return -1;
            } else {
                return 0;
            }
        });
        list.sort(comparator);
        System.out.println(list);
        System.out.println("--------------------------");
    }
}
