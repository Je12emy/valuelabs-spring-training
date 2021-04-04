package com.bank.transactions.bank_transactions.dao;

import com.bank.transactions.bank_transactions.pojo.Deposit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DepositDaoImp {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public Deposit read(int id) {
        return (Deposit) hibernateTemplate.get(Deposit.class, id);
    }

    public void update(Deposit w) {
        hibernateTemplate.update(w);
    }
}
