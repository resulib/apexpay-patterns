package com.apexpay.apexpaypatterns.controller;

import com.apexpay.apexpaypatterns.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        String transaction = transactionService.executeTransfer();
        return ResponseEntity.ok(transaction);
    }
}
