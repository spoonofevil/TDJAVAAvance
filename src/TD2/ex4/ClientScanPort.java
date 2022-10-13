package TD2.ex4;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientScanPort {
    int minPort;
    int maxPort;
    Socket socket;
    ClientScanPort(int min,int max){
        minPort=min;
        maxPort=max;
    }

    void scanPort(){
        for (int i = minPort; i <= maxPort; i++) {
            if(portLibre(i)){
                System.out.println("Le server ecoute sur le port "+i);
            }else{
                System.out.println("Le server n'ecoute pas sur le port "+i);
            }
        }
    }


    boolean portLibre(int port){
        try {
            socket =new Socket(InetAddress.getLocalHost(),port);
            return true;
        } catch (IOException e) {
            //e.printStackTrace();
            return false;
        }
    }
}
