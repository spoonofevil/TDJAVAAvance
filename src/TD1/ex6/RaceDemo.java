package TD1.ex6;
public class RaceDemo {
    private final static int NUMRUNNERS = 2;
    public static void main(String[] args) {
        TD1.ex6.PoliteRunner[] runners = new TD1.ex6.PoliteRunner[NUMRUNNERS];
        for (int i = 0; i < NUMRUNNERS; i++) {
            runners[i] = new TD1.ex6.PoliteRunner(i);
            runners[i].setPriority(2);
        }
        for (int i = 0; i < NUMRUNNERS; i++)
            runners[i].start();
    }
}