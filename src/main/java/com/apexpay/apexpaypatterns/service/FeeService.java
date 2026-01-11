package com.apexpay.apexpaypatterns.service;

import com.apexpay.apexpaypatterns.model.enums.TransactionType;
import com.apexpay.apexpaypatterns.strategy.FeeStrategy;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Map;

@Service
public class FeeService {

    private final Map<String, FeeStrategy> strategies;

    public FeeService(Map<String, FeeStrategy> strategies) {
        this.strategies = strategies;
    }

    public BigDecimal calculateFee(TransactionType transactionType, BigDecimal amount) {
        String strategyName = transactionType.name() + "_STRATEGY";

        FeeStrategy feeStrategy = this.strategies.get(strategyName);

        if (feeStrategy == null) {
            throw new RuntimeException(strategyName + " not found");
        }

        return feeStrategy.calculateFee(amount);
    }
}
