package com.apexpay.apexpaypatterns.controller;

import com.apexpay.apexpaypatterns.config.AppConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/system")
public class SystemController {

    @GetMapping("/info")
    public String getInfo() {
        return AppConfig.getInstance().getBankInfo();
    }
}
