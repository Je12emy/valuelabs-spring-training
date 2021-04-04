package com.bank.transactions.bank_transactions.dao;

import com.bank.transactions.bank_transactions.pojo.Withdraw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class WithdrawDaoImp {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public Withdraw read(int id) {
        return hibernateTemplate.get(Withdraw.class, id);
    }

    public void update(Withdraw w) {
        hibernateTemplate.update(w);
    }
}
