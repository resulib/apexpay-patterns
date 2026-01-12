package com.apexpay.apexpaypatterns.listener;

import com.apexpay.apexpaypatterns.event.MoneyTransferEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationListener {

    @EventListener
    public void handleTransferNotification(MoneyTransferEvent event) {
        System.out.println("SMS GÖNDƏRİLDİ: Sizin hesabınızdan " +
                event.amount() + " AZN pul çıxıldı.");
    }
}
