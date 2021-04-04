package main.java.dao;

import main.java.dao.model.Customer;

public interface CustomerDao {
    public void save(Customer e);

    public void update(Customer e);

    public void delete(int eno);

    public void salute();

    public Customer get(int eno);
}
