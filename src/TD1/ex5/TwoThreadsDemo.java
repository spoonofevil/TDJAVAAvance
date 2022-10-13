package TD1.ex5;

    public class TwoThreadsDemo {
        public static void main (String[] args) {
            new TD1.ex5.SimpleThread("Jamaica").start();
            new TD1.ex5.SimpleThread("Fiji").start();
            //new SimpleThread("bora bora").start();
        }
    }

