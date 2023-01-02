package Exceptions.Udemy_Alishe_Exceptions.Exceptions_04_Try_repeatedly_Catch;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) {

        // multi catch block
        try {
            run();
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }

        // repeatedly catch
        try {
            run();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        // catch class Exception - родительский класс покрывает весь спектр ошибок. Последующие catch block не нужны;
        try {
            run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }
}
