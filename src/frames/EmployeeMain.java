/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import databasecontrol.DatabaseConnection;

/**
 *
 * @author julio
 */
public class EmployeeMain extends javax.swing.JFrame {

    DatabaseConnection connection = new DatabaseConnection();
    
    public EmployeeMain() {
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

        jButtonManageLecturers = new javax.swing.JButton();
        jButtonManageCourses = new javax.swing.JButton();
        jButtonManageStudents = new javax.swing.JButton();
        jInternalFrameMain = new javax.swing.JInternalFrame();
        jLabelBackgroundMainEmployee = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonManageLecturers.setText("Manage Lecturers");
        getContentPane().add(jButtonManageLecturers);
        jButtonManageLecturers.setBounds(20, 400, 130, 22);

        jButtonManageCourses.setText("Manage Courses");
        jButtonManageCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManageCoursesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonManageCourses);
        jButtonManageCourses.setBounds(20, 170, 130, 22);

        jButtonManageStudents.setText("Manage Students");
        jButtonManageStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManageStudentsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonManageStudents);
        jButtonManageStudents.setBounds(20, 280, 130, 22);

        jInternalFrameMain.setVisible(true);

        javax.swing.GroupLayout jInternalFrameMainLayout = new javax.swing.GroupLayout(jInternalFrameMain.getContentPane());
        jInternalFrameMain.getContentPane().setLayout(jInternalFrameMainLayout);
        jInternalFrameMainLayout.setHorizontalGroup(
            jInternalFrameMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrameMainLayout.setVerticalGroup(
            jInternalFrameMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jInternalFrameMain);
        jInternalFrameMain.setBounds(160, 60, 560, 370);

        jLabelBackgroundMainEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgemployeemain.png"))); // NOI18N
        getContentPane().add(jLabelBackgroundMainEmployee);
        jLabelBackgroundMainEmployee.setBounds(-3, -4, 730, 440);

        setSize(new java.awt.Dimension(739, 469));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonManageCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManageCoursesActionPerformed
        EmployeeAddCourse screen = new EmployeeAddCourse();
        screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonManageCoursesActionPerformed

    private void jButtonManageStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManageStudentsActionPerformed
        EmployeeAddStudent screen = new EmployeeAddStudent();
        screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonManageStudentsActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonManageCourses;
    private javax.swing.JButton jButtonManageLecturers;
    private javax.swing.JButton jButtonManageStudents;
    private javax.swing.JInternalFrame jInternalFrameMain;
    private javax.swing.JLabel jLabelBackgroundMainEmployee;
    // End of variables declaration//GEN-END:variables
}
