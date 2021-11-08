package InputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/stephenfreed/Projects/Java-DS-Algorithms/src/InputOutput/testFile.txt"));

            String line;
            int counter = 1;

            while  ((line = reader.readLine()) != null && counter < 4) {
                System.out.println(line);
                counter++;
            }

            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
