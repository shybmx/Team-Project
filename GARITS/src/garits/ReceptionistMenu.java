package garits;

public class ReceptionistMenu extends javax.swing.JFrame {
    
    public ReceptionistMenu() {
        initComponents();
        createJobs.setOpaque(false);
        createJobs.setContentAreaFilled(false); 
        createJobs.setBorderPainted(false);
        viewCustomer.setOpaque(false);
        viewCustomer.setContentAreaFilled(false); 
        viewCustomer.setBorderPainted(false);
        produceInvoice.setOpaque(false);
        produceInvoice.setContentAreaFilled(false); 
        produceInvoice.setBorderPainted(false);
        logout.setOpaque(false);
        logout.setContentAreaFilled(false); 
        logout.setBorderPainted(false);
        payment.setOpaque(false);
        payment.setContentAreaFilled(false); 
        payment.setBorderPainted(false);
        stock.setOpaque(false);
        stock.setContentAreaFilled(false); 
        stock.setBorderPainted(false);
        this.setSize(1300, 900);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createJobs = new javax.swing.JButton();
        viewCustomer = new javax.swing.JButton();
        produceInvoice = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        payment = new javax.swing.JButton();
        stock = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        createJobs.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\createicon.png")); // NOI18N
        createJobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJobsActionPerformed(evt);
            }
        });
        getContentPane().add(createJobs);
        createJobs.setBounds(240, 10, 109, 157);

        viewCustomer.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\viewicon.png")); // NOI18N
        viewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(viewCustomer);
        viewCustomer.setBounds(360, 10, 115, 157);

        produceInvoice.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\invoiceicon.png")); // NOI18N
        produceInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produceInvoiceActionPerformed(evt);
            }
        });
        getContentPane().add(produceInvoice);
        produceInvoice.setBounds(480, 10, 117, 157);

        logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\logouticon.png")); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(840, 10, 114, 160);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\imageedit_1_5745129201.gif")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 0, 202, 205);

        payment.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\payment.png")); // NOI18N
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });
        getContentPane().add(payment);
        payment.setBounds(720, 10, 120, 160);

        stock.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\stockicon.png")); // NOI18N
        getContentPane().add(stock);
        stock.setBounds(600, 10, 120, 160);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\background.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-80, -30, 1670, 990);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createJobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJobsActionPerformed
        Jobs job = new Jobs();
        job.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_createJobsActionPerformed

    private void viewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomerActionPerformed
        CustomerInfo customerinfo = new CustomerInfo();
        customerinfo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewCustomerActionPerformed

    private void produceInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produceInvoiceActionPerformed
        Invoice invoice = new Invoice();
        invoice.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_produceInvoiceActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Pin pin = new Pin();
        pin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        Payment pay = new Payment();
        pay.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_paymentActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createJobs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logout;
    private javax.swing.JButton payment;
    private javax.swing.JButton produceInvoice;
    private javax.swing.JButton stock;
    private javax.swing.JButton viewCustomer;
    // End of variables declaration//GEN-END:variables
}