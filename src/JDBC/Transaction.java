package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaction {
    public static final String DB_URL = "";
    public static final String DB_USER = "";
    public static final String DB_PASSWORD = "";
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO \"Students\" (name, phone) VALUES (?, ?)");
            preparedStatement.setString(1, "Bayram");
            preparedStatement.setInt(2, 824728223);
            preparedStatement.executeUpdate();

            if(true) {
                throw new SQLException();
            }

            preparedStatement.setString(1, "Hikmet");
            preparedStatement.setInt(2, 3230927);
            preparedStatement.executeUpdate();

            connection.commit();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            if(connection!=null) {
                try {
                    connection.rollback();
                } catch (SQLException err) {
                    System.out.println(err.getMessage());
                }
            }
            System.out.println(e.getMessage());
        }
    }
}
