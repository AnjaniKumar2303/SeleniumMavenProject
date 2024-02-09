package Thread.ThreadState.BlockedState;

public class BlockedState {

    public static void main(String[] args) throws InterruptedException {

        DemoBlockedRunnable d = new DemoBlockedRunnable();
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);

        t1.start();
        t2.start();
        Thread.sleep(1000);

        System.out.println(t2.getState());

    }
}
