package garits;

public class RestoreDB extends javax.swing.JPanel {
    DBConnect db;
    public RestoreDB(DBConnect db) {
        //Setting up all the componets within this JFrame
        initComponents();
        //Passing in the database connection
        this.db = db;
        //Removing the background from the JButtons and JPanel
        restoreButton.setOpaque(false);
        restoreButton.setContentAreaFilled(false); 
        restoreButton.setBorderPainted(false);
        closeButton.setOpaque(false);
        closeButton.setContentAreaFilled(false); 
        closeButton.setBorderPainted(false);
        controlPanel.setOpaque(false);
        //Setting the size of the JPanel
        this.setSize(1300, 900);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        controlPanel = new javax.swing.JPanel();
        restoreButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        restoreLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        restoreButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/restoreDB.png"))); // NOI18N
        restoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreButtonActionPerformed(evt);
            }
        });

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        restoreLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        restoreLabel.setText("Select Restore Files:");

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(restoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(restoreLabel)))
                .addContainerGap(422, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(restoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(restoreButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        add(controlPanel);
        controlPanel.setBounds(360, 290, 820, 430);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1300, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void restoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreButtonActionPerformed
        try{
           //A string variable which will get the location of the back up file 
           String str = "C:/xampp/mysql/bin/mysql -u root garits < C:/Users/shahzad/Desktop/test.sql";
           //Execute the query on cmd
           Process process = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c",str});
       }catch(Exception ex){
           //Print out an error message to the terminal
           ex.printStackTrace();
       }
    }//GEN-LAST:event_restoreButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        //Closes the JPanel
        this.setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton restoreButton;
    private javax.swing.JLabel restoreLabel;
    // End of variables declaration//GEN-END:variables
}
