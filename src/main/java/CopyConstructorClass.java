class AB {

    int price;

    AB(int price) {
        this.price = price;
    }

    AB(AB ab) {
        this.price = ab.price;

    }

}


public class CopyConstructorClass {

    public static void main(String[] args) {

        AB a = new AB(10);
        AB b = new AB(a);
        System.out.println(b.price);

    }


}
