package com.bank.transactions.bank_transactions.controller;

import com.bank.transactions.bank_transactions.config.SpringPropTxsConfig;
import com.bank.transactions.bank_transactions.service.ITransferMoney;
import com.bank.transactions.bank_transactions.service.TransferMoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/transactions")
public class TransactionController {
    // @Autowired
    // ITransferMoney transferMoneyService;

    @Autowired
    ApplicationContext context;

    @PostMapping("/{fromAccountId}/{toAccountId}")
    public void transfer(@PathVariable int fromAccountId, @PathVariable int toAccountId) {
        ITransferMoney transMoney = (ITransferMoney) context.getBean("transfer_money");
        transMoney.transfer(fromAccountId, toAccountId);
        // transferMoneyService.transfer(fromAccountId, toAccountId);
    }
}
