package TD2.ex1;

public class socketTest {

    public static void main(String args[]){
        server serverTest= new server();
        int port=1234;
        ThreadServer threadServer=new ThreadServer(port);
        ThreadClient threadClient= new ThreadClient(port);
        threadServer.start();
        threadClient.start();
        synchronized (threadClient){
            try {
                threadClient.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }        System.out.println("on a lancer le client");

        threadClient.getClient().listen();
        threadServer.getServer().sendDate();
        threadClient.getClient().send("test 1");
        threadServer.getServer().listen();
        threadServer.close();
        threadClient.close();
    }
}
