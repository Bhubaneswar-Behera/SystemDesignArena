package com.lld.design.patterns.behavioural.observer;

public class Client {
    public static void main(String[] args) {
        Flipkart flipkart = Flipkart.getInstance();
        EmailService emailService = new EmailService();
        InventoryService inventoryService = new InventoryService();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        flipkart.onOrderPlaced();

        flipkart.unRegisterSubscriber(invoiceGenerator);
        flipkart.onOrderPlaced();
    }
}
