package ex6;

import java.util.Date;

public class PoliteRunner extends Thread {
    private int tick = 1;
    private final int num;
    public PoliteRunner(int num) {
        this.num = num;
    }
    public void run() {
        Long debut= new Date().getTime();

        while (tick < 400000) {
            tick++;
            if ((tick % 50000) == 0){
                Thread.yield();
                System.out.println((new Date().getTime()-debut)+ "µs : Thread #" + num + ", tick = " + tick);
            }
        }
    }
}