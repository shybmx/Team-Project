package garits;

public class Register extends javax.swing.JPanel {

    public Register() {
        initComponents();
        addUser.setOpaque(false);
        addUser.setContentAreaFilled(false); 
        addUser.setBorderPainted(false);
        editUser.setOpaque(false);
        editUser.setContentAreaFilled(false); 
        editUser.setBorderPainted(false);
        close.setOpaque(false);
        close.setContentAreaFilled(false); 
        close.setBorderPainted(false);
        this.setSize(1300, 900);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editUser = new javax.swing.JButton();
        close = new javax.swing.JButton();
        addUser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        editUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\editUserIcon.png")); // NOI18N
        add(editUser);
        editUser.setBounds(681, 313, 128, 144);

        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\closeicon.png")); // NOI18N
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        add(close);
        close.setBounds(814, 313, 125, 144);

        addUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\addUserIcon.png")); // NOI18N
        add(addUser);
        addUser.setBounds(549, 313, 127, 144);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(549, 475, 390, 323);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\background.jpg")); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1310, 920);
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUser;
    private javax.swing.JButton close;
    private javax.swing.JButton editUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}