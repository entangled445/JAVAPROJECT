package com.Bmanagement;
import java.sql.*;

public class Conn {
    Connection c;
    Statement st;
    public Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/form", "root", "root");
            st = c.createStatement();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public PreparedStatement prepareStatement(String query) throws SQLException {
        return c.prepareStatement(query);
    }
}
