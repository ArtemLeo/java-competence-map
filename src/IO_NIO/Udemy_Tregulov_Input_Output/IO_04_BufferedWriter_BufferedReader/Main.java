package IO_NIO.Udemy_Tregulov_Input_Output.IO_04_BufferedWriter_BufferedReader;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("File_Writer-Reader.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("Buffered_Writer-Reader.txt"))) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            // or
            // method readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                // line transfer;
                writer.write('\n');
            }
            System.out.println();
            System.out.println("---------------------------");
            System.out.println("Done");
        }
    }
}
