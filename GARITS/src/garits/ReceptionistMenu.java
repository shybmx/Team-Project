package garits;

public class ReceptionistMenu extends javax.swing.JFrame {
    
    public ReceptionistMenu() {
        initComponents();
        createJobs.setOpaque(false);
        createJobs.setContentAreaFilled(false); 
        createJobs.setBorderPainted(false);
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
        reports.setOpaque(false);
        reports.setContentAreaFilled(false); 
        reports.setBorderPainted(false);
        jobList.setOpaque(false);
        jobList.setContentAreaFilled(false); 
        jobList.setBorderPainted(false);
        this.setResizable(false);
        this.setSize(1300, 900);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createJobs = new javax.swing.JButton();
        produceInvoice = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        payment = new javax.swing.JButton();
        stock = new javax.swing.JButton();
        jobList = new javax.swing.JButton();
        reports = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        createJobs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/createJob.png"))); // NOI18N
        createJobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJobsActionPerformed(evt);
            }
        });
        getContentPane().add(createJobs);
        createJobs.setBounds(240, 10, 140, 155);

        produceInvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/invoiceicon.png"))); // NOI18N
        produceInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produceInvoiceActionPerformed(evt);
            }
        });
        getContentPane().add(produceInvoice);
        produceInvoice.setBounds(500, 10, 117, 155);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/logouticon.png"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(990, 10, 114, 160);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/imageedit_1_5745129201.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 0, 202, 205);

        payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/payment.png"))); // NOI18N
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });
        getContentPane().add(payment);
        payment.setBounds(740, 10, 120, 160);

        stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/stockicon.png"))); // NOI18N
        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });
        getContentPane().add(stock);
        stock.setBounds(620, 10, 120, 160);

        jobList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/Joblist.png"))); // NOI18N
        jobList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobListActionPerformed(evt);
            }
        });
        getContentPane().add(jobList);
        jobList.setBounds(380, 10, 120, 150);

        reports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/reportsicon.png"))); // NOI18N
        reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsActionPerformed(evt);
            }
        });
        getContentPane().add(reports);
        reports.setBounds(860, 10, 130, 160);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1300, 990);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createJobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJobsActionPerformed
        CreateJob createJobPanel = new CreateJob();
        this.getContentPane().add(createJobPanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_createJobsActionPerformed

    private void produceInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produceInvoiceActionPerformed
        Invoice invoicePanel = new Invoice();
        this.getContentPane().add(invoicePanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_produceInvoiceActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Pin pin = new Pin();
        pin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        Payment paymentPanel = new Payment(this);
        this.getContentPane().add(paymentPanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_paymentActionPerformed

    private void jobListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobListActionPerformed
        JobList jobListPanel = new JobList(this);
        this.getContentPane().add(jobListPanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_jobListActionPerformed

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed
        Stock stockPanel = new Stock();
        this.getContentPane().add(stockPanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_stockActionPerformed

    private void reportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsActionPerformed
        SparePartReport sparepartreportpanel = new SparePartReport();
        this.getContentPane().add(sparepartreportpanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_reportsActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createJobs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jobList;
    private javax.swing.JButton logout;
    private javax.swing.JButton payment;
    private javax.swing.JButton produceInvoice;
    private javax.swing.JButton reports;
    private javax.swing.JButton stock;
    // End of variables declaration//GEN-END:variables
}