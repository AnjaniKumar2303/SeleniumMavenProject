package CodeAgain;

public class StaticClass {

    static int i = 0;

    void test() {
        i++;
        System.out.println(i);
    }

    public static void main(String[] args) {

        StaticClass s1 = new StaticClass();
        StaticClass s2 = new StaticClass();

        s1.test();
        s2.test();

    }
}
