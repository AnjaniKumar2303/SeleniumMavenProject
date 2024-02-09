package Thread.NewSynchronizedExample;

public class Test {

    public static void main(String[] args) {

        ThreadC c = new ThreadC();

        ThreadA a = new ThreadA(c);
        ThreadB b = new ThreadB(c);

        a.start();
        b.start();


    }
}
