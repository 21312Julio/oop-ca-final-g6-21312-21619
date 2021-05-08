/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

/**
 *
 * @author julio
 */
public class LoginSelectionFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginSelectionFrame
     */
    public LoginSelectionFrame() {
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

        jButtonLoginEmployee = new javax.swing.JButton();
        jButtonLoginLecturer = new javax.swing.JButton();
        jButtonLoginStudent = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonLoginEmployee.setText("Login as Employee");
        jButtonLoginEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLoginEmployee);
        jButtonLoginEmployee.setBounds(550, 90, 140, 22);

        jButtonLoginLecturer.setText("Login as Lecturer");
        jButtonLoginLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginLecturerActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLoginLecturer);
        jButtonLoginLecturer.setBounds(550, 210, 140, 22);

        jButtonLoginStudent.setText("Login as Student");
        getContentPane().add(jButtonLoginStudent);
        jButtonLoginStudent.setBounds(550, 340, 140, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgmainlogin.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-3, -4, 730, 440);

        setSize(new java.awt.Dimension(739, 469));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginEmployeeActionPerformed
        EmployeeLoginFrame screen = new EmployeeLoginFrame();
        screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonLoginEmployeeActionPerformed

    private void jButtonLoginLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginLecturerActionPerformed
        LecturerLoginFrame screen = new LecturerLoginFrame();
        screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonLoginLecturerActionPerformed

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
            java.util.logging.Logger.getLogger(LoginSelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginSelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginSelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginSelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginSelectionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLoginEmployee;
    private javax.swing.JButton jButtonLoginLecturer;
    private javax.swing.JButton jButtonLoginStudent;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}