package garits;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    public SearchCustomerPayment(DBConnect db, String name, JTextField id, JTextField custName, JTextField amount, JTextField custType, JTextField disType) {
        initComponents();
        this.db = db;
        this.name = name;
        this.id = id;
        this.custName = custName;
        this.amount = amount;
        this.custType = custType;
        this.disType = disType;
        updateTable();
        this.setSize(1470, 580);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    public void updateTable() {
        try {
            prestate = db.conn.prepareStatement("SELECT distinct `Jobsheets`.`Job_Number`,`Jobsheets`.`customer`, "
                    + "`Jobsheets`.`VehicleRegNumber`, `Jobsheets`.`make`,`Jobsheets`.`model`, `Jobsheets`.`TelephoneNumber`, "
                    + "`Jobsheets`.`status`, `Jobsheets`.`TypeOfJob`, `Jobsheets`.`HasPaid`, `job completed`.`Grand total`,`customers`.`customerType`, "
                    + "`customers`.`DiscountType` FROM `jobsheets` INNER JOIN `job completed` ON `jobsheets`.`job_Number` = `job completed`.`Job_Number` "
                    + "INNER JOIN `customers` ON `customers`.`name` = `jobsheets`.`customer` WHERE `jobsheets`.`Status` = 'Complete' AND `hasPaid` = 'No' And `customer` like '%"+name+"%' ");
            ResultSet result = prestate.executeQuery();
            needToPay.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            needToPay.setModel(DbUtils.resultSetToTableModel(result));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
            ex.printStackTrace();
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

        select.setText("Select");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        getContentPane().add(select);
        select.setBounds(1260, 30, 64, 25);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(1330, 30, 114, 147);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1470, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        try {
            int index = needToPay.getSelectedRow();
            String jobNum = needToPay.getValueAt(index, 0).toString();
            String customerName = needToPay.getValueAt(index, 1).toString();
            String total = needToPay.getValueAt(index, 9).toString();
            String cusType = needToPay.getValueAt(index, 10).toString();
            String discType = needToPay.getValueAt(index, 11).toString();
            String workType = needToPay.getValueAt(index, 7).toString();
            if (cusType.equals("Account")) {
                 double a = Double.parseDouble(total);
                if (discType.equals("Flexible")) {
                    try {
                        prestate = db.conn.prepareStatement("SELECT `Spent` FROM `customers` WHERE name = '" + customerName + "' ");
                        ResultSet rs = prestate.executeQuery();
                        rs.next();
                        double mSpent = rs.getDouble("Spent");
                        if (mSpent > 0 && mSpent < 1000) {
                            double aPercent = ((1.0 / 100) * a);
                            a = a - aPercent;
                            total = String.valueOf(a);
                        }else if(mSpent > 1001 && mSpent < 5000){
                           double aPercent = ((2.0 / 100) * a);
                            a = a - aPercent;
                            total = String.valueOf(a);
                        }else if(mSpent > 5001){
                            double aPercent = ((3.0 / 100) * a);
                            a = a - aPercent;
                            total = String.valueOf(a);
                        }
                    } catch (Exception ex) {
                            ex.printStackTrace();
                    }
                } else if (discType.equals("Fixed")) {
                    try{
                        prestate = db.conn.prepareStatement("SELECT `value` FROM `System config` WHERE  `Variables` = 'Fixed Discount' ");
                        ResultSet rs = prestate.executeQuery();
                        rs.next();
                        double percent = rs.getDouble("value");
                        double aPercent= ((percent/100) * a);
                        a = a - aPercent;
                        total = String.valueOf(a);
                    }catch(Exception ex){
                        
                    }
                } else {
                    try{
                        if(workType.equals("MOT")){
                            prestate = db.conn.prepareStatement("SELECT `value` FROM `system config` WHERE `Variables` = 'MOT'  ");
                            ResultSet rs = prestate.executeQuery();
                            rs.next();
                            double percent = rs.getDouble("value");
                            double aPercent = ((percent/100) * a);
                            
                            System.out.println(aPercent);
                            a = a - aPercent;
                            total = String.valueOf(a);
                        }else if(workType.equals("Annual Service")){
                             prestate = db.conn.prepareStatement("SELECT `value` FROM `system config` WHERE `Variables` = 'Annual service'  ");
                            ResultSet rs = prestate.executeQuery();
                            rs.next();
                            double percent = rs.getDouble("value");
                            double aPercent = ((percent/100) * a);
                            a = a - aPercent;
                            total = String.valueOf(a);
                        }
                    }catch(Exception ex){
                        
                    }
                }
            }

            id.setText(jobNum);
            custName.setText(customerName);
            amount.setText(total);
            custType.setText(cusType);
            disType.setText(discType);
        } catch (Exception ex) {
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
