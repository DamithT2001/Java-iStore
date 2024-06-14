package Controller;

import Model.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;

//(Abstraction)
public abstract class User {

    database db = new database();
    Connection con = database.mycon();
    ResultSet rs;
    PreparedStatement pst;

    private String u_id;
    private String name;
    private String userName;
    private String userType;
    private String password;

    public User() {

    }
    
    // Get & Set Methods (Encapsulation)
    public String getUserId() {
        return u_id;
    }

    public void setUserId(String u_id) {
        this.u_id = u_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract void viewProduct(JTable tblStock);

    public abstract void searchProduct(JTable tblStock, String search);

}
