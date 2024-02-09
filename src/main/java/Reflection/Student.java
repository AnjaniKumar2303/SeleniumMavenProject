package Reflection;

public class Student {

    private int age;
    private String name;

    Student() {

    }

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void display() {
        System.out.println("Student");
    }

}
