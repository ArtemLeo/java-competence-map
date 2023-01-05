package IO_NIO.Udemy_Tregulov_Input_Output.IO_01_Intro_to_Streams_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String brodsky = """
                ------ИОСИФ БРОДСКИЙ------
                Сверни с проезжей части в полу-
                слепой проулок и, войдя
                в костёл, пустой об эту пору,
                сядь на скамью и, погодя,
                в ушную раковину Бога,
                закрытую для шума дня,
                шепни всего четыре слога:
                — Прости меня.""";

        String year = "\n----------1971----------";

        // Writing a string to a (text) file;
        // If you do not set away for the file - it will be created in the root of the current project;
        FileWriter writer = null;
        try {
            writer = new FileWriter("File_Writer-Reader.txt");
            for (int i = 0; i < brodsky.length(); i++) {
                writer.write(brodsky.charAt(i));
            }
            // or
            // writer.write(brodsky);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
        // append: true - adding to the file, not overwriting it;
    }
}
