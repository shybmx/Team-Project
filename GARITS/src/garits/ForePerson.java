package garits;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class ForePerson extends javax.swing.JFrame {
    DBConnect db;
    public ForePerson(DBConnect db) {
        //Set up all the componets within this JFrame
        initComponents();
        //Passes in the database connection
        this.db = db;
        //Remove all the background from all the JButtons and JPanels
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
        reports.setOpaque(false);
        reports.setContentAreaFilled(false); 
        reports.setBorderPainted(false);
        ///Make the JFrame non resizeable
        this.setResizable(false);
        //Stop the program from closing when the close button is hit
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //Set the size of the frame
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
        reports = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/logouticon.png"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(940, 10, 114, 150);

        createJob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/createJob.png"))); // NOI18N
        createJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJobActionPerformed(evt);
            }
        });
        getContentPane().add(createJob);
        createJob.setBounds(208, 6, 140, 155);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/imageedit_1_5745129201.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 202, 205);

        invoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/invoiceicon.png"))); // NOI18N
        invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceActionPerformed(evt);
            }
        });
        getContentPane().add(invoice);
        invoice.setBounds(350, 10, 120, 150);

        stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/stockicon.png"))); // NOI18N
        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });
        getContentPane().add(stock);
        stock.setBounds(590, 10, 120, 150);

        payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/payment.png"))); // NOI18N
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });
        getContentPane().add(payment);
        payment.setBounds(710, 10, 120, 150);

        jobList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/Joblist.png"))); // NOI18N
        jobList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobListActionPerformed(evt);
            }
        });
        getContentPane().add(jobList);
        jobList.setBounds(470, 10, 120, 150);

        reports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/reportsicon.png"))); // NOI18N
        reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsActionPerformed(evt);
            }
        });
        getContentPane().add(reports);
        reports.setBounds(830, 10, 110, 150);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1300, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        //Creating a new Login menu when the logout button is hit
        Pin pin = new Pin();
        try {
            //Closing the database connection
            db.close();
        } catch (SQLException ex) {
            //Show an error if the connection cannot be closed
            Logger.getLogger(ForePerson.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Open the Login menu
        pin.setVisible(true);
        //Close this menu
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void createJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJobActionPerformed
        //Create a new Create Job panel 
        CreateJob createjob = new CreateJob(db);
        //Places the new JPanel within this JFrame
        this.getContentPane().add(createjob);
        //Refresh the JFrame
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_createJobActionPerformed

    private void invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceActionPerformed
        //Create a new Invoice JPanel
        Invoice invoicePanel = new Invoice(db);
        //Places the new JPanel within this JFrame
        this.getContentPane().add(invoicePanel);
        //Refresh the JFrame
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_invoiceActionPerformed

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed
        //Creates a new Stock JPanel
        Stock stockpanel = new Stock(db);
        //Places the new JPanel within this JFrame
        this.getContentPane().add(stockpanel);
        //Refresh the JFrame
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_stockActionPerformed

    private void jobListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobListActionPerformed
        //Creates a new Job List Panel
        JobList jobListPanel = new JobList(this, db);
        //Places the new JPanel within this JFrame
        this.getContentPane().add(jobListPanel);
        //Refresh the JFrame
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_jobListActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        //Creates a new Payment Panel
        Payment paymentPanel = new Payment(db);
        //Places the new JPanel within this JFrame
        this.getContentPane().add(paymentPanel);
        //Refresh the JFrame
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_paymentActionPerformed

    private void reportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsActionPerformed
        //Creates a new Reports Panel
        SparePartReport generatereportpanel = new SparePartReport(db);
        //Places the new JPanel within this JFrame
        this.getContentPane().add(generatereportpanel);
        //Refresh the JFrame
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_reportsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createJob;
    private javax.swing.JButton invoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jobList;
    private javax.swing.JButton logout;
    private javax.swing.JButton payment;
    private javax.swing.JButton reports;
    private javax.swing.JButton stock;
    // End of variables declaration//GEN-END:variables
}