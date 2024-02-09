package Composition;

import java.util.ArrayList;
import java.util.List;

public class CompositionClass {

    public static void main(String[] args) {

        List<Office> officeList = new ArrayList();
        officeList.add(new Office("office1", "Bangalore"));
        officeList.add(new Office("office2", "Hyderabad"));

        Company c = new Company("ABCD", officeList);

        List<Office> l = c.getOffices();

        for(Office office : l) {
            System.out.println(office.name + " " + office.address);
        }

    }

}
