package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Required;

import dao.model.Account;

public class AccountDaoImp implements AccountDao {
    private DataSource dataSource;

    @Required
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void save(Account account) {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            // Get connection
            con = dataSource.getConnection();
            // Prepare query
            String query = "INSERT INTO account VALUES(?,?,?,?)";
            // Create JDBC statement
            pstmt = con.prepareStatement(query);
            // Set data
            pstmt.setInt(1, account.getAccno());
            pstmt.setString(2, account.getAccName());
            pstmt.setString(3, account.getAccType());
            pstmt.setDouble(4, account.getBal());
            // Execute statement
            pstmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void update(Account account) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(int accno) {
        // TODO Auto-generated method stub

    }

    @Override
    public Account get(int accno) {
        // TODO Auto-generated method stub
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        Account avo = null;
        try {
            // Get connection.
            con = dataSource.getConnection();
            // Prepare query.
            String query = "SELECT * FROM account WHERE ACC_NO=" + accno;
            // Create statement object.
            stmt = con.createStatement();
            // Execute query and Process ResultSet
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                avo = new Account();
                avo.setAccno(rs.getInt(1));
                avo.setAccName(rs.getString(2));
                avo.setAccType(rs.getString(3));
                avo.setBal(rs.getDouble(4));
            }
        } catch (Exception e) { // Handle exceptions
            e.printStackTrace();
        } finally { // Release resources to avoid memory leaks
            try {
                rs.close();
                stmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return avo;

    }
}
