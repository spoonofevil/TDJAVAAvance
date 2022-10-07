package ex4;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Toolkit;
public class AnnoyingBeepSchedule {
    Toolkit toolkit;
    Timer timer;
    Long debut,fin;
    public AnnoyingBeepSchedule() {
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.scheduleAtFixedRate(new RemindTask(),
                0, //initial delay
                1*1000); //subsequent rate
        debut= new Date().getTime();
    }
    class RemindTask extends TimerTask {
        int numWarningBeeps = 3;
        public void run() {
            fin= new Date().getTime();
            if (numWarningBeeps > 0 && (fin-debut<=5)) {
                toolkit.beep();
                System.out.println("Beep!");
                numWarningBeeps--;
            } else {
                toolkit.beep();
                System.out.println("Time's up!");
//timer.cancel(); //Not necessary because we call System.exit
                System.exit(0); //Stops the AWT thread (and everything else)
            }
        }
    }
    public static void main(String args[]) {
        System.out.println("About to schedule task.");
        new AnnoyingBeepSchedule();
        System.out.println("Task scheduled.");
    }
}
