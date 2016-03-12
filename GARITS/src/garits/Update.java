package garits;

import java.sql.*;
import javax.swing.JOptionPane;

public class Update extends javax.swing.JFrame {
    DBConnect db;
    public Update() {
        initComponents();
        update.setOpaque(false);
        update.setContentAreaFilled(false); 
        update.setBorderPainted(false);
        close.setOpaque(false);
        close.setContentAreaFilled(false); 
        close.setBorderPainted(false);
        this.setSize(1450, 400);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        insertName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        insertAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        insertPostCode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        insertPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        insertEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        insertReg = new javax.swing.JTextField();
        insertMake = new javax.swing.JTextField();
        insertModel = new javax.swing.JTextField();
        insertEng = new javax.swing.JTextField();
        insertChass = new javax.swing.JTextField();
        insertColour = new javax.swing.JTextField();
        close = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        insertDiscount = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 6, 70, 32);

        insertName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNameActionPerformed(evt);
            }
        });
        getContentPane().add(insertName);
        insertName.setBounds(131, 6, 400, 40);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel2.setText("Address:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(6, 63, 95, 32);

        insertAddress.setMinimumSize(new java.awt.Dimension(12, 40));
        insertAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertAddressActionPerformed(evt);
            }
        });
        getContentPane().add(insertAddress);
        insertAddress.setBounds(131, 61, 400, 44);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel3.setText("Post Code:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(6, 123, 119, 32);

        insertPostCode.setMinimumSize(new java.awt.Dimension(12, 40));
        insertPostCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertPostCodeActionPerformed(evt);
            }
        });
        getContentPane().add(insertPostCode);
        insertPostCode.setBounds(131, 123, 400, 40);

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel4.setText("Phone:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(6, 175, 77, 32);

        insertPhone.setMaximumSize(new java.awt.Dimension(400, 40));
        insertPhone.setMinimumSize(new java.awt.Dimension(400, 40));
        insertPhone.setName(""); // NOI18N
        insertPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertPhoneActionPerformed(evt);
            }
        });
        getContentPane().add(insertPhone);
        insertPhone.setBounds(131, 175, 400, 40);

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel5.setText("E-Mail:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(6, 221, 74, 32);
        getContentPane().add(insertEmail);
        insertEmail.setBounds(131, 221, 400, 40);

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel7.setText("Reg.no:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(549, 6, 85, 32);

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel8.setText("Make:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(549, 63, 64, 32);

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel9.setText("Model:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(549, 123, 72, 32);

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel10.setText("Eng.Serial:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(549, 175, 119, 32);

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel11.setText("Chassis Number: ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(549, 221, 192, 32);

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel6.setText("Colour:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(549, 267, 78, 32);

        insertReg.setPreferredSize(new java.awt.Dimension(350, 40));
        getContentPane().add(insertReg);
        insertReg.setBounds(749, 6, 400, 40);
        getContentPane().add(insertMake);
        insertMake.setBounds(747, 64, 402, 41);
        getContentPane().add(insertModel);
        insertModel.setBounds(747, 123, 402, 40);
        getContentPane().add(insertEng);
        insertEng.setBounds(747, 175, 402, 40);

        insertChass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertChassActionPerformed(evt);
            }
        });
        getContentPane().add(insertChass);
        insertChass.setBounds(747, 221, 402, 40);

        insertColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertColourActionPerformed(evt);
            }
        });
        getContentPane().add(insertColour);
        insertColour.setBounds(747, 267, 402, 38);

        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\closeicon.png")); // NOI18N
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(1160, 0, 112, 149);

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel12.setText("Discount: ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(549, 311, 108, 32);

        insertDiscount.setText("0");
        getContentPane().add(insertDiscount);
        insertDiscount.setBounds(747, 311, 402, 41);

        jLabel13.setText("%");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(1160, 320, 11, 16);

        update.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\update.png")); // NOI18N
        getContentPane().add(update);
        update.setBounds(1280, 0, 110, 150);

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\background.jpg")); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 1450, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNameActionPerformed
       
    }//GEN-LAST:event_insertNameActionPerformed

    private void insertAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertAddressActionPerformed
        
    }//GEN-LAST:event_insertAddressActionPerformed

    private void insertPostCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPostCodeActionPerformed
        
    }//GEN-LAST:event_insertPostCodeActionPerformed

    private void insertPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPhoneActionPerformed
        
    }//GEN-LAST:event_insertPhoneActionPerformed

    private void insertChassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertChassActionPerformed
        
    }//GEN-LAST:event_insertChassActionPerformed

    private void insertColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertColourActionPerformed
        
    }//GEN-LAST:event_insertColourActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JTextField insertAddress;
    private javax.swing.JTextField insertChass;
    private javax.swing.JTextField insertColour;
    private javax.swing.JTextField insertDiscount;
    private javax.swing.JTextField insertEmail;
    private javax.swing.JTextField insertEng;
    private javax.swing.JTextField insertMake;
    private javax.swing.JTextField insertModel;
    private javax.swing.JTextField insertName;
    private javax.swing.JTextField insertPhone;
    private javax.swing.JTextField insertPostCode;
    private javax.swing.JTextField insertReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}