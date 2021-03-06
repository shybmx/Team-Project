package garits;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class BackupDB extends javax.swing.JPanel {

    DBConnect db;
    PreparedStatement prestate;

    public BackupDB(DBConnect db) {
        //Sets up all the componets within the JFrame
        initComponents();
        //Passes in the connection to the database
        this.db = db;
        //removes the background from all the JButtons
        backUpButton.setOpaque(false);
        backUpButton.setContentAreaFilled(false);
        backUpButton.setBorderPainted(false);
        closeButton.setOpaque(false);
        closeButton.setContentAreaFilled(false);
        closeButton.setBorderPainted(false);
        controlPanel.setOpaque(false);
        //Sets the size of the JFrame
        this.setSize(1300, 900);
    }

    //This method is used for automatic backup
    public void backup() {
        try {
            //Creating a string variable of the path where the backup file is going to be placed
            String str = "C:/xampp/mysql/bin/mysqldump -u root garits > C:/Users/shahzad/Desktop/test.sql";
            //Passing in the String into CMD 
            Process process = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", str});
        } catch (Exception ex) {
            //Prints out an error if the path is incorrect
            JOptionPane.showMessageDialog(null, "Cannot file path");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        controlPanel = new javax.swing.JPanel();
        backUpButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        restoreLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        backUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/backupIcon.png"))); // NOI18N
        backUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backUpButtonActionPerformed(evt);
            }
        });

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        restoreLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        restoreLabel.setText("Select Backup Files:");

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(backUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(restoreLabel)))
                .addContainerGap(347, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(restoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(closeButton))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        add(controlPanel);
        controlPanel.setBounds(290, 400, 820, 430);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1300, 900);
    }// </editor-fold>//GEN-END:initComponents

    //This method is used for on demand backup
    private void backUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backUpButtonActionPerformed
        try {
            //Creating a string variable of the path where the backup file is going to be placed
            String str = "C:/xampp/mysql/bin/mysqldump -u root garits > C:/Users/shahzad/Desktop/test.sql";
            //Passing in the String into CMD 
            Process process = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", str});
        } catch (Exception ex) {
            //Prints out an error if the path is incorrect
            JOptionPane.showMessageDialog(null, "Cannot file path");
        }
    }//GEN-LAST:event_backUpButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        //Making the current JPanel invisable
        this.setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backUpButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel restoreLabel;
    // End of variables declaration//GEN-END:variables
}
