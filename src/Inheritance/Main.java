package Inheritance;

public class Main {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("Mustafa Haita", "05123948322", "mustafa@dev.com");
        //Akademisyen a1 = new Akademisyen("Patika Dev", "05129348423", "bilgi@patika.com", "CENG", "Doçent");
        //Memur m1 = new Memur("Ali Veli", "293823232", "a@patika.dev", "Bilgi İşlem", "09:00-18:00");
        //Asistan mustafa = new Asistan("Mustafa Haita", "5369503282", "mustafa@gmail.com", "CENG", "PROF", "12:00");
        LabAsistani mustafa = new LabAsistani("Mustafa Haita", "5369503282", "mustafa@gmail.com", "CENG", "PROF", "12:00");
        OgretimGorevlisi o1 = new OgretimGorevlisi("Patika Dev", "05129348423", "bilgi@patika.com", "CENG", "Doçent", "12");
        //mustafa.derseGir();

        // Method Overloading
        //mustafa.giris("20:00", "24:00");

        //a1.giris();
        //mustafa.giris();
        //m1.giris();

        // Polymorphism
        //int[] loginUser = new int[5];
        //Calisan[] loginUser = {c1, a1, m1, mustafa};
        //Calisan.girisYapanlar(loginUser);

        // Abstraction
        o1.derseGir("12:00");
    }
}
