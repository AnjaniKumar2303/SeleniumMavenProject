package Thread.ThreadState.WaitingState;

public class ThreadClass1 implements Runnable {

    public static Thread t1;


    @Override
    public void run() {
        Thread t2 = new Thread(new ThreadClass2());
        t2.start();
        try {
            t2.join();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        t1 = new Thread(new ThreadClass1());
        t1.start();

    }
}
