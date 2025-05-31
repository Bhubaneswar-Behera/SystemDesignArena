package com.lld.design.patterns.structural;

import com.lld.design.patterns.structural.adapter.icicibank.ICICIBank;

public class ICICIAdapter implements BankAPI {
    private ICICIBank iciciBank = new ICICIBank();

    @Override
    public void sendMoney(String from, String to, int amount) {
        iciciBank.makePayment(to, from, amount);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public long getBalance(String accountNumber) {
        return 0;
    }
}
