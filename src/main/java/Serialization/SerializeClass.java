package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeClass {

    public static void main(String[] args) {

        try {

            Student s = new Student(1, "Mohan");

            FileOutputStream fout = new FileOutputStream("C:\\Users\\AnjKumar\\OneDrive - OpenText\\Documents\\InputOutputStream\\c.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s);
            out.flush();
            out.close();

            FileInputStream fin = new FileInputStream("C:\\Users\\AnjKumar\\OneDrive - OpenText\\Documents\\InputOutputStream\\c.txt");
            ObjectInputStream obj = new ObjectInputStream(fin);
            Student s1 = (Student) obj.readObject();
            System.out.println(s1.id + " " + s1.name);

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
