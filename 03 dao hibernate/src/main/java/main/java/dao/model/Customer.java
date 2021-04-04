package main.java.dao.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity(name = "customer")
public class Customer implements Serializable {
    private int cno;
    private String cname;
    private String address;
    private long phone;

    public Customer() {
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

}
