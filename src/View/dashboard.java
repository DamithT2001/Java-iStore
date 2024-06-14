/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.Signin;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;


/**
 *
 * @author DamithT
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblSubTitle = new javax.swing.JLabel();
        lblBtnSignIn = new javax.swing.JLabel();
        lblMainBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(null);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons8-apple-logo-256.png"))); // NOI18N
        jPanel1.add(lblLogo);
        lblLogo.setBounds(150, 0, 260, 560);

        lblTitle.setFont(new java.awt.Font("Agency FB", 1, 85)); // NOI18N
        lblTitle.setText("iStore");
        jPanel1.add(lblTitle);
        lblTitle.setBounds(440, 170, 185, 72);

        lblSubTitle.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 36)); // NOI18N
        lblSubTitle.setText("Stock Management System");
        jPanel1.add(lblSubTitle);
        lblSubTitle.setBounds(440, 250, 514, 41);

        lblBtnSignIn.setFont(new java.awt.Font("Trebuchet MS", 0, 30)); // NOI18N
        lblBtnSignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icons8-enter-64.png"))); // NOI18N
        lblBtnSignIn.setText("Sign in ");
        lblBtnSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnSignInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnSignInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnSignInMouseExited(evt);
            }
        });
        jPanel1.add(lblBtnSignIn);
        lblBtnSignIn.setBounds(430, 330, 180, 70);
        jPanel1.add(lblMainBg);
        lblMainBg.setBounds(0, 0, 1080, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBtnSignInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSignInMouseEntered
        // TODO add your handling code here:
         lblBtnSignIn.setFont(lblBtnSignIn.getFont().deriveFont(Font.BOLD));
         lblBtnSignIn.setForeground(Color.decode("#279EF"));
         lblBtnSignIn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblBtnSignInMouseEntered

    private void lblBtnSignInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSignInMouseExited
        // TODO add your handling code here:
         lblBtnSignIn.setFont(lblBtnSignIn.getFont().deriveFont(Font.PLAIN));
         lblBtnSignIn.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblBtnSignInMouseExited

    private void lblBtnSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnSignInMouseClicked
        // TODO add your handling code here:
        //open signin jframe
        Signin jfSignin = new Signin();
        jfSignin.setVisible(true);//display signin jframe
        dispose();//close current(dashboard) jframe
    }//GEN-LAST:event_lblBtnSignInMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBtnSignIn;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMainBg;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
