package Thread.ThreadState;

public class ThreadState extends Thread{

    public void run() {

        System.out.println("Thread");

    }

    public static void main(String[] args) {

        try {

            ThreadState t = new ThreadState();
            System.out.println(t.getState());
            t.start();
            System.out.println(t.getState());
            t.sleep(10);
            System.out.println(t.getState());

        } catch(Exception e) {
            System.out.println(e);
        }




    }



}
