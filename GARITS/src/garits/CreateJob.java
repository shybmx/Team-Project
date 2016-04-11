package garits;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

public class CreateJob extends javax.swing.JPanel {
    DBConnect db;
    PreparedStatement prestate;
    Vector<String> vec = new Vector<>();
    public CreateJob(DBConnect db) {
        //Setting up all the componets within the JFrame
        initComponents();
        //Passing in the database connection
        this.db = db;
        //Refreshing this JFrame
        this.repaint();
        //Removing the background from all the JButtons and JPanels
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
        //Setting the size of this JPanel
        this.setSize(1300, 900);
        //To populate the Combo box from the database
        populateCombo();
    }

    public void setFields(String name, String regNo, String make, String model, String phone) {
        //Populating the Text fields from another class
        customerNameField.setText(name);
        vehicleRegNoField.setText(regNo);
        makeField.setText(make);
        modelField.setText(model);
        telephoneField.setText(phone);
    }

    public void populateCombo() {
        try {
            //Creating a MySQL statement which will get data to populate the combo box
            prestate = db.conn.prepareStatement("Select * FROM `standard jobs` ");
            //Placing the result into a result set
            ResultSet rs = prestate.executeQuery();
            //Going to the next result which is not the header
            rs.next();
            //creating a while loop which goes through every element in the table and its not the last element within it
            while (!rs.isAfterLast()) {
                //Seleting which colume it is from
                typeOfJob.addItem(rs.getString("TypeOfJob"));
                //going to the next result
                rs.next();
            }
        } catch (Exception ex) {
            //Prints out to the terminal if there is any error with the database connection or MySQL statement
            ex.printStackTrace();
        }
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
        vehicleRegNoField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        makeField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        customerNameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        estimatedTimeField = new javax.swing.JTextField();
        workDonePanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        workRequiredDropDown = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequired = new javax.swing.JList();
        addButtonPanel = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        formPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        dateBookedInField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        modelField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        telephoneField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        typeOfJob = new javax.swing.JComboBox();
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

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/searchicon.png"))); // NOI18N
        search.setPreferredSize(new java.awt.Dimension(120, 155));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        searchPanel.add(search);

        add(searchPanel);
        searchPanel.setBounds(490, 220, 510, 170);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Vehicle Reg.No:");

        vehicleRegNoField.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Make:");

        makeField.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Customer Name:");

        customerNameField.setPreferredSize(new java.awt.Dimension(200, 30));
        customerNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Estimated Time:");

        estimatedTimeField.setPreferredSize(new java.awt.Dimension(200, 30));

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
                    .addComponent(customerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehicleRegNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estimatedTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        formPanel1Layout.setVerticalGroup(
            formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(customerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(vehicleRegNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(makeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(estimatedTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        add(formPanel1);
        formPanel1.setBounds(250, 410, 420, 190);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setText("Work Required:");
        workDonePanel.add(jLabel9);

        workRequiredDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Break repair", "Replace exhaust", "Strip head and replace worn valves", "Replace grommet seal" }));
        workRequiredDropDown.setPreferredSize(new java.awt.Dimension(150, 30));
        workDonePanel.add(workRequiredDropDown);

        workRequired.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        workRequired.setPreferredSize(new java.awt.Dimension(200, 85));
        jScrollPane1.setViewportView(workRequired);

        workDonePanel.add(jScrollPane1);

        add(workDonePanel);
        workDonePanel.setBounds(250, 610, 220, 250);

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/add.png"))); // NOI18N
        add.setPreferredSize(new java.awt.Dimension(120, 155));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        addButtonPanel.add(add);

        add(addButtonPanel);
        addButtonPanel.setBounds(440, 670, 220, 170);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("Dated Booked In:");

        dateBookedInField.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setText("Model:");

        modelField.setMinimumSize(new java.awt.Dimension(200, 30));
        modelField.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setText("Telephone:");

        telephoneField.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel11.setText("Type of Job:");

        javax.swing.GroupLayout formPanel2Layout = new javax.swing.GroupLayout(formPanel2);
        formPanel2.setLayout(formPanel2Layout);
        formPanel2Layout.setHorizontalGroup(
            formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(telephoneField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modelField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateBookedInField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(typeOfJob, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formPanel2Layout.setVerticalGroup(
            formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dateBookedInField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(modelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(telephoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addComponent(typeOfJob))
                .addGap(160, 160, 160))
        );

        add(formPanel2);
        formPanel2.setBounds(690, 410, 420, 190);

        create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/createicon.png"))); // NOI18N
        create.setPreferredSize(new java.awt.Dimension(120, 155));
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        buttons2.add(create);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        close.setPreferredSize(new java.awt.Dimension(120, 155));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        buttons2.add(close);

        add(buttons2);
        buttons2.setBounds(810, 680, 290, 170);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        add(jLabel10);
        jLabel10.setBounds(0, 0, 1300, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        //Getting all the values from the Texfields and placing them into a String variable
        String customerName = customerNameField.getText();
        String vechicleRegNo = vehicleRegNoField.getText();
        String make = makeField.getText();
        String estimatedTime = estimatedTimeField.getText();
        String date = dateBookedInField.getText();
        String model = modelField.getText();
        String telephone = telephoneField.getText();
        String typeOfJobString = typeOfJob.getSelectedItem().toString();
        //Making a job number int to store the right job number
        int jobNo = 0;
        try {
            //Creating a MySQL statement which will insert the information into a jobsheet
            prestate = db.conn.prepareStatement("INSERT INTO `garits`.`jobsheets`(Customer, VehicleRegNumber, "
                    + "Make, EstimatedTime, DateBookedIn, Model, TelephoneNumber, TypeOfJob)"
                    + "Values(?,?,?,?,?,?,?,?)");
            //Placing the string variables into the MySQL statement 
            prestate.setString(1, customerName);
            prestate.setString(2, vechicleRegNo);
            prestate.setString(3, make);
            prestate.setString(4, estimatedTime);
            prestate.setString(5, date);
            prestate.setString(6, model);
            prestate.setString(7, telephone);
            prestate.setString(8, typeOfJobString);
            //Executing the MySQL statement and placing it into an int variable
            int i = prestate.executeUpdate();
            //Creating a select statement which will get the Vehicle reg number and the job number that has just been created
            prestate = db.conn.prepareStatement("Select jobsheets.Job_Number From jobsheets Where jobsheets.VehicleRegNumber  = "
                    + "'" + vechicleRegNo + "'");
            //Executing the MySQL statement 
            ResultSet result = prestate.executeQuery();
            //Going to the next result set which is not the header
            result.next();
            //Getting the job number from the MySQL query and placing it into the JobNo variable
            jobNo = result.getInt("Job_Number");
            //Creating a for loop which gets all the values from the JList and then placing it into the database with the right job number
            for (String t : vec) {
                //Creating a MySQL statement which will insert all the jobs into a table with the right job number
                prestate = db.conn.prepareStatement("INSERT INTO `task` (Job_Number, Task)"
                        + "Values( '" + jobNo + "', ?  ) ");
                //Placing in the string variable with the right item from the JList
                prestate.setString(1, t);
                //Exectuing the MySQL statement
                prestate.executeUpdate();
            }
            //Update the customer information so that they cannot create a new job as they have not paid for this one that has just been created
            prestate = db.conn.prepareStatement("UPDATE `customers` SET `Status` = 'Due' Where `name` = '" + customerName + "' ");
            //Exectuing the statement
            prestate.execute();
            //Making all the JPanels invisable
            formPanel1.setVisible(false);
            workDonePanel.setVisible(false);
            addButtonPanel.setVisible(false);
            buttons2.setVisible(false);
            formPanel2.setVisible(false);
            searchPanel.setVisible(false);
            //A pop up box to show that the job has been created successfully
            JOptionPane.showMessageDialog(null, "Job successfully created");
        } catch (Exception ex) {
            //An error message if anything has gone wrong with the database connection or any of the MYSQL statement
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_createActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        //Making the current JPanel invisable
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        //Pop up the new JFrame which will show all the customers which can create a job
        SearchCustomer searchCustomerTableFrame = new SearchCustomer(db, this);
        //Making the JFrame visable
        searchCustomerTableFrame.setVisible(true);
    }//GEN-LAST:event_searchActionPerformed

    private void customerNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameFieldActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        //Adding the selected items from the JCombo box and placing them into the JList
        vec.add(workRequiredDropDown.getSelectedItem().toString());
        //Setting the items into the JList
        workRequired.setListData(vec);
    }//GEN-LAST:event_addActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JPanel addButtonPanel;
    private javax.swing.JPanel buttons2;
    private javax.swing.JButton close;
    private javax.swing.JButton create;
    private javax.swing.JTextField customerNameField;
    private javax.swing.JTextField dateBookedInField;
    private javax.swing.JTextField estimatedTimeField;
    private javax.swing.JPanel formPanel1;
    private javax.swing.JPanel formPanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField makeField;
    private javax.swing.JTextField modelField;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchCustomer;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTextField telephoneField;
    private javax.swing.JComboBox typeOfJob;
    private javax.swing.JTextField vehicleRegNoField;
    private javax.swing.JPanel workDonePanel;
    private javax.swing.JList workRequired;
    private javax.swing.JComboBox workRequiredDropDown;
    // End of variables declaration//GEN-END:variables
}