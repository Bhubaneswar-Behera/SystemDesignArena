package com.lld.library.management.system;

public class NovelBook extends Book{
    private String genre;

    public NovelBook(String isbn ,String title, String author, String genre) {
        super(isbn, title, author);
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Textbook - ISBN: " + getIsbn()
                + ", Title: " + getTitle() +
                ", Author: " + getAuthor() + "" +
                ", Genre: " + getGenre());
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
