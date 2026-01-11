package com.apexpay.apexpaypatterns.strategy;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Component("INTERNATIONAL_STRATEGY")
public class InternationFeeStrategy implements FeeStrategy {
    @Override
    public BigDecimal calculateFee(BigDecimal amount) {
        return new BigDecimal("0.1");
    }
}
