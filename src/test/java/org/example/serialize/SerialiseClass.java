package org.example.serialize;

import java.io.*;

public class SerialiseClass {

    public static void serialiseToObject(Object obj, String filename) {

        try {
            FileOutputStream fout = new FileOutputStream(filename);
            ObjectOutputStream object = new ObjectOutputStream(fout);
            object.writeObject(obj);
            object.close();
            fout.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {

            System.out.println(e);
        }
    }

    public static void deSerialiseToObject(String filename) {

        try {
            FileInputStream fin = new FileInputStream(new File(filename));
            ObjectInputStream object = new ObjectInputStream(fin);
            Object dobject = object.readObject();
            //dobject.close();
            fin.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {

            System.out.println(e);
        }

        catch (ClassNotFoundException e) {

            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        Rectangle rec = new Rectangle(10, 10);

        serialiseToObject(rec, "file");



    }
}

