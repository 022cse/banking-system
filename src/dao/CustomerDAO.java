package dao;

import model.Customer;
import java.sql.*;

public class CustomerDAO {

    public void saveCustomer(Customer c) {
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO customers VALUES (?,?,?,?)"
            );
            ps.setString(1, c.getCustomerId());
            ps.setString(2, c.getCustomerId());
            ps.setString(3, c.getCustomerId());
            ps.setString(4, c.getCustomerId());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}