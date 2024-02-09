public class CloneableClass implements Cloneable{

    int id;

    CloneableClass(int id) {
        this.id = id;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {

        try {
            CloneableClass c = new CloneableClass(1);
            CloneableClass c1 = (CloneableClass) c.clone();
            System.out.println(c1.id);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
