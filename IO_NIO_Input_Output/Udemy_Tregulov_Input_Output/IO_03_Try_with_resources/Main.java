package IO_NIO_Input_Output.Udemy_Tregulov_Input_Output.IO_03_Try_with_resources;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // TRY WITH RESOURCES can be used without the CATHE-FINALLY blocks if it accepts arguments in the TRY block;

        try (FileReader reader = new FileReader("File_Writer-Reader.txt"))
        // FileWriter writer = new FileWriter("File_Writer-Reader.txt")
        {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("---------------------------");
            System.out.println("Done");
        }
    }
}
