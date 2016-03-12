package garits;

import javafx.scene.paint.Color;

public class AdminMenu extends javax.swing.JFrame {

    public AdminMenu() {
        initComponents();
        this.setSize(1000, 658);
        this.setResizable(false);
        backupDB.setOpaque(false);
        backupDB.setContentAreaFilled(false); 
        backupDB.setBorderPainted(false);
        restoreDB.setOpaque(false);
        restoreDB.setContentAreaFilled(false); 
        restoreDB.setBorderPainted(false);
        archiveDB.setOpaque(false);
        archiveDB.setContentAreaFilled(false); 
        archiveDB.setBorderPainted(false);
        logout.setOpaque(false);
        logout.setContentAreaFilled(false); 
        logout.setBorderPainted(false);
        manage.setOpaque(false);
        manage.setContentAreaFilled(false); 
        manage.setBorderPainted(false);
        this.setSize(1300, 900);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backupDB = new javax.swing.JButton();
        restoreDB = new javax.swing.JButton();
        archiveDB = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        manage = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        backupDB.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\backupIcon.png")); // NOI18N
        backupDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backupDBActionPerformed(evt);
            }
        });
        getContentPane().add(backupDB);
        backupDB.setBounds(370, 20, 150, 150);

        restoreDB.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\restoreDB.png")); // NOI18N
        restoreDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreDBActionPerformed(evt);
            }
        });
        getContentPane().add(restoreDB);
        restoreDB.setBounds(520, 20, 120, 150);

        archiveDB.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\archiveicon.png")); // NOI18N
        archiveDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archiveDBActionPerformed(evt);
            }
        });
        getContentPane().add(archiveDB);
        archiveDB.setBounds(640, 20, 120, 150);

        logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\logouticon.png")); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(760, 20, 120, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\imageedit_1_5745129201.gif")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 200, 200);

        manage.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\manageicon.png")); // NOI18N
        manage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageActionPerformed(evt);
            }
        });
        getContentPane().add(manage);
        manage.setBounds(250, 20, 120, 150);
        getContentPane().add(mainPanel);
        mainPanel.setBounds(150, 240, 1150, 660);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\background.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1310, 910);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Pin logout = new Pin();
        logout.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void backupDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backupDBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backupDBActionPerformed

    private void restoreDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreDBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restoreDBActionPerformed

    private void archiveDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archiveDBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_archiveDBActionPerformed

    private void manageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageActionPerformed
        Register reg = new Register();
        mainPanel.add(reg);
    }//GEN-LAST:event_manageActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton archiveDB;
    private javax.swing.JButton backupDB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logout;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton manage;
    private javax.swing.JButton restoreDB;
    // End of variables declaration//GEN-END:variables

}