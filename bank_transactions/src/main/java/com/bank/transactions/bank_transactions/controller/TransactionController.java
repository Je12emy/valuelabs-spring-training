package com.bank.transactions.bank_transactions.controller;

import com.bank.transactions.bank_transactions.service.TransferMoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    private TransferMoney transferMoneyService;

    @PostMapping()
    public void transfer(@RequestBody int fromAccNo, @RequestBody int toAccNo) {
        System.out.println(fromAccNo);
        System.out.println(toAccNo);
    }

}
