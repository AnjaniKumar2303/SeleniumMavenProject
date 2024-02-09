package CodeAgain;

class Parent {

    Parent get() {
        return this;
    }

}

public class CovariantClass extends Parent {

    CovariantClass get() {
        return this;
    }

    void print() {
        System.out.println("Covariant return type");

    }

    public static void main(String[] args) {

        new CovariantClass(). get().print();



    }
}
