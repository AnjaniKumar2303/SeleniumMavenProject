package Composition;

import java.util.List;

public class Company {

    String name;
    List<Office> offices;

    public Company(String name, List<Office> offices) {
        this.name = name;
        this.offices = offices;
    }

    public List<Office> getOffices() {
        return offices;
    }
}
