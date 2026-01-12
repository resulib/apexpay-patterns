package com.apexpay.apexpaypatterns.event;

import java.math.BigDecimal;

public record MoneyTransferEvent(String sender, String receiver, BigDecimal amount) {
}
