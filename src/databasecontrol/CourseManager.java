/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasecontrol;

import java.sql.*;
import javax.swing.JOptionPane;
import models.Courses;
import frames.EmployeeAddCourse;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Student;

/**
 *
 * @author julio
 */

// Managing the courses class inside the database
public class CourseManager {
    
    DatabaseConnection connect = new DatabaseConnection();
    Courses co = new Courses();
    Student st = new Student();
    
    // Saving input data into the database from the employee manage course tab
    public void SaveCourse(Courses co) {
        connect.Connection();
        
        try {
            PreparedStatement pst = connect.con.prepareStatement("INSERT INTO courses"
                    + "(id, name, lecturer, classroom, time, day) VALUES"
                    + "(?,?,?,?,?,?)");
            pst.setString(1, co.getId());
            pst.setString(2, co.getName());
            pst.setString(3, co.getLecturer());
            pst.setString(4, co.getClassroom());
            pst.setString(5, co.getTime());
            pst.setString(6, co.getDay());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert OK");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Insert Error:\n" + ex);
        }
      
        
        connect.Desconnect();
    }
    
    // Search for courses inside database and return values in the employee manage courses tab
    public Courses searchCourses(Courses co) {
        connect.Connection();
        
        connect.ExecuteSQL("SELECT *FROM courses WHERE id LIKE'%" +
                co.getSearch() + "%'");
        try {
            connect.rs.first();
            co.setId(connect.rs.getString("id"));
            co.setName(connect.rs.getString("name"));
            co.setLecturer(connect.rs.getString("lecturer"));
            co.setClassroom(connect.rs.getString("classroom"));
            co.setTime(connect.rs.getString("time"));
            co.setDay(connect.rs.getString("day"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ID Not Registered");
        }
        
        connect.Desconnect();
        return co;
    }
    
    // Return the course that matches the current logged in student course id and display on screen
    public Courses searchCoursesForStudent(Student st, Courses co) {
        connect.Connection();
        
        connect.ExecuteSQL("SELECT *FROM courses WHERE id LIKE'%" +
                st.getCourseID() + "%'");
        try {
            connect.rs.first();
            co.setId(connect.rs.getString("id"));
            co.setName(connect.rs.getString("name"));
            co.setLecturer(connect.rs.getString("lecturer"));
            co.setClassroom(connect.rs.getString("classroom"));
            co.setTime(connect.rs.getString("time"));
            co.setDay(connect.rs.getString("day"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ID Not Registered");
        }
        
        connect.Desconnect();
        return co;
    }
    
    
    // Edit course information from the employee manage courses tab
    public void Edit(Courses co) {
        connect.Connection();
        
        try {
            PreparedStatement pst = connect.con.prepareStatement("UPDATE courses"
                    + " SET name=?, lecturer=?, classroom=?, time=?"
                    + ", day=? WHERE id=?");
            pst.setString(1, co.getName());
            pst.setString(2, co.getLecturer());
            pst.setString(3, co.getClassroom());
            pst.setString(4, co.getTime());
            pst.setString(5, co.getDay());
            pst.setString(6, co.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Updated OK");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Update Error:\n" + ex.getMessage());
        }
        
        connect.Desconnect();
    }
    
    // Delete courses from database from the employee manage courses tab
    public void Delete(Courses co) {
        connect.Connection();
        
        try {
            PreparedStatement pst = connect.con.prepareStatement("DELETE FROM courses"
                    + " WHERE id=?");
            pst.setString(1, co.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Deleted OK");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Delete Error:\n" + ex.getMessage());
        }
        
        connect.Desconnect();
    }
    
    // Return courses that matches lecturer name in the lecturer courses tab
    public Courses searchCoursesForLecturer(Courses co) {
        connect.Connection();
        
        connect.ExecuteSQL("SELECT *FROM courses WHERE lecturer LIKE'%" +
                co.getSearch() + "%'");
        try {
            connect.rs.first();
            co.setId(connect.rs.getString("id"));
            co.setName(connect.rs.getString("name"));
            co.setLecturer(connect.rs.getString("lecturer"));
            co.setClassroom(connect.rs.getString("classroom"));
            co.setTime(connect.rs.getString("time"));
            co.setDay(connect.rs.getString("day"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ID Not Registered");
        }
        
        connect.Desconnect();
        return co;
    }
}
