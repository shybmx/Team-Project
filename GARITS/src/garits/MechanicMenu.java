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

public class MechanicMenu extends javax.swing.JFrame {

    PreparedStatement prestate;
    int jobNo1;
    DBConnect db;
    Vector<String> work = new Vector<>();
    double rate;
    
    public MechanicMenu(DBConnect db) {
        //Setting up all the components within this JFrame
        initComponents();
        //Passing in the database connection
        this.db = db;
        //Removing the background from the JButtons, JPanels and making a few text fields uneditable
        completeJob.setOpaque(false);
        completeJob.setContentAreaFilled(false);        
        completeJob.setBorderPainted(false);
        editStatus.setOpaque(false);
        editStatus.setContentAreaFilled(false);        
        editStatus.setBorderPainted(false);
        editJobStatusAddWorkDone.setOpaque(false);
        editJobStatusAddWorkDone.setContentAreaFilled(false);
        editJobStatusAddWorkDone.setBorderPainted(false);
        editJobStatusAddParts.setOpaque(false);
        editJobStatusAddParts.setContentAreaFilled(false);
        editJobStatusAddParts.setBorderPainted(false);
        logout.setOpaque(false);
        logout.setContentAreaFilled(false);        
        logout.setBorderPainted(false);
        jobsPanel.setOpaque(false);
        editJobStatusPanel.setVisible(false);
        editJobStatusPanel.setOpaque(false);
        jobNumber.setEditable(false);
        hourlyRate.setEditable(false);
        //Make the JFrame not resizeable
        this.setResizable(false);
        //The program will not close when the close button is hit
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //Sets the size of the JFrame
        this.setSize(1300, 900);
        //Update the JTable
        updateTable();
        //Insert the deatils into combo box from the database
        insertCombo();
        insertComboParts();
        updatePartsTable();
        //Get the hourly rate
        getRate();   
        //Set the hourly rate into the text box
        hourlyRate.setText(String.valueOf(rate));
    }

    public int getNo() {
        //Getting the job number and placing it in the right text box
        jobNo1 = Integer.parseInt(jobNumber.getText());
        //return job number
        return jobNo1;
    }

    public void insertCombo() {
        try {
            //Creating a MySQL statement which will select the job name from the job table
            prestate = db.conn.prepareStatement("SELECT `Job Name` FROM jobs");
            //Executing the query and place it in a result set
            ResultSet result = prestate.executeQuery();
            //Goes to the next result which is not the header
            result.next();
            //Creating a MySQL statement which will get the count from the jobs table
            PreparedStatement prestate2 = db.conn.prepareStatement("Select Count(*) FROM jobs ");
            //Execute the result and place it in a result set
            ResultSet result2 = prestate2.executeQuery();
            //Goes to the next result which is not the header
            result2.next();
            //Stroring the count from the database into the database
            int it = result2.getInt("Count(*)");
            //A for loop which goes through the elements in the database
            for (int i = it; i != 0; i--) {
                //Adding the elements from the database into the combo box
                editJobStatusWorkDrop.addItem(result.getString("Job Name"));
                //Goes to the next result
                result.next();
            }
        } catch (SQLException ex) {
                
        }
    }
    
    public void getRate() {
        //Gets which user that is logged in
        String user = Pin.loggedUser;
        try {
            //Create a MySQL statement which will get the labour rate from the user who is logged in
            prestate = db.conn.prepareStatement("SELECT LabourRate From login Where Username = " + "'" + user + "'");
            //Executing the query and placing it in a result set
            ResultSet result = prestate.executeQuery();
            //Goes to the next result which is not the header
            result.next();
            //Place the labour rate into a variable
            rate = result.getDouble("LabourRate");
        } catch (Exception ex) {
            
        }
    }
    
    public void insertComboParts() {
        try {
            //Creating a MySQL statement to select the part name from the parts table
            prestate = db.conn.prepareStatement("SELECT PartName FROM  parts ");
            //Executing the query and placing them in a result set
            ResultSet result = prestate.executeQuery();
            //Goes to the next result which is not the header
            result.next();
            //Creating a MySQL statement which will get the count from parts
            PreparedStatement prestate2 = db.conn.prepareStatement("Select Count(*) FROM parts ");
            //Executing the query and placing it into a result set
            ResultSet result2 = prestate2.executeQuery();
            //Goes to next result which is not the header
            result2.next();
            //Getting the count from the database and placing it into a int variable
            int it = result2.getInt("Count(*)");
            //A for loop which goes through the count
            for (int i = it; i != 0; i--) {
                //Adding the data from the database into the JCombo box
                editJobStatusWorkDrop.addItem(result.getString("parts"));
                //Goes to the next result
                result.next();
            }
        } catch (SQLException ex) {
 
        }
    }
    
    public void updateTable() {
        try {
            //Creating a MySQL query to select all from jobsheet where the status is pending
            prestate = db.conn.prepareStatement("SELECT * FROM jobsheets WHERE Status = 'Pending'");
            //Executing the query and placing it in a result set
            ResultSet result = prestate.executeQuery();
            //Making the JTable resize depending on the results
            pendingJobTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            //Placing the result into a the JTable
            pendingJobTable.setModel(DbUtils.resultSetToTableModel(result));
        } catch (Exception ex) {
            //Showing an error message if there is a problem with the database connection or MySQL statement
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    }
    
    public void updatePartsTable() {
        try {
            //Creating a MySQL statement which selects all the the temp parts table
            prestate = db.conn.prepareStatement("SELECT * FROM `temp parts`");
            //Executing the query and placing it into a result set
            ResultSet result = prestate.executeQuery();
            //Making the JTable resize depending on the results
            partsUsed.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            //Placing the result into a the JTable
            partsUsed.setModel(DbUtils.resultSetToTableModel(result));
        } catch (Exception ex) {
            //Showing an error message if there is a problem with the database connection or MySQL statement
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
        editJobStatusAddParts = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        hourlyRate = new javax.swing.JTextField();
        jobNumber = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        partsUsed = new javax.swing.JTable();
        completeJob = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
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

        editJobStatusWorkDrop.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        editJobStatusWorkDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJobStatusWorkDropActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Duration:");

        editWorkStatusWorkList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(editWorkStatusWorkList);

        editJobStatusAddWorkDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/add.png"))); // NOI18N
        editJobStatusAddWorkDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJobStatusAddWorkDoneActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("Select Parts Used:");

        editJobStatusAddParts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/add.png"))); // NOI18N
        editJobStatusAddParts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJobStatusAddPartsActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setText("Hourly Rate:");

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
        jScrollPane3.setViewportView(partsUsed);

        completeJob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/complete.png"))); // NOI18N
        completeJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeJobActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setText("Job No:");

        javax.swing.GroupLayout editJobStatusPanelLayout = new javax.swing.GroupLayout(editJobStatusPanel);
        editJobStatusPanel.setLayout(editJobStatusPanelLayout);
        editJobStatusPanelLayout.setHorizontalGroup(
            editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editJobStatusPanelLayout.createSequentialGroup()
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editJobStatusAddParts, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(completeJob, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(133, 133, 133))
            .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editJobStatusWorkDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jobNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
            .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                        .addGap(435, 435, 435)
                        .addComponent(jLabel3))
                    .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editJobStatusAddWorkDone, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editJobStatusPanelLayout.setVerticalGroup(
            editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                        .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editJobStatusWorkDrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(editJobStatusPanelLayout.createSequentialGroup()
                        .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hourlyRate, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(jobNumber))))
                .addGap(70, 70, 70)
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(editJobStatusAddWorkDone, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(editJobStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(completeJob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(editJobStatusAddParts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );

        getContentPane().add(editJobStatusPanel);
        editJobStatusPanel.setBounds(80, 230, 1090, 600);

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
        try {
            //Get the selected row and place it into an int variable
            int index = pendingJobTable.getSelectedRow();
            //Setting the text fiel with the colum from the table
            jobNumber.setText(pendingJobTable.getValueAt(index, 0).toString());
            //Make the job panel JPanel invisable
            jobsPanel.setVisible(false);
            //Make the edit job status visable
            editJobStatusPanel.setVisible(true);
        } catch (Exception ex) {
            //Showing an error message if there is a problem with the database connection or MySQL statement
            JOptionPane.showMessageDialog(null, "Please select a job you wish to start on");
        }
    }//GEN-LAST:event_editStatusActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        //Create a new Pin object
        Pin logout = new Pin();
        //Make pin object visable
        logout.setVisible(true);
        //Make this JFrame invisable
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void editJobStatusAddPartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJobStatusAddPartsActionPerformed
        //Creating a new select parts JFrame object
        SelectParts selectPartsForm = new SelectParts(db, this);
        //Makes the new JFrame visable
        selectPartsForm.setVisible(true);
    }//GEN-LAST:event_editJobStatusAddPartsActionPerformed

    private void editJobStatusAddWorkDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJobStatusAddWorkDoneActionPerformed
       //Adding the selected item to the vector 
        work.add(editJobStatusWorkDrop.getSelectedItem().toString());
        //Adding the selected item to the JList
        editWorkStatusWorkList.setListData(work);
    }//GEN-LAST:event_editJobStatusAddWorkDoneActionPerformed

    private void completeJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeJobActionPerformed
        //Creating a new prepared statement
        PreparedStatement prestate2 = null;
        try {
            //Creating a MySQL query which will selects the total price from the temp parts table 
            prestate = db.conn.prepareStatement("SELECT `Total Price` FROM `temp parts`  ");
            //Execute the query and places them into a result set
            ResultSet result1 = prestate.executeQuery();
            //Creating a MySQL query which selects the count from temp parts
            prestate2 = db.conn.prepareStatement("SELECT count(*) FROM `temp parts`");
            //Executing the query and placing it into a result set
            ResultSet result2 = prestate2.executeQuery();
            //Going to the next result which is not the header
            result2.next();
            //Getting the count from the database and placing it into an int variable
            int it = result2.getInt("count(*)");
            //Creating a double variable which will hold the total parts
            double partsTotal = 0;
            //Goes to the next result
            result1.next();
            //A for lot to go through all the data from count
            for (int i = it; i != 0; i--) {
                //Adding the part total
                partsTotal = partsTotal + result1.getDouble("Total Price");
                //Goes to the next result
                result1.next();
            }
            //Creating a MySQL statement which will get the VAT value
            prestate = db.conn.prepareStatement("SELECT * FROM `system config` WHERE `Variables` = 'VAT' ");
            //Executing the query and placing it in a result set
            ResultSet vatR = prestate.executeQuery();
            //Goes to the next result which is not the header
            vatR.next();
            //Formatting the number
            DecimalFormat format = new DecimalFormat("0.00");
            //Get the labour rate
            double labourTotal = rate * (Double.parseDouble(duration.getText()));
            //Adding the sub labour totals with the parts totals
            double subTotal = labourTotal + partsTotal;
            //getting the Vat totals
            double subVat = vatR.getDouble("Value") / 100 * subTotal; // added the vat from database
            //Getting the grand total
            double grandTotal = subTotal + subVat;
            // formatting the s vat
            String sVat = format.format(subVat);
            //Creating prestatement
            PreparedStatement prestate3;
            PreparedStatement prestate4;
            //Creating a MySQL statement which get the quantity from temp parts table
            prestate3 = db.conn.prepareStatement("SELECT `Qty` FROM `temp parts`");
            //Execute the query and place it in a result set
            ResultSet result3 = prestate3.executeQuery();
            //Goes to the next result
            result3.next();
            //Creating a new MySQL query which will get the description from the temp parts table
            prestate3 = db.conn.prepareStatement("SELECT `Description` FROM `temp parts` ");
            //Execute the query and placing it in a result set
            ResultSet result4 = prestate3.executeQuery();
            //Going to the next result which is not the header
            result4.next();
            //Creating a MySQL query which gets all from temp parts
            prestate4 = db.conn.prepareStatement("SELECT * FROM `temp parts` ");
            //Executing the query and placing it in a result set
            ResultSet result5 = prestate4.executeQuery();
            //Goes to the next result which is not the header
            result5.next();
            //A for loop which goes through the count
            for (int i = it; i != 0; i--) {
                //Creating a MySQL statement which will insert all the details into the table
                prestate3 = db.conn.prepareStatement("INSERT INTO `job completed` (`Job_Number`, "
                        + " `Description`,  `Part No`,`Unit Cost`,`Qty`, `Total Price`, `Labour Rate`,  `Duration`  ,`VAT`, `Grand Total`) "
                        + "VALUES ( '" + jobNumber.getText() + "', '" + result4.getString("Description") + "',     '"+result5.getString("Part No")+"',  '"+ result5.getFloat("Unit Cost")+"' ,  " + result3.getInt("Qty") + ",'" + (result3.getInt("Qty")* result5.getDouble("Unit Cost")) + "','" + rate + "',    '"+duration.getText()+"'    ,'" + sVat + "','" + grandTotal + "' )");
                //Going to the next result
                result3.next();
                result4.next();
                result5.next();
                //Executing the query
                prestate3.executeUpdate();
                
            }
            //A for loop which will insert all the work done
            for (int i = 0; i < work.size(); i++) {
                //Creating a MySQL query which will insert the details into work done
                prestate3 = db.conn.prepareStatement("INSERT INTO `work done`(`Job_Number` , `work done`)   VALUES (  '" + jobNumber.getText() + "', '" + work.get(i) + "'   )  ");
                //Executing the query
                prestate3.executeUpdate();
            }
            //Creating a MySQL statement which will update the jobsheet to complete
            prestate4 = db.conn.prepareStatement("UPDATE `jobsheets` SET `Status` = 'Complete' WHERE"
                    + " `Job_Number` = '" + jobNumber.getText() + "'  ");
            //Execute the query
            prestate4.execute();
            //Updating the table
            updateTable();
            //Creating a MySQL query to delete all from temp parts
            prestate4 = db.conn.prepareStatement("DELETE FROM `temp parts`");
            //Execute the query 
            prestate4.execute();
            //Make this JPanel invisable
            editJobStatusPanel.setVisible(false);
            //Open up another JPanel
            jobsPanel.setVisible(true);
        } catch (Exception ex) {
            //Prints out all the errors to the terminal
            ex.printStackTrace();
            
        }
    }//GEN-LAST:event_completeJobActionPerformed

    private void editJobStatusWorkDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJobStatusWorkDropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editJobStatusWorkDropActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton completeJob;
    private javax.swing.JTextField duration;
    private javax.swing.JButton editJobStatusAddParts;
    private javax.swing.JButton editJobStatusAddWorkDone;
    private javax.swing.JPanel editJobStatusPanel;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jobNumber;
    private javax.swing.JPanel jobsPanel;
    private javax.swing.JButton logout;
    private javax.swing.JTable partsUsed;
    private javax.swing.JLabel pendingHeader;
    private javax.swing.JTable pendingJobTable;
    // End of variables declaration//GEN-END:variables
}
