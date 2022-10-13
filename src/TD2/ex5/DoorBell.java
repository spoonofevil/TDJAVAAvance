package TD2.ex5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DoorBell {
    private Socket clientSocket;
    PrintWriter out;
    BufferedReader in;
    void run(ServerSocket serverSocket){
        try {
            System.out.println("on lance le serv sur le port "+serverSocket.getLocalPort());
            clientSocket = serverSocket.accept();
            System.out.println("serv: on s'est co");
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            sendDate();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    void send(String s){
        System.out.println(this.toString()+ ": on va lancer le write du message "+s);
        out.println(s);
        System.out.println(this.toString()+": on a lancer un message "+s);
    }
    public void sendDate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String dateFormate=dateFormat.format(date);
        send(dateFormate);
    }
}
