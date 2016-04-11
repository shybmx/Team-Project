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
        //Set up all the componets within this JFrame
        initComponents();
        //Pass in the database connection
        this.db = db;
        //Removes all the backgrounds from the JButtons and JPanels
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
        //Make the JFrame un resizeable
        this.setResizable(false);
        //Make the JFrame not close the program when the close button is hit
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //Set this size of the JFrame
        this.setSize(1300, 900);
        //Make the pop up notifaction when the franchisee logs in
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
        jButton1 = new javax.swing.JButton();
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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/supplier.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1070, 10, 110, 140);

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
            //Creating a MySQL statement which counts all the reminders
            prestate = db.conn.prepareStatement("SELECT count(*) from `jobsheets` where `Reminder count` = '1' or `Reminder count` = '2' or `Reminder count` = '3'");
            //Executing the query and placing it in a result set
            ResultSet rs1 = prestate.executeQuery();
            //Goes to the nexr result which is not the header
            rs1.next();
            //Gets the count and places it in an int variable
            int i = rs1.getInt("count(*)");
            //Check is the reminder has been checked and there is a reminder
            if(reminderChecked == false && (i > 0)){
                //A pop up to show that there are reminders that need to be checked
                JOptionPane.showMessageDialog(null, "You have: " + i + " reminders due");
            }
        }catch(Exception ex){
            //If there is an error it will print to the terminal
            ex.printStackTrace();
        }
    }
    
    private void viewCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomersActionPerformed
        //Creating a customer info object
        CustomerInfo customerInfoPanel = new CustomerInfo(db);
        //Adding the customer information panel to the JFrame
        this.getContentPane().add(customerInfoPanel);
        //Refresh the JFrame
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_viewCustomersActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        //Creating a new pin object
        Pin pin = new Pin();
        try {
            //Closing the database connection
            db.close();
        } catch (SQLException ex) {
            //An error message if the connection cannot be closed
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Making the pin JFrame visable
        pin.setVisible(true);
        //Make this JFrame invisable
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void updateStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStockActionPerformed
        //Creating a new stock panel object
        Stock stockPanel = new Stock(db);
        //Adding the stock panel to this JFrame
        this.getContentPane().add(stockPanel);
        //Refreshing this JFrame
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_updateStockActionPerformed

    private void createJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJobActionPerformed
        //Creating a new create job object
        CreateJob createJobPanel = new CreateJob(db);
        //Adding the new JPanel created to the JFrame
        this.getContentPane().add(createJobPanel);
        //Refreshing this JFrame
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_createJobActionPerformed

    private void generateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportActionPerformed
        //Creaing a new generate report object
        GenerateReport reportPanel = new GenerateReport(db);
        //Adding the new JPanel to the JFrame
        this.getContentPane().add(reportPanel);
        //Refreshing this JFrame
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_generateReportActionPerformed

    private void invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceActionPerformed
        //Creating a new invoice object 
        Invoice invoicePanel = new Invoice(db);
        //Adding the JPanel to the JFrame 
        this.getContentPane().add(invoicePanel);
        //Refreshing this JFrame
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_invoiceActionPerformed

    private void jobListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobListActionPerformed
        //Creating a new Joblist object
        JobList jobListPanel = new JobList(this, db);
        //Adding the JPanel to the JFrame
        this.getContentPane().add(jobListPanel);
        //Refreshing this JFrame
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_jobListActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        //Creating a new payment object
        Payment paymentPanel = new Payment(db);
        //Adding the JPanel to the JFrame
        this.getContentPane().add(paymentPanel);
        //Refreshing this JFrame
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_paymentActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //Creating a new alter supplier object
       AlterSupplier alterSupplierPanel = new AlterSupplier(db);
       //Adding the JPanel to JFrame
       this.getContentPane().add(alterSupplierPanel);
       //Refreshing this JFrame
       this.invalidate();
       this.validate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Creating a new alert object
        Alerts alertPanel = new Alerts(db);
        //set reminder check to true
        reminderChecked = true;
        //Adding the JPanel to the JFrame
        this.getContentPane().add(alertPanel);
        //Refreshing this JFrame
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createJob;
    private javax.swing.JButton generateReport;
    private javax.swing.JButton invoice;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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