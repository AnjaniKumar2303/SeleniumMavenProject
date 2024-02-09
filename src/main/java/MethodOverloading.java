public class MethodOverloading {

    int add(int a, int b) {
        return a+b;
    }

    int add(int a, int b, int c) {
        return a+b+c;
    }

    void display(int a) {
        System.out.println(a);
    }

    void display(String a) {
        System.out.println(a);
    }
}

class Test {

    public static void main(String[] args) {

        MethodOverloading  m= new MethodOverloading();
        System.out.println(m.add(1,2));
        System.out.println(m.add(1,2,3));
        m.display(1);
        m.display("Test");
    }
}
