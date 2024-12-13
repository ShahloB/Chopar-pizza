package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CRUDService {
    DBConnection dbConnection = new DBConnection();
    public void create(String name, String price) {
        String sql = "insert into products(name, price)" +
                "values" + " ('" + name + "'," + "'" + price + "');";
        try (Connection connection = dbConnection.getConnection();//autoClosable
             PreparedStatement statement = connection.prepareStatement(sql)) {
            int res = statement.executeUpdate();
            System.out.println(res);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//    public String getProducts() {
//        String sql = "select id, name, price" +
//                " from products";
//
//        try (Connection connection = dbConnection.getConnection();//autoClosable
//             PreparedStatement statement = connection.prepareStatement(sql);
//             ResultSet resultSet = statement.executeQuery();) {
//
//            StringBuilder builder = new StringBuilder();
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                String price = resultSet.getString("price");
//
//                builder.append(id + " | " + name + " | " + price );
//                builder.append("\n");
//            }
//
//            return builder.toString();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public void delete(int id) {
        String sql = "DELETE FROM products WHERE id = " + id;
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            int res = statement.executeUpdate();
            System.out.println(res);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateProducts(int id, String newName, String newPrice) {
        String sql = "UPDATE products SET name = '" + newName + "', price = '" + newPrice + "' WHERE id = " + id;
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            int res = statement.executeUpdate();
            System.out.println(res);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
