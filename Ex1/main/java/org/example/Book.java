package org.example;

import java.util.Objects;

public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author, int year) {
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }
}