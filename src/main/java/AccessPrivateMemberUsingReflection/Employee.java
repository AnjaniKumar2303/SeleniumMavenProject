package AccessPrivateMemberUsingReflection;

public class Employee {

    private int id;

    public Employee(int id) {
        this.id = id;
    }

    private int getId() {
        return id;
    }
}
