package TD2.ex5;

public class ServerTest {

    public static void main(String args[]){
        int port=1234;
        MultiProcessServ serverTest= new MultiProcessServ(port);
        serverTest.run();

    }
}
