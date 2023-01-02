package Exceptions.Udemy_Alishe_Exceptions.Exceptions_01_Exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file");
        try {
            Scanner scanner = new Scanner(file1);
        } catch (FileNotFoundException e) {
            System.out.println("Attention!! File is not fount!");;
        }
        System.out.println("-----------------------------------");

        try {
            readFile();
        } catch (FileNotFoundException ex){
            System.out.println("Exception handling in Main");
        }
    }
    public static void readFile() throws FileNotFoundException {
        File file2 = new File("file");
        Scanner scanner = new Scanner(file2);
    }
}
