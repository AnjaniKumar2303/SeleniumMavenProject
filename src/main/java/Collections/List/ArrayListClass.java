package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(100);
        a.add(80);
        System.out.println(a);
        Iterator itr = a.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
