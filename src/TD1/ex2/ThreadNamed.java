package TD1.ex2;
public class ThreadNamed extends Thread{
    ThreadNamed(String name) {
        super(name);
    }
    public void run() {
        System.out.println("Hello this is "+this.getName());
    }
}
