package database;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
    static Connection con;
    static String driver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost/perpustakaan";
    static String uname = "root";
    static String pass = "";
    
    public static Connection getConnection() throws Exception{
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan","root","");
        } catch (SQLException e) {
        }
            return con;
    }
}
