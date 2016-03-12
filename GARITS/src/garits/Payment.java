package garits;

public class Payment extends javax.swing.JFrame {

    public Payment() {
        initComponents();
        cardPayment.setOpaque(false);
        cardPayment.setContentAreaFilled(false); 
        cardPayment.setBorderPainted(false);
        cashPayment.setOpaque(false);
        cashPayment.setContentAreaFilled(false); 
        cashPayment.setBorderPainted(false);
        storePayment.setOpaque(false);
        storePayment.setContentAreaFilled(false); 
        storePayment.setBorderPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardPayment = new javax.swing.JButton();
        storePayment = new javax.swing.JButton();
        cashPayment = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        cardPayment.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\cardpaymenticon.png")); // NOI18N
        cardPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardPaymentActionPerformed(evt);
            }
        });
        getContentPane().add(cardPayment);
        cardPayment.setBounds(208, 6, 115, 143);

        storePayment.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\storeicon.png")); // NOI18N
        storePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storePaymentActionPerformed(evt);
            }
        });
        getContentPane().add(storePayment);
        storePayment.setBounds(465, 6, 117, 143);

        cashPayment.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\cashicon.png")); // NOI18N
        cashPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashPaymentActionPerformed(evt);
            }
        });
        getContentPane().add(cashPayment);
        cashPayment.setBounds(329, 7, 130, 142);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\imageedit_1_5745129201.gif")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 202, 205);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\background.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 670, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cashPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashPaymentActionPerformed
        CashPayment cash = new CashPayment();
        cash.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cashPaymentActionPerformed

    private void cardPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardPaymentActionPerformed
        CardPayment card = new CardPayment();
        card.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cardPaymentActionPerformed

    private void storePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storePaymentActionPerformed
        ChequePayment cheq = new ChequePayment();
        cheq.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_storePaymentActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cardPayment;
    private javax.swing.JButton cashPayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton storePayment;
    // End of variables declaration//GEN-END:variables
}