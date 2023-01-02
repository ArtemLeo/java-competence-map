package Primitives_BasicStructures.Udemy_Alishev_Primitives_BasicStructures;

import java.util.Arrays;

public class Primitives_12_ForEach_StringArrays {
    public static void main(String[] args) {
        // String Array;
        String[] arr1 = new String[3];
        arr1[0] = "Hello";
        arr1[1] = "Bye";
        arr1[2] = "Java";
        System.out.println(arr1[0]);
        System.out.println(arr1[2]);
        System.out.println(Arrays.toString(arr1));
        System.out.println("------------------------");

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("------------------------");

        // For Each: for (data type + name data type: object)
        for (String stringName : arr1) {
            System.out.println(stringName);
        }
        System.out.println("------------------------");

        // The SUM of the numbers in the array;
        int[] arr2 = new int[]{23, 4, 1, 65, 32, 65, 3, 234};
        int sum = 0;
        for (int intSum : arr2) {
            sum += intSum;
            System.out.println("Next number = " + intSum);
        }
        System.out.println("The SUM of the numbers in the array = " + sum);
    }
}
