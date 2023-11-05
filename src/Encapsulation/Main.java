package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", 150);
        Book lordOfTheRings = new Book("Lord of The Rings", -100);

        System.out.println(lordOfTheRings.getPageNumber());
    }
}
