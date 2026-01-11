package com.apexpay.apexpaypatterns.config;

public class AppConfig {

    private static AppConfig instance;
    private final String bankName = "ApexPay Digital Bank";
    private final String description = "Digital Bank System with Design Patterns.";
    private final String version = "1.0.0";

    private AppConfig() {
    }

    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getBankInfo() {
        return bankName + " (v" + version + "). \n" + description;
    }

    public String getVersion() {
        return version;
    }

    public String getBankName() {
        return bankName;
    }

    public String getDescription() {
        return description;
    }

}
