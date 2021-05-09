/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import databasecontrol.DatabaseConnection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class StudentLoginFrame extends javax.swing.JFrame {

    DatabaseConnection connection = new DatabaseConnection();
    
    /**
     * Creates new form StudentLoginFrame
     */
    public StudentLoginFrame() {
        initComponents();
        connection.Connection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonExit = new javax.swing.JButton();
        jTextFieldUser = new javax.swing.JTextField();
        jPasswordFieldLogin = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonExit.setText("Back");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit);
        jButtonExit.setBounds(640, 10, 80, 22);

        jTextFieldUser.setText("username...");
        getContentPane().add(jTextFieldUser);
        jTextFieldUser.setBounds(510, 190, 160, 22);

        jPasswordFieldLogin.setText("password...");
        getContentPane().add(jPasswordFieldLogin);
        jPasswordFieldLogin.setBounds(510, 240, 160, 22);

        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin);
        jButtonLogin.setBounds(550, 290, 80, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgstudentlogin.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1, -14, 740, 460);

        setSize(new java.awt.Dimension(745, 469));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        LoginSelectionFrame screen = new LoginSelectionFrame();
        screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    // Check if student information exists on database and matches before loggin 
    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed

        try {
            connection.ExecuteSQL("SELECT *FROM students WHERE id='"+jTextFieldUser.getText()+"'");
            connection.rs.first();
            if (connection.rs.getString("password").equals(jPasswordFieldLogin.getText())) {
                StudentMain screen = new StudentMain(jTextFieldUser.getText());
                screen.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid User/Password");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Invalid User/Password: "+ex);
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

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
            java.util.logging.Logger.getLogger(StudentLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordFieldLogin;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
