package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {

    public database() {

    }

    public static Connection mycon() {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/istore", "root", "1234");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

        return con;
    }
}
