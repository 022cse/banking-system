package dao;

import model.Account;
import java.sql.*;

public class AccountDAO {

    public void saveAccount(Account a) {
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO accounts VALUES (?,?)"
            );
            ps.setString(1, a.getAccNo());
            ps.setDouble(2, a.getBalance());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}