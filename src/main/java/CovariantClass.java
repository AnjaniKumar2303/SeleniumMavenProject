import org.checkerframework.checker.units.qual.C;

class A {
    A a() {
        return this;
    }
}


public class CovariantClass extends A {

    CovariantClass b() {
        return this;
    }

    void display() {
        System.out.println("Display");
    }

    public static void main(String[] args) {

        CovariantClass c = new CovariantClass();
        CovariantClass c1 = c.b();
        c1.display();


    }


}
