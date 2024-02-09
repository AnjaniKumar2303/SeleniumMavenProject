package CodeAgain.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Student s1 = new Student(45, "Amana");
        Student s2 = new Student(34, "Mohan");

        List<Student> s = new ArrayList<>();
        s.add(s1);
        s.add(s2);

        System.out.println(s);

        Iterator itr = s.iterator();

        while(itr.hasNext()) {
            Student ss = (Student) itr.next();
            System.out.println(ss.age);
        }


        Collections.sort(s, new AgeComparator());

        itr = s.iterator();

        while(itr.hasNext()) {
            Student ss = (Student) itr.next();
            System.out.println(ss.age);
        }
    }
}
