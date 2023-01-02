package Primitives_BasicStructures.Udemy_Sumin_Primitives_BasicStructures;

public class Primitives_01_Variables {
    public static void main(String[] args) {
        int totalDays = 5000;
        int years = totalDays / 365;
        int months = (totalDays % 365) / 31;
        int days = totalDays - (years * 365) - (months * 31);
        System.out.println("Total days = " + totalDays);
        System.out.println("Years = " + years);
        System.out.println("Months = " + months);
        System.out.println("Days = " + days);
    }
}
