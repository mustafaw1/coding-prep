package FileHandling;

import java.net.*;
import java.io.*;

class MyServer {
    public static void main(String args[]) throws Exception {
        ServerSocket listeningServerSocket = new ServerSocket(6666, 40, null);
        Socket clientSocket = listeningServerSocket.accept();
        {
            if (clientSocket.isConnected())
                System.out.println("Client Connected: " + clientSocket);
            else
                System.out.print("Not Connected: " + clientSocket);
        }

        DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String command = "", inputString = "";
        while (!command.equals("/stop")) {
            command = inputStream.readUTF();
            System.out.println("client says: " + command);
            inputString = br.readLine();
            outputStream.writeUTF(inputString);
            outputStream.flush();
            if (command.equals("/stop")) {
                System.out.println("Shutting down Socket server!!");
                inputStream.close();
                clientSocket.close();
                listeningServerSocket.close();
            }

        }

    }
}
