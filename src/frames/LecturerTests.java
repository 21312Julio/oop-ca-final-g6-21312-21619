/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import databasecontrol.CourseManager;
import databasecontrol.DatabaseConnection;
import databasecontrol.TestManager;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import models.CoursesTable;
import models.Tests;
import models.TestsTable;

/**
 *
 * @author julio
 */
public class LecturerTests extends javax.swing.JFrame {
    
    // Initialize variables
    DatabaseConnection connection = new DatabaseConnection();
    TestManager tm = new TestManager();
    Tests tes = new Tests();
    // Flag variable to change function of update button
    int flag = 0;

    /**
     * Creates new form LecturerCourse
     */
    public LecturerTests() {
        initComponents();
        // Fill tests table based on SQL Query
        FillTestsTable("SELECT *FROM tests ORDER BY testid");
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
        jButtonCreate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTests = new javax.swing.JTable();
        jComboBoxTypeOfAssignment = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldTestName = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxValue = new javax.swing.JComboBox<>();
        jButtonEditTests = new javax.swing.JButton();
        jButtonDeleteTest = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextFieldTestId = new javax.swing.JFormattedTextField();
        jButtonSearchTests = new javax.swing.JButton();
        jFormattedTextFieldSearchForTest = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTestDate = new javax.swing.JFormattedTextField();
        jButtonCourses1 = new javax.swing.JButton();
        jButtonAttendance = new javax.swing.JButton();
        jButtonTests = new javax.swing.JButton();
        jButtonLOGOFF = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setVisible(true);

        jButtonCreate.setText("Create");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        jTableTests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableTests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTestsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTests);

        jComboBoxTypeOfAssignment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Continuous Assignment", "Continuous Exam", "Final Exam" }));
        jComboBoxTypeOfAssignment.setEnabled(false);

        jLabel2.setText("Activity");

        jLabel3.setText("Name");

        jFormattedTextFieldTestName.setEnabled(false);

        jLabel4.setText("Date");

        jLabel5.setText("Marks");

        jComboBoxValue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5%", "10%", "15%", "20%", "25%", "30%", "35%", "40%", "45%", "50%", "55%", "60%", "65%", "70%" }));
        jComboBoxValue.setEnabled(false);

        jButtonEditTests.setText("Update");
        jButtonEditTests.setEnabled(false);
        jButtonEditTests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditTestsActionPerformed(evt);
            }
        });

        jButtonDeleteTest.setText("Delete");
        jButtonDeleteTest.setEnabled(false);
        jButtonDeleteTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteTestActionPerformed(evt);
            }
        });

        jLabel6.setText("ID");

        jFormattedTextFieldTestId.setEnabled(false);

        jButtonSearchTests.setText("Search");
        jButtonSearchTests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchTestsActionPerformed(evt);
            }
        });

        jFormattedTextFieldTestDate.setEnabled(false);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditTests, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDeleteTest, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSearchTests)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextFieldSearchForTest))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxTypeOfAssignment, 0, 167, Short.MAX_VALUE)
                                    .addComponent(jFormattedTextFieldTestDate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(jComboBoxValue, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldTestId))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jFormattedTextFieldTestName, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTypeOfAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextFieldTestName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBoxValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jFormattedTextFieldTestId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldTestDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearchTests)
                    .addComponent(jFormattedTextFieldSearchForTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeleteTest)
                    .addComponent(jButtonEditTests)
                    .addComponent(jButtonCreate))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bglecturermaintests.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -3, 730, 440);

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

    // Edit tests selected
    private void jButtonEditTestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditTestsActionPerformed
        // Check if text fields are empty
        if (jFormattedTextFieldTestId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Id Required");
            jFormattedTextFieldTestId.requestFocus();
        } else if (jFormattedTextFieldTestName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name Required");
            jFormattedTextFieldTestName.requestFocus();
        } else if (jFormattedTextFieldTestDate.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Date Required");
            jFormattedTextFieldTestDate.requestFocus();
        } else {
            // If flag is set to 1, save information on database
            if (flag == 1) {
                tes.setId("VGC"+jFormattedTextFieldTestId.getText()
                    +jComboBoxTypeOfAssignment.getSelectedItem().toString().substring(0, 3));
                tes.setActivity(jComboBoxTypeOfAssignment.getSelectedItem().toString());
                tes.setName(jFormattedTextFieldTestName.getText());
                tes.setDueDate(jFormattedTextFieldTestDate.getText().toString());
                tes.setAmount(jComboBoxValue.getSelectedItem().toString());
                tm.SaveTest(tes);
                jFormattedTextFieldTestId.setText("");
                jFormattedTextFieldTestName.setText("");
                jFormattedTextFieldSearchForTest.setText("");
                jFormattedTextFieldTestDate.setText("");
                jFormattedTextFieldTestId.setEnabled(false);
                jFormattedTextFieldTestName.setEnabled(false);
                jFormattedTextFieldSearchForTest.setEnabled(true);
                jFormattedTextFieldTestDate.setEnabled(false);
                jComboBoxTypeOfAssignment.setEnabled(false);
                jComboBoxValue.setEnabled(false);
                jButtonCreate.setEnabled(true);
                jButtonEditTests.setEnabled(false);
                jButtonSearchTests.setEnabled(true);
                jButtonDeleteTest.setEnabled(false);
                FillTestsTable("SELECT *FROM tests ORDER BY testid");
            } else {
                // If flag is set to 2, update current given information on database
                tes.setId(jFormattedTextFieldTestId.getText());
                tes.setName(jFormattedTextFieldTestName.getText());
                tes.setActivity(jComboBoxTypeOfAssignment.getSelectedItem().toString());
                tes.setAmount(jComboBoxValue.getSelectedItem().toString());
                tes.setDueDate(jFormattedTextFieldTestDate.getText());
                tm.EditTable(tes);
                jFormattedTextFieldTestId.setText("");
                jFormattedTextFieldTestName.setText("");
                jFormattedTextFieldTestDate.setText("");
                jFormattedTextFieldTestId.setEnabled(false);
                jFormattedTextFieldTestName.setEnabled(false);
                jFormattedTextFieldTestDate.setEnabled(false);
                jFormattedTextFieldSearchForTest.setEnabled(true);
                jComboBoxTypeOfAssignment.setEnabled(false);
                jComboBoxValue.setEnabled(false);
                jButtonEditTests.setEnabled(false);
                jButtonDeleteTest.setEnabled(false);
                jButtonSearchTests.setEnabled(true);
                jButtonCreate.setEnabled(true);
                FillTestsTable("SELECT *FROM tests ORDER BY testid");
            }
        }       
    }//GEN-LAST:event_jButtonEditTestsActionPerformed

    // Set flag to 1 and change function of update button to save on database
    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        flag = 1;
        jFormattedTextFieldTestName.setEnabled(true);
        jFormattedTextFieldTestDate.setEnabled(true);
        jFormattedTextFieldTestId.setEnabled(true);
        jFormattedTextFieldSearchForTest.setEnabled(false);
        jComboBoxTypeOfAssignment.setEnabled(true);
        jComboBoxValue.setEnabled(true);
        jButtonDeleteTest.setEnabled(false);
        jButtonEditTests.setEnabled(true);
        jButtonCreate.setEnabled(false);
        jButtonSearchTests.setEnabled(false);
    }//GEN-LAST:event_jButtonCreateActionPerformed

    // Search for test, return information and set flag to 2 in order to update information when
    // Button is clicked
    private void jButtonSearchTestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchTestsActionPerformed
        flag = 2;
        tes.setSearch(jFormattedTextFieldSearchForTest.getText());
        Tests test = tm.SearchTest(tes);
        jFormattedTextFieldTestId.setText(test.getId());
        jFormattedTextFieldTestName.setText(test.getName());
        jFormattedTextFieldTestDate.setText(test.getDueDate());
        jComboBoxValue.setSelectedItem(test.getAmount());
        jComboBoxTypeOfAssignment.setSelectedItem(test.getActivity());
        jFormattedTextFieldTestId.setEnabled(true);
        jFormattedTextFieldTestName.setEnabled(true);
        jFormattedTextFieldTestDate.setEnabled(true);
        jComboBoxValue.setEnabled(true);
        jComboBoxTypeOfAssignment.setEnabled(true);
        jFormattedTextFieldSearchForTest.setEnabled(true);
        jButtonSearchTests.setEnabled(true);
        jButtonEditTests.setEnabled(true);
        jButtonDeleteTest.setEnabled(true);
        jButtonCreate.setEnabled(false);
    }//GEN-LAST:event_jButtonSearchTestsActionPerformed

    // Delete test from database
    private void jButtonDeleteTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteTestActionPerformed
        int answer = 0;
        answer = JOptionPane.showConfirmDialog(rootPane, "Confirm Delete?");
        if(answer==JOptionPane.YES_OPTION) {
            tes.setId(jFormattedTextFieldTestId.getText());
            tm.DeleteTable(tes);
            jFormattedTextFieldSearchForTest.setText("");
            jFormattedTextFieldTestDate.setText("");
            jFormattedTextFieldTestId.setText("");
            jFormattedTextFieldTestName.setText("");
            jFormattedTextFieldTestDate.setEnabled(false);
            jFormattedTextFieldTestId.setEnabled(false);
            jFormattedTextFieldTestName.setEnabled(false);
            jComboBoxTypeOfAssignment.setEnabled(false);
            jComboBoxValue.setEnabled(false);
            jFormattedTextFieldSearchForTest.setEnabled(true);
            jButtonEditTests.setEnabled(false);
            jButtonCreate.setEnabled(true);
            jButtonDeleteTest.setEnabled(false);
            jButtonSearchTests.setEnabled(true);
            FillTestsTable("SELECT *FROM tests ORDER BY testid");
        }
    }//GEN-LAST:event_jButtonDeleteTestActionPerformed

    // Fill in information text fields above based on jTable selected row and
    // change function of update button
    private void jTableTestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTestsMouseClicked
        flag = 2;
        String id = ""+jTableTests.getValueAt(jTableTests.getSelectedRow(), 0);
        connection.Connection();
        
        connection.ExecuteSQL("SELECT *FROM tests WHERE testid='"+id+"'");
        try {
            connection.rs.first();
            jFormattedTextFieldTestId.setText(connection.rs.getString("testid"));
            jFormattedTextFieldTestName.setText(connection.rs.getString("testname"));
            jFormattedTextFieldTestDate.setText(connection.rs.getString("duedate"));
            jComboBoxTypeOfAssignment.setSelectedItem(connection.rs.getString("activitytype"));
            jComboBoxValue.setSelectedItem(connection.rs.getString("percentage"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Selection Error:\n" + ex.getMessage());
        }
        
        jButtonEditTests.setEnabled(true);
        jButtonDeleteTest.setEnabled(true);
        jButtonCreate.setEnabled(false);
        jFormattedTextFieldTestDate.setEnabled(true);
        jFormattedTextFieldTestId.setEnabled(true);
        jFormattedTextFieldTestName.setEnabled(true);
        jComboBoxTypeOfAssignment.setEnabled(true);
        jComboBoxValue.setEnabled(true);
        
        connection.Desconnect();
    }//GEN-LAST:event_jTableTestsMouseClicked

    private void jButtonLOGOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLOGOFFActionPerformed
        LoginSelectionFrame screen = new LoginSelectionFrame();
        screen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonLOGOFFActionPerformed

    // Fill the tests jTable, looping on result set and adding to array list, which is table model
    private void FillTestsTable(String sql) { 
        ArrayList data = new ArrayList();
        String [] columns = new String[]{"testid","activitytype","testname","duedate",
            "percentage"};
        connection.Connection();
        connection.ExecuteSQL(sql);
        try {
            connection.rs.first();
            do {
                data.add(new Object[]{connection.rs.getString("testid"),
                connection.rs.getString("activitytype"),
                connection.rs.getString("testname"),
                connection.rs.getString("duedate"),
                connection.rs.getString("percentage")});
            } while(connection.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Search for another name");
        }
        
        TestsTable tesmodel = new TestsTable(data, columns);
        jTableTests.setModel(tesmodel);
        jTableTests.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTableTests.getColumnModel().getColumn(0).setResizable(false);
        jTableTests.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTableTests.getColumnModel().getColumn(1).setResizable(false);
        jTableTests.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTableTests.getColumnModel().getColumn(2).setResizable(false);
        jTableTests.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableTests.getColumnModel().getColumn(3).setResizable(false);
        jTableTests.getColumnModel().getColumn(4).setPreferredWidth(60);
        jTableTests.getColumnModel().getColumn(4).setResizable(false);
        jTableTests.getTableHeader().setReorderingAllowed(false);
        jTableTests.setAutoResizeMode(jTableTests.AUTO_RESIZE_OFF);
        jTableTests.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
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
            java.util.logging.Logger.getLogger(LecturerTests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerTests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerTests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerTests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecturerTests().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAttendance;
    private javax.swing.JButton jButtonCourses1;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDeleteTest;
    private javax.swing.JButton jButtonEditTests;
    private javax.swing.JButton jButtonLOGOFF;
    private javax.swing.JButton jButtonSearchTests;
    private javax.swing.JButton jButtonTests;
    private javax.swing.JComboBox<String> jComboBoxTypeOfAssignment;
    private javax.swing.JComboBox<String> jComboBoxValue;
    private javax.swing.JFormattedTextField jFormattedTextFieldSearchForTest;
    private javax.swing.JFormattedTextField jFormattedTextFieldTestDate;
    private javax.swing.JFormattedTextField jFormattedTextFieldTestId;
    private javax.swing.JFormattedTextField jFormattedTextFieldTestName;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTests;
    // End of variables declaration//GEN-END:variables
}
