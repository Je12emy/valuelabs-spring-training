package com.bank.transactions.bank_transactions;

import com.bank.transactions.bank_transactions.config.SpringPropTxsConfig;
import com.bank.transactions.bank_transactions.service.ITransferMoney;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringPropTxsConfig.class)
public class BankTransactionsApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	public void testSpringProgTxs() {
		ITransferMoney transMoney = (ITransferMoney) context.getBean("transfer_money");
		transMoney.transfer(1, 1);
		System.out.println("successfully transferred...");
	}

}
