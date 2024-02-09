package Collections.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("My");
        linkedHashSet.add("name");
        linkedHashSet.add("is");
        linkedHashSet.add("Mohan");

        Iterator i = linkedHashSet.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

    }


}
