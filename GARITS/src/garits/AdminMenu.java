package garits;

import java.awt.*;
import javafx.scene.paint.Color;
import javax.swing.*;

public class AdminMenu extends javax.swing.JFrame {
    DBConnect db;

    
    public AdminMenu() {
         initComponents();
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
        //db.connect();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        alerts = new javax.swing.JTable();
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

        archiveDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/archiveicon.png"))); // NOI18N
        archiveDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archiveDBActionPerformed(evt);
            }
        });
        getContentPane().add(archiveDB);
        archiveDB.setBounds(640, 20, 120, 150);

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

        alerts.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(alerts);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(940, 20, 300, 150);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1300, 910);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Pin logout = new Pin();
        logout.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void backupDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backupDBActionPerformed
       BackupDB backupdbpanel = new BackupDB();
       this.getContentPane().add(backupdbpanel);
       this.invalidate();
       this.validate();
    }//GEN-LAST:event_backupDBActionPerformed

    private void restoreDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreDBActionPerformed
        RestoreDB restoredbpanel = new RestoreDB();
        this.getContentPane().add(restoredbpanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_restoreDBActionPerformed

    private void archiveDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archiveDBActionPerformed
        ArchiveDB archivedbpanel = new ArchiveDB();
        this.getContentPane().add(archivedbpanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_archiveDBActionPerformed

    private void manageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageActionPerformed
       Register register = new Register(this);
        this.getContentPane().add(register);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_manageActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable alerts;
    private javax.swing.JButton archiveDB;
    private javax.swing.JButton backupDB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton manage;
    private javax.swing.JButton restoreDB;
    // End of variables declaration//GEN-END:variables

}
