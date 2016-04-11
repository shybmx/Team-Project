package garits;

import java.util.Calendar;
import java.util.Date;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import wagu.Board;
import wagu.Table;

public class CreateReports implements Runnable {
    //Create variable that checks if the franchsiee has checked his notifcations
    boolean checked = false;
    PreparedStatement prestate;
    PreparedStatement prestate2;
    DBConnect db;
    BackupDB bd;
    public CreateReports() {
        //Creating a new database connection
        db = new DBConnect();
        //Creating a new Backup database object which takes in the database connection
        bd = new BackupDB(db);
        
    }

    public int getDate() {
        //Getting the current date
        Calendar cal = Calendar.getInstance();
        //Placing the current date into a int variable
        int i = cal.get(Calendar.DATE);
        //Returning the date
        return i;
    }

    public int getMonth() {
        //Getting the current month
        Calendar cal = Calendar.getInstance();
        //Placing the current month into a int variable
        int i = cal.get(Calendar.MONTH);
        //Reurning the month
        return i;
    }
    
    public void backUp(){
        //Getting the automatic backup from the back up class
        bd.backup();
    }
    
    public void serviceReport() {
        try {
            //Creating a new file in the location shown
            File file = new File("/Users/shahzad/Desktop/ServiceReport.txt");
            //Creating a file writier which allows the software to write to the file
            FileWriter fr = new FileWriter(file.getAbsoluteFile());
            //Creating a buffered Wrtier which allows us to write to the file
            BufferedWriter out = new BufferedWriter(fr);
            //A list which containts all the apprioate information for this report
            List<String> headers = Arrays.asList("MOT", "Annual Service", "Repairs", "MOT (Account)", "MOT (Non-Account)", "Annual Service (Account)", "Annual Service (Non-Account)", "Repairs (Account)", "Repairs(Non-Account)");
            //An ArrayList which takes in a list and String
            ArrayList<List<String>> rowData = new ArrayList<>();
            //Creating a MySQL statement which counts all the relevent information
            prestate = db.conn.prepareStatement("SELECT count(*) FROM `jobsheets` where `TypeOfJob` = 'MOT' ");
            //Executing the query and placing it in a result set 
            ResultSet rs = prestate.executeQuery();
            //Going to the next result which is not the header
            rs.next();
            //Creating a MySQL statement which counts all the relevent information
            prestate = db.conn.prepareStatement("SELECT count(*) FROM `jobsheets` where `TypeOfJob` = 'Annual Service' ");
            //Executing the query and placing it in a result set 
            ResultSet rs1 = prestate.executeQuery();
            //Going to the next result which is not the header
            rs1.next();
            //Creating a MySQL statement which counts all the relevent information
            prestate = db.conn.prepareStatement("SELECT count(*) FROM `jobsheets` where `TypeOfJob` = 'repair' ");
            //Executing the query and placing it in a result set 
            ResultSet rs2 = prestate.executeQuery();
            //Going to the next result which is not the header
            rs2.next();
            //Creating a MySQL statement which counts all the relevent information
            prestate = db.conn.prepareStatement("SELECT COUNT(*) FROM `customers` INNER JOIN `jobsheets` on `customers`.`name` = `jobsheets`.`customer` WHERE `TypeOfJob`= 'MOT' AND `customers`.`CustomerType` = 'account'");
            //Executing the query and placing it in a result set
            ResultSet rs3 = prestate.executeQuery();
            //Going to the next result which is not the header
            rs3.next();
            //Creating a MySQL statement which counts all the relevent information
            prestate = db.conn.prepareStatement("SELECT COUNT(*) FROM `customers` INNER JOIN `jobsheets` on `customers`.`name` = `jobsheets`.`customer` WHERE `TypeOfJob`= 'MOT' AND `customers`.`CustomerType` = 'non-account' ");
            //Executing the query and placing it in a result set
            ResultSet rs4 = prestate.executeQuery();
            //Going to the next result which is not the header
            rs4.next();
            //Creating a MySQL statement which counts all the relevent information
            prestate = db.conn.prepareStatement("SELECT COUNT(*) FROM `customers` INNER JOIN `jobsheets` on `customers`.`name` = `jobsheets`.`customer` WHERE `TypeOfJob`= 'Annual Service' AND `customers`.`CustomerType` = 'account'");
            //Executing the query and placing it in a result set
            ResultSet rs5 = prestate.executeQuery();
            //Going to the next result which is not the header
            rs5.next();
            //Creating a MySQL statement which counts all the relevent information
            prestate = db.conn.prepareStatement("SELECT COUNT(*) FROM `customers` INNER JOIN `jobsheets` on `customers`.`name` = `jobsheets`.`customer` WHERE `TypeOfJob`= 'Annual Service' AND `customers`.`CustomerType` = 'non-account'");
            //Executing the query and placing it in a result set
            ResultSet rs6 = prestate.executeQuery();
            //Going to the next result which is not the header
            rs6.next();
            //Creating a MySQL statement which counts all the relevent information
            prestate = db.conn.prepareStatement("SELECT COUNT(*) FROM `customers` INNER JOIN `jobsheets` on `customers`.`name` = `jobsheets`.`customer` WHERE `TypeOfJob`= 'repair' AND `customers`.`CustomerType` = 'account'");
            //Executing the query and placing it in a result set
            ResultSet rs7 = prestate.executeQuery();
            //Going to the next result which is not the header
            rs7.next();
            //Creating a MySQL statement which counts all the relevent information
            prestate = db.conn.prepareStatement("SELECT COUNT(*) FROM `customers` INNER JOIN `jobsheets` on `customers`.`name` = `jobsheets`.`customer` WHERE `TypeOfJob`= 'repair' AND `customers`.`CustomerType` = 'non-account'");
            //Executing the query and placing it in a result set
            ResultSet rs8 = prestate.executeQuery();
            //Going to the next result which is not the header
            rs8.next();
            //Writing all the information that is needed to be in the report
            out.write("Quick Fix FItters");
            //Creating a new line in the report
            out.newLine();
            out.write("19 High St.");
            out.newLine();
            out.write("Ashford");
            out.newLine();
            out.write("Kent CT16 8YY");
            out.newLine();
            out.newLine();
            out.write("Service Report");
            out.newLine();
            out.newLine();
            //Placing all the information stored in the arraylist into the File
            rowData.add(Arrays.asList(rs.getString("count(*)"), rs1.getString("count(*)"), rs2.getString("count(*)"), rs3.getString("count(*)"), rs4.getString("count(*)"), rs5.getString("count(*)"), rs6.getString("count(*)"), rs7.getString("count(*)"), rs8.getString("count(*)")));
            //Setting the size of the table
            Board board = new Board(280);
            //Creating a new table within the file
            String tableString = board.setInitialBlock(new Table(board, 280, headers, rowData).tableToBlocks()).build().getPreview();
            //Wrting everything into the file
            out.write(tableString);
            //Closing the writng into the file
            out.close();
        } catch (Exception ex) {
            //Prints out to the terminal any error with the MySQL or database connection
            ex.printStackTrace();
        }
    }

    public void sparePartReport(){
        try {
            //Creating a new file in the path shown
            File file = new File("/Users/shahzad/Desktop/SparePartReport.txt");
            //Creating a file writier which allows the software to write to the file
            FileWriter fr = new FileWriter(file.getAbsoluteFile());
            //A list which containts all the apprioate information
            BufferedWriter out = new BufferedWriter(fr);
            //A list which containts all the apprioate information for this report
            List<String> headers = Arrays.asList("Part Name", "Code", "Manufacturer", "Vehicle Type", "Year(s)", "Price", "Initial Stock Level", "Intial Cost, £", "Used", "Delivery", "New Stock Level", "Stock Cost, £", "Low Level Threshold");
            //An ArrayList which takes in a list and String
            ArrayList<List<String>> rowData = new ArrayList<>();
            //Creating a MySQL statement which will select the data from the table
            prestate = db.conn.prepareStatement("SELECT * FROM `spare reports` "); 
            //Executing the query and placing it in a result set
            ResultSet rs1 = prestate.executeQuery();
            //Creating a MySQL statement which will select the data from the table
            prestate2 = db.conn.prepareStatement("SELECT * FROM `parts`");
            //Exectuing the query and placing it in a result set
            ResultSet rs2 = prestate2.executeQuery();
            //Going to the next result which is not the header for both of the query
            rs1.next();
            rs2.next();
            //Writing all the relevent information which needs to be placed into the text file 
            out.write("Quick Fix FItters");
            //Creating a new line 
            out.newLine();
            out.write("19 High St.");
            out.newLine();
            out.write("Ashford");
            out.newLine();
            out.write("Kent CT16 8YY");
            out.newLine();
            out.newLine();
            out.write("Spare Parts Report");
            out.newLine();
            out.newLine();
            ///Create a while loop that will loop through everything in both MySQL statements and it is not the last result
            while (!rs1.isAfterLast() && !rs2.isAfterLast()) {
                //Adding all the relevent information into the text field
                rowData.add(Arrays.asList(rs1.getString("PartName"), rs1.getString("PartNo"), rs1.getString("Supplier"),
                        rs1.getString("VehicleType"),
                        rs1.getString("Years"),
                        rs1.getString("UnitCost"),
                        rs1.getString("Quantity"),
                        String.valueOf(rs1.getInt("Quantity") * rs1.getDouble("UnitCost")),
                        String.valueOf(rs1.getInt("Quantity") - rs2.getInt("Quantity")),
                        rs2.getString("Delivery"),
                        String.valueOf((rs2.getInt("Quantity")) + rs2.getInt("Delivery")),
                        String.valueOf(((rs2.getInt("Quantity") + rs2.getInt("Delivery"))) * rs1.getDouble("UnitCost")),
                        rs1.getString("Threshold")
                ));
                //Going to the next result for both tables
                rs1.next();
                rs2.next();
            }
            //Setting the size of each colume in the text file
            Board board = new Board(300);
            //Creating the table within the text file
            String tableString = board.setInitialBlock(new Table(board, 300, headers, rowData).tableToBlocks()).build().getPreview();
            //Wrting everythin into the text file
            out.write(tableString);
            //Closing the writing to the file
            out.close();
        } catch (Exception ex) {
            //Prints out any errors with the MySQL statement or database connection to the terminal 
            ex.printStackTrace();
        }
    }

    @Override
    public void run() {
        //Getting the current date
        Calendar cal = Calendar.getInstance();
        //Getting the end of the current month
        int lDay = cal.getActualMaximum(Calendar.DATE);
        //Getting the current date
        int cDay = cal.get(Calendar.DATE);
        //Getting the current month
        int m = cal.get(Calendar.MONTH);
        //Looping for ever
        forever:
        while (true) {
            //If the check is true
            if (checked == true) {
                //And its the first day of the month
                if (cDay == 1) {
                    //Checked becomes false
                    checked = false;
                }
            }
            //If the current date is the last day of the month and checked is false
            if (cDay == lDay && (checked == false)) {
                try {
                    //Backs up the database
                    backUp();
                    //Creating a MySQL statement which reset all the customer spending in a month to 0
                    prestate = db.conn.prepareStatement("UPDATE `customers` SET `Spent` = 0");
                    //Executing the query
                    prestate.execute();
                    //Creating a spare part report 
                    sparePartReport();
                    //Deleting everything from current spare part report sheet
                    prestate = db.conn.prepareStatement("DELETE FROM `spare reports`");
                    //Executing the query
                    prestate.execute();
                    //Creating a new MySQL statement that inserts the new spare part table into the spare part report table
                    prestate = db.conn.prepareStatement("INSERT `spare reports` SELECT * FROM `parts` ");
                    //Executing the query
                    prestate.execute();
                } catch (Exception ex) {
                    //Print any errors with the MySQL statements or database to the ternimal
                    ex.printStackTrace();
                }
                //Increment the current month
                cal.add(Calendar.MONTH, 1);
                cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
                Date d = cal.getTime();
                Calendar cal2 = Calendar.getInstance();
                cal2.setTime(d);
                lDay = cal2.get(Calendar.DAY_OF_MONTH);
                checked = true;
            }
            cDay = getDate();
            m = getMonth();
        }
    }
}