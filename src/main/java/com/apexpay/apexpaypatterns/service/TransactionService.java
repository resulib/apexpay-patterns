package com.apexpay.apexpaypatterns.service;

import com.apexpay.apexpaypatterns.model.Transaction;
import com.apexpay.apexpaypatterns.model.enums.Currency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Slf4j
public class TransactionService {

    public String executeTransfer() {
        Transaction transaction = Transaction.builder()
                .sender("Ali")
                .receiver("Veli")
                .amount(new BigDecimal("15"))
                .currency(Currency.AZN)
                .description("Test payment")
                .build();
        log.info(transaction.toString());
        return transaction.toString();
    }
}
