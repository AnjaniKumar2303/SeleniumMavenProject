package EqualsAndHashcode;

import java.util.Objects;

public class Student {

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) {
            return false;
        }
        if(!(o instanceof Student)) {
            return false;
        }
        if(o == this) {
            return true;
        }
        return this.getId() == ((Student) o).getId();
    }

    @Override
    public int hashCode() {
        return id;
    }
}
