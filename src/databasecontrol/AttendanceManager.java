/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasecontrol;

import models.Attendance;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */

// Managing Attendance Tables on SQL
public class AttendanceManager {
    
    DatabaseConnection connect = new DatabaseConnection();
    Attendance att = new Attendance();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    String date = sdf.format(new Date(System.currentTimeMillis()));
    
    // Create a new Table on Database for the desired courseid and today's date
    public void CreateTableAttendance(Attendance att) {
        connect.Connection();
        
        String courseID = "VGC"+att.getSearch();
        String tablename = courseID + date;  
        connect.ExecuteSQLCreate("CREATE TABLE " + tablename + " (studentname VARCHAR(45),"
            + " studentid VARCHAR(10),"
            + " attendance VARCHAR(15))");           
        
        connect.Desconnect();
    }
        
    /**
     * Fill the table with students that have the same course id as the one specified for
     * table creation
     */ 
    public void InsertIntoTable(Attendance att, String[] data) {
        connect.Connection();
        
        String courseID = "VGC"+att.getSearch();
        String tablename = courseID + date;
        
        try {
            PreparedStatement pst = connect.con.prepareStatement("INSERT INTO " 
                    + tablename
                    + "(studentname, studentid, attendance) VALUES"
                    + "(?,?,?)");
            pst.setString(1, data[0]);
            pst.setString(2, data[1]);
            pst.setString(3, "");
            pst.execute();
            JOptionPane.showMessageDialog(null, "Table Insert Ok!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Couldn't create table:\n" + ex);
        }
        
        connect.Desconnect();
        
    }     

    /**
     * Update students attendance information every update button is pressed
     */ 
    public void UpdateInformation(Attendance att) {
        connect.Connection();
        
        String courseID = "vgc"+att.getSearch().toLowerCase();
        String tablename = courseID + date;
        try {
            PreparedStatement pst = connect.con.prepareStatement("UPDATE " 
                    + tablename
                    + " SET attendance=? WHERE studentid=?");
            pst.setString(1, att.getAttendance());
            pst.setString(2, att.getStudentid());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Student Updated");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Couldn't update information");
        }
        
        connect.Desconnect();
        
    }
    
}
        
