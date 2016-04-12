package garits;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class SystemConfig extends javax.swing.JPanel {
    DBConnect db;
    PreparedStatement prestate;
    public SystemConfig(DBConnect db) {
        //Setting the all the componerts within this JFrame
        initComponents();
        //Passing in the database connection
        this.db = db;
        //Setting the size of the JFrame
        this.setSize(1300, 900);
        //Removing the backgrounds from the JButtons, JPanels
        updateSystem.setOpaque(false);
        updateSystem.setContentAreaFilled(false); 
        updateSystem.setBorderPainted(false);
        closeSystem.setOpaque(false);
        closeSystem.setContentAreaFilled(false); 
        closeSystem.setBorderPainted(false);
        systemConfigPanel.setOpaque(false);
        //refreshing the JTable
        insertIntoText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemConfigPanel = new javax.swing.JPanel();
        closeSystem = new javax.swing.JButton();
        updateSystem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        markUp = new javax.swing.JTextField();
        vat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mot = new javax.swing.JTextField();
        service = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fixedDiscount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        repairs = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        closeSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        closeSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeSystemActionPerformed(evt);
            }
        });

        updateSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/update.png"))); // NOI18N
        updateSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSystemActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Mark up for parts:");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("VAT:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("MOT:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Annual Service:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("Fixed discount:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setText("Repairs:");

        javax.swing.GroupLayout systemConfigPanelLayout = new javax.swing.GroupLayout(systemConfigPanel);
        systemConfigPanel.setLayout(systemConfigPanelLayout);
        systemConfigPanelLayout.setHorizontalGroup(
            systemConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemConfigPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(systemConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(systemConfigPanelLayout.createSequentialGroup()
                        .addComponent(updateSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(closeSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(systemConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(systemConfigPanelLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(139, 139, 139)
                            .addComponent(vat, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(systemConfigPanelLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(0, 0, 0)
                            .addComponent(markUp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(systemConfigPanelLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mot, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(systemConfigPanelLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(service, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(systemConfigPanelLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fixedDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(systemConfigPanelLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(repairs, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        systemConfigPanelLayout.setVerticalGroup(
            systemConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemConfigPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(systemConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(vat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(systemConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(markUp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(systemConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(systemConfigPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4))
                    .addGroup(systemConfigPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mot, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(systemConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(systemConfigPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5))
                    .addGroup(systemConfigPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(service, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(systemConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(systemConfigPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6))
                    .addGroup(systemConfigPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fixedDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(systemConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(systemConfigPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel7))
                    .addGroup(systemConfigPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(repairs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(systemConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateSystem)
                    .addComponent(closeSystem))
                .addGap(20, 20, 20))
        );

        add(systemConfigPanel);
        systemConfigPanel.setBounds(540, 370, 370, 430);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1300, 900);
    }// </editor-fold>//GEN-END:initComponents

    public void insertIntoText(){
        try{
            //Getting everything from the database
            prestate = db.conn.prepareStatement("SELECT * FROM `system config` ");
            ResultSet result = prestate.executeQuery();
            result.next();
            fixedDiscount.setText(result.getString("Value"));
            result.next();
            markUp.setText(result.getString("Value"));
            result.next();
            vat.setText(result.getString("Value"));
            result.next();
            prestate = db.conn.prepareStatement("SELECT * FROM `standard jobs` ");
            ResultSet result2 = prestate.executeQuery();
            result2.next();
            service.setText(result2.getString("Discount"));
            result2.next();
            mot.setText(result2.getString("Discount"));
            result2.next();
            repairs.setText(result2.getString("Discount"));
        }catch(Exception ex){
            
        }
    }
    
    
    private void updateSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSystemActionPerformed
        try{
            //Updating the database 
            prestate = db.conn.prepareStatement("UPDATE `system config` SET `value` = '"+vat.getText()+"' WHERE `variables` = 'VAT' ");
            prestate.execute();
            prestate = db.conn.prepareStatement("UPDATE `system config` SET `value` = '"+markUp.getText()+"'  WHERE `variables` = 'Mark up for Parts' ");
            prestate.execute();
            prestate = db.conn.prepareStatement("UPDATE `system config` SET `value` = '"+fixedDiscount.getText()+"'  WHERE `variables` = 'Fixed Discount' ");
            prestate.execute();
            prestate = db.conn.prepareStatement("UPDATE `standard jobs` SET `Discount` = '"+mot.getText()+"'  WHERE `TypeOfJob` = 'MOT' ");
            prestate.execute();
            prestate = db.conn.prepareStatement("UPDATE `standard jobs` SET `Discount` = '"+service.getText()+"'  WHERE `TypeOfJob` = 'Annual service' ");
            prestate.execute();
            prestate = db.conn.prepareStatement("UPDATE `standard jobs` SET `Discount` = '"+repairs.getText()+"'  WHERE `TypeOfJob` = 'Repairs' ");
            prestate.execute();
            JOptionPane.showMessageDialog(null, "System has been updated");
            this.setVisible(false);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "There was an error with updating the system");
        }
    }//GEN-LAST:event_updateSystemActionPerformed

    private void closeSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeSystemActionPerformed
        //Closing the JPanel
        this.setVisible(false);
    }//GEN-LAST:event_closeSystemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeSystem;
    private javax.swing.JTextField fixedDiscount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField markUp;
    private javax.swing.JTextField mot;
    private javax.swing.JTextField repairs;
    private javax.swing.JTextField service;
    private javax.swing.JPanel systemConfigPanel;
    private javax.swing.JButton updateSystem;
    private javax.swing.JTextField vat;
    // End of variables declaration//GEN-END:variables
}
