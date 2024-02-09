package CodeAgain.thiskeyword;

import Reflection.Test;

public class TestThisKeywordClass {

    int i;

    TestThisKeywordClass() {
        System.out.println("Constructor");
    }

    TestThisKeywordClass(int i) {
        this();
        this.i =i;
    }

    void display() {
        System.out.println("Display");
    }

    TestThisKeywordClass getObject() {
        return this;
    }

    void print() {

        this.display();
        System.out.println(i);
    }



    public static void main(String[] args) {

        TestThisKeywordClass t = new TestThisKeywordClass(10);

        t.print();

        t.getObject().print();
    }

}
