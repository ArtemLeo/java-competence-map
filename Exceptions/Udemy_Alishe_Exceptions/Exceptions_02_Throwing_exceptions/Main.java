package Exceptions.Udemy_Alishe_Exceptions.Exceptions_02_Throwing_exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("catch IOException");
                }
            }
            System.out.println("-------------------------------------");
            if (x != 0) {
                try {
                    throw new ScannerException("Description of ScannerException ...");
                }catch (ScannerException ex){
                    System.out.println("catch ScannerException");
                }
            }
        }
    }
}
