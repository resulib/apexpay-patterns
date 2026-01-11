package com.apexpay.apexpaypatterns.model;

import com.apexpay.apexpaypatterns.model.enums.Currency;
import com.apexpay.apexpaypatterns.model.enums.TransactionStatus;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@ToString
public class Transaction {

    private final String id;
    private final String senderIban;
    private final String receiverIban;
    private final BigDecimal amount;
    private final Currency currency;
    private final TransactionStatus status;
    private final LocalDateTime createdAt;
    private final String description;

    private Transaction(Builder builder) {
        this.id = builder.id;
        this.senderIban = builder.senderIban;
        this.receiverIban = builder.receiverIban;
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.status = builder.status;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
    }


    public String getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String id = UUID.randomUUID().toString();
        private String senderIban;
        private String receiverIban;
        private BigDecimal amount;
        private Currency currency = Currency.AZN; // Default
        private TransactionStatus status = TransactionStatus.PENDING;
        private LocalDateTime createdAt = LocalDateTime.now();
        private String description;

        public Builder sender(String iban) {
            this.senderIban = iban;
            return this;
        }

        public Builder receiver(String iban) {
            this.receiverIban = iban;
            return this;
        }

        public Builder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public Builder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public Builder description(String desc) {
            this.description = desc;
            return this;
        }

        public Transaction build() {
            validate(); // Yaradılmadan öncə mütləq yoxlama
            return new Transaction(this);
        }

        private void validate() {
            if (senderIban == null || receiverIban == null)
                throw new IllegalStateException("IBAN məlumatları boş ola bilməz");
            if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0)
                throw new IllegalStateException("Məbləğ 0-dan böyük olmalıdır");
        }
    }

}
