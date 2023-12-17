package JDBC;

import java.sql.*;

public class DBConn {
    public static final String DB_URL = "";
    public static final String DB_USER = "";
    public static final String DB_PASSWORD = "";
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        // Veri Tabanından Kayıt Sorgulamak
        /*
        String sql = "SELECT * FROM \"Students\"";
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            statement = connection.createStatement();
            ResultSet data = statement.executeQuery(sql);
            while(data.next()) {
                System.out.println("ID: " + data.getInt("id"));
                System.out.println("Student name: " + data.getString("name"));
                System.out.println("Phone number: " + data.getInt("phone"));
                System.out.println("##################");
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }

         */

        // Veritabanına Veri Ekleme
        /*
        String sql = "INSERT INTO \"Students\" (name, phone) VALUES ('Damla', '248237892')";
        String prSql = "INSERT INTO \"Students\" (name, phone) VALUES (?, ?)";
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            //statement = connection.createStatement();
            //statement.executeQuery(sql);

            PreparedStatement preparedStatement = connection.prepareStatement(prSql);
            preparedStatement.setString(1, "Can");
            preparedStatement.setInt(2, 23982937);
            preparedStatement.executeUpdate();

            preparedStatement.close();
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }

         */

        String sql = "UPDATE \"Students\" SET name='Mahmut' WHERE id=3";
        String prSql = "UPDATE \"Students\" SET name=? WHERE id=?";
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            //statement = connection.createStatement();
            //statement.executeQuery(sql);

            PreparedStatement preparedStatement = connection.prepareStatement(prSql);
            preparedStatement.setInt(2, 328723);
            preparedStatement.setString(1, "Mahmut");
            preparedStatement.executeUpdate();

            preparedStatement.close();
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
