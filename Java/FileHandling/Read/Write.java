package FileHandling.Read;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Write {
    private static final int BUFFER_SIZE = 4; 
 
    public static void main(String[] args) {
        try (
            InputStream inputStream = new FileInputStream("C:/Users/Qaisar Abbas/Desktop/Mustafa_Zaidi_VisualCV_Resume.pdf");
            OutputStream outputStream = new FileOutputStream("C:/Users/Qaisar Abbas/Desktop/Ticket1.pdf");
        ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;
 
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        inputStream.close();
        outputStream.close();    
 
        } catch (IOException ex) {
            System.out.print("There is an error");
        }
    }
}
