package TD2.ex4;

public class ClientMain {
    public static void main(String[] args) {
        ClientScanPort c=new ClientScanPort(1,10);
        c.scanPort();
    }
}
