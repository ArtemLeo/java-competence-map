package IO_NIO_Input_Output.Udemy_Tregulov_Input_Output.IO_08_Class_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("Class_RandomAccessFile.txt", "rw")) {
            // Read one letter from our file;
            int a = file.read();
            System.out.println("Letter from file: " + (char) a);

            // Read one string from our file;
            String s = file.readLine();
            System.out.println("String from file: " + s);

            // Move the pointer and read from a given location;
            file.seek(101);
            String s1 = file.readLine();
            System.out.println("Reading from 101 characters: " + s1);

            // Shows which position the pointer is in;
            long position = file.getFilePointer();
            System.out.println("Pointer in position: " + position);

            // Adding the name of the author of the poem;
            file.seek(file.length()-1);
            file.writeBytes("\n\t\tJoseph Brodsky");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
