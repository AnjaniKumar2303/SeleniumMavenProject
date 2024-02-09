package Thread.Synchronization;

public class ClassC {

    public synchronized void print(int n) {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(n * i);
                    Thread.sleep(500);
                }
            } catch (Exception e) {
                System.out.println(e);

            }
    }
}
