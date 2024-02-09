package CodeAgain.Stream;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequesnceInputStream {

    public static void main(String[] args) {

        try {

            FileInputStream f1 = new FileInputStream("C:\\Users\\AnjKumar\\OneDrive - OpenText\\Documents\\Java\\a.txt");
            FileInputStream f2 = new FileInputStream("C:\\Users\\AnjKumar\\OneDrive - OpenText\\Documents\\Java\\b.txt");

            SequenceInputStream s = new SequenceInputStream(f1, f2);

            int i;

            while((i = s.read()) != -1) {
                System.out.print((char) i);
            }
        } catch(Exception e) {
            System.out.println(e);
        }

    }

}
