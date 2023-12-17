package Files;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class OutputStreamWriters {
    public static void main(String[] args) {
        String data = "ĞÜŞİ";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/Files/output.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);

            outputStreamWriter.write(data);

            outputStreamWriter.close();
            outputStreamWriter.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
