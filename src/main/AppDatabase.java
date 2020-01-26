package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppDatabase {

    private static Connection connection;
    public static Statement perintah;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                //Membangun koneksi kedalam database
                String url = "jdbc:mysql://localhost:3306/amazingdb";
                String user = "root";
                String pass = "";
                connection = DriverManager.getConnection(url, user, pass);
                perintah = connection.createStatement();
                System.out.println("Koneksi Berhasil");
            } catch (ClassNotFoundException e) {
                System.err.println("JDBC Driver tidak ditemukan");
            } catch (SQLException e) {
                System.err.println("Koneksi Database Gagal");
            }
        }
        return connection;
    }

}
