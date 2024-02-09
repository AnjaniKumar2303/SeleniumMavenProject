package EqualsAndHashcode;

public class Test {

    public static void main(String[] args) {

        Student s1 = new Student(10, "Aman");
        Student s2 = new Student(10, "Aman");
        System.out.println(s1==s2);
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1.equals(s2));
    }
}
