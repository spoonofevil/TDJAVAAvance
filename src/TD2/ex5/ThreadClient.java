package TD2.ex5;

import java.io.IOException;
import java.net.InetAddress;

public class ThreadClient extends Thread{
    private final client client;
    int port;
    InetAddress address;
    ThreadClient(int port){
        this.port=port;
        client = new client("client");
    }
    @Override
    public synchronized void run() {
        try {
            this.wait(100);
            System.out.println("c bon");
            client.start(port);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.notifyAll();
    }
    synchronized void listen(){
        client.listen();
        notifyAll();
    }

    synchronized void send(String s){
        client.send(s);
    }

    public TD2.ex5.client getClient() {
        return client;
    }

    public void close(){
        client.close();
    }
}
