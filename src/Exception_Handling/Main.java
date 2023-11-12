package Exception_Handling;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void checkAge(int age) throws AgeCheckException {
        if(age < 18) {
            throw new AgeCheckException("Hata yakalandı!");
        }
        System.out.println("Yaşı uygundur!");
    }

    public static void main(String[] args) throws AgeCheckException {
        /*
        Scanner input = new Scanner(System.in);
        int a = 10;
        int b = 20;
        int[] arr = new int[3];
        try {
            System.out.println(b / a);
            int c = input.nextInt();
            arr[10] = 11;
        }catch (ArithmeticException e) {
            System.out.println("Artimetik hata bulundu.");
            System.out.println(e.getMessage());
        }catch (InputMismatchException e) {
            System.out.println("Yanlış veri girildi.");
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array hatası alındı.");
            System.out.println(e.getMessage());
        }

        System.out.println("Program bitti!");
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz: ");
        int age = input.nextInt();
        checkAge(age);
    }
}
