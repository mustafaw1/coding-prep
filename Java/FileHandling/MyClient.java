package FileHandling;

import java.net.*;
import java.io.*;

class MyClient {
    public static void main(String args[]) throws Exception {
        Socket serversSocket = new Socket("localhost", 6666);
        {
            if (serversSocket.isConnected())
                System.out.println("Server Connected: " + serversSocket);
            else
                System.out.print("Not COnnected: " + serversSocket);

        }
        DataInputStream inputStream = new DataInputStream(serversSocket.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(serversSocket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String command = " ", inpuString = "";
        while (!command.equals("/stop")) {
            command = br.readLine();
            outputStream.writeUTF(command);
            outputStream.flush();
            inpuString = inputStream.readUTF();
            System.out.println("Server says: " + inpuString);
            if (command.equals("/stop")){
                outputStream.close();
                serversSocket.close();

            }
                
        }
    }
}
