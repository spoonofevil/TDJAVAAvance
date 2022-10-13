package TD2.ex1;

public class ThreadClient extends Thread{
    private final client client;
    int port;
    ThreadClient(int port){
        client = new client();
    }
    @Override
    public synchronized void run() {
        client.start(port);
        this.notify();

    }

    public TD2.ex1.client getClient() {
        return client;
    }

    public void close(){
        client.close();
    }
}
