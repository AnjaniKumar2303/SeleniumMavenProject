package ComparableAndComparator.Comparable;

public class Student implements Comparable<Student> {

    int age;
    String name;

    Student(int age, String name) {

        this.age = age;
        this.name = name;

    }

    @Override
    public int compareTo(Student s1) {
        if (age == s1.age) {
            return 0;
        } else if (age > s1.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
