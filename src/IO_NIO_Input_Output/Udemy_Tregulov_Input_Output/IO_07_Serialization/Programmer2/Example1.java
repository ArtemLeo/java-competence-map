package IO_NIO_Input_Output.Udemy_Tregulov_Input_Output.IO_07_Serialization.Programmer2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<String> employeesIn = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("ObjectOutputStream.bin"))) {
            employeesIn = (List<String>) objectInputStream.readObject();
            System.out.println(employeesIn);
        } catch (
                IOException e) {
            throw new IOException(e);
        }
    }
}
