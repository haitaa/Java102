package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/Files/dev.txt");
            System.out.println("Kullanılabilir byte sayısı: " + fileInputStream.available());
            /*
            input.skip(10);
            int i = fileInputStream.read();
            while(i != -1) {
                System.out.print((char)i);
                i = fileInputStream.read();
            }

             */
            fileInputStream.close();
        } catch(Exception e) {
            e.getStackTrace();
        }
    }
}
