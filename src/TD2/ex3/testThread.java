package TD2.ex3;

public class testThread {
    public static void main(String[] args) {
        ThreadServer server=new ThreadServer(1234);
        server.start();
        ThreadClient client=new ThreadClient(1234);
        client.start();
        /*client.listen();
        server.send("b");
        server.close();
        client.close();
        System.out.println("on a close");

        /*client.getClient().close();
        server.getServer().close();
        System.out.println("tt est bon");*/
    }
}
