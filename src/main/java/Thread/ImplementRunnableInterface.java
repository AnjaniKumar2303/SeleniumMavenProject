package Thread;

public class ImplementRunnableInterface implements Runnable {

    public void run() {
        System.out.println("Thread has started.");
    }

    public static void main(String[] args) {

        ImplementRunnableInterface e = new ImplementRunnableInterface();
        Thread t = new Thread(e);
        t.start();
    }
}
