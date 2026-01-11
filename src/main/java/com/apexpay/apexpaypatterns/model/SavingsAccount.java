package com.apexpay.apexpaypatterns.model;

import com.apexpay.apexpaypatterns.model.enums.AccountType;

import java.math.BigDecimal;

public class SavingsAccount implements Account {

    private String accountNumber;
    private BigDecimal balance = BigDecimal.ZERO;
    private final BigDecimal interestRate = BigDecimal.valueOf(0.05);

    public SavingsAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

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
        return AccountType.SAVINGS;
    }

    @Override
    public void processTransaction(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }
}
