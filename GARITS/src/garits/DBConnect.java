package garits;

import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnect {
    public Connection conn;
    public DBConnect(){
        try{
            //Creates a connection to the database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/garits","root","");
        }catch(Exception ex){
            //Show a error message if a connection cannot be made
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
        }
    }
    
    public void close() throws SQLException{
        //Closes the database connection
        conn.close();
    }  
}