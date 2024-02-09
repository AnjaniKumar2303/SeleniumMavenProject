package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapClass {

    public static void main(String[] args) {

        HashMap<Integer,String> h = new HashMap<>();
        h.put(1, "A");
        h.put(2, "B");

        for (Map.Entry<Integer,String> map : h.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }

        Iterator<Map.Entry<Integer, String>> itr = h.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> map = itr.next();
            System.out.println(map.getKey() + " " + map.getValue());
        }

        for (Map.Entry mp : h.entrySet()) {
            System.out.println(mp.getKey() + " " + mp.getValue());
        }



    }
}
