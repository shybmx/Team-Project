package garits;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class SystemConfig extends javax.swing.JPanel {
    DBConnect db;
    PreparedStatement prestate;
    public SystemConfig(DBConnect db) {
        initComponents();
        this.db = db;
        this.setSize(1300, 900);
        updateSystem.setOpaque(false);
        updateSystem.setContentAreaFilled(false); 
        updateSystem.setBorderPainted(false);
        closeSystem.setOpaque(false);
        closeSystem.setContentAreaFilled(false); 
        closeSystem.setBorderPainted(false);
        systemConfigPanel.setOpaque(false);
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

        javax.swing.GroupLayout systemConfigPanelLayout = new javax.swing.GroupLayout(systemConfigPanel);
        systemConfigPanel.setLayout(systemConfigPanelLayout);
        systemConfigPanelLayout.setHorizontalGroup(
            systemConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemConfigPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(systemConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(systemConfigPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(139, 139, 139)
                        .addComponent(vat, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(systemConfigPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addComponent(markUp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(systemConfigPanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(updateSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(closeSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(18, 18, 18)
                .addGroup(systemConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateSystem)
                    .addComponent(closeSystem))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        add(systemConfigPanel);
        systemConfigPanel.setBounds(540, 370, 370, 280);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1300, 900);
    }// </editor-fold>//GEN-END:initComponents

    public void insertIntoText(){
        try{
            prestate = db.conn.prepareStatement("SELECT * FROM `system config` ");
            ResultSet result = prestate.executeQuery();
            result.next();
            
           markUp.setText(result.getString("Value"));
           result.next();
            vat.setText(result.getString("Value"));
        }catch(Exception ex){
            
        }
    }
    
    
    private void updateSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSystemActionPerformed
        try{
            prestate = db.conn.prepareStatement("UPDATE `system config` SET `value` = '"+vat.getText()+"' WHERE `variables` = 'VAT' ");
            prestate.execute();
            prestate = db.conn.prepareStatement("UPDATE `system config` SET `value` = '"+markUp.getText()+"'  WHERE `variables` = 'Mark up for Parts' ");
            prestate.execute();
            JOptionPane.showMessageDialog(null, "System has been updated");
            this.setVisible(false);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "There was an error with updating the system");
        }
    }//GEN-LAST:event_updateSystemActionPerformed

    private void closeSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeSystemActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeSystemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeSystem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField markUp;
    private javax.swing.JPanel systemConfigPanel;
    private javax.swing.JButton updateSystem;
    private javax.swing.JTextField vat;
    // End of variables declaration//GEN-END:variables
}
