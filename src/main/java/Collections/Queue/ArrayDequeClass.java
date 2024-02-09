package Collections.Queue;

import java.util.ArrayDeque;

public class ArrayDequeClass {

    public static void main(String[] args) {

        ArrayDeque<String> ad = new ArrayDeque<>();

        ad.addFirst("a");
        ad.addLast("b");
        System.out.println(ad);
        ad.addFirst("x");
        ad.addLast("y");
        System.out.println(ad);
        ad.removeFirst();
        ad.removeLast();
        System.out.println(ad);
        ad.offerFirst("a");
        ad.offerLast("b");
        System.out.println(ad);
    }
}
