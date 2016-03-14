package garits;

public class ForePerson extends javax.swing.JFrame {

    public ForePerson() {
        initComponents();
        logout.setOpaque(false);
        logout.setContentAreaFilled(false); 
        logout.setBorderPainted(false);
        jobList.setOpaque(false);
        jobList.setContentAreaFilled(false); 
        jobList.setBorderPainted(false);
        createJob.setOpaque(false);
        createJob.setContentAreaFilled(false); 
        createJob.setBorderPainted(false);
        invoice.setOpaque(false);
        invoice.setContentAreaFilled(false); 
        invoice.setBorderPainted(false);
        stock.setOpaque(false);
        stock.setContentAreaFilled(false); 
        stock.setBorderPainted(false);
        payment.setOpaque(false);
        payment.setContentAreaFilled(false); 
        payment.setBorderPainted(false);
        this.setSize(1300, 900);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logout = new javax.swing.JButton();
        createJob = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        invoice = new javax.swing.JButton();
        stock = new javax.swing.JButton();
        payment = new javax.swing.JButton();
        jobList = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\logouticon.png")); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(840, 10, 114, 150);

        createJob.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\createJob.png")); // NOI18N
        createJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJobActionPerformed(evt);
            }
        });
        getContentPane().add(createJob);
        createJob.setBounds(208, 6, 140, 155);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\imageedit_1_5745129201.gif")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 202, 205);

        invoice.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\invoiceicon.png")); // NOI18N
        invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceActionPerformed(evt);
            }
        });
        getContentPane().add(invoice);
        invoice.setBounds(350, 10, 120, 150);

        stock.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\stockicon.png")); // NOI18N
        getContentPane().add(stock);
        stock.setBounds(590, 10, 120, 150);

        payment.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\payment.png")); // NOI18N
        getContentPane().add(payment);
        payment.setBounds(710, 10, 120, 150);

        jobList.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\Joblist.png")); // NOI18N
        getContentPane().add(jobList);
        jobList.setBounds(470, 10, 120, 150);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\background.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-510, -30, 1930, 1200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Pin pin = new Pin();
        pin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void createJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJobActionPerformed
        CreateJob createjob = new CreateJob();
        this.getContentPane().add(createjob);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_createJobActionPerformed

    private void invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceActionPerformed
        Invoice invoice = new Invoice();
        this.getContentPane().add(invoice);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_invoiceActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createJob;
    private javax.swing.JButton invoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jobList;
    private javax.swing.JButton logout;
    private javax.swing.JButton payment;
    private javax.swing.JButton stock;
    // End of variables declaration//GEN-END:variables
}