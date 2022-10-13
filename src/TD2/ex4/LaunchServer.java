package TD2.ex4;

public class LaunchServer {
    public static void main(String[] args) {
        ServerListening s=new ServerListening();
        s.start(2);
        s.start(5);
    }
}
