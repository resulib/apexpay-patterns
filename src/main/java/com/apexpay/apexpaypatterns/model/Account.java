package com.apexpay.apexpaypatterns.model;

import com.apexpay.apexpaypatterns.model.enums.AccountType;

import java.math.BigDecimal;

public interface Account {

    String getAccountNumber();

    BigDecimal getBalance();

    AccountType getAccountType();

    void processTransaction(BigDecimal amount);
}
