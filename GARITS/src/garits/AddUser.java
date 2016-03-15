package garits;

public class AddUser extends javax.swing.JPanel {

    public AddUser() {
        initComponents();
        close.setOpaque(false);
        close.setContentAreaFilled(false); 
        close.setBorderPainted(false);
        addUser.setOpaque(false);
        addUser.setContentAreaFilled(false); 
        addUser.setBorderPainted(false);
        this.setSize(1300, 900);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        postCode = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        EMail = new javax.swing.JTextField();
        userName = new javax.swing.JTextField();
        passWord = new javax.swing.JTextField();
        reTypePassWord = new javax.swing.JTextField();
        addUser = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();

        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Address:");
        add(jLabel2);
        jLabel2.setBounds(314, 534, 95, 32);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Post Code:");
        add(jLabel3);
        jLabel3.setBounds(314, 577, 119, 32);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Phone:");
        add(jLabel4);
        jLabel4.setBounds(314, 620, 77, 32);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("E-Mail:");
        add(jLabel5);
        jLabel5.setBounds(314, 663, 74, 32);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("Username:");
        add(jLabel6);
        jLabel6.setBounds(733, 491, 117, 32);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setText("Password:");
        add(jLabel7);
        jLabel7.setBounds(735, 534, 112, 32);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setText("Re-Type Password:");
        add(jLabel8);
        jLabel8.setBounds(733, 577, 210, 32);

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        add(address);
        address.setBounds(443, 539, 272, 32);

        postCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postCodeActionPerformed(evt);
            }
        });
        add(postCode);
        postCode.setBounds(443, 582, 272, 32);

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        add(phone);
        phone.setBounds(443, 625, 272, 32);

        EMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMailActionPerformed(evt);
            }
        });
        add(EMail);
        EMail.setBounds(443, 668, 272, 32);

        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        add(userName);
        userName.setBounds(965, 496, 272, 32);

        passWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passWordActionPerformed(evt);
            }
        });
        add(passWord);
        passWord.setBounds(965, 539, 272, 32);

        reTypePassWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reTypePassWordActionPerformed(evt);
            }
        });
        add(reTypePassWord);
        reTypePassWord.setBounds(965, 582, 272, 32);

        addUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\add.png")); // NOI18N
        add(addUser);
        addUser.setBounds(965, 632, 116, 140);

        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\closeicon.png")); // NOI18N
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        add(close);
        close.setBounds(1086, 632, 116, 140);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\background.jpg")); // NOI18N
        add(jLabel9);
        jLabel9.setBounds(0, 0, 230, 900);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Name:");
        jPanel1.add(jLabel1);

        name.setPreferredSize(new java.awt.Dimension(200, 30));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);

        add(jPanel1);
        jPanel1.setBounds(-60, 430, 1040, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void postCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postCodeActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void EMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EMailActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void passWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passWordActionPerformed

    private void reTypePassWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reTypePassWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reTypePassWordActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EMail;
    private javax.swing.JButton addUser;
    private javax.swing.JTextField address;
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField passWord;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField postCode;
    private javax.swing.JTextField reTypePassWord;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}