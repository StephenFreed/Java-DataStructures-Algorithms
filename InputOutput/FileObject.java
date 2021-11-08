package InputOutput;

import java.io.File;

public class FileObject {

    public static void main(String[] args) {

        File file = new File("src/InputOutput/testFile.txt");

        if (file.exists()) {
            System.out.println("This File Exists.");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
        }
        else {
            System.out.println("File Does Not Exist.");
        }

    }

}
