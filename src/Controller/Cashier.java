package Controller;

import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

// Inherit
public class Cashier extends User {

    public Cashier(String u_id,String name, String userName, String userType, String password) {
        super.setUserId(u_id);
        super.setName(name);
        super.setUserName(userName);
        super.setUserType(userType);
        super.setPassword(password);
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

    public void orderProducts() {

    }

    public void calTotal(JTable tblAdded, JTextField txtTotal) {
        int rowCount = tblAdded.getRowCount();
        double total = 0.0;
        for (int i = 0; i < rowCount; i++) {
            String priceStr = (String) tblAdded.getValueAt(i, 3);
            // Convert the string to a double and add it to the total
            try {
                double price = Double.parseDouble(priceStr);
                total += price;
                txtTotal.setText(String.valueOf(total));
            } catch (NumberFormatException e) {

            }

        }
    }

    public void printInvoice(JTable tblAdded, JTextArea txtAreaInvoice, JTextField txtTotal) {
        String total = txtTotal.getText();
        DefaultTableModel tblModel = (DefaultTableModel) tblAdded.getModel();
        txtAreaInvoice.setText(txtAreaInvoice.getText() + "\n");
        txtAreaInvoice.setText(txtAreaInvoice.getText() + "\t      ----------->>>iStore<<<-----------\n");
        txtAreaInvoice.setText(txtAreaInvoice.getText() + "---------------------------------------------------------------------------"
                + "-----------------------\n");
        txtAreaInvoice.setText(txtAreaInvoice.getText() + "-----------------------------------********************------------------"
                + "--------------------\n");
        txtAreaInvoice.setText(txtAreaInvoice.getText() + "\nProduct ID" + "\t" + "Product" + "\t" + " \t  Amount" +"\t\n");
        

        for (int i = 0; i < tblModel.getRowCount(); i++) {
            String id = (String) tblModel.getValueAt(i, 0);
            String product = (String) tblModel.getValueAt(i, 1);
            String amount =  (String)tblModel.getValueAt(i, 3);

            txtAreaInvoice.setText(txtAreaInvoice.getText() +"\n" + id + "\t" + product + "\t\t  " + amount + "\t");
        }


        txtAreaInvoice.setText(txtAreaInvoice.getText() + "\n");
        txtAreaInvoice.setText(txtAreaInvoice.getText() + "\n");
        txtAreaInvoice.setText(txtAreaInvoice.getText() + "\t\t\t" + "Total : " + total);
         txtAreaInvoice.setText(txtAreaInvoice.getText() + "\n\n---------------------------------------------------------------------------"
                + "-------------------\n");
          txtAreaInvoice.setText(txtAreaInvoice.getText() + "---------------------------------------------------------------------------"
                + "-------------------\n");
    }

    





}
