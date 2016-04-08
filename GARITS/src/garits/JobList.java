package garits;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class JobList extends javax.swing.JPanel {
    JFrame myFrame;
    DBConnect db;
    PreparedStatement prestate;
     Vector<String> vec = new Vector<>();
     Vector<String> vec2 = new Vector<>();
     Vector<String> work = new Vector<>();
     double rate;
    public JobList(JFrame frame, DBConnect db) {
        initComponents();
        myFrame = frame;
        this.db = db;
        this.repaint();
        editJobStatusAddWorkDone.setOpaque(false);
        editJobStatusAddWorkDone.setContentAreaFilled(false);
        editJobStatusAddWorkDone.setBorderPainted(false);
        completeJob.setOpaque(false);
        completeJob.setContentAreaFilled(false);        
        completeJob.setBorderPainted(false);
        editJobStatusAddParts.setOpaque(false);
        editJobStatusAddParts.setContentAreaFilled(false);
        editJobStatusAddParts.setBorderPainted(false);
        refreshTable.setOpaque(false);
        refreshTable.setContentAreaFilled(false);
        refreshTable.setBorderPainted(false);
        searchButton.setOpaque(false);
        searchButton.setContentAreaFilled(false);
        searchButton.setBorderPainted(false);
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
        getRate();
        editJobStatusPanel.setVisible(false);
        editJobStatusPanel.setOpaque(false);
        jobNumber.setEditable(false);
        hourlyRate.setEditable(false);
        this.setSize(1300, 900);
        insertCombo();
        
        hourlyRate.setText(String.valueOf(rate));
    }
    
    public void getRate() {
        String user = Pin.loggedUser;
        try {
            prestate = db.conn.prepareStatement("SELECT LabourRate From login Where Username = " + "'" + user + "'");
            ResultSet result = prestate.executeQuery();
            result.next();
            rate = result.getDouble("LabourRate");
            
        } catch (Exception ex) {
            
        }
    }
    
    public String getNo(){
        return jobNumber.getText();
    }
    public void insertCombo() {
        
        try {
            prestate = db.conn.prepareStatement("SELECT `Job Name` FROM jobs");
            ResultSet result = prestate.executeQuery();
            result.next();
            PreparedStatement prestate2 = db.conn.prepareStatement("Select Count(*) FROM jobs ");
            ResultSet result2 = prestate2.executeQuery();
            result2.next();
            int it = result2.getInt("Count(*)");
            for (int i = it; i != 0; i--) {
                editJobStatusWorkDrop.addItem(result.getString("Job Name"));
                result.next();
            }
        } catch (SQLException ex) {
            System.out.println("");
        }
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
    
    public void updatePartsTable() {
        try {
            prestate = db.conn.prepareStatement("SELECT * FROM `temp parts`");
            ResultSet result = prestate.executeQuery();
            partsUsed.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            partsUsed.setModel(DbUtils.resultSetToTableModel(result));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        buttons = new javax.swing.JPanel();
        editJob = new javax.swing.JButton();
        editStatus = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jobListTable = new javax.swing.JTable();
        searchCustomer = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        refreshTable = new javax.swing.JButton();
        editJobStatusPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        editJobStatusWorkDrop = new javax.swing.JComboBox();
        duration = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        editWorkStatusWorkList = new javax.swing.JList();
        editJobStatusAddWorkDone = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        editJobStatusAddParts = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        hourlyRate = new javax.swing.JTextField();
        jobNumber = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        partsUsed = new javax.swing.JTable();
        completeJob = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

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
        editJobPanel.setBounds(190, 210, 1020, 590);

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

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/searchicon.png"))); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        refreshTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/update.png"))); // NOI18N
        refreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsLayout = new javax.swing.GroupLayout(buttons);
        buttons.setLayout(buttonsLayout);
        buttonsLayout.setHorizontalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(editJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(editStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278)
                .addComponent(searchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsLayout.createSequentialGroup()
                        .addComponent(searchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(buttonsLayout.createSequentialGroup()
                        .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editJob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(close, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refreshTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(buttons);
        buttons.setBounds(20, 280, 1280, 580);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Edit Job Status");

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel16.setText("Select Work Done:");

        editJobStatusWorkDrop.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        editJobStatusWorkDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJobStatusWorkDropActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel17.setText("Duration:");

        editWorkStatusWorkList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(editWorkStatusWorkList);

        editJobStatusAddWorkDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/add.png"))); // NOI18N
        editJobStatusAddWorkDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJobStatusAddWorkDoneActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel18.setText("Select Parts Used:");

        editJobStatusAddParts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/add.png"))); // NOI18N
        editJobStatusAddParts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJobStatusAddPartsActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel19.setText("Hourly Rate:");

        partsUsed.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(partsUsed);

        completeJob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/complete.png"))); // NOI18N
        completeJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeJobActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Job No:");

        javax.swing.GroupLayout editJobStatusPanelLayout = new javax.swing.GroupLayout(editJobStatusPanel);
        editJobStatusPanel.setLayout(editJobStatusPanelLayout);
        editJobStatusPanelLayout.setHorizontalGroup(
            editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editJobStatusPanelLayout.createSequentialGroup()
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editJobStatusAddParts, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(completeJob, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(133, 133, 133))
            .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                        .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editJobStatusWorkDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114)
                        .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editJobStatusAddWorkDone, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editJobStatusPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editJobStatusPanelLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jobNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                .addGap(458, 458, 458)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editJobStatusPanelLayout.setVerticalGroup(
            editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                        .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editJobStatusWorkDrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jobNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))
                    .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(editJobStatusAddWorkDone, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(completeJob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(editJobStatusAddParts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );

        add(editJobStatusPanel);
        editJobStatusPanel.setBounds(150, 210, 1090, 600);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1310, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void editStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStatusActionPerformed
        try{
            int index = jobListTable.getSelectedRow();
            jobNumber.setText(jobListTable.getValueAt(index, 0).toString());
            String test = jobListTable.getValueAt(index, 8).toString();
            if(test.equals("Pending")){
                buttons.setVisible(false);
                editJobStatusPanel.setVisible(true);
            }else{
                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "You must select a job you wish to edit");
        }
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

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try{
            prestate = db.conn.prepareStatement("SELECT * FROM `jobsheets` WHERE  `customer` LIKE '"+searchCustomer.getText()+"' ");
            ResultSet result = prestate.executeQuery();
            prestate = db.conn.prepareStatement("Select Count(*) FROM `jobsheets` WHERE `customer` LIKE  '"+searchCustomer.getText()+"' ");
            ResultSet result2 = prestate.executeQuery();
            result2.next();
            int it = result2.getInt("Count(*)");
            if(it > 0){
            jobListTable.setModel(DbUtils.resultSetToTableModel(result));
            }else{
                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
        }
        
        try{
            prestate = db.conn.prepareStatement("SELECT * FROM `jobsheets` WHERE  `VehicleRegNumber` =  '"+searchCustomer.getText()+"' ");
            ResultSet result = prestate.executeQuery();
            prestate = db.conn.prepareStatement("Select Count(*) FROM `jobsheets` WHERE `VehicleRegNumber` =  '"+searchCustomer.getText()+"' ");
            ResultSet result2 = prestate.executeQuery();
            result2.next();
            int it = result2.getInt("Count(*)");
            if(it > 0){
            jobListTable.setModel(DbUtils.resultSetToTableModel(result));
            }else{
                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

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

    private void refreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTableActionPerformed
        updateTable();
    }//GEN-LAST:event_refreshTableActionPerformed

    private void editJobStatusWorkDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJobStatusWorkDropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editJobStatusWorkDropActionPerformed

    private void editJobStatusAddWorkDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJobStatusAddWorkDoneActionPerformed
        work.add(editJobStatusWorkDrop.getSelectedItem().toString());
        editWorkStatusWorkList.setListData(work);
    }//GEN-LAST:event_editJobStatusAddWorkDoneActionPerformed

    private void editJobStatusAddPartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJobStatusAddPartsActionPerformed
        SelectPartsFor selectPartsForm = new SelectPartsFor(db, this);
        selectPartsForm.setVisible(true);
    }//GEN-LAST:event_editJobStatusAddPartsActionPerformed

    private void completeJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeJobActionPerformed
        PreparedStatement prestate2 = null;

        try {
            prestate = db.conn.prepareStatement("SELECT `Total Price` FROM `temp parts`  ");
            ResultSet result1 = prestate.executeQuery();

            prestate2 = db.conn.prepareStatement("SELECT count(*) FROM `temp parts`");
            ResultSet result2 = prestate2.executeQuery();
            result2.next();
            int it = result2.getInt("count(*)");
            double partsTotal = 0;
            result1.next();
            for (int i = it; i != 0; i--) {
                partsTotal = partsTotal + result1.getDouble("Total Price");
                result1.next();
            }

            prestate = db.conn.prepareStatement("SELECT * FROM `system config` WHERE `Variables` = 'VAT' ");
            ResultSet vatR = prestate.executeQuery();
            vatR.next();

            DecimalFormat format = new DecimalFormat("0.00");

            double labourTotal = rate * (Double.parseDouble(duration.getText()));

            double subTotal = labourTotal + partsTotal;

            double subVat = vatR.getDouble("Value") / 100 * subTotal; // added the vat from database

            double grandTotal = subTotal + subVat;

            String sVat = format.format(subVat);

            PreparedStatement prestate3;
            PreparedStatement prestate4;
            prestate3 = db.conn.prepareStatement("SELECT `Qty` FROM `temp parts`");
            ResultSet result3 = prestate3.executeQuery();
            result3.next();

            prestate3 = db.conn.prepareStatement("SELECT `Description` FROM `temp parts` ");
            ResultSet result4 = prestate3.executeQuery();
            result4.next();

            prestate4 = db.conn.prepareStatement("SELECT * FROM `temp parts` ");
            ResultSet result5 = prestate4.executeQuery();
            result5.next();

            for (int i = it; i != 0; i--) {

                prestate3 = db.conn.prepareStatement("INSERT INTO `job completed` (`Job_Number`, "
                    + " `Description`,  `Part No`,`Unit Cost`,`Qty`, `Total Price`, `Labour Rate`,  `Duration`  ,`VAT`, `Grand Total`) "
                    + "VALUES ( '" + jobNumber.getText() + "', '" + result4.getString("Description") + "',     '"+result5.getString("Part No")+"',  '"+ result5.getFloat("Unit Cost")+"' ,  " + result3.getInt("Qty") + ",'" + (result3.getInt("Qty")* result5.getDouble("Unit Cost")) + "','" + rate + "',    '"+duration.getText()+"'    ,'" + sVat + "','" + grandTotal + "' )");
                System.out.println(prestate3);
                result3.next();
                result4.next();
                result5.next();
                prestate3.executeUpdate();

            }

            for (int i = 0; i < work.size(); i++) {
                prestate3 = db.conn.prepareStatement("INSERT INTO `work done`(`Job_Number` , `work done`)   VALUES (  '" + jobNumber.getText() + "', '" + work.get(i) + "'   )  ");
                prestate3.executeUpdate();
            }

            prestate4 = db.conn.prepareStatement("UPDATE `jobsheets` SET `Status` = 'Complete' WHERE"
                + " `Job_Number` = '" + jobNumber.getText() + "'  ");
            prestate4.execute();
            updateTable();

            prestate4 = db.conn.prepareStatement("DELETE FROM `temp parts`");
            prestate4.execute();
            editJobStatusPanel.setVisible(false);
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }//GEN-LAST:event_completeJobActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttons;
    private javax.swing.JButton close;
    private javax.swing.JButton completeJob;
    private javax.swing.JTextField duration;
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
    private javax.swing.JButton editJobStatusAddParts;
    private javax.swing.JButton editJobStatusAddWorkDone;
    private javax.swing.JPanel editJobStatusPanel;
    private javax.swing.JComboBox editJobStatusWorkDrop;
    private javax.swing.JTextField editJobTelephone;
    private javax.swing.JButton editJobUpdate;
    private javax.swing.JTextField editJobVehicleRegNo;
    private javax.swing.JPanel editJobWorkDone;
    private javax.swing.JList editJobWorkDoneListCurrent;
    private javax.swing.JList editJobWorkDoneListNew;
    private javax.swing.JButton editStatus;
    private javax.swing.JButton editStatusRemoveCurrent;
    private javax.swing.JList editWorkStatusWorkList;
    private javax.swing.JTextField hourlyRate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jobListTable;
    private javax.swing.JTextField jobNumber;
    private javax.swing.JTable partsUsed;
    private javax.swing.JButton refreshTable;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchCustomer;
    // End of variables declaration//GEN-END:variables
}