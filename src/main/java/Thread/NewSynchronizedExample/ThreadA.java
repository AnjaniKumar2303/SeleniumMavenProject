package Thread.NewSynchronizedExample;

public class ThreadA extends Thread {

    ThreadC c;

    ThreadA(ThreadC c) {
        this.c = c;
    }

    public void run() {
        c = new ThreadC();
        c.print(5);

    }





}
