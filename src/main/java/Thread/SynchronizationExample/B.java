package Thread.SynchronizationExample;

public class B extends Thread {

    C c;

    B(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        c.print(10);
    }
}
