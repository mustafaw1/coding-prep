package FileHandling;

import java.io.*;

public class ReadFile {
    // public static void main(String[] args) throws Exception {

    //     File file = new File("C:\\Users\\Qaisar Abbas\\Desktop\\m.txt");
     
    //     BufferedReader br = new BufferedReader(new FileReader(file));

    //     String st;

    //     while ((st = br.readLine()) != null)

    //         System.out.println(st);
    // }

    // ********************************\\

    public static void main(String[] args) throws Exception
    {
 
        
        FileReader fr = new FileReader("C:\\Users\\Qaisar Abbas\\Desktop\\m.txt");
 
   
        int i;
        
        while ((i = fr.read()) != -1)
 
            
            System.out.print((char)i);
            fr.close();
    }
}

