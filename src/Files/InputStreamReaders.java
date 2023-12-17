package Files;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class InputStreamReaders {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/Files/dev.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, Charset.forName("Big5"));
            int i = inputStreamReader.read();
            while(i != -1) {
                System.out.println((char) i);
                i = inputStreamReader.read();
            }
        } catch(Exception e) {
            e.getStackTrace();
        }
    }
}
