package garits;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class SearchCustomer extends javax.swing.JFrame {
     PreparedStatement prestate;
     DBConnect db;
     CreateJob cj;
    public SearchCustomer(DBConnect db, CreateJob cj) {
        initComponents();
        this.db = db;
        this.cj = cj;
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        updateTable();
        this.setSize(1100, 500);
    }
    
    public void updateTable(){
        try{
            prestate = db.conn.prepareStatement("SELECT customers.CustomerID, "
                    + "customers.name, customers.address, customers.PostCode, customers.TelephoneNumber, "
                    + "customers.EMail, customers.CustomerType, customers.Discount, vehicle.regNum, vehicle.Make, "
                    + "vehicle.Model, vehicle.EngSerial, vehicle.ChassieNumber, vehicle.Colour FROM customers "
                    + "INNER JOIN vehicle on customers.CustomerID = vehicle.CustomerID WHERE `Status` = 'clear'");
            ResultSet result = prestate.executeQuery();
            searchCustomerTable.setModel(DbUtils.resultSetToTableModel(result));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        searchCustomerTable = new javax.swing.JTable();
        selectButton = new javax.swing.JButton();
        closeFrame = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        searchCustomerTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(searchCustomerTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 12, 931, 403);

        selectButton.setText("Select");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });
        getContentPane().add(selectButton);
        selectButton.setBounds(961, 12, 120, 202);

        closeFrame.setText("Close");
        closeFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeFrameActionPerformed(evt);
            }
        });
        getContentPane().add(closeFrame);
        closeFrame.setBounds(976, 294, 61, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1110, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        try{
            int index = searchCustomerTable.getSelectedRow();
            cj.setFields(searchCustomerTable.getValueAt(index, 1).toString(),    searchCustomerTable.getValueAt(index, 7).toString(),searchCustomerTable.getValueAt(index, 8).toString(), searchCustomerTable.getValueAt(index, 9).toString(), searchCustomerTable.getValueAt(index, 3).toString() );
            this.setVisible(false);
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_selectButtonActionPerformed

    private void closeFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeFrameActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeFrameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable searchCustomerTable;
    private javax.swing.JButton selectButton;
    // End of variables declaration//GEN-END:variables
}
