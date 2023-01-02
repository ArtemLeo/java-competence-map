package Primitives_BasicStructures.Udemy_Sumin_Primitives_BasicStructures;

public class Primitives_06_SwitchCase_String {
    public static void main(String[] args) {
        String[] arr1 = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String result = "";
        for (int i = 0; i < arr1.length; i++) {
            result += arr1[i];
            if (i == arr1.length - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
        // result = January, February, March, April, May, June, July, August, September, October, November, December.
        System.out.println("-------------------------------------");

        // switch-case;
        int numberOfMonth = 10;
        switch (numberOfMonth) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Enter the month number again!");
        }
        System.out.println("-------------------------------------");

        // String | equals;
        String s1 = "Hello!";
        String s2 = "Hello!";
        if (s1.equals(s2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

