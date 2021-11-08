package InputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {

        String[] lines = {"First Line", "Second Line", "Third Line"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/InputOutput/testFile.txt"));

            for (String line : lines) {
                writer.write(line + "\n");
            }

            writer.append("Appended Line");

            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
