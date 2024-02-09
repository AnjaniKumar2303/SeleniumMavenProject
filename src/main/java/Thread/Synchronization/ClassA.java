package Thread.Synchronization;

public class ClassA extends Thread {

    ClassC c;

    ClassA(ClassC c) {
       this.c=c;
    }

    @Override
    public void run() {
        ClassC c = new ClassC();
        c.print(5);

    }
}
