package dao_test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import main.java.dao.CustomerDao;
import main.java.dao.config.SpringHibernateConfig;
import main.java.dao.model.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringHibernateConfig.class })
public class SpringDaoTest {
    @Autowired
    ApplicationContext context;

    @Test
    public void testSpringHibernate() {
        CustomerDao custDao = (CustomerDao) context.getBean("custdao");
        Customer c = new Customer();
        c.setCno(1);
        c.setCname("ramesh");
        c.setAddress("Ameerpet");
        c.setPhone(7799108899L);
        custDao.save(c);
        System.out.println("Record inserted successfully...");
    }
}
