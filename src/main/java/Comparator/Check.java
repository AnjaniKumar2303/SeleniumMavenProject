package Comparator;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class Check {

    public static void main(String[] args) {

        ArrayList<Employee> a = new ArrayList<>();

        a.add(new Employee(20, "Mohan"));
        a.add(new Employee(30, "Rohan"));
        a.add(new Employee(12, "Sohan"));
        a.add(new Employee(60, "Bohan"));

        Collections.sort(a, new AgeComparator());

        for(Employee e : a) {

            System.out.println(e.age + " " + e.name);

        }

    }

}
