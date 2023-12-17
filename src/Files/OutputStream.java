package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) {
        String data = "OutputStream ogreniyorum.";
        try {
            File file = new File("src/Files/patika.txt");
            FileOutputStream output = new FileOutputStream(file, true);
            byte[] dataByte = data.getBytes();
            output.write(dataByte);
            output.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
