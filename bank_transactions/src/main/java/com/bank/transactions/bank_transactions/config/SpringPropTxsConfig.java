package com.bank.transactions.bank_transactions.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

@Configuration
@ComponentScan(basePackages = { "com.bank.transactions.bank_transactions.dao",
        "com.bank.transactions.bank_transactions.service" })
public class SpringPropTxsConfig {
    @Bean
    public DataSource dataSource() {
        BasicDataSource bds = new BasicDataSource();
        bds.setUrl("jdbc:mysql://localhost:3306/value_spring");
        bds.setDriverClassName("com.mysql.jdbc.Driver");
        bds.setUsername("root");
        bds.setPassword("root");

        return bds;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory(DataSource ds) {
        LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
        lsfb.setDataSource(ds);
        Properties props = new Properties();
        props.put("hibernate.show_sql", "true");
        props.put("hibernate.format_sql", "true");
        props.put("hibernate.use_sql_comments", "true");
        props.put("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");
        lsfb.setHibernateProperties(props);

        lsfb.setMappingResources("Withdraw.hbm.xml", "Deposit.hbm.xml");

        return lsfb;
    }

    @Bean(autowire = Autowire.BY_TYPE)
    public HibernateTemplate hibTemplate() {
        return new HibernateTemplate();
    }

    @Bean(autowire = Autowire.BY_TYPE)
    public PlatformTransactionManager transactionManager() {
        return new HibernateTransactionManager();
    }

    @Bean(autowire = Autowire.BY_TYPE)
    public TransactionTemplate trnsactionTemplate() {
        return new TransactionTemplate();
    }

}
