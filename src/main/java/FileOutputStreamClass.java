import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamClass {

    public static void main(String[] args) {

        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\AnjKumar\\OneDrive - OpenText\\Documents\\InputOutputStream\\a.txt");
            fout.write(65);
            String s = "Hello";
            byte b[] = s.getBytes();
            fout.write(b);
            System.out.println("Success");
            FileInputStream fin = new FileInputStream("C:\\Users\\AnjKumar\\OneDrive - OpenText\\Documents\\InputOutputStream\\a.txt");
            int i=0;
            while((i= fin.read())!=-1) {
                char c = (char) i;
                System.out.print(c);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
