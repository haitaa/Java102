package Interface_;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String terminalId = "38284223";

        System.out.print("Tutar giriniz: ");
        double price = input.nextDouble();

        System.out.print("Kart No giriniz: ");
        String cardNumber = input.next();

        System.out.print("Son Kullanım Tarihi giriniz: ");
        String expireDate = input.next();

        System.out.print("Güvenlik Kodu giriniz: ");
        String cvc = input.next();

        System.out.println("1- A Bankası\n2- B Bankası\n3- C Bankası");
        System.out.print("Seçiniz: ");
        int selectBank = input.nextInt();

        switch(selectBank) {
            case 1:
                ABankasi aPos = new ABankasi("A Bankası", "2372873829", "1234567");
                aPos.connect("127.1.1.1");
                aPos.sendCardInfo(price, cardNumber, expireDate, cvc);
                break;
            case 2:
                BBankasi bPos = new BBankasi("B Bankası", "32738232", "23829382");
                bPos.connect();
                bPos.sendCardInfo(price, cardNumber, expireDate, cvc);
                break;
            default:
                System.out.println("Geçerli banka giriniz!");
        }

    }
}
