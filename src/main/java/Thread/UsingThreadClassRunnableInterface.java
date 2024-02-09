package Thread;

public class UsingThreadClassRunnableInterface implements  Runnable{

    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {

        Runnable r = new UsingThreadClassRunnableInterface();
        Thread t = new Thread(r, "Thread");
        t.start();
        System.out.println(t.getName());
    }
}
