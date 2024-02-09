package Thread.ThreadState.WaitingState;

public class ThreadClass2 implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        System.out.println(ThreadClass1.t1.getState());
    }
}
