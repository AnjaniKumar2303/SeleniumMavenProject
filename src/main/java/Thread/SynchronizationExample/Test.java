package Thread.SynchronizationExample;

public class Test {

    public static void main(String[] args) {

        C c = new C();

        A a = new A(c);
        B b = new B(c);
        a.start();
        b.start();
    }
}
