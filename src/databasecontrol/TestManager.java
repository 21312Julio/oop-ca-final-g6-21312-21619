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
import models.Tests;

/**
 *
 * @author julio
 */

// Manage test class in database
public class TestManager {
    
    DatabaseConnection connect = new DatabaseConnection();
    Tests tes = new Tests();
    
    
    // Save tests in database from inside lecturer test tab
    public void SaveTest(Tests tes) {
        connect.Connection();
        
        try {
            PreparedStatement pst = connect.con.prepareStatement("INSERT INTO tests"
            + "(testid, activitytype, testname, duedate, percentage) VALUES"
            + "(?,?,?,?,?)");
            pst.setString(1, tes.getId());
            pst.setString(2, tes.getActivity());
            pst.setString(3, tes.getName());
            pst.setString(4, tes.getDueDate());
            pst.setString(5, tes.getAmount());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert OK");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Insert Error:\n" + ex);
        }
    }
    
    // Search for test from inside lecturers tests tab
    public Tests SearchTest(Tests tes) {
        connect.Connection();
        
        connect.ExecuteSQL("SELECT *FROM tests WHERE testid LIKE'%" +
                tes.getSearch() + "%'");
        try {
            connect.rs.first();
            tes.setId(connect.rs.getString("testid"));
            tes.setActivity(connect.rs.getString("activitytype"));
            tes.setName(connect.rs.getString("testname"));
            tes.setDueDate(connect.rs.getString("duedate"));
            tes.setAmount(connect.rs.getString("percentage"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Student Not Registered");
        }
        
        connect.Desconnect();
        return tes;
    }
    
    // Edit test from inside lectures tests tab
    public void EditTable(Tests tes) {
        connect.Connection();
        
        try {
            PreparedStatement pst = connect.con.prepareStatement("UPDATE tests" +
                    " SET activitytype=?, testname=?, duedate=?, percentage=? WHERE testid=?");
            pst.setString(1, tes.getActivity());
            pst.setString(2, tes.getName());
            pst.setString(3, tes.getDueDate());
            pst.setString(4, tes.getAmount());
            pst.setString(5, tes.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Updated OK");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Update Error:\n" + ex.getMessage());
        }
        
        connect.Desconnect();
    }
    
    // Delete test from inside lectures tests tab
    public void DeleteTable(Tests tes){
        connect.Connection();
        
        try {
            PreparedStatement pst = connect.con.prepareStatement("DELETE FROM tests"
                    + " WHERE testid=?");
            pst.setString(1, tes.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Deleted OK");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Delete Error:\n" + ex.getMessage());
        }
        
        connect.Desconnect();
    }
    
}
