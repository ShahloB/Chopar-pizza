package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRegister {
    DBConnection dbConnection = new DBConnection();
    public void register(String name, String phone, String role) {
        String sql = "insert into users(name, phone,role)" +
                "values" + " ('" + name + "'," + "'" + phone + "'," + "'" + role + "')";
        try (Connection connection = dbConnection.getConnection();//autoClosable
             PreparedStatement statement = connection.prepareStatement(sql)) {
            int res = statement.executeUpdate();
            System.out.println(res);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
