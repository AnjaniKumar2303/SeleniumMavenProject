class ParentClass {
    String s = "Hello";

    ParentClass() {
        System.out.println("Parent Class Constructor");
    }
}

class ChildClass extends ParentClass {
    ChildClass() {
        super();
    }
    public void display() {
        System.out.println(super.s);
    }
}

public class SuperClass {
    public static void main(String[] args) {
        ChildClass c = new ChildClass();
        c.display();
    }
}
