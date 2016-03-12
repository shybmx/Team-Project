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
        viewReport.setOpaque(false);
        viewReport.setContentAreaFilled(false); 
        viewReport.setBorderPainted(false);
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
        viewReport = new javax.swing.JButton();
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
        logout.setBounds(800, 10, 114, 150);

        viewReport.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\createicon.png")); // NOI18N
        viewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReportActionPerformed(evt);
            }
        });
        getContentPane().add(viewReport);
        viewReport.setBounds(208, 6, 114, 157);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\imageedit_1_5745129201.gif")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 202, 205);

        invoice.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\invoiceicon.png")); // NOI18N
        getContentPane().add(invoice);
        invoice.setBounds(320, 10, 120, 150);

        stock.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\stockicon.png")); // NOI18N
        getContentPane().add(stock);
        stock.setBounds(560, 10, 120, 150);

        payment.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\payment.png")); // NOI18N
        getContentPane().add(payment);
        payment.setBounds(680, 10, 120, 150);

        jobList.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\Joblist.png")); // NOI18N
        getContentPane().add(jobList);
        jobList.setBounds(440, 10, 120, 150);

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

    private void viewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewReportActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton invoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jobList;
    private javax.swing.JButton logout;
    private javax.swing.JButton payment;
    private javax.swing.JButton stock;
    private javax.swing.JButton viewReport;
    // End of variables declaration//GEN-END:variables
}