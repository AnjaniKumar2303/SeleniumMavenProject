package Thread.Synchronization;

public class RunClass {

    public static void main(String[] args) {

        ClassA a = new ClassA(new ClassC());
        ClassB b = new ClassB(new ClassC());
        a.start();
        b.start();
    }

}
