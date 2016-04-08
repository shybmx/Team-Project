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
    boolean checked = false;
    PreparedStatement prestate;
    PreparedStatement prestate2;
    DBConnect db;
    BackupDB bd;
    public CreateReports() {
        db = new DBConnect();
        bd = new BackupDB(db);
        
    }

    public int getDate() {
        Calendar cal = Calendar.getInstance();
        int i = cal.get(Calendar.DATE);
        return i;
    }

    public int getMonth() {
        Calendar cal = Calendar.getInstance();
        int i = cal.get(Calendar.MONTH);
        return i;
    }
    
    public void backUp(){
        bd.backup();
    }
    
    

    public void serviceReport() {
        try {
            File file = new File("/Users/shahzad/Desktop/ServiceReport.txt");
            FileWriter fr = new FileWriter(file.getAbsoluteFile());
            BufferedWriter out = new BufferedWriter(fr);
            List<String> headers = Arrays.asList("MOT", "Annual Service", "Repairs", "MOT (Account)", "MOT (Non-Account)", "Annual Service (Account)", "Annual Service (Non-Account)", "Repairs (Account)", "Repairs(Non-Account)");
            ArrayList<List<String>> rowData = new ArrayList<>();
            prestate = db.conn.prepareStatement("SELECT count(*) FROM `jobsheets` where `TypeOfJob` = 'MOT' ");
            ResultSet rs = prestate.executeQuery();
            rs.next();
            prestate = db.conn.prepareStatement("SELECT count(*) FROM `jobsheets` where `TypeOfJob` = 'Annual Service' ");
            ResultSet rs1 = prestate.executeQuery();
            rs1.next();
            prestate = db.conn.prepareStatement("SELECT count(*) FROM `jobsheets` where `TypeOfJob` = 'repair' ");
            ResultSet rs2 = prestate.executeQuery();
            rs2.next();
            prestate = db.conn.prepareStatement("SELECT COUNT(*) FROM `customers` INNER JOIN `jobsheets` on `customers`.`name` = `jobsheets`.`customer` WHERE `TypeOfJob`= 'MOT' AND `customers`.`CustomerType` = 'account'");
            ResultSet rs3 = prestate.executeQuery();
            rs3.next();
            prestate = db.conn.prepareStatement("SELECT COUNT(*) FROM `customers` INNER JOIN `jobsheets` on `customers`.`name` = `jobsheets`.`customer` WHERE `TypeOfJob`= 'MOT' AND `customers`.`CustomerType` = 'non-account' ");
            ResultSet rs4 = prestate.executeQuery();
            rs4.next();
            prestate = db.conn.prepareStatement("SELECT COUNT(*) FROM `customers` INNER JOIN `jobsheets` on `customers`.`name` = `jobsheets`.`customer` WHERE `TypeOfJob`= 'Annual Service' AND `customers`.`CustomerType` = 'account'");
            ResultSet rs5 = prestate.executeQuery();
            rs5.next();
            prestate = db.conn.prepareStatement("SELECT COUNT(*) FROM `customers` INNER JOIN `jobsheets` on `customers`.`name` = `jobsheets`.`customer` WHERE `TypeOfJob`= 'Annual Service' AND `customers`.`CustomerType` = 'non-account'");
            ResultSet rs6 = prestate.executeQuery();
            rs6.next();
            prestate = db.conn.prepareStatement("SELECT COUNT(*) FROM `customers` INNER JOIN `jobsheets` on `customers`.`name` = `jobsheets`.`customer` WHERE `TypeOfJob`= 'repair' AND `customers`.`CustomerType` = 'account'");
            ResultSet rs7 = prestate.executeQuery();
            rs7.next();
            prestate = db.conn.prepareStatement("SELECT COUNT(*) FROM `customers` INNER JOIN `jobsheets` on `customers`.`name` = `jobsheets`.`customer` WHERE `TypeOfJob`= 'repair' AND `customers`.`CustomerType` = 'non-account'");
            ResultSet rs8 = prestate.executeQuery();
            rs8.next();
            out.write("Quick Fix FItters");
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
            rowData.add(Arrays.asList(rs.getString("count(*)"), rs1.getString("count(*)"), rs2.getString("count(*)"), rs3.getString("count(*)"), rs4.getString("count(*)"), rs5.getString("count(*)"), rs6.getString("count(*)"), rs7.getString("count(*)"), rs8.getString("count(*)")));
            Board board = new Board(280);
            String tableString = board.setInitialBlock(new Table(board, 280, headers, rowData).tableToBlocks()).build().getPreview();
            out.write(tableString);
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void sparePartReport(){
        try {
            File file = new File("/Users/shahzad/Desktop/SparePartReport.txt");
            FileWriter fr = new FileWriter(file.getAbsoluteFile());
            BufferedWriter out = new BufferedWriter(fr);
            List<String> headers = Arrays.asList("Part Name", "Code", "Manufacturer", "Vehicle Type", "Year(s)", "Price", "Initial Stock Level", "Intial Cost, £", "Used", "Delivery", "New Stock Level", "Stock Cost, £", "Low Level Threshold");
            ArrayList<List<String>> rowData = new ArrayList<>();
            prestate = db.conn.prepareStatement("SELECT * FROM `spare reports` "); 
            ResultSet rs1 = prestate.executeQuery();
            prestate2 = db.conn.prepareStatement("SELECT * FROM `parts`");
            ResultSet rs2 = prestate2.executeQuery();
            rs1.next();
            rs2.next();
            out.write("Quick Fix FItters");
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
            while (!rs1.isAfterLast() && !rs2.isAfterLast()) {
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
                rs1.next();
                rs2.next();
            }
            Board board = new Board(300);
            String tableString = board.setInitialBlock(new Table(board, 300, headers, rowData).tableToBlocks()).build().getPreview();
            out.write(tableString);
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void run() {
        Calendar cal = Calendar.getInstance();
        int lDay = cal.getActualMaximum(Calendar.DATE);
        int cDay = cal.get(Calendar.DATE);
        int m = cal.get(Calendar.MONTH);
        forever:
        while (true) {
            if (checked == true) {
                if (cDay == 1) {
                    checked = false;
                }
            }
            if (cDay == lDay && (checked == false)) {
                System.out.println("Hi its last day of the month " + m + " " + lDay);
                try {
                    
                    
                    backUp();
                    
                    prestate = db.conn.prepareStatement("UPDATE `customers` SET `Spent` = 0");
                    prestate.execute();
                    sparePartReport();
                    prestate = db.conn.prepareStatement("DELETE FROM `spare reports`");
                    prestate.execute();
                    prestate = db.conn.prepareStatement("INSERT `spare reports` SELECT * FROM `parts` ");
                    prestate.execute();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
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