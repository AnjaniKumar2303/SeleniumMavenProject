package ComparableAndComparator.Comparator;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Student> s = new ArrayList<Student>();
        s.add(new Student(10, "Aman"));
        s.add(new Student(20, "Pintu"));
        s.add(new Student(12, "Sintu"));
        s.add(new Student(24, "Mohan"));

        Iterator<Student> itr = s.iterator();
         while(itr.hasNext()) {
             Student s1 = (Student) itr.next();
             System.out.println(s1.age + " " + s1.name);
         }

        System.out.println("Sorting by age.");

        Collections.sort(s, new AgeComparator());

        itr = s.iterator();
        while(itr.hasNext()) {
            Student s2 = (Student) itr.next();
            System.out.println(s2.age + " " + s2.name);
        }

        System.out.println("Sorting by name.");

        Collections.sort(s, new NameComparator());

        itr = s.iterator();
        while(itr.hasNext()) {
            Student s3 = (Student) itr.next();
            System.out.println(s3.age + " " + s3.name);
        }




    }
}
