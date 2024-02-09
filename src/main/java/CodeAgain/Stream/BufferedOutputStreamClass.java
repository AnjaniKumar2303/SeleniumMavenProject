package CodeAgain.Stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamClass {

    public static void main(String[] args) {

        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\AnjKumar\\OneDrive - OpenText\\Documents\\Java\\c.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            String s = "Welcome to javaTpoint.";
            byte b[] = s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("Success");


        } catch(Exception e) {

        }
    }

}
