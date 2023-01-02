package IO_NIO_Input_Output.Udemy_Tregulov_Input_Output.IO_05_FileInputStream_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (FileInputStream inputStream = new FileInputStream("image.jpg");
             FileOutputStream outputStream = new FileOutputStream("File_Out-In_put_Stream.jpg")) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("Done!");
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (
                IOException e) {
            throw new IOException(e);
        }
    }
}
