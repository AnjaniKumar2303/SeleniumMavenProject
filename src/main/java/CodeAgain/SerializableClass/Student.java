package CodeAgain.SerializableClass;

import java.io.Serializable;

public class Student implements Serializable {

    transient int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
