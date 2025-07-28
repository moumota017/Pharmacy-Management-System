package pharmecymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static Connection conn;

    public static void connect() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:pharmacy.db");
            System.out.println("Connected to DB");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }

    public static void disconnect() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Disconnected DB");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

