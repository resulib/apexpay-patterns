package com.apexpay.apexpaypatterns.strategy;

import java.math.BigDecimal;

public interface FeeStrategy {
    BigDecimal calculateFee(BigDecimal amount);
}
