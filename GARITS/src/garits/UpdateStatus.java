package garits;

public class UpdateStatus extends javax.swing.JFrame {

    public UpdateStatus() {
        initComponents();
        addTask.setOpaque(false);
        addTask.setContentAreaFilled(false); 
        addTask.setBorderPainted(false);
        addPart.setOpaque(false);
        addPart.setContentAreaFilled(false); 
        addPart.setBorderPainted(false);
        close.setOpaque(false);
        close.setContentAreaFilled(false); 
        close.setBorderPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        garageTasks = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        taskList = new javax.swing.JList();
        addTask = new javax.swing.JButton();
        taskHeader = new javax.swing.JLabel();
        taskDuration = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        partsHeader = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        partsList = new javax.swing.JList();
        spareParts = new javax.swing.JComboBox();
        addPart = new javax.swing.JButton();
        durationHeader = new javax.swing.JLabel();
        formTitle = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        garageTasks.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(garageTasks);
        garageTasks.setBounds(0, 154, 138, 26);

        taskList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(taskList);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 187, 358, 147);

        addTask.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\add.png")); // NOI18N
        addTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTaskActionPerformed(evt);
            }
        });
        getContentPane().add(addTask);
        addTask.setBounds(364, 187, 120, 147);

        taskHeader.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        taskHeader.setText("Select work done");
        getContentPane().add(taskHeader);
        taskHeader.setBounds(0, 115, 185, 32);

        taskDuration.setText("0000000");
        getContentPane().add(taskDuration);
        taskDuration.setBounds(267, 153, 91, 28);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 770, 0, 0);

        partsHeader.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        partsHeader.setText("Select parts used ");
        getContentPane().add(partsHeader);
        partsHeader.setBounds(6, 346, 195, 32);

        partsList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(partsList);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(6, 428, 352, 143);

        spareParts.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(spareParts);
        spareParts.setBounds(6, 390, 138, 26);

        addPart.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\add.png")); // NOI18N
        addPart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPartActionPerformed(evt);
            }
        });
        getContentPane().add(addPart);
        addPart.setBounds(364, 428, 120, 143);

        durationHeader.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        durationHeader.setText("Duration");
        getContentPane().add(durationHeader);
        durationHeader.setBounds(267, 115, 91, 32);

        formTitle.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        formTitle.setText("UPDATE JOB STATUS");
        getContentPane().add(formTitle);
        formTitle.setBounds(130, 6, 248, 32);

        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\closeicon.png")); // NOI18N
        getContentPane().add(close);
        close.setBounds(610, 310, 120, 150);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\background.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 570, 790);

        jButton1.setText("jButton1");
        getContentPane().add(jButton1);
        jButton1.setBounds(860, 210, 73, 28);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTaskActionPerformed
    
    }//GEN-LAST:event_addTaskActionPerformed

    private void addPartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPartActionPerformed
        
    }//GEN-LAST:event_addPartActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPart;
    private javax.swing.JButton addTask;
    private javax.swing.JButton close;
    private javax.swing.JLabel durationHeader;
    private javax.swing.JLabel formTitle;
    private javax.swing.JComboBox garageTasks;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel partsHeader;
    private javax.swing.JList partsList;
    private javax.swing.JComboBox spareParts;
    private javax.swing.JTextField taskDuration;
    private javax.swing.JLabel taskHeader;
    private javax.swing.JList taskList;
    // End of variables declaration//GEN-END:variables
}