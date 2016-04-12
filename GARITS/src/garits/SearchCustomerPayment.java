package garits;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

public class SearchCustomerPayment extends javax.swing.JFrame {
    DBConnect db;
    String name;
    PreparedStatement prestate;
    JTextField id;
    JTextField custName;
    JTextField amount;
    JTextField custType;
    JTextField disType;
    double vat;
    public SearchCustomerPayment(DBConnect db, String name, JTextField id, JTextField custName, JTextField amount, JTextField custType, JTextField disType) {
        //Setting up all the componets within this JFrame
        initComponents();
        //Passing in the database connection
        this.db = db;
        //Passing in all the variables
        this.name = name;
        this.id = id;
        this.custName = custName;
        this.amount = amount;
        this.custType = custType;
        this.disType = disType;
        //Refeshing the JTable
        updateTable();
        //Setting the size of this JFrame
        this.setSize(1470, 580);
        //Not making the program close when the close button is hit
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //Removing the background from the JButton
        select.setOpaque(false);
        select.setContentAreaFilled(false); 
        select.setBorderPainted(false);
        close.setOpaque(false);
        close.setContentAreaFilled(false); 
        close.setBorderPainted(false);
    }

    public void updateTable() {
        try {
            //Creating a MySQL query that will select the right data from the database
            prestate = db.conn.prepareStatement("SELECT distinct `Jobsheets`.`Job_Number`,`Jobsheets`.`customer`, "
                    + "`Jobsheets`.`VehicleRegNumber`, `Jobsheets`.`make`,`Jobsheets`.`model`, `Jobsheets`.`TelephoneNumber`, "
                    + "`Jobsheets`.`status`, `Jobsheets`.`TypeOfJob`, `Jobsheets`.`HasPaid`, `job completed`.`Grand total`,`customers`.`customerType`, "
                    + "`customers`.`DiscountType` FROM `jobsheets` INNER JOIN `job completed` ON `jobsheets`.`job_Number` = `job completed`.`Job_Number` "
                    + "INNER JOIN `customers` ON `customers`.`name` = `jobsheets`.`customer` WHERE `jobsheets`.`Status` = 'Complete' AND `hasPaid` = 'No' And `customer` like '%" + name + "%' ");
            //Executing the query and placing it in a result set
            ResultSet result = prestate.executeQuery();
            //Resetting the size of the JTable depening on the information within it
            needToPay.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            //Placing the result set inside the JTable
            needToPay.setModel(DbUtils.resultSetToTableModel(result));
        } catch (Exception ex) {
            //An error message to show there was a problem connecting to the database or the MySQL query
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        needToPay = new javax.swing.JTable();
        select = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        needToPay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(needToPay);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(21, 21, 1220, 403);

        select.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/Select.png"))); // NOI18N
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        getContentPane().add(select);
        select.setBounds(1260, 60, 120, 155);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(1260, 220, 114, 147);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1470, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        //Closing this JFrame
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        try {
            //Getting the selected row and placing it into an int variable
            int index = needToPay.getSelectedRow();
            //Getting all the values from the JTable and placing into a string variable
            String jobNum = needToPay.getValueAt(index, 0).toString();
            String customerName = needToPay.getValueAt(index, 1).toString();
            String total = needToPay.getValueAt(index, 9).toString();
            String cusType = needToPay.getValueAt(index, 10).toString();
            String discType = needToPay.getValueAt(index, 11).toString();
            String workType = needToPay.getValueAt(index, 7).toString();
            //Formatting the numbers
            DecimalFormat format = new DecimalFormat("0.00");
            //If the customer is an account holder
            if (cusType.equals("Account")) {
                //Parsing the string into a double
                double a = Double.parseDouble(total);
                //Check if they have a flexible discount
                if (discType.equals("Flexible")) {
                    try {
                        //Creating a MySQL query that will get there spent
                        prestate = db.conn.prepareStatement("SELECT `Spent` FROM `customers` WHERE name = '" + customerName + "' ");
                        //Executing the query and placing it in a result set
                        ResultSet rs = prestate.executeQuery();
                        //Goes to the next result which is not the header
                        rs.next();
                        //Getting the spent and placing it in a double
                        double mSpent = rs.getDouble("Spent");
                        if (mSpent > 0 && mSpent < 1000) {
                            //Caluclations
                            double aPercent = ((1.0 / 100) * a);
                            a = a - aPercent;
                           total =  format.format(a);
                        } else if (mSpent > 1001 && mSpent < 5000) {
                            //Caluclations
                            double aPercent = ((2.0 / 100) * a);
                            a = a - aPercent;
                            total =  format.format(a);
                        } else if (mSpent > 5001) {
                            //Caluclations
                            double aPercent = ((3.0 / 100) * a);
                            a = a - aPercent;
                            total =  format.format(a);
                        }
                    } catch (Exception ex) {
                        //Printing any error to the terminal
                        ex.printStackTrace();
                    }
                    //If the customer has a fixed discount
                } else if (discType.equals("Fixed")) {
                    try {
                        //Creating a mySQL to get the fixed discount
                        prestate = db.conn.prepareStatement("SELECT `value` FROM `System config` WHERE  `Variables` = 'Fixed Discount' ");
                        //Executing the query and placing it in a result set
                        ResultSet rs = prestate.executeQuery();
                        //Goes to thw next result which is not a header
                        rs.next();
                        //Getting the double of value from the database
                        double percent = rs.getDouble("value");
                        //Caluclations
                        double aPercent = ((percent / 100) * a);
                        a = a - aPercent;
                        total =  format.format(a);
                    } catch (Exception ex) {
                        //Prining any errors to the terminal
                        ex.printStackTrace();
                    }
                } else {
                    try {
                        //Creating a MySQL statement which checks the work type
                        prestate = db.conn.prepareStatement("Select * FROM `standard jobs` WHERE  `TypeOfJob` = " +"'"+workType+"'");
                        //Execute they query and place it in a result set
                        ResultSet jSet = prestate.executeQuery();
                        //Goes to the next query which is not the header
                        jSet.next();
                        //Getting the double from the database
                        double percent = jSet.getDouble("Discount");
                        //Caluclations
                        double aPercent = ((percent / 100) * a);
                        a = a - aPercent;
                        total =  format.format(a);
                    } catch (Exception ex) {
                        //Printing the errors to the terminal
                         ex.printStackTrace();
                    }
                }
            }
            //Setting the text fields with the correct data
            id.setText(jobNum);
            custName.setText(customerName);
            amount.setText(total);
            custType.setText(cusType);
            disType.setText(discType);
        } catch (Exception ex) {
            //A error message which shows a problem with the database connection or MySQL statement
            JOptionPane.showMessageDialog(null, "You must select a customer");
        }
    }//GEN-LAST:event_selectActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable needToPay;
    private javax.swing.JButton select;
    // End of variables declaration//GEN-END:variables
}
