package TD2.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class SocketImplement {

    PrintWriter out;
    BufferedReader in;
    void listen(){
        try {
            System.out.println("client: on va lancer le read");
            String res= String.valueOf(in.read());
            System.out.println("client: on a recu un message "+res);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void send(String s){
        System.out.println(this.toString()+ ": on va lancer le write du message "+s);
        out.write(s);
        System.out.println("client: on a lancer un message "+s);
    }
    public void close() {
        try {
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
