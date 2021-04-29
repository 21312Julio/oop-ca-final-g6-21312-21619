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
public class StudentManager {
    
    DatabaseConnection connect = new DatabaseConnection();
    Student st = new Student();
    
    public void SaveStudent(Student st) {
        connect.Connection();
        
        try {
            PreparedStatement pst = connect.con.prepareStatement("INSERT INTO students"
            + "(id, name, nationality, address, passport, phone, password) VALUES"
            + "(?,?,?,?,?,?,?)");
            pst.setString(1, st.getId());
            pst.setString(2, st.getName());
            pst.setString(3, st.getNationality());
            pst.setString(4, st.getAddress());
            pst.setString(5, st.getPassport());
            pst.setString(6, st.getPhone());
            pst.setString(7, st.getPassword());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert OK");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Insert Error:\n" + ex);
        }
    }
    
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
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Student Not Registered");
        }
        
        connect.Desconnect();
        return st;
    }
    
    public void EditStudent(Student st) {
        connect.Connection();
        
        try {
            PreparedStatement pst = connect.con.prepareStatement("UPDATE students" +
                    " SET name=?, address=?, phone=?, password=? WHERE id=?");
            pst.setString(1, st.getName());
            pst.setString(2, st.getAddress());
            pst.setString(3, st.getPhone());
            pst.setString(4, st.getPassword());
            pst.setString(5, st.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Updated OK");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Update Error:\n" + ex.getMessage());
        }
        
        connect.Desconnect();
    }
    
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
