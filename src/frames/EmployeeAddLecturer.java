/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import databasecontrol.DatabaseConnection;
import databasecontrol.LecturerManager;
import models.Lecturer;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import models.LecturerTable;

/**
 *
 * @author julio
 */
public class EmployeeAddLecturer extends javax.swing.JFrame {

    DatabaseConnection connection  = new DatabaseConnection();
    LecturerManager lm = new LecturerManager();
    Lecturer lec = new Lecturer();
    int flag = 0;
    
    /**
     * Creates new form EmployeeAddLecturer
     */
    public EmployeeAddLecturer() {
        initComponents();
        FillLecturerTable("SELECT *FROM lecturers ORDER BY name");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameCoursesAdd = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLecturers = new javax.swing.JTable();
        jFormattedTextFieldLecturerSearch = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jLabelStudentName = new javax.swing.JLabel();
        jFormattedTextFieldLecturerName = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextFieldLecturerPhone = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldLecturerAddress = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldLecturerId = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldLecturerPassword = new javax.swing.JFormattedTextField();
        jButtonAddLecturer = new javax.swing.JButton();
        jButtonSaveLecturer = new javax.swing.JButton();
        jButtonCancelLecturer = new javax.swing.JButton();
        jButtonEditLecturer = new javax.swing.JButton();
        jButtonDeleteLecturer = new javax.swing.JButton();
        jButtonManageCourses = new javax.swing.JButton();
        jButtonManageStudents = new javax.swing.JButton();
        jButtonManageLecturers = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameCoursesAdd.setMaximizable(true);
        jInternalFrameCoursesAdd.setVisible(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableLecturers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableLecturers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLecturersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLecturers);

        jFormattedTextFieldLecturerSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldLecturerSearchActionPerformed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelStudentName.setText("Name");

        jFormattedTextFieldLecturerName.setEnabled(false);
        jFormattedTextFieldLecturerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldLecturerNameActionPerformed(evt);
            }
        });

        jLabel1.setText("Phone");

        jFormattedTextFieldLecturerPhone.setEnabled(false);

        jLabel3.setText("Address");

        jFormattedTextFieldLecturerAddress.setEnabled(false);

        jLabel4.setText("ID");

        jFormattedTextFieldLecturerId.setEnabled(false);

        jLabel5.setText("Password");

        jFormattedTextFieldLecturerPassword.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelStudentName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextFieldLecturerName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextFieldLecturerId, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextFieldLecturerAddress))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextFieldLecturerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextFieldLecturerPassword))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextFieldLecturerSearch)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStudentName)
                    .addComponent(jFormattedTextFieldLecturerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextFieldLecturerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextFieldLecturerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFormattedTextFieldLecturerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldLecturerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jFormattedTextFieldLecturerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButtonAddLecturer.setText("Add");
        jButtonAddLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddLecturerActionPerformed(evt);
            }
        });

        jButtonSaveLecturer.setText("Save");
        jButtonSaveLecturer.setEnabled(false);
        jButtonSaveLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveLecturerActionPerformed(evt);
            }
        });

        jButtonCancelLecturer.setText("Cancel");
        jButtonCancelLecturer.setEnabled(false);
        jButtonCancelLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelLecturerActionPerformed(evt);
            }
        });

        jButtonEditLecturer.setText("Edit");
        jButtonEditLecturer.setEnabled(false);
        jButtonEditLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditLecturerActionPerformed(evt);
            }
        });

        jButtonDeleteLecturer.setText("Delete");
        jButtonDeleteLecturer.setEnabled(false);
        jButtonDeleteLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteLecturerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameCoursesAddLayout = new javax.swing.GroupLayout(jInternalFrameCoursesAdd.getContentPane());
        jInternalFrameCoursesAdd.getContentPane().setLayout(jInternalFrameCoursesAddLayout);
        jInternalFrameCoursesAddLayout.setHorizontalGroup(
            jInternalFrameCoursesAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameCoursesAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameCoursesAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDeleteLecturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSaveLecturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelLecturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditLecturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAddLecturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jInternalFrameCoursesAddLayout.setVerticalGroup(
            jInternalFrameCoursesAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameCoursesAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameCoursesAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jInternalFrameCoursesAddLayout.createSequentialGroup()
                        .addComponent(jButtonAddLecturer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSaveLecturer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelLecturer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditLecturer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDeleteLecturer)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jInternalFrameCoursesAdd);
        jInternalFrameCoursesAdd.setBounds(160, 60, 560, 370);

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

        jButtonManageLecturers.setText("Manage Lecturers");
        getContentPane().add(jButtonManageLecturers);
        jButtonManageLecturers.setBounds(20, 400, 130, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgemployeemainlecturer.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-3, -4, 730, 440);

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

    private void jFormattedTextFieldLecturerSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldLecturerSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldLecturerSearchActionPerformed

    private void jButtonAddLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddLecturerActionPerformed
        flag = 1;
        jFormattedTextFieldLecturerName.setEnabled(true);
        jFormattedTextFieldLecturerAddress.setEnabled(true);
        jFormattedTextFieldLecturerPhone.setEnabled(true);
        jFormattedTextFieldLecturerName.setText("");
        jFormattedTextFieldLecturerAddress.setText("");
        jFormattedTextFieldLecturerPhone.setText("");
        jButtonSaveLecturer.setEnabled(true);
        jButtonCancelLecturer.setEnabled(true);
        jButtonEditLecturer.setEnabled(false);
        jButtonDeleteLecturer.setEnabled(false);
        jFormattedTextFieldLecturerSearch.setEnabled(false);
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButtonAddLecturerActionPerformed

    private void jButtonSaveLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveLecturerActionPerformed
        if (jFormattedTextFieldLecturerName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name Required");
            jFormattedTextFieldLecturerName.requestFocus();
        } else if (jFormattedTextFieldLecturerAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Address Required");
            jFormattedTextFieldLecturerAddress.requestFocus();
        } else if (jFormattedTextFieldLecturerPhone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Phone Required");
        } else {
            if (flag==1) {
                lec.setName(jFormattedTextFieldLecturerName.getText());
                lec.setPhone(jFormattedTextFieldLecturerPhone.getText());
                lec.setAddress(jFormattedTextFieldLecturerAddress.getText());
                lec.setId(lec.createId());
                lec.setPassword("678910");
                lm.SaveLecturer(lec);
                jFormattedTextFieldLecturerName.setText("");
                jFormattedTextFieldLecturerPhone.setText("");
                jFormattedTextFieldLecturerAddress.setText("");
                jFormattedTextFieldLecturerName.setEnabled(false);
                jFormattedTextFieldLecturerPhone.setEnabled(false);
                jFormattedTextFieldLecturerAddress.setEnabled(false);
                jFormattedTextFieldLecturerSearch.setEnabled(true);
                jButton1.setEnabled(true);
                jButtonSaveLecturer.setEnabled(false);
                jButtonCancelLecturer.setEnabled(false);
                FillLecturerTable("SELECT *FROM lecturers ORDER BY name");
            } else {
                lec.setName(jFormattedTextFieldLecturerName.getText());
                lec.setPhone(jFormattedTextFieldLecturerPhone.getText());
                lec.setAddress(jFormattedTextFieldLecturerAddress.getText());
                lec.setId(jFormattedTextFieldLecturerId.getText());
                lec.setPassword(jFormattedTextFieldLecturerPassword.getText());
                lm.EditLecturer(lec);
                jFormattedTextFieldLecturerName.setText("");
                jFormattedTextFieldLecturerPhone.setText("");
                jFormattedTextFieldLecturerAddress.setText("");
                jFormattedTextFieldLecturerId.setText("");
                jFormattedTextFieldLecturerPassword.setText("");
                jFormattedTextFieldLecturerName.setEnabled(false);
                jFormattedTextFieldLecturerPhone.setEnabled(false);
                jFormattedTextFieldLecturerAddress.setEnabled(false);
                jButtonSaveLecturer.setEnabled(false);
                jButtonCancelLecturer.setEnabled(false);
                jButtonAddLecturer.setEnabled(true);
                FillLecturerTable("SELECT *FROM lecturers ORDER BY name");
            }
        }
    }//GEN-LAST:event_jButtonSaveLecturerActionPerformed

    private void jButtonCancelLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelLecturerActionPerformed
        jFormattedTextFieldLecturerName.setEnabled(!true);
        jFormattedTextFieldLecturerPhone.setEnabled(!true);
        jFormattedTextFieldLecturerAddress.setEnabled(!true);
        jFormattedTextFieldLecturerId.setEnabled(!true);
        jFormattedTextFieldLecturerPassword.setEnabled(!true);
        jButtonSaveLecturer.setEnabled(!true);
        jButtonCancelLecturer.setEnabled(!true);
        jButtonAddLecturer.setEnabled(true);
        jButtonEditLecturer.setEnabled(false);
        jButtonDeleteLecturer.setEnabled(false);
        jFormattedTextFieldLecturerName.setText("");
        jFormattedTextFieldLecturerPhone.setText("");
        jFormattedTextFieldLecturerAddress.setText("");
        jFormattedTextFieldLecturerId.setText("");
        jFormattedTextFieldLecturerPassword.setText("");
        jFormattedTextFieldLecturerSearch.setText("");
        jButton1.setEnabled(true);
        jFormattedTextFieldLecturerSearch.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelLecturerActionPerformed

    private void jButtonEditLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditLecturerActionPerformed
        flag = 2;
        jFormattedTextFieldLecturerName.setEnabled(true);
        jFormattedTextFieldLecturerPhone.setEnabled(true);
        jFormattedTextFieldLecturerAddress.setEnabled(true);
        jFormattedTextFieldLecturerPassword.setEnabled(true);
        jButtonSaveLecturer.setEnabled(true);
        jButtonCancelLecturer.setEnabled(true);
        jButtonEditLecturer.setEnabled(false);
        jButtonAddLecturer.setEnabled(false);
        jButtonDeleteLecturer.setEnabled(false);
    }//GEN-LAST:event_jButtonEditLecturerActionPerformed

    private void jButtonDeleteLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteLecturerActionPerformed
        int answer = 0;
        answer = JOptionPane.showConfirmDialog(rootPane, "Confirm Delete?");
        if(answer==JOptionPane.YES_OPTION) {
            lec.setId(jFormattedTextFieldLecturerId.getText());
            lm.DeleteLecturer(lec);
            jFormattedTextFieldLecturerName.setText("");
            jFormattedTextFieldLecturerPhone.setText("");
            jFormattedTextFieldLecturerAddress.setText("");
            jFormattedTextFieldLecturerId.setText("");
            jFormattedTextFieldLecturerPassword.setText("");
            jFormattedTextFieldLecturerName.setEnabled(false);
            jFormattedTextFieldLecturerPhone.setEnabled(false);
            jFormattedTextFieldLecturerAddress.setEnabled(false);
            jFormattedTextFieldLecturerId.setEnabled(false);
            jFormattedTextFieldLecturerPassword.setEnabled(false);
            jButtonSaveLecturer.setEnabled(false);
            jButtonAddLecturer.setEnabled(true);
            jButtonCancelLecturer.setEnabled(false);
            jButtonEditLecturer.setEnabled(false);
            jButtonDeleteLecturer.setEnabled(false);
            FillLecturerTable("SELECT *FROM lecturers ORDER BY name");
        }
    }//GEN-LAST:event_jButtonDeleteLecturerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        lec.setSearch(jFormattedTextFieldLecturerSearch.getText());
        Lecturer lect = lm.SearchLecturer(lec);
        jFormattedTextFieldLecturerName.setText(lect.getName());
        jFormattedTextFieldLecturerPhone.setText(lect.getPhone());
        jFormattedTextFieldLecturerAddress.setText(lect.getAddress());
        jFormattedTextFieldLecturerId.setText(lect.getId());
        jFormattedTextFieldLecturerPassword.setText(lect.getPassword());
        jButtonEditLecturer.setEnabled(true);
        jButtonDeleteLecturer.setEnabled(true);
        jFormattedTextFieldLecturerSearch.setEnabled(true);
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableLecturersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLecturersMouseClicked
        String name = ""+jTableLecturers.getValueAt(jTableLecturers.getSelectedRow(), 0);
        connection.Connection();
        
        connection.ExecuteSQL("SELECT *FROM lecturers WHERE name='"+name+"'");
        try {
            connection.rs.first();
            jFormattedTextFieldLecturerName.setText(connection.rs.getString("name"));
            jFormattedTextFieldLecturerPhone.setText(connection.rs.getString("phone"));
            jFormattedTextFieldLecturerAddress.setText(connection.rs.getString("address"));
            jFormattedTextFieldLecturerId.setText(connection.rs.getString("id"));
            jFormattedTextFieldLecturerPassword.setText(connection.rs.getString("password"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Selection Error:\n" + ex.getMessage());
        }
        
        jButtonEditLecturer.setEnabled(true);
        jButtonDeleteLecturer.setEnabled(true);
        
        connection.Desconnect();
    }//GEN-LAST:event_jTableLecturersMouseClicked

    private void jFormattedTextFieldLecturerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldLecturerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldLecturerNameActionPerformed

    private void FillLecturerTable(String sql) {
        ArrayList data = new ArrayList();
        String [] columns = new String[]{"name","phone","address","id","password"};
        connection.Connection();
        connection.ExecuteSQL(sql);
        try {
            connection.rs.first();
            do {
                data.add(new Object[]{connection.rs.getString("name"),
                connection.rs.getString("phone"),
                connection.rs.getString("address"),
                connection.rs.getString("id"),
                connection.rs.getString("password")});
            } while(connection.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Search for another lecturer");
        }
        LecturerTable lecmodel = new LecturerTable(data, columns);
        jTableLecturers.setModel(lecmodel);
        jTableLecturers.getColumnModel().getColumn(0).setPreferredWidth(200);
        jTableLecturers.getColumnModel().getColumn(0).setResizable(false);
        jTableLecturers.getColumnModel().getColumn(1).setPreferredWidth(130);
        jTableLecturers.getColumnModel().getColumn(1).setResizable(false);
        jTableLecturers.getColumnModel().getColumn(2).setPreferredWidth(250);
        jTableLecturers.getColumnModel().getColumn(2).setResizable(false);
        jTableLecturers.getColumnModel().getColumn(3).setPreferredWidth(60);
        jTableLecturers.getColumnModel().getColumn(3).setResizable(false);
        jTableLecturers.getColumnModel().getColumn(4).setPreferredWidth(70);
        jTableLecturers.getColumnModel().getColumn(4).setResizable(false);
        jTableLecturers.getTableHeader().setReorderingAllowed(false);
        jTableLecturers.setAutoResizeMode(jTableLecturers.AUTO_RESIZE_OFF);
        jTableLecturers.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
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
            java.util.logging.Logger.getLogger(EmployeeAddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeAddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeAddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeAddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeAddLecturer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddLecturer;
    private javax.swing.JButton jButtonCancelLecturer;
    private javax.swing.JButton jButtonDeleteLecturer;
    private javax.swing.JButton jButtonEditLecturer;
    private javax.swing.JButton jButtonManageCourses;
    private javax.swing.JButton jButtonManageLecturers;
    private javax.swing.JButton jButtonManageStudents;
    private javax.swing.JButton jButtonSaveLecturer;
    private javax.swing.JFormattedTextField jFormattedTextFieldLecturerAddress;
    private javax.swing.JFormattedTextField jFormattedTextFieldLecturerId;
    private javax.swing.JFormattedTextField jFormattedTextFieldLecturerName;
    private javax.swing.JFormattedTextField jFormattedTextFieldLecturerPassword;
    private javax.swing.JFormattedTextField jFormattedTextFieldLecturerPhone;
    private javax.swing.JFormattedTextField jFormattedTextFieldLecturerSearch;
    private javax.swing.JInternalFrame jInternalFrameCoursesAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelStudentName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLecturers;
    // End of variables declaration//GEN-END:variables
}
