package com.apexpay.apexpaypatterns.adapter;

import com.apexpay.apexpaypatterns.legacy.LegacyCurrencyData;
import com.apexpay.apexpaypatterns.service.CurrencyProvider;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
public class CurrencyAdapter implements CurrencyProvider {

    private final LegacyCurrencyData legacyCurrencyData;

    @Override
    public BigDecimal getCurrencyInAzn() {

        BigDecimal amount = BigDecimal.valueOf(legacyCurrencyData.getVal());

        if ("USD".equals(legacyCurrencyData.getCode())) {
            return amount.multiply(new BigDecimal("1.70"));
        }
        return amount;
    }
}
