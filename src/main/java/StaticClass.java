public class StaticClass {

    static int a = 100;

    void change() {
        a++;
        System.out.println(a);
    }

    public static void main(String[] args) {
        StaticClass s1 = new StaticClass();
        StaticClass s2 = new StaticClass();
        StaticClass s3 = new StaticClass();

        s1.change();
        s2.change();
        s3.change();


    }
}
