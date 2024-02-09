package ComparableAndComparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Student> l = new ArrayList<>();
        l.add(new Student(10, "AAAA"));
        l.add(new Student(20, "BBBB"));
        l.add(new Student(12, "CCCC"));
        l.add(new Student(22, "DDDD"));

        Iterator itr = l.iterator();

        while(itr.hasNext()) {
            Student s = (Student) itr.next();
            System.out.println(s.age + " " + s.name);
        }
        System.out.println(" ");

        Collections.sort(l);

        itr = l.iterator();

        while(itr.hasNext()) {
            Student s = (Student) itr.next();
            System.out.println(s.age + " " + s.name);
        }

    }
}
