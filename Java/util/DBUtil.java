package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static final String URL =
    "jdbc:mysql://localhost:3306/careeradmin?serverTimezone=Asia/Tokyo";

    private static final String PASSWORD = "kcsf"; 

    // データベース接続
    public static Connection getConnection() {

        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException e) {
            System.out.println("JDBCドライバが見つかりません。");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("データベースに接続できません。");
            e.printStackTrace();
        }

        return con;
    }
}