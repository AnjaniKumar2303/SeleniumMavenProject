package Thread;

public class WaitAndNotify extends Thread {

    public synchronized void display() {
        System.out.println("Multiples");
        try {
            wait();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Completed");
    }




    public synchronized void print(int n) {
        for(int i=1; i<=8; i++) {
            System.out.println(n*i);
        }
        notify();

    }

    public static void main(String[] args) {

        WaitAndNotify w = new WaitAndNotify();

        new Thread() {
            @Override
            public void run() {
                w.display();
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                w.print(100);
            }
        }.start();


    }
}
