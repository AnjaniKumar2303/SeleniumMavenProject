package Collections.SortedSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Apple");
        ts.add("Mango");
        ts.add("Banana");
        ts.add("Apple");
        ts.add("Orange");

        Iterator itr = ts.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
