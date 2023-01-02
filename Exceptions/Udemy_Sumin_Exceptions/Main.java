package Exceptions.Udemy_Sumin_Exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        try {
            int b = 7 / a;
            String s = "123 abc";
            int i = Integer.parseInt(s);
        } catch (ArithmeticException e1) {
            System.out.println("На ноль делить нельзя!");
        } catch (NumberFormatException e2) {
            System.out.println("Нельзя конвертировать буквы в цифры!");
        } catch (Exception all) {
            System.out.println("Exception ловит абсолютно все ошибки!");
        } finally {
            System.out.println("Мы в любом случае попадаем в блок finally!");
        }
        System.out.println("Программа выполняется дальше!");
    }

}
