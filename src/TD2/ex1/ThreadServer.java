package TD2.ex1;

public class ThreadServer extends Thread{
    private final server server;
    int port;
    ThreadServer(int port){
        server = new server();
    }
    @Override
    public synchronized void  run() {
        server.start(port);
        this.notifyAll();
    }

    public TD2.ex1.server getServer() {
        return server;
    }

    public void close(){ server.close();
    }
}
