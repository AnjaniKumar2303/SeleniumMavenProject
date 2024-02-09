package CodeAgain.Java8;

interface FunctionalInterfaceClass {

    void display(int n);

}

abstract class A implements FunctionalInterfaceClass {

    public static void main(String[] args) {

        FunctionalInterfaceClass f = (int x) -> {System.out.println(x);};

        f.display(10);

    }
}
