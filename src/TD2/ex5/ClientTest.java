package TD2.ex5;

public class ClientTest {

    public static void main(String args[]){

        int port=1234;
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                client client= new client("client 1");
                client.start(port);
                client.close();
            }
        });
        t1.start();
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                client client= new client("client 2");
                client.start(port);
                client.close();
            }
        });
        t2.start();

    }
}
