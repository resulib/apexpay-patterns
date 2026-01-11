package com.apexpay.apexpaypatterns.model;

import com.apexpay.apexpaypatterns.model.enums.AccountType;

import java.math.BigDecimal;

public class BusinessAccount implements Account {

    private String accountNumber;
    private BigDecimal balance = BigDecimal.ZERO;
    private final BigDecimal interestRate = new BigDecimal("0.2");

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public AccountType getAccountType() {
        return AccountType.BUSINESS;
    }

    @Override
    public void processTransaction(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }
}
