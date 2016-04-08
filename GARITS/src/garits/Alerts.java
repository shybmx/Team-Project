package garits;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Alerts extends javax.swing.JPanel {

    DBConnect db;
    PreparedStatement prestate;

    public Alerts(DBConnect db) {
        initComponents();
        this.db = db;
        this.setSize(1300, 900);
        updateTable();
        generate.setOpaque(false);
        generate.setContentAreaFilled(false);
        generate.setBorderPainted(false);
        close.setOpaque(false);
        close.setContentAreaFilled(false);
        close.setBorderPainted(false);
        paymentDuePanel.setOpaque(false);
    }

    public void updateTable() {
        try {
            prestate = db.conn.prepareStatement("SELECT `customers`.`name`, `customers`.`address`, "
                    + "`jobsheets`.`VehicleRegNumber`, `job completed`.`Grand Total` FROM `jobsheets` "
                    + "INNER join `customers` on `customers`.`name` = `jobsheets`.`customer` INNER JOIN `job completed` "
                    + "On `job completed`.`job_number` = `jobsheets`.`job_number` where `jobsheets`.`hasPaid` = 'No' "
                    + "and `Reminder count` = '1' or `Reminder count` = '2' or `Reminder count` = '3' ");
            ResultSet result = prestate.executeQuery();
            paymentDue.setModel(DbUtils.resultSetToTableModel(result));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paymentDuePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        paymentDue = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        generate = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        paymentDue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(paymentDue);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Payment Due:");

        generate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/generate.png"))); // NOI18N
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paymentDuePanelLayout = new javax.swing.GroupLayout(paymentDuePanel);
        paymentDuePanel.setLayout(paymentDuePanelLayout);
        paymentDuePanelLayout.setHorizontalGroup(
            paymentDuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentDuePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(paymentDuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(paymentDuePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        paymentDuePanelLayout.setVerticalGroup(
            paymentDuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentDuePanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(paymentDuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paymentDuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(close, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        add(paymentDuePanel);
        paymentDuePanel.setBounds(130, 350, 1040, 500);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1300, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        try {
            int index = paymentDue.getSelectedRow();
            String name = paymentDue.getValueAt(index, 0).toString();
            String address = paymentDue.getValueAt(index, 1).toString();
            String vehReg = paymentDue.getValueAt(index, 2).toString();
            String grandTotal = paymentDue.getValueAt(index, 3).toString();
            prestate = db.conn.prepareStatement("SELECT `Reminder count` FROM `jobsheets` WHERE `Customer` = '" + name + "' AND  `hasPaid` = 'no' AND `Status` = 'Complete'   ");
            ResultSet rs1 = prestate.executeQuery();
            rs1.next();
            int count = rs1.getInt("Reminder count");
            System.out.println(count);
            if (count == 1) {
                System.out.println();
                File file = new File("/Users/shahzad/Desktop/FirstReminder.txt");
                FileWriter fr = new FileWriter(file.getAbsoluteFile());
                BufferedWriter out = new BufferedWriter(fr);
                out.write(name);
                out.newLine();
                out.write(address);
                out.newLine(); 
                out.newLine(); 
                out.write("Dear " + name+",");
                out.newLine(); out.newLine();
                out.write("First Reminder");
                out.newLine(); 
                out.write("Vehicle Registration No . " + vehReg);
                out.newLine();
                out.write("Amount " + "£" + grandTotal);
                out.newLine(); out.newLine();
                out.write("According to our records, it appears that we have not yet received a payment of the amount above for the vehicle(s) stated");
                out.newLine();
                out.write("We would appreciate payment at your earliest convenience.");
                out.newLine();
                out.newLine();
                out.write("If you have already sent a payment to us recently, please accept our apologies.");
                out.newLine();
                out.newLine();
                out.write("Yours sincerely,");
                out.newLine();
                out.newLine();
                out.write("G.Lancaster");
                out.close();
                prestate = db.conn.prepareStatement("UPDATE `jobsheets` SET `Reminder count` = '2' WHERE Customer='"+name+"' AND `hasPaid` = 'No' ");
                prestate.execute();
                JOptionPane.showMessageDialog(null, "Report has been created");
            } else if (count == 2) {
                File file = new File("/Users/shahzad/Desktop/SecondReminder.txt");
                FileWriter fr = new FileWriter(file.getAbsoluteFile());
                BufferedWriter out = new BufferedWriter(fr);
                out.write(name);
                out.newLine();
                out.write(address);
                out.newLine();
                out.newLine();
                out.write("Dear " + name+",");
                out.newLine(); 
                out.newLine();
                out.write("Second Reminder");
                out.newLine();
                out.write("Vehicle Registration No . " + vehReg);
                out.newLine();
                out.write("Amount " + "£" + grandTotal);
                out.newLine(); 
                out.newLine();
                out.write("It appears that we still have not yet received a payment of the amount above for the work done on the");
                out.newLine();
                out.write("vehicle(s) stated, despite a reminder letter posted to you last month.");
                out.newLine();
                out.write("We would appreciate if you would settle this invoice in full by return.");
                out.newLine();
                out.newLine();
                out.write("If you have already sent a payment to us recently, please accept our apologies.");
                out.newLine();
                out.newLine();
                out.write("Yours sincerely,");
                out.newLine();
                out.newLine();
                out.write("G.Lancaster");
                out.close();
                prestate = db.conn.prepareStatement("UPDATE `jobsheets` SET `Reminder count` = '3' WHERE Customer='"+name+"' AND `hasPaid` = 'No' ");
                prestate.execute();
                JOptionPane.showMessageDialog(null, "Report has been created");
            } else if (count == 3) {
                File file = new File("/Users/shahzad/Desktop/ThirdReminder.txt");
                FileWriter fr = new FileWriter(file.getAbsoluteFile());
                BufferedWriter out = new BufferedWriter(fr);
                out.write(name);
                out.newLine();
                out.write(address);
                out.newLine();
                out.newLine();
                out.write("Dear " + name+",");
                out.newLine();
                out.newLine();
                out.write("Final Reminder");
                out.newLine();
                out.write("Vehicle Registration No . " + vehReg);
                out.newLine();
                out.write("Amount " + "£" + grandTotal);
                out.newLine();
                out.newLine();
                out.write("Despite two reminders, it appears that we still have not yet received payment for the above, which was posted to you last month for work done");
                out.write("on the vehicle(s) listed above.");
                out.newLine();
                out.write("Unless you pay the outstanding amount in full within SEVEN DAYS, or contact us with proposals for repayment, we will have"); out.newLine();
                out.write("no option but to reer the matter to our solicitor.");
                out.newLine(); out.newLine();
                out.write("Please send payment immediately to avoid further action.");
                out.newLine();
                out.newLine();
                out.write("Yours sincerely,");
                out.newLine();
                out.newLine();
                out.write("G.Lancaster");
                out.close();
                prestate = db.conn.prepareStatement("UPDATE `jobsheets` SET `Reminder count` = '4' WHERE Customer='"+name+"' AND `hasPaid` = 'No' ");
                prestate.execute();
                JOptionPane.showMessageDialog(null, "Report has been created");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_generateActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        paymentDuePanel.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JButton generate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable paymentDue;
    private javax.swing.JPanel paymentDuePanel;
    // End of variables declaration//GEN-END:variables
}
