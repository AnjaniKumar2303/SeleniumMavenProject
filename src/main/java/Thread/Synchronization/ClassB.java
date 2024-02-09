package Thread.Synchronization;

public class ClassB extends Thread {

    ClassC c;

    ClassB(ClassC c) {
        this.c = c;
    }

    @Override
    public void run() {
        ClassC c = new ClassC();
        c.print(100);

    }
}
