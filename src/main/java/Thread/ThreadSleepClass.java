package Thread;

public class ThreadSleepClass extends Thread {

    @Override
    public void run() {

        try {
            for(int i=0; i<5; i++) {
                System.out.println(i);
                Thread.sleep(2000);
            }
        } catch(Exception e) {
            System.out.println("Thread");
        }
    }

    public static void main(String[] args) {
        ThreadSleepClass t1 = new ThreadSleepClass();
        ThreadSleepClass t2 = new ThreadSleepClass();

        t1.start();
        t2.start();

    }




}
