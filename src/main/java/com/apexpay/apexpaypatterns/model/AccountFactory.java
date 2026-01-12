package com.apexpay.apexpaypatterns.model;

import com.apexpay.apexpaypatterns.model.enums.AccountType;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class AccountFactory {

    public Account createAccount(AccountType accountType) {
        String accountNumber = "AZ-" + UUID.randomUUID().toString().substring(0, 16).toUpperCase();

        return switch (accountType) {
            case CURRENT -> new CurrentAccount(accountNumber);
            case SAVINGS -> new SavingsAccount(accountNumber);
            case BUSINESS -> new BusinessAccount();
            default -> throw new IllegalArgumentException("Invalid account type");
        };
    }
}
