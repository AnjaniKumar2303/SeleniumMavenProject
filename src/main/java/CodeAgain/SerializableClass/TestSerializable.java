package CodeAgain.SerializableClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {

    public static void main(String[] args) {

        try {

            Student s = new Student(10, "Aman");

            FileOutputStream fout = new FileOutputStream("C:\\Users\\AnjKumar\\ab.txt");
            ObjectOutputStream o = new ObjectOutputStream(fout);
            o.writeObject(s);
            o.flush();
            System.out.println("Success");

            FileInputStream fin = new FileInputStream("C:\\Users\\AnjKumar\\ab.txt");
            ObjectInputStream oo = new ObjectInputStream(fin);
            Student ss = (Student) oo.readObject();
            System.out.println(ss.id + " " +ss.name);
        } catch(Exception e) {
            System.out.println(e);
        }

    }
}
