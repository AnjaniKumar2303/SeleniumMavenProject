package CodeAgain.Stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderWriterClass {

    public static void main(String[] args) {
        try {
            Writer w = new FileWriter("d.txt");
            String s = "Welcome";
            w.write(s);
            w.close();

            Reader r = new FileReader("C:\\Users\\AnjKumar\\OneDrive - OpenText\\Documents\\Java\\d.txt");

            int data = r.read();

            while(data != -1) {
                System.out.print((char) data);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
