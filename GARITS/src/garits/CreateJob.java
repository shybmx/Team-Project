package garits;

public class CreateJob extends javax.swing.JPanel {

    public CreateJob() {
        initComponents();
        this.repaint();
        add.setOpaque(false);
        add.setContentAreaFilled(false); 
        add.setBorderPainted(false);
        close.setOpaque(false);
        close.setContentAreaFilled(false); 
        close.setBorderPainted(false);
        create.setOpaque(false);
        create.setContentAreaFilled(false); 
        create.setBorderPainted(false);
        search.setOpaque(false);
        search.setContentAreaFilled(false); 
        search.setBorderPainted(false);
        addButtonPanel.setOpaque(false);
        buttons2.setOpaque(false);
        formPanel1.setOpaque(false);
        formPanel2.setOpaque(false);
        searchPanel.setOpaque(false);
        workDonePanel.setOpaque(false);
        this.setSize(1300, 900);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchCustomer = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        formPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        vehicleRegNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        make = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        customerName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        estimatedTime = new javax.swing.JTextField();
        workDonePanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        addButtonPanel = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        formPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        dateBookedIn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        model = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        telephone = new javax.swing.JTextField();
        buttons2 = new javax.swing.JPanel();
        create = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Customer:");
        searchPanel.add(jLabel2);

        searchCustomer.setPreferredSize(new java.awt.Dimension(200, 30));
        searchPanel.add(searchCustomer);

        search.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\searchicon.png")); // NOI18N
        search.setPreferredSize(new java.awt.Dimension(120, 155));
        searchPanel.add(search);

        add(searchPanel);
        searchPanel.setBounds(450, 110, 510, 170);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Vehicle Reg.No:");

        vehicleRegNo.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Make:");

        make.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Customer Name:");

        customerName.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Estimated Time:");

        estimatedTime.setPreferredSize(new java.awt.Dimension(200, 30));

        javax.swing.GroupLayout formPanel1Layout = new javax.swing.GroupLayout(formPanel1);
        formPanel1.setLayout(formPanel1Layout);
        formPanel1Layout.setHorizontalGroup(
            formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(make, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehicleRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estimatedTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        formPanel1Layout.setVerticalGroup(
            formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(vehicleRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(make, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(estimatedTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        add(formPanel1);
        formPanel1.setBounds(210, 300, 420, 190);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setText("Work Required:");
        workDonePanel.add(jLabel9);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(150, 30));
        workDonePanel.add(jComboBox1);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setPreferredSize(new java.awt.Dimension(200, 85));
        jScrollPane1.setViewportView(jList1);

        workDonePanel.add(jScrollPane1);

        add(workDonePanel);
        workDonePanel.setBounds(210, 500, 220, 250);

        add.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\add.png")); // NOI18N
        add.setPreferredSize(new java.awt.Dimension(120, 155));
        addButtonPanel.add(add);

        add(addButtonPanel);
        addButtonPanel.setBounds(400, 560, 220, 170);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("Dated Booked In:");

        dateBookedIn.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setText("Model:");

        model.setMinimumSize(new java.awt.Dimension(200, 30));
        model.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setText("Telephone:");

        telephone.setPreferredSize(new java.awt.Dimension(200, 30));

        javax.swing.GroupLayout formPanel2Layout = new javax.swing.GroupLayout(formPanel2);
        formPanel2.setLayout(formPanel2Layout);
        formPanel2Layout.setHorizontalGroup(
            formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateBookedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formPanel2Layout.setVerticalGroup(
            formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dateBookedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );

        add(formPanel2);
        formPanel2.setBounds(650, 300, 420, 140);

        create.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\createicon.png")); // NOI18N
        create.setPreferredSize(new java.awt.Dimension(120, 155));
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        buttons2.add(create);

        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\closeicon.png")); // NOI18N
        close.setPreferredSize(new java.awt.Dimension(120, 155));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        buttons2.add(close);

        add(buttons2);
        buttons2.setBounds(770, 570, 290, 170);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\background.jpg")); // NOI18N
        add(jLabel10);
        jLabel10.setBounds(0, 0, 1300, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JPanel addButtonPanel;
    private javax.swing.JPanel buttons2;
    private javax.swing.JButton close;
    private javax.swing.JButton create;
    private javax.swing.JTextField customerName;
    private javax.swing.JTextField dateBookedIn;
    private javax.swing.JTextField estimatedTime;
    private javax.swing.JPanel formPanel1;
    private javax.swing.JPanel formPanel2;
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
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField make;
    private javax.swing.JTextField model;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchCustomer;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTextField telephone;
    private javax.swing.JTextField vehicleRegNo;
    private javax.swing.JPanel workDonePanel;
    // End of variables declaration//GEN-END:variables
}