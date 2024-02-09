package Collections.Set;

import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("My");
        hashSet.add("name");
        hashSet.add("is");
        hashSet.add("Mohan");
        for(String s : hashSet) {
            System.out.println(s);
        }
    }
}
