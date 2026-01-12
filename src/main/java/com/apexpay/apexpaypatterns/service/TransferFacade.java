package com.apexpay.apexpaypatterns.service;

import com.apexpay.apexpaypatterns.model.Account;
import com.apexpay.apexpaypatterns.model.AccountFactory;
import com.apexpay.apexpaypatterns.model.Transaction;
import com.apexpay.apexpaypatterns.model.enums.AccountType;
import com.apexpay.apexpaypatterns.model.enums.TransactionType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class TransferFacade {

    private final AccountFactory accountFactory;
    private final FeeService feeService;
    private final TransferService transferService;

    public void processFullTransfer() {
        Account sender = accountFactory.createAccount(AccountType.CURRENT);
        Account receiver = accountFactory.createAccount(AccountType.SAVINGS);

        BigDecimal amount = new BigDecimal(250);

        BigDecimal feeAmount = feeService.calculateFee(TransactionType.INTERNATIONAL, amount);

        Transaction transaction = Transaction.builder()
                .sender(sender.getAccountNumber())
                .receiver(receiver.getAccountNumber())
                .amount(amount)
                .description("Project Final Payment. Fee: " + feeAmount)
                .build();

        transferService.transferMoney(transaction.getSenderIban(), transaction.getReceiverIban(), amount);
        System.out.println("--- Proses uğurla başa çatdı ---");
    }
}
