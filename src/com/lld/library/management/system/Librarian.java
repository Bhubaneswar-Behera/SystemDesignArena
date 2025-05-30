package com.lld.library.management.system;

public class Librarian extends User {
    private String employeeNumber;

    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo, null);
        this.employeeNumber = employeeNumber;
    }
    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Employee Number: " + employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    public void addNewBook(Book book) {

    }
    public void removeBook(Book book) {

    }
}
