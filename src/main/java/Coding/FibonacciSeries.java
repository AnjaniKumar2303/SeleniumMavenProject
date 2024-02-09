package Coding;

public class FibonacciSeries {

    void fib(int n1, int n2, int n) {

        if(n ==0) {
            return;
        }

        System.out.print(n1 + " ");
        fib(n2, n1+n2, n-1);

    }

    public static void main(String[] args) {

        int n = 10;

        FibonacciSeries f = new FibonacciSeries();

        f.fib(0, 1, n);

    }
}
