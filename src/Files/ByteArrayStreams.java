package Files;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ByteArrayOutputStream;

public class ByteArrayStreams {
    public static void main(String[] args) {
        /*
        byte[] arr = {1, 2, 4, 54, 66, 6, 12, 3};
        ByteArrayInputStream input = new ByteArrayInputStream(arr, 2, 4);
        System.out.println("Kullanılabilen byte sayısı: " + input.available());
        int i = input.read();
        while(i != -1) {
            System.out.println(i);
            i = input.read();
        }
        try {
            input.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

         */

        String data = "Java 102 Dersleri!";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] arr = data.getBytes();
        try{
            output.write(arr);
            String newData = output.toString();
            System.out.println(newData);
            output.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
