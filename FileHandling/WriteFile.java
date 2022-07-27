package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {

        String text = "The local file is created";

        BufferedWriter f_writer = new BufferedWriter(new FileWriter("C:\\Users\\Qaisar Abbas\\Desktop\\m.txt"));

        f_writer.write(text);

        f_writer.close();

    }

}
