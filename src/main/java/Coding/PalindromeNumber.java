package Coding;

public class PalindromeNumber {

    public static void main(String[] args) {

        int number = 24642;
        int n = number;
        int r = 0;
        int num = 0;

        while(n>0) {

            r = n%10;
            num = (num * 10) + r;
            n = n/10;
        }

        if(number == num) {
            System.out.println("Palindrome number");
        }
    }

}
