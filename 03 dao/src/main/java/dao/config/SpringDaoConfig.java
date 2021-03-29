package dao.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import dao.AccountDao;
import dao.AccountDaoImp;

@Configuration
public class SpringDaoConfig {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:mysql://localhost:3306/value_spring");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }

    @Bean(name = "accdao", autowire = Autowire.NO)
    public AccountDao getAccDao(DataSource ds) {
        AccountDaoImp adao = new AccountDaoImp();
        adao.setDataSource(ds);
        return adao;
    }
}
