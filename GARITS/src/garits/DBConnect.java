package garits;

import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnect {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DBConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/garits","root","");
            st = con.createStatement();
            System.out.println("Connection Successful");
        }catch(Exception ex){
            System.out.println("I am Error: " + ex);
        }
    }
    
    public void getData(){
        try{
            String query = "SELECT * FROM `customers` WHERE 1";
            rs = st.executeQuery(query);
            System.out.println("Records in Database");
            while(rs.next()){
                String regnum = rs.getString("Reg.No");
                String make = rs.getString("Make");
                String eng = rs.getString("Eng.Serial");
                String chass = rs.getString("Chassis Number");
                String colour = rs.getString("Colour");
                System.out.println("Reg Number: " + regnum + " Make: " + make +
                " Engine Serial: " + eng + " Chassis Num: " + chass + " Colour: "
                + colour);
            }
        }catch(Exception ex){
            
        }
    }
    
    public void connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/garits","root","");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
        }
    }
    
    public void setData() throws Exception{
        try{  
        
        System.out.println("Successfully inserted");
        }catch(Exception ex){
            System.out.println("Failed to insert data");
        }
    }
}