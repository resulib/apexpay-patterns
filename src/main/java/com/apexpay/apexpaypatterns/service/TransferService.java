package com.apexpay.apexpaypatterns.service;

import com.apexpay.apexpaypatterns.event.MoneyTransferEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TransferService {

    private final ApplicationEventPublisher applicationEventPublisher;

    public TransferService(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void transferMoney(String from, String to, BigDecimal amount) {

        System.out.println("Money sent " + amount + " to " + to);

        MoneyTransferEvent event = new MoneyTransferEvent(from, to, amount);
        applicationEventPublisher.publishEvent(event);
    }

}
