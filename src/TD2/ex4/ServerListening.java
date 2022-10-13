package TD2.ex4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListening {
    ServerSocket serverSocket;
    Socket clientSocket;
    public synchronized void start(int port){
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("on lance le serv sur le port "+port);
            clientSocket = serverSocket.accept();
            System.out.println("serv: on s'est co");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
