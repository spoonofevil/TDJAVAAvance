package TD2.ex3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadServer extends Thread{
    private final server server;
    int port;
    ThreadServer(int port){
        this.port=port;
        server = new server();
    }
    @Override
    public synchronized void  run() {
        server.start(port);
        this.notifyAll();
    }

    public TD2.ex3.server getServer() {
        return server;
    }

    public void sendDate(){
        server.sendDate();
        notifyAll();
    }
    synchronized void listen(){
        server.listen();
        notifyAll();
    }

    synchronized void send(String s){
        server.send(s);
        notifyAll();
    }
    public void close(){ server.close();
    }
}
