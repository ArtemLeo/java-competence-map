package IO_NIO_Input_Output.Udemy_Tregulov_Input_Output.IO_07_Serialization.Programmer1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) throws IOException {
        List<String> employeesOut = new ArrayList<>();
        employeesOut.add("Tom");
        employeesOut.add("Den");
        employeesOut.add("Zoe");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("ObjectOutputStream.bin"))) {
            objectOutputStream.writeObject(employeesOut);
            System.out.println("Done!");
        } catch (
                IOException e) {
            throw new IOException(e);
        }
        System.out.println("-------------------------");
    }
}
