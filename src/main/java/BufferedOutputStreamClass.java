import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamClass {

    public static void main(String[] args) {

        try {

            FileOutputStream fout = new FileOutputStream("C:\\Users\\AnjKumar\\OneDrive - OpenText\\Documents\\InputOutputStream\\b.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            bout.write(65);
            bout.flush();

        } catch(Exception e) {
            System.out.println(e);

        }



    }

}
