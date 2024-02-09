package Collections.Enum;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSetClass {

    public enum days {
        mon,tue,wed
    };

    public static void main(String[] args) {

        Set<days> d = EnumSet.of(days.mon, days.tue);
        Iterator itr = d.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
