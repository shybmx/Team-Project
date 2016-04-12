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
        //Setting up  all the componets within the JFrame
        initComponents();
        //Passing in the database connection
        this.db = db;
        //Passing in the create job object
        this.cj = cj;
        //Making the program not close when the close button is hit
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //Refreshing the JTable
        updateTable();
        //Setting the size of the JFrame
        this.setSize(1100, 500);
        //Making the JFrame none resizeable
        this.setResizable(false);
        //Removing the background from the JButtons and JPanel
        select.setOpaque(false);
        select.setContentAreaFilled(false); 
        select.setBorderPainted(false);
        close.setOpaque(false);
        close.setContentAreaFilled(false); 
        close.setBorderPainted(false);
    }
    
    public void updateTable(){
        try{
            //Creating a MySQL statement which will display all the information on the JTable
            prestate = db.conn.prepareStatement("SELECT customers.CustomerID, "
                    + "customers.name, customers.address, customers.PostCode, customers.TelephoneNumber, "
                    + "customers.EMail, customers.CustomerType, customers.Discount, vehicle.regNum, vehicle.Make, "
                    + "vehicle.Model, vehicle.EngSerial, vehicle.ChassieNumber, vehicle.Colour FROM customers "
                    + "INNER JOIN vehicle on customers.CustomerID = vehicle.CustomerID WHERE `Status` = 'clear'");
            //Executing the query and place it in a result set
            ResultSet result = prestate.executeQuery();
            //Place the result set inside the JTable
            searchCustomerTable.setModel(DbUtils.resultSetToTableModel(result));
        }catch(Exception ex){
            //An error message to show a problem with the database connection or MySQL statement
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        searchCustomerTable = new javax.swing.JTable();
        select = new javax.swing.JButton();
        close = new javax.swing.JButton();
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

        select.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/Select.png"))); // NOI18N
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        getContentPane().add(select);
        select.setBounds(960, 60, 120, 150);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(960, 220, 120, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1110, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        try{
            //Get the selected row
            int index = searchCustomerTable.getSelectedRow();
            //Passing in the items to the other JFrame
            cj.setFields(searchCustomerTable.getValueAt(index, 1).toString(),    searchCustomerTable.getValueAt(index, 8).toString(),searchCustomerTable.getValueAt(index, 9).toString(), searchCustomerTable.getValueAt(index, 10).toString(), searchCustomerTable.getValueAt(index, 4).toString() );
            //Closing this JFrame
            this.setVisible(false);
        }catch(Exception ex){
            //Print out the error to the terminal
            ex.printStackTrace();
        }
    }//GEN-LAST:event_selectActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        //Closing this JFrame
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable searchCustomerTable;
    private javax.swing.JButton select;
    // End of variables declaration//GEN-END:variables
}
