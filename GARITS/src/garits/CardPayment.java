package garits;

public class CardPayment extends javax.swing.JFrame {

    public CardPayment() {
        initComponents();
        close.setOpaque(false);
        close.setContentAreaFilled(false); 
        close.setBorderPainted(false);
        add.setOpaque(false);
        add.setContentAreaFilled(false); 
        add.setBorderPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        close = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Customer Name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 112, 181, 32);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel2.setText("Amount:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 200, 90, 32);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel3.setText("Card Number:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 250, 152, 32);

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel4.setText("Sort Code:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 350, 115, 32);

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel5.setText("Account Number:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 400, 187, 32);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(210, 110, 173, 38);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(210, 200, 173, 40);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(210, 300, 173, 40);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(210, 350, 173, 30);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(210, 400, 173, 32);

        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\closeicon.png")); // NOI18N
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(260, 510, 116, 145);

        add.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\storeicon.png")); // NOI18N
        getContentPane().add(add);
        add.setBounds(130, 510, 117, 145);

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel7.setText("Expiry Date:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 290, 140, 40);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(210, 440, 173, 40);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(210, 250, 173, 40);

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel8.setText("Secuirty Number:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 440, 190, 40);

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel9.setText("Name On Card:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 150, 180, 50);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(210, 160, 170, 28);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\background.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 410, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_closeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}