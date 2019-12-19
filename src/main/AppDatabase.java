package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppDatabase {

    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                //Membangun koneksi kedalam database
                String url = "jdbc:mysql://localhost:3306/amazingdb";
                String user = "root";
                String pass = "";
                connection = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi Berhasil");
            } catch (ClassNotFoundException e) {
                System.err.println("JDBC Driver tidak ditemukan");
            } catch (SQLException e) {
                System.err.println("Koneksi Database Gagal");
            }
        }
        return connection;
    }

    public static void main(String[] args) {
        try {
            getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employee where "
                    + "username = 'Heathcliff' and "
                    + "password = 'suprax125'");
            
            System.out.println("Level = " + resultSet.getString("level"));
        } catch (Exception e) {
        }

    }
}
