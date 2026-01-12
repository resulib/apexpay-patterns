package com.apexpay.apexpaypatterns.listener;

import com.apexpay.apexpaypatterns.event.MoneyTransferEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AuditLogListener {

    @EventListener
    public void logTransferActivity(MoneyTransferEvent event) {
        System.out.println("AUDIT LOG: " + event.sender() + " tərəfindən " +
                event.receiver() + " hesabına köçürmə qeydə alındı.");
    }
}
