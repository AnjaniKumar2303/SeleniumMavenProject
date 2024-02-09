package CodeAgain.Stream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamClass {

    public static void main(String[] args) {

        try {
            FileOutputStream fout1 = new FileOutputStream("C:\\Users\\AnjKumar\\OneDrive - OpenText\\Documents\\Java\\a.txt");
            FileOutputStream fout2 = new FileOutputStream("C:\\Users\\AnjKumar\\OneDrive - OpenText\\Documents\\Java\\b.txt");
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            bout.write(65);
            bout.writeTo(bout);
            bout.writeTo(bout);


        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
