package com.lld.library.management.system;

public interface Lendable {
    boolean lend(User user);
    void returnBook(User user);
    boolean isAvailable();
}
