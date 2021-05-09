/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasecontrol;

import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Lecturer;
import java.sql.*;

/**
 *
 * @author julio
 */

// Manage lecturer class creation and edit inside database from employee manage lecturers tab
public class LecturerManager {
    
    DatabaseConnection connect = new DatabaseConnection();
    Lecturer lec = new Lecturer();
    
    // Insert lecturer in database from employee manage lecturers tab
    public void SaveLecturer(Lecturer lec) {
        connect.Connection();
        
        try {
            PreparedStatement pst = connect.con.prepareStatement("INSERT INTO lecturers"
            + "(name, phone, address, id, password) VALUES"
            + "(?,?,?,?,?)");
            pst.setString(1, lec.getName());
            pst.setString(2, lec.getPhone());
            pst.setString(3, lec.getAddress());
            pst.setString(4, lec.getId());
            pst.setString(5, lec.getPassword());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert OK");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Insert Error:\n"+ex);
        }
    }
    
    // Search for lecturers from inside employee manage lecturers tab
    public Lecturer SearchLecturer(Lecturer lec) {
        connect.Connection();
        
        connect.ExecuteSQL("SELECT *FROM lecturers WHERE name LIKE'%" +
                lec.getSearch() + "%'");
        try {
            connect.rs.first();
            lec.setName(connect.rs.getString("name"));
            lec.setPhone(connect.rs.getString("phone"));
            lec.setAddress(connect.rs.getString("address"));
            lec.setId(connect.rs.getString("id"));
            lec.setPassword(connect.rs.getString("password"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lecturer Not Registered");
        }
        
        connect.Desconnect();
        return lec;
    }
    
    // Edit lecturers from inside employee manage lecturers tab
    public void EditLecturer(Lecturer lec) {
        connect.Connection();
        
        try {
            PreparedStatement pst = connect.con.prepareStatement("UPDATE lecturers" +
                    " SET name=?, phone=?, address=?, password=? WHERE id=?");
            pst.setString(1, lec.getName());
            pst.setString(2, lec.getPhone());
            pst.setString(3, lec.getAddress());
            pst.setString(4, lec.getPassword());
            pst.setString(5, lec.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Updated OK");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Update Error:\n" + ex.getMessage());
        }
        
        connect.Desconnect();
    }
    
    // Delete lecturers from inside employee manage lecturers tab
    public void DeleteLecturer(Lecturer lec) {
        connect.Connection();
        
        try {
            PreparedStatement pst = connect.con.prepareStatement("DELETE FROM lecturers"
                + " WHERE id=?");
            pst.setString(1, lec.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Deleted OK");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Delete Error:\n" + ex.getMessage());
        }
    }
    
}
