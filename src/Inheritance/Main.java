package Inheritance;

public class Main {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("Mustafa Haita", "05123948322", "mustafa@dev.com");
        Akademisyen a1 = new Akademisyen("Patika Dev", "05129348423", "bilgi@patika.com", "CENG", "Doçent");
        Memur m1 = new Memur("Ali Veli", "293823232", "a@patika.dev", "Bilgi İşlem", "09:00-18:00");
        //Asistan mustafa = new Asistan("Mustafa Haita", "5369503282", "mustafa@gmail.com", "CENG", "PROF", "12:00");
        LabAsistani mustafa = new LabAsistani("Mustafa Haita", "5369503282", "mustafa@gmail.com", "CENG", "PROF", "12:00");
        mustafa.derseGir();
    }
}
