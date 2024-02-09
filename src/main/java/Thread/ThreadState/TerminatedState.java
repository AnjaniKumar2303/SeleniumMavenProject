package Thread.ThreadState;

public class TerminatedState extends Thread {

    @Override
    public void run() {
       System.out.println("Thread");
    }

    public static void main(String[] args) throws Exception {
        TerminatedState t = new TerminatedState();
        t.start();
        Thread.sleep(1000);
        System.out.println(t.getState());
    }
}
