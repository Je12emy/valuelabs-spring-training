package dao.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;

@Configuration
@ComponentScan(basePackages = "dao")
public class SpringDaoConfig {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/value_spring");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }

    @Bean(autowire = Autowire.BY_TYPE)
    public JdbcTemplate jdbcTemplate() { // autowiring
        return new JdbcTemplate();
    }

    @Bean(name = "empdao")
    public EmployeeDao empDao() { // annotation based wiring
        return new EmployeeDaoImpl();
    }
}
