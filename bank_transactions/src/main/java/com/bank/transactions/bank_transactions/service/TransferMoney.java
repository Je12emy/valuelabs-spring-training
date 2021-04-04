package com.bank.transactions.bank_transactions.service;

import com.bank.transactions.bank_transactions.dao.DepositDaoImp;
import com.bank.transactions.bank_transactions.dao.WithdrawDaoImp;
import com.bank.transactions.bank_transactions.pojo.Deposit;
import com.bank.transactions.bank_transactions.pojo.Withdraw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

@Service("transfer_money")
public class TransferMoney implements ITransferMoney {

    @Autowired
    private TransactionTemplate txTemplate;

    @Autowired
    private WithdrawDaoImp withdrawDao;

    @Autowired
    private DepositDaoImp depositoDao;

    @Override
    public void transfer(int fromAccNo, int toAccNo) {
        txTemplate.execute(new TransactionCallback() {

            @Override
            public Object doInTransaction(TransactionStatus status) {

                try {
                    Withdraw w = withdrawDao.read(fromAccNo);
                    w.setAmount(w.getAmount() - 100);
                    withdrawDao.update(w);

                    Deposit d = depositoDao.read(toAccNo);
                    d.setAmount(d.getAmount() + 100);
                    depositoDao.update(d);

                } catch (Exception e) {
                    e.printStackTrace();
                    status.setRollbackOnly();
                }

                return null;
            }
        });
    }

    public void salute(int fromAccNo, int toAccNo) {
        System.out.println("Transfer from account " + fromAccNo + " to account " + toAccNo);

    }

}
