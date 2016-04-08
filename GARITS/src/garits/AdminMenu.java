package garits;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class AdminMenu extends javax.swing.JFrame {
    DBConnect db;
    public AdminMenu(DBConnect db) {
        initComponents();
        this.db = db;
        this.setResizable(false);
        systemConfig.setOpaque(false);
        systemConfig.setContentAreaFilled(false); 
        systemConfig.setBorderPainted(false);
        backupDB.setOpaque(false);
        backupDB.setContentAreaFilled(false); 
        backupDB.setBorderPainted(false);
        restoreDB.setOpaque(false);
        restoreDB.setContentAreaFilled(false); 
        restoreDB.setBorderPainted(false);
        logout.setOpaque(false);
        logout.setContentAreaFilled(false); 
        logout.setBorderPainted(false);
        manage.setOpaque(false);
        manage.setContentAreaFilled(false); 
        manage.setBorderPainted(false);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setSize(1300, 900);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backupDB = new javax.swing.JButton();
        restoreDB = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        manage = new javax.swing.JButton();
        systemConfig = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        backupDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/backupIcon.png"))); // NOI18N
        backupDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backupDBActionPerformed(evt);
            }
        });
        getContentPane().add(backupDB);
        backupDB.setBounds(370, 20, 150, 150);

        restoreDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/restoreDB.png"))); // NOI18N
        restoreDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreDBActionPerformed(evt);
            }
        });
        getContentPane().add(restoreDB);
        restoreDB.setBounds(520, 20, 120, 150);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/logouticon.png"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(760, 20, 120, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/imageedit_1_5745129201.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 200, 200);

        manage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/manageicon.png"))); // NOI18N
        manage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageActionPerformed(evt);
            }
        });
        getContentPane().add(manage);
        manage.setBounds(250, 20, 120, 150);

        systemConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/System.png"))); // NOI18N
        systemConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systemConfigActionPerformed(evt);
            }
        });
        getContentPane().add(systemConfig);
        systemConfig.setBounds(640, 20, 120, 150);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1300, 910);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Pin logout = new Pin();
        try {
            db.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        logout.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void backupDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backupDBActionPerformed
       BackupDB backupdbpanel = new BackupDB(db);
       this.getContentPane().add(backupdbpanel);
       this.invalidate();
       this.validate();
    }//GEN-LAST:event_backupDBActionPerformed

    private void restoreDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreDBActionPerformed
        RestoreDB restoredbpanel = new RestoreDB(db);
        this.getContentPane().add(restoredbpanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_restoreDBActionPerformed

    private void manageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageActionPerformed
       Register register = new Register(this, db);
        this.getContentPane().add(register);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_manageActionPerformed

    private void systemConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systemConfigActionPerformed
        SystemConfig systemConfigPanel = new SystemConfig(db);
        this.getContentPane().add(systemConfigPanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_systemConfigActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backupDB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logout;
    private javax.swing.JButton manage;
    private javax.swing.JButton restoreDB;
    private javax.swing.JButton systemConfig;
    // End of variables declaration//GEN-END:variables

}