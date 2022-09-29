package FileHandling;
import static java.nio.file.StandardCopyOption.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

class Main {

    public static void main(String[] args) throws IOException {
        File src = new File("C:/Users/Qaisar Abbas/Desktop/input.txt");
        File dest = new File("C:/Users/Qaisar Abbas/Desktop/output.txt");

        Files.copy(src.toPath(), dest.toPath(), REPLACE_EXISTING);

    }
}
