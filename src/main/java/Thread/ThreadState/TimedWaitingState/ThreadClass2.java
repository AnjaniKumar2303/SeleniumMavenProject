package Thread.ThreadState.TimedWaitingState;

public class ThreadClass2  {

    public static void main(String[] args) throws Exception {

        ThreadClass1 t = new ThreadClass1();
        t.start();
        Thread.sleep(1000);
        System.out.println(t.getState());

    }

}
