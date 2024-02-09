package Thread.NewSynchronizedExample;

public class ThreadB extends Thread {

    ThreadC c;

    ThreadB(ThreadC c) {
        this.c = c;
    }

    public void run() {
        c = new ThreadC();
        c.print(10);

    }
}
