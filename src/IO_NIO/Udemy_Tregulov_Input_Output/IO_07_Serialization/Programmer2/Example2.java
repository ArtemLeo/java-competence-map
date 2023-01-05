package IO_NIO.Udemy_Tregulov_Input_Output.IO_07_Serialization.Programmer2;

import IO_NIO.Udemy_Tregulov_Input_Output.IO_07_Serialization.Programmer1.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example2 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Employee employee;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("ObjectOutputStreamEmp.bin"))) {
            employee = (Employee) objectInputStream.readObject();
            System.out.println(employee);
        } catch (IOException e) {
            throw new IOException(e);
        }
    }
}
