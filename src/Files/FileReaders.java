package Files;

import java.io.FileReader;

public class FileReaders {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/Files/dev.txt");
        } catch(Exception e) {
            e.getStackTrace();
        }
    }
}
