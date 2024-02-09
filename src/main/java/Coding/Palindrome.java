package Coding;

public class Palindrome {

    public String reverse(String s) {
        if((s==null) || (s.length()<=1)) {
            return s;
        }
        return s.substring(s.length()-1) + reverse(s.substring(0, s.length()-1));
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        String s ="littil";
        System.out.println(p.reverse(s));
    }
}
