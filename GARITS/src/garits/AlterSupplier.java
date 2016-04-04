package garits;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class AlterSupplier extends javax.swing.JPanel {
    DBConnect db;
    PreparedStatement prestate;
    public AlterSupplier(DBConnect db) {
        initComponents();
        this.db = db;
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
        updateTable();
        this.setSize(1300, 900);
    }
    
    public void updateTable(){
        try{
            prestate = db.conn.prepareStatement("SELECT * FROM `suppliers`");
            ResultSet result = prestate.executeQuery();
            supplierTable.setModel(DbUtils.resultSetToTableModel(result));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        buttons = new javax.swing.JPanel();
        deleteSupplier = new javax.swing.JButton();
        addNewSupplier = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setLayout(null);

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

        delete.setText("Delete");
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
                .addGap(159, 159, 159)
                .addGroup(deleteSupplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete)
                    .addComponent(closeDeletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        deleteSupplierPanelLayout.setVerticalGroup(
            deleteSupplierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteSupplierPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(deleteSupplierPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(delete)
                .addGap(18, 18, 18)
                .addComponent(closeDeletePanel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(deleteSupplierPanel);
        deleteSupplierPanel.setBounds(400, 350, 610, 340);

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
        addSupplierPanel.setBounds(370, 370, 630, 340);

        deleteSupplier.setText("delete");
        deleteSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSupplierActionPerformed(evt);
            }
        });

        addNewSupplier.setText("add");
        addNewSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewSupplierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsLayout = new javax.swing.GroupLayout(buttons);
        buttons.setLayout(buttonsLayout);
        buttonsLayout.setHorizontalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addNewSupplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteSupplier)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNewSupplier)
                    .addComponent(deleteSupplier))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        add(buttons);
        buttons.setBounds(610, 300, 149, 67);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(0, 0, 1300, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void addNewSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewSupplierActionPerformed
        addSupplierPanel.setVisible(true);
        buttons.setVisible(false);
    }//GEN-LAST:event_addNewSupplierActionPerformed

    private void closeAddSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAddSupplierActionPerformed
        addSupplierPanel.setVisible(false);
    }//GEN-LAST:event_closeAddSupplierActionPerformed

    private void addSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSupplierActionPerformed
        String partNoString = partNo.getText();
        String partNameString = partName.getText();
        String supplierString = supplier.getText();
        String vehicleTypeString = vehicleType.getText();
        String yearsString = years.getText();
        String unitCostString = unitCost.getText();
        String quantityString = quantity.getText();
        try{
            prestate = db.conn.prepareStatement("INSERT INTO `parts`(PartNo, PartName, Supplier, "
                + "VehicleType, Years, UnitCost, Quantity)"
                + "Values(?,?,?,?,?,?,?) ");
            prestate.setString(1, partNoString);
            prestate.setString(2, partNameString);
            prestate.setString(3, supplierString);
            prestate.setString(4, vehicleTypeString);
            prestate.setString(5, yearsString);
            prestate.setString(6, unitCostString);
            prestate.setString(7, quantityString);
            prestate.executeUpdate();
        }catch(Exception ex){

        }
        try{
            prestate = db.conn.prepareStatement("INSERT INTO `suppliers` (`Supplier`)"
                + "Values ('"+supplierString+"')");
            prestate.executeUpdate();

        }catch(Exception ex){

        }
        partNo.setText("");
        partName.setText("");
        vehicleType.setText("");
        years.setText("");
        unitCost.setText("");
        quantity.setText("");
    }//GEN-LAST:event_addSupplierActionPerformed

    private void deleteSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSupplierActionPerformed
        deleteSupplierPanel.setVisible(true);
        buttons.setVisible(false);
    }//GEN-LAST:event_deleteSupplierActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try{
            int index = supplierTable.getSelectedRow();
            String supplier = supplierTable.getValueAt(index, 0).toString();
            prestate = db.conn.prepareStatement("DELETE FROM `suppliers` WHERE  `Supplier` = '"+supplier+"' ");
            prestate.execute();
            updateTable();
            JOptionPane.showMessageDialog(null, "Supplier: " + supplier + " has been deleted");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Suppiler "+ supplier+ " has not been deleted");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void closeDeletePanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeDeletePanelActionPerformed
        deleteSupplierPanel.setVisible(false);
    }//GEN-LAST:event_closeDeletePanelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewSupplier;
    private javax.swing.JButton addSupplier;
    private javax.swing.JPanel addSupplierPanel;
    private javax.swing.JPanel buttons;
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
