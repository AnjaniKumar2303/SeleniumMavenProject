package Aggregation;

public class Circle {

    Operation o;

    double area(int r) {
        o = new Operation();
        return 3.14*(o.square(r));
    }

}
