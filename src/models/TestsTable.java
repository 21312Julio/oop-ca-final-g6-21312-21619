/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author julio
 */

// Tests table model creation to fill jTables of the class
public class TestsTable extends AbstractTableModel{
    
    private ArrayList rows = null;
    private String[] columns = null;
    
    public TestsTable (ArrayList ro, String[] col) {
        setRows(ro);
        setColumns(col);
    }

    public ArrayList getRows() {
        return rows;
    }

    public void setRows(ArrayList rows) {
        this.rows = rows;
    }

    public String[] getColumns() {
        return columns;
    }

    public void setColumns(String[] columns) {
        this.columns = columns;
    }
    
    public int getColumnCount() {
        return columns.length;
    }
    
    public int getRowCount() {
        return rows.size();
    }
    
    public String getColumnName(int numCol) {
        return columns[numCol];
    }
    
    public Object getValueAt(int numRow, int numCol) {
        Object[] row = (Object[])getRows().get(numRow);
        return row[numCol];
    }
    
}
