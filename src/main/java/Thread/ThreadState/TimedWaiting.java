package Thread.ThreadState;

public class TimedWaiting implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        TimedWaiting tw = new TimedWaiting();
        Thread t = new Thread(tw);
        t.start();
        Thread.sleep(1000);
        System.out.println(t.getState());
    }
}
