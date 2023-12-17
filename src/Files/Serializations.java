package Files;

import java.io.*;

public class Serializations {
    public static void main(String[] args) {
        /*
        Car audi = new Car("Audi", "A3");
        try {
            FileOutputStream file = new FileOutputStream("src/Files/araba.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(audi);
            output.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

         */
        Car audi = new Car("Audi", "A3");
        try {
            FileInputStream inputFile = new FileInputStream("src/Files/araba.txt");
            ObjectInputStream input = new ObjectInputStream(inputFile);
            Car newCar = (Car) input.readObject();
            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel());

            inputFile.close();
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
