package com.lld.library.management.system;

public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;
    private static int totalUser = 0;

    public User(){
        this.userId = generateUniqueId();
    }

    public User(String userId, String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    //copy constructor
    public User(User other){
        this.userId = generateUniqueId();
        this.name = other.name;
        this.contactInfo = other.contactInfo;
    }

    private final String generateUniqueId(){
        ++totalUser;
        return String.valueOf(totalUser) ;
    }
    //Abstract methods
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public static int getTotalUser() {
        return totalUser;
    }

}
