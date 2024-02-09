package CodeAgain.Comparable;

public class Student implements Comparable<Student> {

    int age;

    Student(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        if(age == o.age) {
            return 0;
        } else if(age > o.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
