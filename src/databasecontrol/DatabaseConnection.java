/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasecontrol;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author julio
 */

// Handle all SQL queries executed inside the program
public class DatabaseConnection {
    
    public Statement stm;
    public ResultSet rs;
    private final String DB_URL = "jdbc:mysql://localhost:3306/collegeca3";
    private final String DB_USER = "Julio";
    private final String DB_PASSWORD = "gurthang.1";
    public java.sql.Connection con;
    
    
    // Start connection with database
    public void Connection() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
           // JOptionPane.showMessageDialog(null, "Database Connection Successful.");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database Connection Error:\n" + ex.getMessage());
        }
        
    }
    
    // SQL Table creation statement for the attendance tables
    public void ExecuteSQLCreate(String sql) {
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            stm.execute(sql);
            JOptionPane.showMessageDialog(null, "Executed successfully!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ExecuteSQL Error:\n" + ex.getMessage());
        }
    }
    
    // Execute queries and return values inside the database
    public void ExecuteSQL(String sql) {
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ExecuteSQL Error:\n" + ex.getMessage());
        }
        
    }
    
    // Desconnect from current database session
    public void Desconnect() {
        
        try {
            con.close();
           // JOptionPane.showMessageDialog(null, "DB Desconnected with Success");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Disconnecting Error:\n" + ex.getMessage());
        }
        
    }
    
}
