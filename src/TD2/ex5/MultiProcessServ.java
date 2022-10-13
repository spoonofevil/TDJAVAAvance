package TD2.ex5;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiProcessServ implements Runnable{
    private ServerSocket serverSocket;
    int port;
    MultiProcessServ(int port){
        this.port=port;
        try {
            serverSocket =new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true){
            new DoorBell().run(serverSocket);

        }
    }
}
