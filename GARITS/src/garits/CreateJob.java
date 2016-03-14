package garits;

public class CreateJob extends javax.swing.JPanel {

    public CreateJob() {
        initComponents();
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
        this.setSize(1300, 900);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchCustomer = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        vehicleRegNo = new javax.swing.JTextField();
        make = new javax.swing.JTextField();
        customerName = new javax.swing.JTextField();
        estimatedTime = new javax.swing.JTextField();
        dateBookedIn = new javax.swing.JTextField();
        model = new javax.swing.JTextField();
        telephone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        add = new javax.swing.JButton();
        create = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setLayout(null);
        add(searchCustomer);
        searchCustomer.setBounds(420, 270, 180, 30);

        search.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\searchicon.png")); // NOI18N
        add(search);
        search.setBounds(610, 270, 116, 145);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Customer:");
        add(jLabel2);
        jLabel2.setBounds(290, 270, 120, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Vehicle Reg.No:");
        add(jLabel3);
        jLabel3.setBounds(280, 430, 173, 32);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Make:");
        add(jLabel1);
        jLabel1.setBounds(280, 470, 64, 32);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Customer Name:");
        add(jLabel4);
        jLabel4.setBounds(280, 510, 181, 32);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Estimated Time:");
        add(jLabel5);
        jLabel5.setBounds(280, 550, 173, 32);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("Dated Booked In:");
        add(jLabel6);
        jLabel6.setBounds(800, 430, 186, 32);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setText("Model");
        add(jLabel7);
        jLabel7.setBounds(800, 470, 65, 32);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setText("Telephone:");
        add(jLabel8);
        jLabel8.setBounds(800, 510, 121, 32);
        add(vehicleRegNo);
        vehicleRegNo.setBounds(470, 430, 217, 32);
        add(make);
        make.setBounds(470, 480, 217, 31);
        add(customerName);
        customerName.setBounds(470, 520, 217, 31);
        add(estimatedTime);
        estimatedTime.setBounds(470, 560, 217, 31);
        add(dateBookedIn);
        dateBookedIn.setBounds(1000, 430, 217, 31);
        add(model);
        model.setBounds(1000, 470, 217, 31);
        add(telephone);
        telephone.setBounds(1000, 510, 217, 31);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setText("Work Required:");
        add(jLabel9);
        jLabel9.setBounds(280, 640, 168, 32);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox1);
        jComboBox1.setBounds(280, 670, 168, 24);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        add(jScrollPane1);
        jScrollPane1.setBounds(280, 700, 168, 139);

        add.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\add.png")); // NOI18N
        add(add);
        add.setBounds(460, 640, 120, 144);

        create.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\createicon.png")); // NOI18N
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        add(create);
        create.setBounds(990, 640, 116, 144);

        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\closeicon.png")); // NOI18N
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        add(close);
        close.setBounds(1110, 640, 106, 144);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\background.jpg")); // NOI18N
        add(jLabel10);
        jLabel10.setBounds(0, 0, 1920, 1200);
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

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
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField make;
    private javax.swing.JTextField model;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchCustomer;
    private javax.swing.JTextField telephone;
    private javax.swing.JTextField vehicleRegNo;
    // End of variables declaration//GEN-END:variables
}