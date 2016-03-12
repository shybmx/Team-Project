package garits;

public class Jobs extends javax.swing.JFrame {

    String pin;
    
    public Jobs() {
        initComponents();
        searchButton.setOpaque(false);
        searchButton.setContentAreaFilled(false); 
        searchButton.setBorderPainted(false);
        close.setOpaque(false);
        close.setContentAreaFilled(false); 
        close.setBorderPainted(false);
        add.setOpaque(false);
        add.setContentAreaFilled(false); 
        add.setBorderPainted(false);
        create.setOpaque(false);
        create.setContentAreaFilled(false); 
        create.setBorderPainted(false);
        this.setSize(1300, 900);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        searchCustomer = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        regNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dateBookedIn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        make = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        model = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        customerName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        telephone = new javax.swing.JTextField();
        jobTypes = new javax.swing.JComboBox();
        add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jobList = new javax.swing.JList();
        jLabel8 = new javax.swing.JLabel();
        estimatedTime = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        create = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        searchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(searchCustomer);
        searchCustomer.setBounds(123, 6, 259, 40);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Customer:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 6, 111, 32);

        searchButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\searchicon.png")); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton);
        searchButton.setBounds(388, 6, 114, 139);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel2.setText("Vehicle Reg.No:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(6, 186, 173, 32);

        regNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regNoActionPerformed(evt);
            }
        });
        getContentPane().add(regNo);
        regNo.setBounds(228, 187, 144, 39);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel3.setText("Date Booked In:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(378, 186, 172, 32);

        dateBookedIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateBookedInActionPerformed(evt);
            }
        });
        getContentPane().add(dateBookedIn);
        dateBookedIn.setBounds(550, 186, 175, 40);

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel4.setText("Make:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(6, 232, 64, 32);
        getContentPane().add(make);
        make.setBounds(228, 232, 144, 40);

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel5.setText("Model:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(378, 232, 72, 32);
        getContentPane().add(model);
        model.setBounds(550, 238, 175, 39);

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel6.setText("Customer name:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(6, 281, 178, 32);
        getContentPane().add(customerName);
        customerName.setBounds(228, 281, 144, 41);

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel7.setText("Telephone:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(378, 281, 121, 32);
        getContentPane().add(telephone);
        telephone.setBounds(550, 283, 175, 39);

        jobTypes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jobTypes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobTypesActionPerformed(evt);
            }
        });
        getContentPane().add(jobTypes);
        jobTypes.setBounds(6, 446, 93, 26);

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(105, 445, 49, 28);

        jobList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jobList);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(6, 479, 148, 119);

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel8.setText("Estimated Time:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(6, 331, 173, 32);
        getContentPane().add(estimatedTime);
        estimatedTime.setBounds(228, 331, 144, 42);

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel10.setText("Work Required:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(6, 395, 168, 32);

        create.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\createicon.png")); // NOI18N
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        getContentPane().add(create);
        create.setBounds(488, 455, 116, 143);

        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\closeicon.png")); // NOI18N
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(610, 455, 115, 143);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\background.jpg")); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 1965, 910);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchCustomerActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        if(pin == "1234"){
          MainMenu menu = new MainMenu ();
        menu.setVisible(true);
        this.setVisible(false);  
        }else if(pin == "6969"){
            System.out.println("wejuhdj");
            ReceptionistMenu repmenu = new ReceptionistMenu();
            repmenu.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_closeActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createActionPerformed

    private void regNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regNoActionPerformed

    private void dateBookedInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateBookedInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateBookedInActionPerformed

    private void jobTypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobTypesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jobTypesActionPerformed

    public void check(String x){
        pin = x;
        System.out.println("aduiyshgde");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton close;
    private javax.swing.JButton create;
    private javax.swing.JTextField customerName;
    private javax.swing.JTextField dateBookedIn;
    private javax.swing.JTextField estimatedTime;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList jobList;
    private javax.swing.JComboBox jobTypes;
    private javax.swing.JTextField make;
    private javax.swing.JTextField model;
    private javax.swing.JTextField regNo;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchCustomer;
    private javax.swing.JTextField telephone;
    // End of variables declaration//GEN-END:variables
}