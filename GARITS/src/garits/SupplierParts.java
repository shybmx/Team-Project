package garits;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class SupplierParts extends javax.swing.JFrame {
    String supplier;
    DBConnect db;
    PreparedStatement prestate;
    Stock stock;
    public SupplierParts(String supplier, DBConnect db, Stock stock) {
        //Setting the all the componerts within this JFrame
        initComponents();
        //Passing in the database connection
        this.db = db;
        //Passing in the supplier string
        this.supplier = supplier;
        //Passing in the stock string
        this.stock = stock;
        //Setting the size of the JFrame
        this.setSize(1280, 470);
        //Making the JFrame not resizeable
        this.setResizable(false);
        //Refreshing the JTable
        updateTable();
        //Not making the program close when the close button is hit
         setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
         //Removing the backgrounds from the JButtons, JPanels
         selectToOrder.setOpaque(false);
        selectToOrder.setContentAreaFilled(false);
        selectToOrder.setBorderPainted(false);
        closeFrame.setOpaque(false);
        closeFrame.setContentAreaFilled(false);
        closeFrame.setBorderPainted(false);
    }
    
    public void updateTable(){
        try{
            //Creating a mySQL query that gets supplier from the parts table
            prestate = db.conn.prepareStatement("SELECT * FROM parts WHERE Supplier = '"+supplier+"'");
            //Executing the query and placing it in a result set
            ResultSet result = prestate.executeQuery();
            //Placing the result into a JTable
            partsTable.setModel(DbUtils.resultSetToTableModel(result));
            //Closing this JFrame
            this.setVisible(false);
        }catch(Exception ex){
            //An error message if there is a problem with the database connection or MySQL statement
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        partsTable = new javax.swing.JTable();
        selectToOrder = new javax.swing.JButton();
        closeFrame = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        partsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(partsTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 12, 1120, 403);

        selectToOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/Select.png"))); // NOI18N
        selectToOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectToOrderActionPerformed(evt);
            }
        });
        getContentPane().add(selectToOrder);
        selectToOrder.setBounds(1140, 60, 110, 150);

        closeFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        closeFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeFrameActionPerformed(evt);
            }
        });
        getContentPane().add(closeFrame);
        closeFrame.setBounds(1140, 210, 110, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectToOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectToOrderActionPerformed
        try{
            //Geting the selected row and placing it into an int variable
            int index = partsTable.getSelectedRow();
            //Getting all the fields from the JTable and placing them into text fields
            String unitCost = partsTable.getValueAt(index, 5).toString();
            String supplierName = partsTable.getValueAt(index, 2).toString();
            String partName = partsTable.getValueAt(index, 1).toString();
            //Passing in the items to the method
            stock.setTextFields(unitCost, partName, supplierName);
        }catch(Exception ex){
            //Printing out the errors to the terminal
            ex.printStackTrace();
        }
    }//GEN-LAST:event_selectToOrderActionPerformed

    private void closeFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeFrameActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_closeFrameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable partsTable;
    private javax.swing.JButton selectToOrder;
    // End of variables declaration//GEN-END:variables
}
