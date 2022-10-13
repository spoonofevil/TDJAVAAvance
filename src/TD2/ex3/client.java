package TD2.ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class client extends SocketImplement{
    java.net.Socket socket;
    void start(int port){
        try {
            System.out.println("client: on lance le client sur le port "+port);
            socket =new Socket(InetAddress.getLocalHost(),port);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("client: on s'est co");
            listen();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void close(){
        //super.close();
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("on close le client");

    }

    @Override
    public String toString() {
        return "Client";
    }
}
