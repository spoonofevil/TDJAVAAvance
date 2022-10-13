package TD2.ex3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class server  extends  SocketImplement{

    private ServerSocket serverSocket;
    private Socket clientSocket;

    public synchronized void start(int port){
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("on lance le serv sur le port "+port);
            notify();
            clientSocket = serverSocket.accept();
            System.out.println("serv: on s'est co");
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            sendDate();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void sendDate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String dateFormate=dateFormat.format(date);
        send(dateFormate);
    }
    public void close() {
        //super.close();
        try {
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("on close le serv");
    }

    @Override
    public String toString() {
        return "Server";
    }

}
