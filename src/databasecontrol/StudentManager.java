/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasecontrol;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Student;

/**
 *
 * @author julio
 */

// Manage student class in database from employee manage students tab
public class StudentManager {
    
    DatabaseConnection connect = new DatabaseConnection();
    Student st = new Student();
    
    // Insert new student in database from employee manage students tab
    public void SaveStudent(Student st) {
        connect.Connection();
        
        try {
            PreparedStatement pst = connect.con.prepareStatement("INSERT INTO students"
            + "(id, name, nationality, address, passport, phone, password, courseID) VALUES"
            + "(?,?,?,?,?,?,?,?)");
            pst.setString(1, st.getId());
            pst.setString(2, st.getName());
            pst.setString(3, st.getNationality());
            pst.setString(4, st.getAddress());
            pst.setString(5, st.getPassport());
            pst.setString(6, st.getPhone());
            pst.setString(7, st.getPassword());
            pst.setString(8, st.getCourseID());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert OK");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Insert Error:\n" + ex);
        }
    }
    
    // Search for students from inside employee manage students tab
    public Student SearchStudent(Student st) {
        connect.Connection();
        
        connect.ExecuteSQL("SELECT *FROM students WHERE name LIKE'%" +
                st.getSearch() + "%'");
        try {
            connect.rs.first();
            st.setId(connect.rs.getString("id"));
            st.setName(connect.rs.getString("name"));
            st.setNationality(connect.rs.getString("nationality"));
            st.setAddress(connect.rs.getString("address"));
            st.setPassport(connect.rs.getString("passport"));
            st.setPhone(connect.rs.getString("phone"));
            st.setPassword(connect.rs.getString("password"));
            st.setCourseID(connect.rs.getString("courseID"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Student Not Registered");
        }
        
        connect.Desconnect();
        return st;
    }
    
    // Return student values that matches current logged in user and display on screen
    public Student SearchStudentById(String id) {
        connect.Connection();
        
        connect.ExecuteSQL("SELECT *FROM students WHERE id LIKE'%" +
                id + "%'");
        try {
            connect.rs.first();
            st.setId(connect.rs.getString("id"));
            st.setName(connect.rs.getString("name"));
            st.setNationality(connect.rs.getString("nationality"));
            st.setAddress(connect.rs.getString("address"));
            st.setPassport(connect.rs.getString("passport"));
            st.setPhone(connect.rs.getString("phone"));
            st.setPassword(connect.rs.getString("password"));
            st.setCourseID(connect.rs.getString("courseID"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Student Not Registered");
        }
        
        connect.Desconnect();
        return st;
    }
    
    // Edit students from inside employee manage students tab
    public void EditStudent(Student st) {
        connect.Connection();
        
        try {
            PreparedStatement pst = connect.con.prepareStatement("UPDATE students" +
                    " SET name=?, address=?, phone=?, password=?, courseID=? WHERE id=?");
            pst.setString(1, st.getName());
            pst.setString(2, st.getAddress());
            pst.setString(3, st.getPhone());
            pst.setString(4, st.getPassword());
            pst.setString(5, st.getCourseID());
            pst.setString(6, st.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Updated OK");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Update Error:\n" + ex.getMessage());
        }
        
        connect.Desconnect();
    }
    
    // Delete students from inside employee manage students tab
    public void DeleteStudent(Student st) {
        connect.Connection();
        
        try {
            PreparedStatement pst = connect.con.prepareStatement("DELETE FROM students"
                    + " WHERE id=?");
            pst.setString(1, st.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Deleted OK");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Delete Error:\n" + ex.getMessage());
        }
    }
    
}
