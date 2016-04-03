package garits;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class JobList extends javax.swing.JPanel {
    JFrame myFrame;
    DBConnect db;
    PreparedStatement prestate;
     Vector<String> vec = new Vector<>();
     Vector<String> vec2 = new Vector<>();
    public JobList(JFrame frame, DBConnect db) {
        initComponents();
        myFrame = frame;
        this.db = db;
        this.repaint();
        editJobAddNewWorkDone.setOpaque(false);
        editJobAddNewWorkDone.setContentAreaFilled(false);
        editJobAddNewWorkDone.setBorderPainted(false);
        close.setOpaque(false);
        close.setContentAreaFilled(false); 
        close.setBorderPainted(false);
        editJob.setOpaque(false);
        editJob.setContentAreaFilled(false); 
        editJob.setBorderPainted(false);
        editJobUpdate.setOpaque(false);
        editJobUpdate.setContentAreaFilled(false); 
        editJobUpdate.setBorderPainted(false);
        editJobClose.setOpaque(false);
        editJobClose.setContentAreaFilled(false); 
        editJobClose.setBorderPainted(false);
        editStatus.setOpaque(false);
        editStatus.setContentAreaFilled(false); 
        editStatus.setBorderPainted(false);
        buttons.setOpaque(false);
        editJobPanel.setVisible(false);
        editJobForm1.setVisible(false);
        editJobForm2.setVisible(false);
        editJobWorkDone.setVisible(false);
        editJobButtons.setVisible(false);
        editJobPanel.setOpaque(false);
        editJobForm1.setOpaque(false);
        editJobForm2.setOpaque(false);
        editJobWorkDone.setOpaque(false);
        editJobButtons.setOpaque(false);
        editJobCustomerID.setEditable(false);
        editJobCustomerName.setEditable(false);
        editJobCustomerName.setEditable(false);
        editJobDateBookedIn.setEditable(false);
        updateTable();
        this.setSize(1300, 900);
    }
    
    public void updateTable(){
        try{
            prestate = db.conn.prepareStatement("SELECT * FROM `jobsheets`");
            ResultSet result = prestate.executeQuery();
            jobListTable.setModel(DbUtils.resultSetToTableModel(result));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttons = new javax.swing.JPanel();
        editJob = new javax.swing.JButton();
        editStatus = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jobListTable = new javax.swing.JTable();
        searchCustomerName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searchCarNumber = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        editJobPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        editJobForm1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        editJobVehicleRegNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        editJobMake = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        editJobCustomerName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        editJobEstimatedTime = new javax.swing.JTextField();
        editJobForm2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        editJobDateBookedIn = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        editJobModel = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        editJobTelephone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        editJobCustomerID = new javax.swing.JTextField();
        editJobWorkDone = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        editJobWorkDoneListCurrent = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        editJobWorkDoneListNew = new javax.swing.JList();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        editJobDropDown = new javax.swing.JComboBox();
        editStatusRemoveCurrent = new javax.swing.JButton();
        editJobButtons = new javax.swing.JPanel();
        editJobUpdate = new javax.swing.JButton();
        editJobClose = new javax.swing.JButton();
        editJobAddNewWorkDone = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        editJob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/editjob.png"))); // NOI18N
        editJob.setPreferredSize(new java.awt.Dimension(120, 155));
        editJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJobActionPerformed(evt);
            }
        });

        editStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/editstatusicon.png"))); // NOI18N
        editStatus.setPreferredSize(new java.awt.Dimension(140, 155));
        editStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStatusActionPerformed(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        close.setPreferredSize(new java.awt.Dimension(120, 155));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jobListTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jobListTable);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Customer Name:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Car Number:");

        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsLayout = new javax.swing.GroupLayout(buttons);
        buttons.setLayout(buttonsLayout);
        buttonsLayout.setHorizontalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(editJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(editStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonsLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(searchCarNumber))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(170, 170, 170))))
        );
        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(buttonsLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchCustomerName))
                        .addGap(2, 2, 2)
                        .addComponent(jButton1)
                        .addGap(4, 4, 4)
                        .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(searchCarNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(buttons);
        buttons.setBounds(10, 330, 1280, 520);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Edit Job");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Vehicle Reg.No:");

        editJobVehicleRegNo.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("Make:");

        editJobMake.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setText("Customer Name:");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setText("Estimated Time:");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setText("Date Booked In:");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel10.setText("Model:");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel11.setText("Telephone");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel13.setText("Job Number:");

        javax.swing.GroupLayout editJobForm2Layout = new javax.swing.GroupLayout(editJobForm2);
        editJobForm2.setLayout(editJobForm2Layout);
        editJobForm2Layout.setHorizontalGroup(
            editJobForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editJobForm2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editJobForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(editJobForm2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editJobModel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editJobForm2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editJobTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editJobForm2Layout.createSequentialGroup()
                        .addGroup(editJobForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(editJobForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editJobCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editJobDateBookedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        editJobForm2Layout.setVerticalGroup(
            editJobForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editJobForm2Layout.createSequentialGroup()
                .addGroup(editJobForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(editJobCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(editJobForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(editJobDateBookedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(editJobForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(editJobModel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editJobForm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(editJobTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout editJobForm1Layout = new javax.swing.GroupLayout(editJobForm1);
        editJobForm1.setLayout(editJobForm1Layout);
        editJobForm1Layout.setHorizontalGroup(
            editJobForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editJobForm1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(editJobForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editJobForm1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editJobEstimatedTime, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editJobForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(editJobForm1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editJobCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editJobForm1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editJobMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editJobForm1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editJobVehicleRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(editJobForm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        editJobForm1Layout.setVerticalGroup(
            editJobForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editJobForm1Layout.createSequentialGroup()
                .addGroup(editJobForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editJobForm1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(editJobForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(editJobVehicleRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(editJobForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editJobMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(editJobForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(editJobCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(editJobForm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(editJobEstimatedTime, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(editJobForm2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel12.setText("Work required:");

        editJobWorkDoneListCurrent.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(editJobWorkDoneListCurrent);

        editJobWorkDoneListNew.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(editJobWorkDoneListNew);

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel14.setText("Current:");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel15.setText("New:");

        editJobDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Break repair", "Replace exhaust", "Strip head and replace worn valves", "Replace grommet seal" }));
        editJobDropDown.setPreferredSize(new java.awt.Dimension(150, 30));

        editStatusRemoveCurrent.setText("Remove");
        editStatusRemoveCurrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStatusRemoveCurrentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editJobWorkDoneLayout = new javax.swing.GroupLayout(editJobWorkDone);
        editJobWorkDone.setLayout(editJobWorkDoneLayout);
        editJobWorkDoneLayout.setHorizontalGroup(
            editJobWorkDoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editJobWorkDoneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(editJobWorkDoneLayout.createSequentialGroup()
                .addGroup(editJobWorkDoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(editJobWorkDoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editJobWorkDoneLayout.createSequentialGroup()
                        .addGroup(editJobWorkDoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(editJobWorkDoneLayout.createSequentialGroup()
                        .addComponent(editStatusRemoveCurrent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(editJobDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        editJobWorkDoneLayout.setVerticalGroup(
            editJobWorkDoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editJobWorkDoneLayout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(21, 21, 21)
                .addGroup(editJobWorkDoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editJobWorkDoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editStatusRemoveCurrent)
                    .addComponent(editJobDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(editJobWorkDoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        editJobUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/update.png"))); // NOI18N
        editJobUpdate.setPreferredSize(new java.awt.Dimension(120, 155));
        editJobUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJobUpdateActionPerformed(evt);
            }
        });
        editJobButtons.add(editJobUpdate);

        editJobClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        editJobClose.setPreferredSize(new java.awt.Dimension(120, 155));
        editJobClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJobCloseActionPerformed(evt);
            }
        });
        editJobButtons.add(editJobClose);

        editJobAddNewWorkDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/add.png"))); // NOI18N
        editJobAddNewWorkDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJobAddNewWorkDoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editJobPanelLayout = new javax.swing.GroupLayout(editJobPanel);
        editJobPanel.setLayout(editJobPanelLayout);
        editJobPanelLayout.setHorizontalGroup(
            editJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editJobPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(editJobWorkDone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editJobAddNewWorkDone, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editJobButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(editJobPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editJobForm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editJobPanelLayout.createSequentialGroup()
                .addContainerGap(488, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(444, 444, 444))
        );
        editJobPanelLayout.setVerticalGroup(
            editJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editJobPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editJobForm1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(editJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editJobPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(editJobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editJobButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editJobWorkDone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editJobPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editJobAddNewWorkDone, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))))
        );

        add(editJobPanel);
        editJobPanel.setBounds(180, 280, 1020, 590);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1310, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void editStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStatusActionPerformed
        buttons.setVisible(false);
        EditJobStatus editJobStatusPanel = new EditJobStatus();
        myFrame.getContentPane().add(editJobStatusPanel);
    }//GEN-LAST:event_editStatusActionPerformed

    private void editJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJobActionPerformed
        try{
            int index = jobListTable.getSelectedRow();
            editJobCustomerID.setText(jobListTable.getValueAt(index, 0).toString());
            editJobCustomerName.setText(jobListTable.getValueAt(index, 1).toString());
            editJobVehicleRegNo.setText(jobListTable.getValueAt(index, 2).toString());
            editJobMake.setText(jobListTable.getValueAt(index, 3).toString());
            editJobEstimatedTime.setText(jobListTable.getValueAt(index, 4).toString());
            editJobDateBookedIn.setText(jobListTable.getValueAt(index, 5).toString());
            editJobModel.setText(jobListTable.getValueAt(index, 6).toString());
            editJobTelephone.setText(jobListTable.getValueAt(index, 7).toString());
            PreparedStatement prestate = db.conn.prepareStatement("Select Count(*) FROM task where Job_Number = '"+jobListTable.getValueAt(index, 0)+"'");
            ResultSet result = prestate.executeQuery();
            result.next();
            int it = result.getInt("Count(*)");
                  PreparedStatement prestate2 = db.conn.prepareStatement("SELECT * FROM task WHERE Job_Number = '"+jobListTable.getValueAt(index, 0)+"'  ");
                  ResultSet result2 = prestate2.executeQuery();
                 result2.next();
            for(int i = it; i != 0; i--){
                vec.add(result2.getString("task"));
                result2.next();
            }
            editJobWorkDoneListCurrent.setListData(vec);
            buttons.setVisible(false);
            editJobPanel.setVisible(true);
            editJobForm1.setVisible(true);
            editJobForm2.setVisible(true);
            editJobWorkDone.setVisible(true);
            editJobButtons.setVisible(true);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "You must select a job you wish to edit");
        }
    }//GEN-LAST:event_editJobActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editJobUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJobUpdateActionPerformed
       String jobnum = editJobCustomerID.getText();
        try{   
           prestate = db.conn.prepareStatement("UPDATE `jobsheets` SET `VehicleRegNumber`= '"+editJobVehicleRegNo.getText()+"' ,"
                   + "`Make`= '"+editJobMake.getText()+"',`EstimatedTime`= '"+editJobEstimatedTime.getText()+"' ,"
                   + "`Model`= '"+editJobModel.getText()+"' ,`TelephoneNumber`=  '"+editJobTelephone.getText()+"'   "
                   + "WHERE `Job_Number` = '"+jobnum+"'");
           prestate.execute();
           JOptionPane.showMessageDialog(null, "Job Number: " + jobnum + " has been updated");
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null, "Job Number: " + jobnum + " has not been updated");
       }
       
       try{
           for(String t: vec2){
               prestate = db.conn.prepareStatement("INSERT INTO `task` (Job_Number, Task)"
                       + "Values ( '"+jobnum+"', ?  )");
               prestate.setString(1, t);
               prestate.executeUpdate();
               editJobPanel.setVisible(false);
           }
       }catch(Exception ex){
           
       }
    }//GEN-LAST:event_editJobUpdateActionPerformed

    private void editJobCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJobCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_editJobCloseActionPerformed

    private void editJobAddNewWorkDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJobAddNewWorkDoneActionPerformed
        vec2.add(editJobDropDown.getSelectedItem().toString());
        editJobWorkDoneListNew.setListData(vec2);
    }//GEN-LAST:event_editJobAddNewWorkDoneActionPerformed

    private void editStatusRemoveCurrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStatusRemoveCurrentActionPerformed
        String jobnum = editJobCustomerID.getText();
        try{
             
             editJobWorkDoneListCurrent.updateUI();
             prestate = db.conn.prepareStatement("DELETE FROM `Task` WHERE "
                     + " `Job_Number` = '"+jobnum+"' AND `Task` = '"+editJobWorkDoneListCurrent.getSelectedValue().toString()+"' ");
             vec.remove(editJobWorkDoneListCurrent.getSelectedValue().toString()); 
             prestate.execute();
             System.out.println(prestate);
         }catch(Exception ex){
             ex.printStackTrace();
         }
    }//GEN-LAST:event_editStatusRemoveCurrentActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttons;
    private javax.swing.JButton close;
    private javax.swing.JButton editJob;
    private javax.swing.JButton editJobAddNewWorkDone;
    private javax.swing.JPanel editJobButtons;
    private javax.swing.JButton editJobClose;
    private javax.swing.JTextField editJobCustomerID;
    private javax.swing.JTextField editJobCustomerName;
    private javax.swing.JTextField editJobDateBookedIn;
    private javax.swing.JComboBox editJobDropDown;
    private javax.swing.JTextField editJobEstimatedTime;
    private javax.swing.JPanel editJobForm1;
    private javax.swing.JPanel editJobForm2;
    private javax.swing.JTextField editJobMake;
    private javax.swing.JTextField editJobModel;
    private javax.swing.JPanel editJobPanel;
    private javax.swing.JTextField editJobTelephone;
    private javax.swing.JButton editJobUpdate;
    private javax.swing.JTextField editJobVehicleRegNo;
    private javax.swing.JPanel editJobWorkDone;
    private javax.swing.JList editJobWorkDoneListCurrent;
    private javax.swing.JList editJobWorkDoneListNew;
    private javax.swing.JButton editStatus;
    private javax.swing.JButton editStatusRemoveCurrent;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jobListTable;
    private javax.swing.JTextField searchCarNumber;
    private javax.swing.JTextField searchCustomerName;
    // End of variables declaration//GEN-END:variables
}