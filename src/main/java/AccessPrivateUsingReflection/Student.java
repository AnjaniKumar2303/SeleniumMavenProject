package AccessPrivateUsingReflection;

public class Student {

    private int age;
    private String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    private void display() {
        System.out.println("Age is " + age);
        System.out.println("Name is " + name);
    }

}
