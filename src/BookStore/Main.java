package BookStore;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", 853, "JK. Rowling", 2005);
        Book b2 = new Book("LOTR", 650, "Mustafa Haita", 1997);
        Book b3 = new Book("Sherlock Holmes", 423, "Ahmet Çakar", 1863);
        Book b4 = new Book("Anna Karina 1", 254, "Can Bozyiğit", 1969);
        Book b5 = new Book("Anna karina 2", 327, "Can Bozyiğit", 1974);

        /*
        TreeSet<Book> booksB = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getBookName().compareTo(o2.getBookName());
            }
        });

        */
        TreeSet<Book> books = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getPages() - o1.getPages();
            }
        });

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        for(Book book : books) {
            System.out.println(book.getBookName());
        }
    }
}
