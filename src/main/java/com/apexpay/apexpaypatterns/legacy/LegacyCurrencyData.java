package com.apexpay.apexpaypatterns.legacy;

public class LegacyCurrencyData {

    private double val;
    private String code;

    public LegacyCurrencyData(double val, String code) {
        this.val = val;
        this.code = code;
    }

    public double getVal() {
        return val;
    }

    public String getCode() {
        return code;
    }
}
