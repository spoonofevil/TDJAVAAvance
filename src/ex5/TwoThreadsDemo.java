package ex5;

    public class TwoThreadsDemo {
        public static void main (String[] args) {
            new SimpleThread("Jamaica").start();
            new SimpleThread("Fiji").start();
            //new SimpleThread("bora bora").start();
        }
    }

