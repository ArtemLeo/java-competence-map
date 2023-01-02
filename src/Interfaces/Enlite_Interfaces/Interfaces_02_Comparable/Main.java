package Interfaces.Enlite_Interfaces.Interfaces_02_Comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Man[] men = new Man[3];
        men[0] = new Man(5, "John");
        men[1] = new Man(3, "Jack");
        men[2] = new Man(4, "Adam");

        Arrays.sort(men);
        for (int i = 0; i < men.length; i++){
            System.out.println(men[i]);
        }
        System.out.println("-----------------------");
        System.out.println("After sorting: \n" + Arrays.toString(men));


    }
}
