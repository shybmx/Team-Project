package garits;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class AlterSupplier extends javax.swing.JPanel {
    DBConnect db;
    PreparedStatement prestate;
    public AlterSupplier(DBConnect db) {
        // this sets up all the componets within this JFrame
        initComponents();
        //Passes all the database connection to this panel
        this.db = db;
        //Removes the background from all the buttons and JPanel
        addNewSupplier.setOpaque(false);
        addNewSupplier.setContentAreaFilled(false); 
        addNewSupplier.setBorderPainted(false);
        delete.setOpaque(false);
        delete.setContentAreaFilled(false); 
        delete.setBorderPainted(false);
        close.setOpaque(false);
        close.setContentAreaFilled(false); 
        close.setBorderPainted(false);
        addSupplierPanel.setVisible(false);
        addSupplierPanel.setOpaque(false);
        addSupplier.setOpaque(false);
        buttons.setOpaque(false);
        addSupplier.setContentAreaFilled(false); 
        addSupplier.setBorderPainted(false);
        closeAddSupplier.setOpaque(false);
        closeAddSupplier.setContentAreaFilled(false); 
        closeAddSupplier.setBorderPainted(false);
        deleteSupplierPanel.setVisible(false);
        deleteSupplierPanel.setOpaque(false);
        closeDeletePanel.setOpaque(false);
        closeDeletePanel.setContentAreaFilled(false); 
        closeDeletePanel.setBorderPainted(false);
        //This updates the table that is being displayed within this JPanel
        updateTable();
        //This sets the size of the JPanel
        this.setSize(1300, 900);
    }
    
    public void updateTable(){
        try{
            //Creates a MySQL statement that is sent to the database which will select the appropiate data to be displayed on the JTable
            prestate = db.conn.prepareStatement("SELECT * FROM `suppliers`");
            //Store the result of the MySQL query into a result set
            ResultSet result = prestate.executeQuery();
            //Getting the result set and placing it into a database table
            supplierTable.setModel(DbUtils.resultSetToTableModel(result));
        }catch(Exception ex){
            //Throw an error if there is a problem with the database connection or MySQL
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttons = new javax.swing.JPanel();
        deleteSupplier = new javax.swing.JButton();
        addNewSupplier = new javax.swing.JButton();
        close = new javax.swing.JButton();
        deleteSupplierPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        supplierTable = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        closeDeletePanel = new javax.swing.JButton();
        addSupplierPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        partNo = new javax.swing.JTextField();
        partName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        supplier = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        vehicleType = new javax.swing.JTextField();
        years = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        unitCost = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        closeAddSupplier = new javax.swing.JButton();
        addSupplier = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setLayout(null);

        deleteSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/delete.png"))); // NOI18N
        deleteSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSupplierActionPerformed(evt);
            }
        });

        addNewSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/add.png"))); // NOI18N
        addNewSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewSupplierActionPerformed(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsLayout = new javax.swing.GroupLayout(buttons);
        buttons.setLayout(buttonsLayout);
        buttonsLayout.setHorizontalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addNewSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsLayout.createSequentialGroup()
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, buttonsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, buttonsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(deleteSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(addNewSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        add(buttons);
        buttons.setBounds(520, 400, 370, 160);

        supplierTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(supplierTable);

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/delete.png"))); // NOI18N
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        closeDeletePanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        closeDeletePanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeDeletePanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteSupplierPanelLayout = new javax.swing.GroupLayout(deleteSupplierPanel);
        deleteSupplierPanel.setLayout(deleteSupplierPanelLayout);
        deleteSupplierPanelLayout.setHorizontalGroup(
            deleteSupplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteSupplierPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeDeletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        deleteSupplierPanelLayout.setVerticalGroup(
            deleteSupplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteSupplierPanelLayout.createSequentialGroup()
                .addGroup(deleteSupplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(deleteSupplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeDeletePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        add(deleteSupplierPanel);
        deleteSupplierPanel.setBounds(430, 310, 530, 340);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Part No:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Part Name:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Supplier:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Vehicle Type:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Years:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("Unit Cost:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setText("Quantity:");

        closeAddSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        closeAddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeAddSupplierActionPerformed(evt);
            }
        });

        addSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/add.png"))); // NOI18N
        addSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSupplierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addSupplierPanelLayout = new javax.swing.GroupLayout(addSupplierPanel);
        addSupplierPanel.setLayout(addSupplierPanelLayout);
        addSupplierPanelLayout.setHorizontalGroup(
            addSupplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSupplierPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addSupplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addSupplierPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(69, 69, 69)
                        .addComponent(partNo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addSupplierPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(partName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addSupplierPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(60, 60, 60)
                        .addComponent(supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addSupplierPanelLayout.createSequentialGroup()
                        .addGroup(addSupplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(12, 12, 12)
                        .addGroup(addSupplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(years, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unitCost, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(closeAddSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        addSupplierPanelLayout.setVerticalGroup(
            addSupplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSupplierPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addSupplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(addSupplierPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(partNo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(addSupplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(addSupplierPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(partName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(addSupplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(addSupplierPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(addSupplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addSupplierPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7))
                    .addGroup(addSupplierPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(vehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(years, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(unitCost, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addSupplierPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(addSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addSupplierPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(closeAddSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        add(addSupplierPanel);
        addSupplierPanel.setBounds(420, 310, 630, 340);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(0, 0, 1300, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void addNewSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewSupplierActionPerformed
        //Making the new JPanel visable
        addSupplierPanel.setVisible(true);
        //Making the current JPanel invisable
        buttons.setVisible(false);
    }//GEN-LAST:event_addNewSupplierActionPerformed

    private void closeAddSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAddSupplierActionPerformed
        //Make the adding supplier panel invisable
        addSupplierPanel.setVisible(false);
    }//GEN-LAST:event_closeAddSupplierActionPerformed

    private void addSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSupplierActionPerformed
        //Getting all the values from the JFields and storing them into a String variable
        String partNoString = partNo.getText();
        String partNameString = partName.getText();
        String supplierString = supplier.getText();
        String vehicleTypeString = vehicleType.getText();
        String yearsString = years.getText();
        String unitCostString = unitCost.getText();
        String quantityString = quantity.getText();
        try{
            //Creates a MySQL statement which will insert data into the database
            prestate = db.conn.prepareStatement("INSERT INTO `parts`(PartNo, PartName, Supplier, "
                + "VehicleType, Years, UnitCost, Quantity)"
                + "Values(?,?,?,?,?,?,?) ");
            //Getting the string variables which has been created on the top and passing them into the MySQL statement
            prestate.setString(1, partNoString);
            prestate.setString(2, partNameString);
            prestate.setString(3, supplierString);
            prestate.setString(4, vehicleTypeString);
            prestate.setString(5, yearsString);
            prestate.setString(6, unitCostString);
            prestate.setString(7, quantityString);
            //Executing the MySQL statement
            prestate.executeUpdate();
        }catch(Exception ex){

        }
        try{
            //Creates a MySQL statement which will insert data into the database
            prestate = db.conn.prepareStatement("INSERT INTO `suppliers` (`Supplier`)"
                + "Values ('"+supplierString+"')");
            //Executing the MySQL statement
            prestate.executeUpdate();
        }catch(Exception ex){

        }
        //Resetting the text fields to blank to allow the user to insert more details
        partNo.setText("");
        partName.setText("");
        vehicleType.setText("");
        years.setText("");
        unitCost.setText("");
        quantity.setText("");
    }//GEN-LAST:event_addSupplierActionPerformed

    private void deleteSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSupplierActionPerformed
        //Makes the next JPanel visable
        deleteSupplierPanel.setVisible(true);
        //Makes the current JPanel invisable
        buttons.setVisible(false);
    }//GEN-LAST:event_deleteSupplierActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try{
            //Getting the selected row number from the JTable
            int index = supplierTable.getSelectedRow();
            //Getting a certain colume from the selected row 
            String supplier = supplierTable.getValueAt(index, 0).toString();
            //Creates a MySQL statement which will delete a supplier, selected from the JTable
            prestate = db.conn.prepareStatement("DELETE FROM `suppliers` WHERE  `Supplier` = '"+supplier+"' ");
            //Execute the MySQL statement
            prestate.execute();
            //Refreash the JTable
            updateTable();
            //Show a pop up box to confirm that the supplier has been deleted
            JOptionPane.showMessageDialog(null, "Supplier: " + supplier + " has been deleted");
        }catch(Exception ex){
            //An error message that shows that the supplier has not been deleted
            JOptionPane.showMessageDialog(null, "Suppiler "+ supplier+ " has not been deleted");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void closeDeletePanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeDeletePanelActionPerformed
        //Makes the JPanel invisable when the button is pressed
        deleteSupplierPanel.setVisible(false);
    }//GEN-LAST:event_closeDeletePanelActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        //Makes the JPanel invisable when the button is pressed
        buttons.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewSupplier;
    private javax.swing.JButton addSupplier;
    private javax.swing.JPanel addSupplierPanel;
    private javax.swing.JPanel buttons;
    private javax.swing.JButton close;
    private javax.swing.JButton closeAddSupplier;
    private javax.swing.JButton closeDeletePanel;
    private javax.swing.JButton delete;
    private javax.swing.JButton deleteSupplier;
    private javax.swing.JPanel deleteSupplierPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField partName;
    private javax.swing.JTextField partNo;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField supplier;
    private javax.swing.JTable supplierTable;
    private javax.swing.JTextField unitCost;
    private javax.swing.JTextField vehicleType;
    private javax.swing.JTextField years;
    // End of variables declaration//GEN-END:variables
}