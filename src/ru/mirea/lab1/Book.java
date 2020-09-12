package ru.mirea.lab1;

public class Book {
    String nameBook;
    int page;
    public Book (String nameBook, int page) {
        this.nameBook = nameBook;
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public String getName() {
        return nameBook;
    }

    public void setName(String name) {
        this.nameBook = nameBook;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String toString() {
        return "Book's " + "tag is " + nameBook + ", page=" + page;
    }
}