package IO_NIO_Input_Output.Udemy_Tregulov_Input_Output.IO_09_Class_File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("File_class.txt");
        File folder = new File("C:\\Users\\User\\Desktop\\A");

        // Methods of class File:
        // getAbsolutePath - get the absolute path of the file/folder;
        System.out.println(file.getAbsolutePath());
        System.out.println(folder.getAbsolutePath());
        System.out.println("--------------------------");

        // isAbsolute - whether the file/folder path is absolute (true/false);
        System.out.println(file.isAbsolute());
        System.out.println(folder.isAbsolute());
        System.out.println("--------------------------");

        // isDirectory - the file is a folder or not (true/false);
        System.out.println(file.isDirectory());
        System.out.println(folder.isDirectory());
        System.out.println("--------------------------");

        // exists - our file exists or not (true/false);
        System.out.println(file.exists());
        System.out.println(folder.exists());
        System.out.println("--------------------------");

        // createNewFile (for file), mkdir (for folder) - create a new file/folder;
        System.out.println(file.createNewFile());
        System.out.println(folder.mkdir());
        System.out.println("--------------------------");

        // length - get the file/folder size. Folder size will always be 0 (you need to find the sum of the file sizes);
        System.out.println(file.length());
        System.out.println(folder.length());
        System.out.println("--------------------------");

        // delete - deleting a file/folder. This method will not delete a folder unless it is empty;
        System.out.println(file.delete());
        System.out.println(folder.delete());
        System.out.println("--------------------------");

        // listFiles - output the contents of the folder with an array;
        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println("--------------------------");

        // isHidden - whether this file/folder is hidden or not;
        System.out.println(file.isHidden());
        System.out.println(folder.isHidden());
        System.out.println("--------------------------");

        // canRead - whether there is reading access to the file/folder;
        // canWrite - whether there is writing access to the file/folder;
        // canExecute - whether there is executing access to the file/folder;
        System.out.println(file.canRead());
        System.out.println(folder.canRead());
        System.out.println(file.canWrite());
        System.out.println(folder.canWrite());
        System.out.println(file.canExecute());
        System.out.println(folder.canExecute());
    }
}
