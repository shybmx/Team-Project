package garits;

public class MainMenu extends javax.swing.JFrame {

    DBConnect db;
    
    public MainMenu() {
        initComponents();
        viewCustomers.setOpaque(false);
        viewCustomers.setContentAreaFilled(false); 
        viewCustomers.setBorderPainted(false);
        logout.setOpaque(false);
        logout.setContentAreaFilled(false); 
        logout.setBorderPainted(false);
        updateStock.setOpaque(false);
        updateStock.setContentAreaFilled(false); 
        updateStock.setBorderPainted(false);
        createJob.setOpaque(false);
        createJob.setContentAreaFilled(false); 
        createJob.setBorderPainted(false);
        generateReport.setOpaque(false);
        generateReport.setContentAreaFilled(false); 
        generateReport.setBorderPainted(false);
        jobList.setOpaque(false);
        jobList.setContentAreaFilled(false); 
        jobList.setBorderPainted(false);
        payment.setOpaque(false);
        payment.setContentAreaFilled(false); 
        payment.setBorderPainted(false);
        invoice.setOpaque(false);
        invoice.setContentAreaFilled(false); 
        invoice.setBorderPainted(false);
        this.setResizable(false);
        this.setSize(1300, 900);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        viewCustomers = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        generateReport = new javax.swing.JButton();
        updateStock = new javax.swing.JButton();
        createJob = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jobList = new javax.swing.JButton();
        payment = new javax.swing.JButton();
        invoice = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        viewCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/customer.png"))); // NOI18N
        viewCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomersActionPerformed(evt);
            }
        });
        getContentPane().add(viewCustomers);
        viewCustomers.setBounds(208, 6, 130, 141);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/logouticon.png"))); // NOI18N
        logout.setToolTipText("");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(1080, 10, 114, 140);

        generateReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/reportsicon.png"))); // NOI18N
        generateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportActionPerformed(evt);
            }
        });
        getContentPane().add(generateReport);
        generateReport.setBounds(480, 10, 120, 142);

        updateStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/stockicon.png"))); // NOI18N
        updateStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStockActionPerformed(evt);
            }
        });
        getContentPane().add(updateStock);
        updateStock.setBounds(600, 10, 114, 142);

        createJob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/createJob.png"))); // NOI18N
        createJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJobActionPerformed(evt);
            }
        });
        getContentPane().add(createJob);
        createJob.setBounds(340, 10, 140, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/imageedit_1_5745129201.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 202, 205);

        jobList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/Joblist.png"))); // NOI18N
        jobList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobListActionPerformed(evt);
            }
        });
        getContentPane().add(jobList);
        jobList.setBounds(720, 10, 120, 140);

        payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/payment.png"))); // NOI18N
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });
        getContentPane().add(payment);
        payment.setBounds(840, 10, 120, 140);

        invoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/invoiceicon.png"))); // NOI18N
        invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceActionPerformed(evt);
            }
        });
        getContentPane().add(invoice);
        invoice.setBounds(960, 10, 120, 140);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1300, 950);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomersActionPerformed
        CustomerInfo customerInfoPanel = new CustomerInfo(this);
        this.getContentPane().add(customerInfoPanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_viewCustomersActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Pin pin = new Pin();
        pin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void updateStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStockActionPerformed
        Stock stockPanel = new Stock();
        this.getContentPane().add(stockPanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_updateStockActionPerformed

    private void createJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJobActionPerformed
        CreateJob createJobPanel = new CreateJob();
        this.getContentPane().add(createJobPanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_createJobActionPerformed

    private void generateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportActionPerformed
        GenerateReport reportPanel = new GenerateReport();
        this.getContentPane().add(reportPanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_generateReportActionPerformed

    private void invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceActionPerformed
        Invoice invoicePanel = new Invoice();
        this.getContentPane().add(invoicePanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_invoiceActionPerformed

    private void jobListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobListActionPerformed
        JobList jobListPanel = new JobList(this);
        this.getContentPane().add(jobListPanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_jobListActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        Payment paymentPanel = new Payment(this);
        this.getContentPane().add(paymentPanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_paymentActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createJob;
    private javax.swing.JButton generateReport;
    private javax.swing.JButton invoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jobList;
    private javax.swing.JButton logout;
    private javax.swing.JButton payment;
    private javax.swing.JButton updateStock;
    private javax.swing.JButton viewCustomers;
    // End of variables declaration//GEN-END:variables
}