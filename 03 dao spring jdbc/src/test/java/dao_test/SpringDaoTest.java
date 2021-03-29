package dao_test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.EmployeeDao;
import dao.config.SpringDaoConfig;
import dao.model.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringDaoConfig.class })
public class SpringDaoTest {
    @Autowired
    ApplicationContext context;

    @Test
    public void testSpringJDBC() {
        EmployeeDao empdao = (EmployeeDao) context.getBean("empdao");
        Employee e = new Employee();
        // Please alter eno for future tests
        e.setEno(3);
        e.setEname("Ramesh");
        e.setDesig("Director");
        e.setSal(1000.0);
        empdao.save(e);
        System.out.println("Record inserted successfully...");
    }
}
