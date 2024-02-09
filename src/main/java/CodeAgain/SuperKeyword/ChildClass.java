package CodeAgain.SuperKeyword;

class Parent {

    int m = 10;

    Parent() {
        System.out.println("Parent Class Contructor");

    }

    void eat() {
        System.out.println("Parent");
    }

}

public class ChildClass extends Parent {

    int m = 20;

    ChildClass() {
        System.out.println("Child Class Contructor");
    }

    void eat() {
        System.out.println("Child");
    }

    void print() {
        super.eat();
        System.out.println(m);
        System.out.println(super.m);
    }

    public static void main(String[] args) {

        ChildClass c = new ChildClass();
        c.print();

    }
}
