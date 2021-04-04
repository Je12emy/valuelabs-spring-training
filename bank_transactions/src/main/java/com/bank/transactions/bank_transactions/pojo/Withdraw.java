package com.bank.transactions.bank_transactions.pojo;

import java.io.Serializable;

public class Withdraw implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 4530180727175947898L;
    private int accno;
    private String name;
    private int amount;

    public Withdraw() {
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
