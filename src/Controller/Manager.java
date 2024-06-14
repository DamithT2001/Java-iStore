package Controller;

import Model.database;
import java.sql.Statement;
import Model.Products;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

// Inherit
public class Manager extends User {

    public Manager() {

    }

    public void addProduct(Products product) {
        try {
            Statement s = database.mycon().createStatement();
            s.executeUpdate("INSERT INTO stock (product_Id, product, Category, Price) VALUES "
                    + "('" + product.getProductId() + "','" + product.getProduct() + "','" + product.getProductCat() + "'," + product.getPrice() + ")");

        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateProduct(Products product, String productId) {
        try {
            String sql = "UPDATE stock SET product=?, Category=?, Price=? WHERE product_Id=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, product.getProduct());
            pst.setString(2, product.getProductCat());
            pst.setString(3, product.getPrice());
            pst.setString(4, productId);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int deleteProduct(String productId) {
    int rowsDeleted = 0;
    try {
        String sql = "DELETE FROM stock WHERE product_Id=?";
        pst = con.prepareStatement(sql);
        pst.setString(1, productId);
        rowsDeleted = pst.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
    }
    return rowsDeleted;
}


    public void createAccount(Cashier cashier) {
        try {
            Statement s = database.mycon().createStatement();
            s.executeUpdate("INSERT INTO user (u_id,name,userName,userType,password) "
                    + "VALUES ('" + cashier.getUserId() + "','" + cashier.getName() + "','" + cashier.getUserName() + "','" + cashier.getUserType() + "','" + cashier.getPassword() + "')");
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // (Polymorphism)
    @Override
    public void viewProduct(JTable tblStock) {
        try {
            String sql = "SELECT * FROM stock";
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tblStock.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});
            }
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }

    @Override
    public void searchProduct(JTable tblStock, String search) {
        DefaultTableModel obj = (DefaultTableModel) tblStock.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        tblStock.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(search));
    }

    public boolean isProductExists(String productId) {
        boolean exists = false;
        try {
            String sql = "SELECT COUNT(*) FROM stock WHERE product_Id=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, productId);

            rs = pst.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                exists = (count > 0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exists;
    }
public ResultSet checkUserName(String userName) {
        
        try {
            pst = con.prepareCall("SELECT * FROM user WHERE userName = ?");
            pst.setString(1, userName);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public ResultSet checkUserId(String u_id) throws SQLException {
        ResultSet resultSet = null;
        try {
            String sql = "SELECT * FROM user WHERE u_id=?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, u_id);

            resultSet = preparedStatement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultSet;
    }
    

   

}
