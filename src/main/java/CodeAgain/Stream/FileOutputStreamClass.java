package CodeAgain.Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamClass {

    public static void main(String[] args) {

        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\AnjKumar\\OneDrive - OpenText\\Documents\\Java\\a.txt");
            fout.write(65);

            String s = "Success";
            byte b[] = s.getBytes();
            fout.write(b);

            FileInputStream fin = new FileInputStream("C:\\Users\\AnjKumar\\OneDrive - OpenText\\Documents\\Java\\a.txt");
            int i = 0;
            while((i = fin.read()) !=-1) {
                System.out.print((char) i);

            }
        } catch(Exception e) {
            System.out.println(e);
        }

    }

}
