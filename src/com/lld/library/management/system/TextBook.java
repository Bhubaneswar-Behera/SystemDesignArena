package com.lld.library.management.system;

public class TextBook extends Book{
    private String subject;
    private String edition;


    public TextBook(String isbn, String title, String author,
                    String subject, String edition) {
        super(isbn, title, author);
        this.subject = subject;
        this.edition = edition;

    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Textbook - ISBN: " + getIsbn()
                + ", Title: " + getTitle() +
                ", Author: " + getAuthor() + ", Subject: " + getSubject()
        + ", Edition: " + getEdition());
    }
}
