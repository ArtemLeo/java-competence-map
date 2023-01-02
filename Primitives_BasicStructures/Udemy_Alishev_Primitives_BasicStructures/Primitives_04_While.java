package Primitives_BasicStructures.Udemy_Alishev_Primitives_BasicStructures;

public class Primitives_04_While {
    public static void main(String[] args) {
        // While is executed as long as the condition is "true"
        int value = 0;
        int count;
        while (value <= 10) {
            count = value;
            System.out.println("Count value = " + count);
            value++;
        }
    }
}
