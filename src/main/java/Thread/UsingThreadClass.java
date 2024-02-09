package Thread;

public class UsingThreadClass {

    public static void main(String[] args) {

        Thread t1 = new Thread("Thread");

        t1.start();

        System.out.println(t1.getName());
    }
}
