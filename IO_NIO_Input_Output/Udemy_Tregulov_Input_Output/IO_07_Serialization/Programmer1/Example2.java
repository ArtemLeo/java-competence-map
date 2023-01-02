package IO_NIO_Input_Output.Udemy_Tregulov_Input_Output.IO_07_Serialization.Programmer1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example2 {
    public static void main(String[] args) throws IOException {
        Car car = new Car("Nissan", "white");
        Employee employee = new Employee("Tom", "Hurt","IT", 2000, car);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("ObjectOutputStreamEmp.bin"))) {
            objectOutputStream.writeObject(employee);
            System.out.println("Done!");
        }
    }
}
