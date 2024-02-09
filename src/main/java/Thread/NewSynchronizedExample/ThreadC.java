package Thread.NewSynchronizedExample;

public class ThreadC {

    synchronized void print(int n) {

        try {
            for(int i=n; i>0; i--) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
