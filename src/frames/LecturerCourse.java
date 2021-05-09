/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import databasecontrol.CourseManager;
import databasecontrol.DatabaseConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import models.Courses;
import models.CoursesTable;
import models.Student;
import models.StudentsTable;

/**
 *
 * @author julio
 */
public class LecturerCourse extends javax.swing.JFrame {

    //Initialize variables
    DatabaseConnection connection = new DatabaseConnection();
    CourseManager cm = new CourseManager();
    Courses co = new Courses();
    Student st = new Student();
    
    /**
     * Creates new form LecturerCourse
     */
    public LecturerCourse() {
        initComponents();
        // Fill table of courses and students upon opening tab
        FillCourseTable("SELECT *FROM courses ORDER BY lecturer");
        FillStudentTable("SELECT *FROM students ORDER BY name");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButtonSearchForLecturer = new javax.swing.JButton();
        jFormattedTextFieldSearchLecturer = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableStudents = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCourses = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButtonCourses1 = new javax.swing.JButton();
        jButtonAttendance = new javax.swing.JButton();
        jButtonTests = new javax.swing.JButton();
        jButtonLOGOFF = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setVisible(true);

        jButtonSearchForLecturer.setText("Search for Lecturer");
        jButtonSearchForLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchForLecturerActionPerformed(evt);
            }
        });

        jTableStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableStudents);

        jTableCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCoursesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCourses);

        jLabel2.setText("Classroom");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jButtonSearchForLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextFieldSearchLecturer))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearchForLecturer)
                    .addComponent(jFormattedTextFieldSearchLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(140, 60, 580, 370);

        jButtonCourses1.setText("Courses");
        jButtonCourses1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCourses1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCourses1);
        jButtonCourses1.setBounds(30, 170, 100, 22);

        jButtonAttendance.setText("Attendance");
        jButtonAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAttendanceActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAttendance);
        jButtonAttendance.setBounds(30, 280, 100, 22);

        jButtonTests.setText("Tests");
        jButtonTests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTestsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTests);
        jButtonTests.setBounds(30, 400, 100, 22);

        jButtonLOGOFF.setText("Log Off");
        jButtonLOGOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLOGOFFActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLOGOFF);
        jButtonLOGOFF.setBounds(640, 10, 72, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bglecturermaincourse.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-1, -4, 730, 440);

        setSize(new java.awt.Dimension(739, 469));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCourses1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCourses1ActionPerformed
        LecturerCourse screen = new LecturerCourse();
        screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCourses1ActionPerformed

    private void jButtonAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAttendanceActionPerformed
        LecturerAttendance screen = new LecturerAttendance();
        screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAttendanceActionPerformed

    private void jButtonTestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTestsActionPerformed
        LecturerTests screen = new LecturerTests();
        screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonTestsActionPerformed

    // Search for courses that match the lecturer name specified on search
    private void jButtonSearchForLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchForLecturerActionPerformed
        co.setSearch(jFormattedTextFieldSearchLecturer.getText());
        FillCourseTable("SELECT *FROM courses WHERE lecturer LIKE'%" +
                co.getSearch() + "%'");
    }//GEN-LAST:event_jButtonSearchForLecturerActionPerformed

    private void jButtonLOGOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLOGOFFActionPerformed
        LoginSelectionFrame screen = new LoginSelectionFrame();
        screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonLOGOFFActionPerformed

    // Return course classroom on table below by searching in database and returning values
    // That match the course id of selected row on course table above
    private void jTableCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCoursesMouseClicked
                                          
        String id = ""+jTableCourses.getValueAt(jTableCourses.getSelectedRow(), 0);
        connection.Connection();
        
        FillStudentTable("SELECT *FROM students WHERE courseID LIKE'%" +
                id + "%'");
        
        connection.Desconnect();
    }//GEN-LAST:event_jTableCoursesMouseClicked

    // Fill the courses jTable, looping on result set and adding to array list, which is table model
    public void FillCourseTable(String sql) {
        ArrayList data = new ArrayList();
        String [] columns = new String []{"id","name","lecturer","classroom",
            "time","day"};
        connection.Connection(); 
        connection.ExecuteSQL(sql);
        try {
            connection.rs.first();
            do {
                data.add(new Object[]{connection.rs.getString("id"),
                        connection.rs.getString("name"),
                        connection.rs.getString("lecturer"),
                        connection.rs.getString("classroom"),
                        connection.rs.getString("time"),
                        connection.rs.getString("day")});  
            } while(connection.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Search for another ID");
        }
        CoursesTable ctmodel = new CoursesTable(data, columns);
        jTableCourses.setModel(ctmodel);
        jTableCourses.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTableCourses.getColumnModel().getColumn(0).setResizable(false);
        jTableCourses.getColumnModel().getColumn(1).setPreferredWidth(220);
        jTableCourses.getColumnModel().getColumn(1).setResizable(false);
        jTableCourses.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTableCourses.getColumnModel().getColumn(2).setResizable(false);
        jTableCourses.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTableCourses.getColumnModel().getColumn(3).setResizable(false);
        jTableCourses.getColumnModel().getColumn(4).setPreferredWidth(100);
        jTableCourses.getColumnModel().getColumn(4).setResizable(false);
        jTableCourses.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTableCourses.getColumnModel().getColumn(5).setResizable(false);
        jTableCourses.getTableHeader().setReorderingAllowed(false);
        jTableCourses.setAutoResizeMode(jTableCourses.AUTO_RESIZE_OFF);
        jTableCourses.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        connection.Desconnect();
    }  
    
    // Fill the students jTable, looping on result set and adding to array list, which is table model
    private void FillStudentTable(String sql) { 
        ArrayList data = new ArrayList();
        String [] columns = new String[]{"id","name","nationality","address",
            "passport","phone","password","courseID"};
        connection.Connection();
        connection.ExecuteSQL(sql);
        try {
            connection.rs.first();
            do {
                data.add(new Object[]{connection.rs.getString("id"),
                connection.rs.getString("name"),
                connection.rs.getString("nationality"),
                connection.rs.getString("address"),
                connection.rs.getString("passport"),
                connection.rs.getString("phone"),
                connection.rs.getString("password"),
                connection.rs.getString("courseID")});
            } while(connection.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Search for another name");
        }
        StudentsTable stmodel = new StudentsTable(data, columns);
        jTableStudents.setModel(stmodel);
        jTableStudents.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTableStudents.getColumnModel().getColumn(0).setResizable(false);
        jTableStudents.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTableStudents.getColumnModel().getColumn(1).setResizable(false);
        jTableStudents.getColumnModel().getColumn(2).setPreferredWidth(70);
        jTableStudents.getColumnModel().getColumn(2).setResizable(false);
        jTableStudents.getColumnModel().getColumn(3).setPreferredWidth(250);
        jTableStudents.getColumnModel().getColumn(3).setResizable(false);
        jTableStudents.getColumnModel().getColumn(4).setPreferredWidth(60);
        jTableStudents.getColumnModel().getColumn(4).setResizable(false);
        jTableStudents.getColumnModel().getColumn(5).setPreferredWidth(130);
        jTableStudents.getColumnModel().getColumn(5).setResizable(false);
        jTableStudents.getColumnModel().getColumn(6).setPreferredWidth(70);
        jTableStudents.getColumnModel().getColumn(6).setResizable(false);
        jTableStudents.getColumnModel().getColumn(7).setPreferredWidth(130);
        jTableStudents.getColumnModel().getColumn(7).setResizable(false);
        jTableStudents.getTableHeader().setReorderingAllowed(false);
        jTableStudents.setAutoResizeMode(jTableStudents.AUTO_RESIZE_OFF);
        jTableStudents.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        connection.Desconnect();
    }
    
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
            java.util.logging.Logger.getLogger(LecturerCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecturerCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAttendance;
    private javax.swing.JButton jButtonCourses1;
    private javax.swing.JButton jButtonLOGOFF;
    private javax.swing.JButton jButtonSearchForLecturer;
    private javax.swing.JButton jButtonTests;
    private javax.swing.JFormattedTextField jFormattedTextFieldSearchLecturer;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCourses;
    private javax.swing.JTable jTableStudents;
    // End of variables declaration//GEN-END:variables
}
