package Primitives_BasicStructures.Udemy_Sumin_Primitives_BasicStructures;

public class Primitives_05_Arrays {
    public static void main(String[] args) {
        // Array;
        int[] dayInMonth = new int[12];
        dayInMonth[0] = 31;
        dayInMonth[1] = 28;
        dayInMonth[2] = 31;
        dayInMonth[3] = 30;
        dayInMonth[4] = 31;
        dayInMonth[5] = 30;
        dayInMonth[6] = 31;
        dayInMonth[7] = 31;
        dayInMonth[8] = 30;
        dayInMonth[9] = 31;
        dayInMonth[10] = 30;
        dayInMonth[11] = 31;

        int march = dayInMonth[2];
        System.out.println("March = " + march + " days");
        System.out.println("----------------------------");

        int count;
        for (int i = 0; i < dayInMonth.length; i++) {
            count = i;
            System.out.println("Days " + count + " month: " + dayInMonth[i]);
        }
        System.out.println("----------------------------");

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }
        System.out.println("----------------------------");

        // ForEach - in this loop, you cannot change the configuration of the array/assign new values to it`s elements;
        for (int i : numbers) {
            System.out.println(i);
        }
        System.out.println("----------------------------");

        String[] string = new String[5];
        for (String s : string) {
            System.out.println(s);
        }
        System.out.println("----------------------------");

        // Homework;
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }
        int[] arr2 = new int[arr1.length];
        for (int i = 0, j = arr1.length - 1; i < arr1.length; i++, j--) {
            arr2[j] = arr1[i];
        }
        for (int i : arr2) {
            System.out.println(i);
        }

    }
}
