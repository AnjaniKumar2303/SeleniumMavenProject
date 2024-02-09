package Coding;

public class Factorial {

    int fact(int n) {

        if(n == 1) {
            return 1;
        }

        return n * fact(n-1);
    }

    public static void main(String[] args) {

        int n = 5;

        Factorial f = new Factorial();

        System.out.println(f.fact(n));

    }


}
