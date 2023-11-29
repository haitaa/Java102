package BookStore;

import java.util.Comparator;

public class Book {
    private String bookName;
    private int pages;
    private String author;
    private int publishDate;

    public Book(String bookName, int pages, String author, int publishDate) {
        this.bookName = bookName;
        this.pages = pages;
        this.author = author;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }
}
