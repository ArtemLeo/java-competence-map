package Exceptions.Udemy_Alishe_Exceptions.Exceptions_03_Checked_Unchecked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exceptions: Checked Exception (Compile time exception) - исключительные случаи в работе программы;
        // Error:      Unchecked Exception (Runtime exception) - ошибка в работе программы;

        // Checked:
        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception");
        }

        // Unchecked:
        // ArithmeticException:
        int a = 1 / 0;

        // NullPointerException:
        String name = null;
        name.length();

        // ArrayIndexOutOfBoundsException:
        int[] array = new int[2];
        System.out.println(array[2]);
    }
}
