package Thread;

public class ExtendThreadClass extends Thread {

    public void run() {
        System.out.println("Thread has started.");
    }

    public static void main(String[] args) {

        ExtendThreadClass e = new ExtendThreadClass();
        e.start();
    }
}
