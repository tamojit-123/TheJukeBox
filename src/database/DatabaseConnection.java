package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    static Connection connection;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loading.....");
            System.out.println("Loaded");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thejukebox", "root", "root@1234");
            System.out.println("Connection Established....");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return connection;
    }
}