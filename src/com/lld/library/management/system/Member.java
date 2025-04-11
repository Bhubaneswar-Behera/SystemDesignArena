package com.lld.library.management.system;

public class Member extends User{
    private int borrowedBookedCount;
    private static  int MAX_BORROW_LIMIT = 5;

    public Member() {
        super();
        this.borrowedBookedCount = 0;
    }
    public Member(String name, String contactInfo) {
        super(name,contactInfo, null);
        this.borrowedBookedCount = 0;
    }
    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Borrowed Book Count: " + borrowedBookedCount);
    }

    @Override
    public boolean canBorrowBooks() {
            return borrowedBookedCount< MAX_BORROW_LIMIT;
    }
}
