package Primitives_BasicStructures.Udemy_Alishev_Primitives_BasicStructures;

import java.util.Arrays;

public class Primitives_11_Arrays {
    public static void main(String[] args) {
        // Arrays initialization;
        int[] arr1 = new int[]{15, 3, 423, 42, 20, 121};
        System.out.println(arr1[0]);
        System.out.println(arr1[5]);
        System.out.println(Arrays.toString(arr1));
        System.out.println("----------------------");

        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 10;
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println("----------------------");

        int[] arr3 = new int[5];
        System.out.println(arr3[0] = 0);
        System.out.println(arr3[1] = 10);
        System.out.println(arr3[2] = 20);
        System.out.println(arr3[3] = 30);
        System.out.println(arr3[4] = 40);
        System.out.println(Arrays.toString(arr3));
    }
}
