package garits;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainMenu extends javax.swing.JFrame {
    DBConnect db;
    PreparedStatement prestate;
    static boolean reminderChecked;
  
    public MainMenu(DBConnect db) {
        initComponents();
        this.db = db;
        supplier.setOpaque(false);
        supplier.setContentAreaFilled(false); 
        supplier.setBorderPainted(false);
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
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setSize(1300, 900);
        popUp();
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
        supplier = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
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
        logout.setBounds(1180, 0, 114, 150);

        generateReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/reportsicon.png"))); // NOI18N
        generateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportActionPerformed(evt);
            }
        });
        getContentPane().add(generateReport);
        generateReport.setBounds(480, 10, 120, 140);

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
        jobList.setBounds(710, 10, 120, 140);

        payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/payment.png"))); // NOI18N
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });
        getContentPane().add(payment);
        payment.setBounds(830, 10, 120, 140);

        invoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/invoiceicon.png"))); // NOI18N
        invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceActionPerformed(evt);
            }
        });
        getContentPane().add(invoice);
        invoice.setBounds(950, 10, 120, 140);

        supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/supplier.png"))); // NOI18N
        supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierActionPerformed(evt);
            }
        });
        getContentPane().add(supplier);
        supplier.setBounds(1070, 10, 110, 140);

        jButton2.setText("Alert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 230, 57, 25);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1300, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void popUp(){
        try{
   
            prestate = db.conn.prepareStatement("SELECT count(*) from `jobsheets` where `Reminder count` = '1' or `Reminder count` = '2' or `Reminder count` = '3' AND `status` = 'Complete' ");
            ResultSet rs1 = prestate.executeQuery();
            rs1.next();
            int i = rs1.getInt("count(*)");
            
            if(reminderChecked == false && (i > 0)){
                JOptionPane.showMessageDialog(null, "You have: " + i + " reminders due");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    private void viewCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomersActionPerformed
        CustomerInfo customerInfoPanel = new CustomerInfo(db);
        this.getContentPane().add(customerInfoPanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_viewCustomersActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Pin pin = new Pin();
  
        try {
            db.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        pin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void updateStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStockActionPerformed
        Stock stockPanel = new Stock(db);
        this.getContentPane().add(stockPanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_updateStockActionPerformed

    private void createJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJobActionPerformed
        CreateJob createJobPanel = new CreateJob(db);
        this.getContentPane().add(createJobPanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_createJobActionPerformed

    private void generateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportActionPerformed
        GenerateReport reportPanel = new GenerateReport(db);
        this.getContentPane().add(reportPanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_generateReportActionPerformed

    private void invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceActionPerformed
        Invoice invoicePanel = new Invoice(db);
        this.getContentPane().add(invoicePanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_invoiceActionPerformed

    private void jobListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobListActionPerformed
        JobList jobListPanel = new JobList(this, db);
        this.getContentPane().add(jobListPanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_jobListActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        Payment paymentPanel = new Payment(db);
        this.getContentPane().add(paymentPanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_paymentActionPerformed

    private void supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierActionPerformed
       AlterSupplier alterSupplierPanel = new AlterSupplier(db);
       this.getContentPane().add(alterSupplierPanel);
       this.invalidate();
       this.validate();
    }//GEN-LAST:event_supplierActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Alerts alertPanel = new Alerts(db);
        reminderChecked = true;
        this.getContentPane().add(alertPanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createJob;
    private javax.swing.JButton generateReport;
    private javax.swing.JButton invoice;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jobList;
    private javax.swing.JButton logout;
    private javax.swing.JButton payment;
    private javax.swing.JButton supplier;
    private javax.swing.JButton updateStock;
    private javax.swing.JButton viewCustomers;
    // End of variables declaration//GEN-END:variables
}