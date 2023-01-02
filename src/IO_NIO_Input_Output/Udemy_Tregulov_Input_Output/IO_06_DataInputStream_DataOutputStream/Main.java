package IO_NIO_Input_Output.Udemy_Tregulov_Input_Output.IO_06_DataInputStream_DataOutputStream;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("Data_Out-In_put_Stream.bin"));
             DataInputStream inputStream = new DataInputStream(new FileInputStream("Data_Out-In_put_Stream.bin"));
        ) {
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(120);
            outputStream.writeInt(500);
            outputStream.writeLong(1000000);
            outputStream.writeFloat(3.14f);
            outputStream.writeDouble(123.456);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
