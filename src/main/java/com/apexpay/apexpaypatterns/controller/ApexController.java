package com.apexpay.apexpaypatterns.controller;

import com.apexpay.apexpaypatterns.service.TransferFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/apex")
@RequiredArgsConstructor
public class ApexController {

    private final TransferFacade transferFacade;

    @PostMapping("/run-demo")
    public String runDemo(){
        transferFacade.processFullTransfer();
        return "ApexPay sistemi bütün pattern-ləri işlətdi! Konsola baxın.";
    }
}
