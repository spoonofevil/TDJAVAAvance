package TD2.ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class SocketImplement {

    PrintWriter out;
    BufferedReader in;
    void listen(){
        try {
            System.out.println(this.toString()+ ": on va lancer le read");
            String res= in.readLine();
            System.out.println(this.toString()+": on a recu un message "+res);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void send(String s){
        System.out.println(this.toString()+ ": on va lancer le write du message "+s);
        out.println(s);
        System.out.println(this.toString()+": on a lancer un message "+s);
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
