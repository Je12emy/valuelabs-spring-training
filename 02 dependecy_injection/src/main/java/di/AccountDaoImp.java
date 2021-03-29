package di;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public class AccountDaoImp {
    // Dependency
    @Inject // Preffer autowired for properties.
    private DataSource dataSource;

    public AccountDaoImp() {
    }

    // @Autowired()
    public AccountDaoImp(DataSource ds) {
        this.dataSource = ds;
    }

    // @Autowired()
    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
    }

    public DataSource getDataSource() {
        System.out.println("Getting data source");
        return dataSource;
    }
}
