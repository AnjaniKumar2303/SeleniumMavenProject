package Thread;

class JoinClassDemo extends Thread {

    @Override
    public void run() {

        for(int i=0; i<2; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(500);
            } catch(Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}


public class JoinClass {

    public static void main(String[] args) throws Exception {

        JoinClassDemo t1 = new JoinClassDemo();
        JoinClassDemo t2 = new JoinClassDemo();
        JoinClassDemo t3 = new JoinClassDemo();

        t1.start();
        t1.join();
        t2.start();
        t3.start();

    }

}
