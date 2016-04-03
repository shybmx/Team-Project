package garits;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class MechanicMenu extends javax.swing.JFrame {
    PreparedStatement prestate;
    DBConnect db;
    public MechanicMenu(DBConnect db) {
        initComponents();
        this.db = db;
        editStatus.setOpaque(false);
        editStatus.setContentAreaFilled(false); 
        editStatus.setBorderPainted(false);
        editJobStatusAddWorkDone.setOpaque(false);
        editJobStatusAddWorkDone.setContentAreaFilled(false);
        editJobStatusAddWorkDone.setBorderPainted(false);
        editJobStatusAddParts.setOpaque(false);
        editJobStatusAddParts.setContentAreaFilled(false);
        editJobStatusAddParts.setBorderPainted(false);
        editJobStatusClose.setOpaque(false);
        editJobStatusClose.setContentAreaFilled(false);
        editJobStatusClose.setBorderPainted(false);
        logout.setOpaque(false);
        logout.setContentAreaFilled(false); 
        logout.setBorderPainted(false);
        jobsPanel.setOpaque(false);
        editJobStatusPanel.setVisible(false);
        updateTable();
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        editJobStatusPanel.setOpaque(false);
        jobNumber.setEditable(false);
        this.setSize(1300, 900);
    }
    
    public void updateTable(){
        try{
            prestate = db.conn.prepareStatement("SELECT * FROM jobsheets WHERE Status = 'Pending'");
            ResultSet result = prestate.executeQuery();
            pendingJobTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            pendingJobTable.setModel(DbUtils.resultSetToTableModel(result));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        editStatus = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        editJobStatusPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        editJobStatusWorkDrop = new javax.swing.JComboBox();
        duration = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        editWorkStatusWorkList = new javax.swing.JList();
        editJobStatusAddWorkDone = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        editJobStatusPartsDrop = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        editJobStatusPartsList = new javax.swing.JList();
        editJobStatusAddParts = new javax.swing.JButton();
        editJobStatusClose = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        hourlyRate = new javax.swing.JTextField();
        jobNumber = new javax.swing.JTextField();
        jobsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pendingJobTable = new javax.swing.JTable();
        pendingHeader = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        editStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/editstatusicon.png"))); // NOI18N
        editStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStatusActionPerformed(evt);
            }
        });
        getContentPane().add(editStatus);
        editStatus.setBounds(214, 0, 138, 146);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/logouticon.png"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(358, 0, 138, 146);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/imageedit_1_5745129201.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 202, 205);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Edit Job Status:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Select Work Done:");

        editJobStatusWorkDrop.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Break repair", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Duration:");

        editWorkStatusWorkList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(editWorkStatusWorkList);

        editJobStatusAddWorkDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/add.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("Select Parts Used:");

        editJobStatusPartsDrop.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        editJobStatusPartsList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(editJobStatusPartsList);

        editJobStatusAddParts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/add.png"))); // NOI18N

        editJobStatusClose.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        editJobStatusClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        editJobStatusClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJobStatusCloseActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setText("Hourly Rate:");

        javax.swing.GroupLayout editJobStatusPanelLayout = new javax.swing.GroupLayout(editJobStatusPanel);
        editJobStatusPanel.setLayout(editJobStatusPanelLayout);
        editJobStatusPanelLayout.setHorizontalGroup(
            editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editJobStatusPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editJobStatusAddParts, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                .addComponent(editJobStatusClose, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(editJobStatusPartsDrop, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jobNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(318, Short.MAX_VALUE))
            .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                        .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editJobStatusWorkDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114)
                        .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(duration)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editJobStatusAddWorkDone, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editJobStatusPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(hourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(139, 139, 139))))
        );
        editJobStatusPanelLayout.setVerticalGroup(
            editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                        .addComponent(jobNumber)
                        .addGap(2, 2, 2)))
                .addGap(18, 18, 18)
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                        .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editJobStatusWorkDrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(hourlyRate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(editJobStatusAddWorkDone, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editJobStatusPartsDrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editJobStatusClose, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(editJobStatusAddParts, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(editJobStatusPanel);
        editJobStatusPanel.setBounds(260, 230, 954, 543);

        pendingJobTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(pendingJobTable);

        pendingHeader.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        pendingHeader.setText("Pending Jobs:");

        javax.swing.GroupLayout jobsPanelLayout = new javax.swing.GroupLayout(jobsPanel);
        jobsPanel.setLayout(jobsPanelLayout);
        jobsPanelLayout.setHorizontalGroup(
            jobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jobsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jobsPanelLayout.createSequentialGroup()
                        .addComponent(pendingHeader)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE))
                .addContainerGap())
        );
        jobsPanelLayout.setVerticalGroup(
            jobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jobsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pendingHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        getContentPane().add(jobsPanel);
        jobsPanel.setBounds(10, 290, 1010, 480);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1300, 960);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStatusActionPerformed
         try{
            int index = pendingJobTable.getSelectedRow();
            jobNumber.setText(pendingJobTable.getValueAt(index, 0).toString());
            jobsPanel.setVisible(false);
            editJobStatusPanel.setVisible(true);
         }catch(Exception ex){
             JOptionPane.showMessageDialog(null, "Please select a job you wish to start on");
         }
    }//GEN-LAST:event_editStatusActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Pin logout = new  Pin();
        logout.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void editJobStatusCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJobStatusCloseActionPerformed
        editJobStatusPanel.setVisible(false);
        jobsPanel.setVisible(true);
    }//GEN-LAST:event_editJobStatusCloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField duration;
    private javax.swing.JButton editJobStatusAddParts;
    private javax.swing.JButton editJobStatusAddWorkDone;
    private javax.swing.JButton editJobStatusClose;
    private javax.swing.JPanel editJobStatusPanel;
    private javax.swing.JComboBox editJobStatusPartsDrop;
    private javax.swing.JList editJobStatusPartsList;
    private javax.swing.JComboBox editJobStatusWorkDrop;
    private javax.swing.JButton editStatus;
    private javax.swing.JList editWorkStatusWorkList;
    private javax.swing.JTextField hourlyRate;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jobNumber;
    private javax.swing.JPanel jobsPanel;
    private javax.swing.JButton logout;
    private javax.swing.JLabel pendingHeader;
    private javax.swing.JTable pendingJobTable;
    // End of variables declaration//GEN-END:variables
}