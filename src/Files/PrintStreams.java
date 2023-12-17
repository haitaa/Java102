package Files;

import java.io.PrintStream;

public class PrintStreams {
    public static void main(String[] args) {
        try {
            PrintStream output = new PrintStream("src/Files/patika.txt");
            output.print(1233432);
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
