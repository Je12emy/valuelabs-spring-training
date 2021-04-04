package main.java.dao;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import main.java.dao.model.Customer;

@Repository("custdao")
@Transactional(readOnly = false)
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public CustomerDaoImpl() {

    }

    @Override
    public void salute() {
        System.out.println("Hi");
    }

    @Override
    public void save(Customer e) {
        // hibernateTemplate.execute(new HibernateCallback() {
        // @Override
        // public Object doInHibernate(Session session) throws HibernateException {
        // Integer iRef = (Integer) session.save(e);
        // return iRef;
        // }
        // });
        hibernateTemplate.save(e);
    }

    @Override
    public void update(Customer e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(int eno) {
        // TODO Auto-generated method stub

    }

    @Override
    public Customer get(int eno) {
        // TODO Auto-generated method stub
        return null;
    }

}
