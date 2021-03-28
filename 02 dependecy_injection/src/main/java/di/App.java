package di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanFactory factory = applicationContext;

        AccountDaoImp accountDaoImp = (AccountDaoImp) factory.getBean("accdao");

        accountDaoImp.getDataSource();
    }
}
