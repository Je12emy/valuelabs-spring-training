package di;

import javax.sql.DataSource;

public class AccountDaoImp {
    // Dependency
    private DataSource dataSource;

    public AccountDaoImp() {
    }

    public AccountDaoImp(DataSource ds) {
        this.dataSource = ds;
    }

    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
    }

    public DataSource getDataSource() {
        System.out.println("Getting data source");
        return dataSource;
    }
}
