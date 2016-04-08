package garits;

import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnect {
    public Connection conn;
    public DBConnect(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/garits","root","");
            System.out.println("Connection made");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
        }
    }
    
    public void close() throws SQLException{
        conn.close();
    }  
}