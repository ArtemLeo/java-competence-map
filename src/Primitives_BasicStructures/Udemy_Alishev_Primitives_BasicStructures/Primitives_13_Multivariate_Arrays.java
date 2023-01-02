package Primitives_BasicStructures.Udemy_Alishev_Primitives_BasicStructures;

public class Primitives_13_Multivariate_Arrays {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{1, 2, 3,}, {4, 5, 6,}, {7, 8, 9}};
        System.out.println("Index arr1 [2][1] = " + arr1[2][1]);
        System.out.println("Index arr1 [0][2] = " + arr1[0][2]);
        System.out.println("---------------------");

        String[][] arr2 = new String[2][3];
        arr2[0][1] = "Hello";
        System.out.println("Index arr2 [0][1] = " + arr2[0][1]);
        System.out.println("---------------------");

        int[][] arr3 = new int[][]{{1, 2, 3,}, {4, 5, 6,}, {7, 8, 9}};
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
