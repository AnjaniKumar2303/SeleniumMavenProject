package Thread.SynchronizationExample;

public class A extends Thread {

    C c;

    A(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        c.print(5);
    }
}
