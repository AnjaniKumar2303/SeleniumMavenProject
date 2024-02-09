package Thread.SynchronizationExample;

public class C {

    public synchronized void print(int num) {

        for(int i=num; i>=0; i--) {
            System.out.println(i);

            try {

                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
