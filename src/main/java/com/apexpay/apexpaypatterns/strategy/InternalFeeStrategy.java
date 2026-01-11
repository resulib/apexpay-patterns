package com.apexpay.apexpaypatterns.strategy;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component("INTERNAL_STRATEGY")
public class InternalFeeStrategy implements FeeStrategy {
    @Override
    public BigDecimal calculateFee(BigDecimal amount) {
        return new BigDecimal("0.01");
    }
}
