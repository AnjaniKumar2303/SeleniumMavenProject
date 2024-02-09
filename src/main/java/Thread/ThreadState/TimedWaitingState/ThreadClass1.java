package Thread.ThreadState.TimedWaitingState;

public class ThreadClass1 extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch(Exception e) {
            System.out.println(e);
        }
    }

}
