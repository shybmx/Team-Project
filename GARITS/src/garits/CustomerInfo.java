package garits;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class CustomerInfo extends javax.swing.JPanel {
    JFrame myFrame;
    DBConnect db;
    PreparedStatement prestate;

    public CustomerInfo(DBConnect db) {
        initComponents();
        this.db = db;
        deleteVeh.setOpaque(false);
        deleteVeh.setContentAreaFilled(false); 
        deleteVeh.setBorderPainted(false);
        deleteCustomerButton.setOpaque(false);
        deleteCustomerButton.setContentAreaFilled(false); 
        deleteCustomerButton.setBorderPainted(false);
        searchCustomer.setOpaque(false);
        searchCustomer.setContentAreaFilled(false); 
        searchCustomer.setBorderPainted(false);
        updateTableButton.setOpaque(false);
        updateTableButton.setContentAreaFilled(false); 
        updateTableButton.setBorderPainted(false);
        closeButton.setOpaque(false);
        closeButton.setContentAreaFilled(false); 
        closeButton.setBorderPainted(false);
        createButton.setOpaque(false);
        createButton.setContentAreaFilled(false); 
        createButton.setBorderPainted(false);
        editButton.setOpaque(false);
        editButton.setContentAreaFilled(false); 
        editButton.setBorderPainted(false);
        buttons.setOpaque(false);
        mulitpleAdd.setOpaque(false);
        mulitpleAdd.setContentAreaFilled(false); 
        mulitpleAdd.setBorderPainted(false);
        mulitpleClose.setOpaque(false);
        mulitpleClose.setContentAreaFilled(false); 
        mulitpleClose.setBorderPainted(false);
        buttons.setOpaque(false);
        buttons.setOpaque(false);
        updateTable();
        editUserButton.setOpaque(false);
        editUserButton.setContentAreaFilled(false); 
        editUserButton.setBorderPainted(false);
        closeButtonEdit.setOpaque(false);
        closeButtonEdit.setContentAreaFilled(false); 
        closeButtonEdit.setBorderPainted(false);
        closeAddingCustomer.setOpaque(false);
        closeAddingCustomer.setContentAreaFilled(false); 
        closeAddingCustomer.setBorderPainted(false);
        addCustomer.setOpaque(false);
        addCustomer.setContentAreaFilled(false); 
        addCustomer.setBorderPainted(false);
        addPanel.setVisible(false);
        addPanel.setOpaque(false);
        buttons.setVisible(true);
        buttons.setOpaque(false);
        editUserPanel.setOpaque(false);
        editUserPanel.setVisible(false);
        customerID.setEditable(false);
        addingExtraVeh.setOpaque(false);
        addingExtraVeh.setVisible(false);
        mulitpleCustomerID.setEditable(false);
        mulitpleName.setEditable(false);
        customerTypeField.setEditable(false);
        editCustomerType.setEditable(false);
        this.setSize(1300, 900);
    }
    
    public boolean delete(String id){
            try{ 
                String sql = "DELETE FROM `customers` WHERE `CustomerID` = '" + id + " ' ";     
                prestate = db.conn.prepareStatement(sql);
                prestate.execute();
                String sql2 = " DELETE FROM `vehicle` WHERE `CustomerID` = '" + id + " '    ";
                    prestate = db.conn.prepareStatement(sql2);
                    prestate.execute();
                    return true;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(closeButton, ex);
                return false;
            }
    }
    
    public void updateTable(){
        try{
            prestate = db.conn.prepareStatement("SELECT customers.CustomerID, customers.name, "
                    + "customers.address, customers.PostCode, customers.TelephoneNumber, customers.EMail, "
                    + "customers.CustomerType, vehicle.regNum, vehicle.Make, vehicle.Model,vehicle.EngSerial, "
                    + "vehicle.ChassieNumber, vehicle.Colour, vehicle.`MOT date` FROM customers "
                    + "INNER JOIN vehicle on customers.CustomerID = vehicle.CustomerID");
            ResultSet result = prestate.executeQuery();
            customerTable.setModel(DbUtils.resultSetToTableModel(result));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttons = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        createButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        addMulitpleVech = new javax.swing.JButton();
        searchCustomerField = new javax.swing.JTextField();
        searchCustomer = new javax.swing.JButton();
        updateTableButton = new javax.swing.JButton();
        deleteCustomerButton = new javax.swing.JButton();
        deleteVeh = new javax.swing.JButton();
        addPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        insertName = new javax.swing.JTextField();
        insertAddress = new javax.swing.JTextField();
        insertPostCode = new javax.swing.JTextField();
        insertPhone = new javax.swing.JTextField();
        insertEMail = new javax.swing.JTextField();
        insertReg = new javax.swing.JTextField();
        insertMake = new javax.swing.JTextField();
        insertModel = new javax.swing.JTextField();
        insertEng = new javax.swing.JTextField();
        insertChass = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        insertColour = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addCustomer = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        closeAddingCustomer = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        discountBox = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        customerTypeBox = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        customerTypeField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        addMOTDate = new javax.swing.JTextField();
        editUserPanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        editName = new javax.swing.JTextField();
        editAddress = new javax.swing.JTextField();
        editPostCode = new javax.swing.JTextField();
        editPhone = new javax.swing.JTextField();
        editEMail = new javax.swing.JTextField();
        editReg = new javax.swing.JTextField();
        editMake = new javax.swing.JTextField();
        editModel = new javax.swing.JTextField();
        editEng = new javax.swing.JTextField();
        editChass = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        editColour = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        editUserButton = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        closeButtonEdit = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        editDiscountBox = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        customerTypeBoxEdit = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        editCustomerType = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        editMOTDate = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        customerID = new javax.swing.JTextField();
        addingExtraVeh = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        mulitpleRegNo = new javax.swing.JTextField();
        mulitpleMake = new javax.swing.JTextField();
        mulitpleModel = new javax.swing.JTextField();
        mulitpleEngSerial = new javax.swing.JTextField();
        mulitpleChassNumber = new javax.swing.JTextField();
        mulitpleColour = new javax.swing.JTextField();
        mulitpleAdd = new javax.swing.JButton();
        mulitpleClose = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        mulitpleCustomerID = new javax.swing.JTextField();
        mulitpleName = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        mulitpleMOTDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(customerTable);

        createButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/createcustomer.png"))); // NOI18N
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/editCustomer.png"))); // NOI18N
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        addMulitpleVech.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/multiple.png"))); // NOI18N
        addMulitpleVech.setPreferredSize(new java.awt.Dimension(120, 155));
        addMulitpleVech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMulitpleVechActionPerformed(evt);
            }
        });

        searchCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/searchicon.png"))); // NOI18N
        searchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerActionPerformed(evt);
            }
        });

        updateTableButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/update.png"))); // NOI18N
        updateTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTableButtonActionPerformed(evt);
            }
        });

        deleteCustomerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/deleteCustomer.png"))); // NOI18N
        deleteCustomerButton.setPreferredSize(new java.awt.Dimension(120, 155));
        deleteCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerButtonActionPerformed(evt);
            }
        });

        deleteVeh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/DeleteVehicle.png"))); // NOI18N
        deleteVeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteVehActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsLayout = new javax.swing.GroupLayout(buttons);
        buttons.setLayout(buttonsLayout);
        buttonsLayout.setHorizontalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addMulitpleVech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteVeh, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchCustomerField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(buttonsLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonsLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(searchCustomerField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateTableButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(closeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(buttonsLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addMulitpleVech, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(buttonsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deleteVeh, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(buttons);
        buttons.setBounds(0, 270, 1280, 590);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setText("Model:");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setText("Eng.Serial:");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel10.setText("Chassis Number:");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel11.setText("Colour:");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel12.setText("Discount:");

        insertAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertAddressActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Address:");

        insertColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertColourActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Post Code:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Name:");

        addCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/add.png"))); // NOI18N
        addCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Phone:");

        closeAddingCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        closeAddingCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeAddingCustomerActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("E-Mail:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setText("Reg.No:");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel13.setText("Make:");

        discountBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fixed", "Flexible", "Variable", " " }));
        discountBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountBoxActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel14.setText("Customer:");

        customerTypeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Account", "Non-Account" }));
        customerTypeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerTypeBoxActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel15.setText("Customer:");

        customerTypeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerTypeFieldActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel16.setText("MOT Date:");

        addMOTDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMOTDateActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel18.setText("Model:");

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel19.setText("Eng.Serial:");

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel20.setText("Chassis Number:");

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel21.setText("Colour:");

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel22.setText("Discount:");

        editAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAddressActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel23.setText("Address:");

        editColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editColourActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel24.setText("Post Code:");

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel25.setText("Name:");

        editUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/editCustomer.png"))); // NOI18N
        editUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserButtonActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel26.setText("Phone:");

        closeButtonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        closeButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonEditActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel27.setText("E-Mail:");

        jLabel28.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel28.setText("Reg.No:");

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel29.setText("Make:");

        editDiscountBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fixed", "Flexible", "Variable", " " }));
        editDiscountBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDiscountBoxActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel30.setText("Customer:");

        customerTypeBoxEdit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Account", "Non-Account" }));
        customerTypeBoxEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerTypeBoxEditActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel31.setText("Customer:");

        editCustomerType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCustomerTypeActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel32.setText("MOT Date:");

        editMOTDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMOTDateActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel33.setText("Customer ID:");

        customerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editUserPanelLayout = new javax.swing.GroupLayout(editUserPanel);
        editUserPanel.setLayout(editUserPanelLayout);
        editUserPanelLayout.setHorizontalGroup(
            editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editUserPanelLayout.createSequentialGroup()
                        .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editUserPanelLayout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(customerID, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editUserPanelLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editUserPanelLayout.createSequentialGroup()
                                .addGap(0, 6, Short.MAX_VALUE)
                                .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editUserPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel27)
                                                .addGap(54, 54, 54)
                                                .addComponent(editEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel26))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editUserPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel23)
                                            .addGap(36, 36, 36)
                                            .addComponent(editAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(editPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(editUserPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel24)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(editPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(31, 31, 31))
                    .addGroup(editUserPanelLayout.createSequentialGroup()
                        .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(editUserPanelLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(customerTypeBoxEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(editUserPanelLayout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editCustomerType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editUserPanelLayout.createSequentialGroup()
                        .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(editUserPanelLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editMake, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(editUserPanelLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(141, 141, 141)
                                .addComponent(editReg))
                            .addGroup(editUserPanelLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(110, 110, 110)
                                .addComponent(editEng, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(editUserPanelLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editModel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addComponent(editUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(closeButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(editUserPanelLayout.createSequentialGroup()
                            .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22)
                                .addComponent(jLabel32))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(editDiscountBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(editMOTDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(editUserPanelLayout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editColour, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editUserPanelLayout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addGap(44, 44, 44)
                            .addComponent(editChass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        editUserPanelLayout.setVerticalGroup(
            editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(editUserPanelLayout.createSequentialGroup()
                        .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(editReg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)
                            .addComponent(customerID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(editMake, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editUserPanelLayout.createSequentialGroup()
                                .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(editAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(editPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(editUserPanelLayout.createSequentialGroup()
                                .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(editModel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(editEng, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editUserPanelLayout.createSequentialGroup()
                                .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(editChass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(editColour, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel32)
                                    .addComponent(editMOTDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel22)
                                    .addComponent(editDiscountBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(editUserPanelLayout.createSequentialGroup()
                                .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(editPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(editEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(editCustomerType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(editUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel30)
                                    .addComponent(customerTypeBoxEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(54, 54, 54)
                                .addComponent(insertEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(customerTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(customerTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(insertName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(36, 36, 36)
                            .addComponent(insertAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(insertPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(addPanelLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(insertPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(discountBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insertMake, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(141, 141, 141)
                        .addComponent(insertReg))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insertColour, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(44, 44, 44)
                        .addComponent(insertChass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(110, 110, 110)
                        .addComponent(insertEng, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insertModel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addMOTDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(addCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeAddingCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(editUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addComponent(editUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeAddingCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(addPanelLayout.createSequentialGroup()
                                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(insertReg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel13)
                                            .addComponent(insertMake, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(insertModel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(insertEng, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(addCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(insertChass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(insertName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(insertAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(insertPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(insertPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(insertEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(insertColour, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(addMOTDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(customerTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(customerTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(discountBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(addPanel);
        addPanel.setBounds(180, 290, 1110, 360);

        jLabel36.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel36.setText("Reg.No:");

        jLabel37.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel37.setText("Make:");

        jLabel38.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel38.setText("Model:");

        jLabel39.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel39.setText("Eng.Serial:");

        jLabel40.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel40.setText("Chassis Number:");

        jLabel41.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel41.setText("Colour:");

        mulitpleAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/add.png"))); // NOI18N
        mulitpleAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulitpleAddActionPerformed(evt);
            }
        });

        mulitpleClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        mulitpleClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulitpleCloseActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel42.setText("CustomerID:");

        jLabel43.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel43.setText("Name:");

        jLabel44.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel44.setText("MOT Date:");

        javax.swing.GroupLayout addingExtraVehLayout = new javax.swing.GroupLayout(addingExtraVeh);
        addingExtraVeh.setLayout(addingExtraVehLayout);
        addingExtraVehLayout.setHorizontalGroup(
            addingExtraVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addingExtraVehLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addingExtraVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addingExtraVehLayout.createSequentialGroup()
                        .addGroup(addingExtraVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addingExtraVehLayout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addGap(55, 55, 55)
                                .addComponent(mulitpleChassNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addingExtraVehLayout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addGap(121, 121, 121)
                                .addComponent(mulitpleEngSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addingExtraVehLayout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(168, 168, 168)
                                .addComponent(mulitpleModel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addingExtraVehLayout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(176, 176, 176)
                                .addComponent(mulitpleMake, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addingExtraVehLayout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(152, 152, 152)
                                .addComponent(mulitpleRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addingExtraVehLayout.createSequentialGroup()
                                .addGroup(addingExtraVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel44))
                                .addGap(124, 124, 124)
                                .addGroup(addingExtraVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mulitpleMOTDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mulitpleColour, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(157, 157, 157)
                        .addComponent(mulitpleAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mulitpleClose, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addGroup(addingExtraVehLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addGroup(addingExtraVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mulitpleCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mulitpleName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        addingExtraVehLayout.setVerticalGroup(
            addingExtraVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addingExtraVehLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addingExtraVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(mulitpleCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addingExtraVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(mulitpleName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(addingExtraVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addingExtraVehLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(addingExtraVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mulitpleAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mulitpleClose, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addingExtraVehLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addingExtraVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(mulitpleRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addingExtraVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mulitpleMake, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addingExtraVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mulitpleModel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addingExtraVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mulitpleEngSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addingExtraVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mulitpleChassNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addingExtraVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mulitpleColour, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addingExtraVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mulitpleMOTDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        add(addingExtraVeh);
        addingExtraVeh.setBounds(190, 290, 880, 400);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1300, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        buttons.setVisible(false);
        addPanel.setVisible(true);
    }//GEN-LAST:event_createButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        try{
            int index = customerTable.getSelectedRow();
            customerID.setText(customerTable.getValueAt(index, 0).toString());
            editName.setText(customerTable.getValueAt(index, 1).toString());
            editAddress.setText(customerTable.getValueAt(index, 2).toString());
            editPostCode.setText(customerTable.getValueAt(index, 3).toString());
            editPhone.setText(customerTable.getValueAt(index, 4).toString());
            editEMail.setText(customerTable.getValueAt(index, 5).toString());
            editCustomerType.setText(customerTable.getValueAt(index, 6).toString());
            editMOTDate.setText(customerTable.getValueAt(index, 13).toString());
            editReg.setText(customerTable.getValueAt(index, 7).toString());
            editMake.setText(customerTable.getValueAt(index, 8).toString());
            editModel.setText(customerTable.getValueAt(index, 9).toString());
            editEng.setText(customerTable.getValueAt(index, 10).toString());
            editChass.setText(customerTable.getValueAt(index, 11).toString());
            editColour.setText(customerTable.getValueAt(index, 12).toString());
            buttons.setVisible(false);
            editUserPanel.setVisible(true);
            System.out.println("here");
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "You must select a customer to edit");
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerButtonActionPerformed
        String[] options ={"Yes","No"};
        int answer = JOptionPane.showOptionDialog(null, "Are you sure you want to Delete?",
                "Confirmed", JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if(answer == 0){
            int index = customerTable.getSelectedRow();
            String id = customerTable.getValueAt(index, 0).toString();
            if(delete(id)){
                updateTable();
                JOptionPane.showMessageDialog(null, "Customer: " +  id + " has been deleted");
            }else{
                JOptionPane.showMessageDialog(null, "Customer: " + id + " has not been deleted");
            }
        }                  
    }//GEN-LAST:event_deleteCustomerButtonActionPerformed

    private void insertAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertAddressActionPerformed

    private void insertColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertColourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertColourActionPerformed

    private void addCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerActionPerformed
        String name = insertName.getText();
        String address = insertAddress.getText();
        String postcode = insertPostCode.getText();
        String phone = insertPhone.getText();
        String email = insertEMail.getText();
        String customerType = customerTypeField.getText();
        String regno = insertReg.getText();
        String make = insertMake.getText();
        String model = insertModel.getText();
        String eng = insertEng.getText();
        String chass = insertChass.getText();
        String colour = insertColour.getText();
        String discountTypeString = discountBox.getSelectedItem().toString();
        String motDateString = addMOTDate.getText().toString();
        
        int id = 0;
        try{
            prestate = db.conn.prepareStatement("INSERT INTO `garits`.`customers`(name, address, PostCode,"
                    + "TelephoneNumber, EMail, CustomerType, DiscountType) "
                    + "Values (?,?,?,?,?,?,?)");
            prestate.setString(1, name);
            prestate.setString(2, address);
            prestate.setString(3, postcode);
            prestate.setString(4, phone);
            prestate.setString(5, email);
            prestate.setString(6, customerType);
            prestate.setString(7, discountTypeString);
            int i = prestate.executeUpdate();
            prestate = db.conn.prepareStatement("Select customers.customerID From Customers Where customers.name = "
               + "'"+name+"'");
            ResultSet result = prestate.executeQuery();
            result.next();
            id = result.getInt("CustomerID");
            prestate = db.conn.prepareStatement("INSERT INTO `garits`.`vehicle`(CustomerID ,CustomerName, "
                    + "regNum,"
                    + "Make, Model, EngSerial, ChassieNumber, Colour, `MOT Date`) "
                    + "Values( " + id + ", ?,?,?,?,?,?,?,? )" );
            prestate.setString(1, name);
            prestate.setString(2, regno);
            prestate.setString(3, make);
            prestate.setString(4, model);
            prestate.setString(5, eng);
            prestate.setString(6, chass);
            prestate.setString(7, colour);
            prestate.setString(8, motDateString);
            prestate.executeUpdate();
            if (i>0){
                JOptionPane.showMessageDialog(null, "Customer has been added");
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Customer has not been added");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_addCustomerActionPerformed

    private void closeAddingCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAddingCustomerActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeAddingCustomerActionPerformed

    private void customerTypeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerTypeFieldActionPerformed
        customerTypeField.setText(customerTypeBox.getSelectedItem().toString());
    }//GEN-LAST:event_customerTypeFieldActionPerformed

    private void editAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editAddressActionPerformed

    private void editColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editColourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editColourActionPerformed

    private void editUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserButtonActionPerformed
             try {
                prestate = db.conn.prepareStatement("UPDATE `customers` SET `name` = '"+ editName.getText()+"',"
                    + "`address` = '"+ editAddress.getText()+"', `PostCode` = '"+ editPostCode.getText()+"',"
                    + "`TelephoneNumber` = '"+ editPhone.getText()+"', `EMail` = '"+ editEMail.getText()+"',"
                    + "`CustomerType` = '"+editCustomerType.getText() +"', "
                        + " `DiscountType` = '"+editDiscountBox.getSelectedItem().toString()+"' WHERE "
                        + "`CustomerID` = '"+customerID.getText()+"' ");
                prestate.execute();
                prestate = db.conn.prepareStatement("UPDATE `vehicle` SET `RegNum` = '"+editReg.getText()+"',"
                        + "`Make` = '"+editMake.getText()+"', `Model` = '"+editModel.getText()+"', "
                        + "`EngSerial` = '"+editEng.getText()+"', `ChassieNumber` = '"+editChass.getText()+"', "
                        + "`Colour` = '"+editColour.getText()+"' , `MOT Date` = '"+editMOTDate.getText()+"'    WHERE `CustomerID` = '"+customerID.getText()+"' AND `RegNum` = '"+editReg.getText()+"' " );
                prestate.execute();
                editUserPanel.setVisible(false);
                JOptionPane.showMessageDialog(null, "Customer with ID: " + customerID.getText()+ " has been updated");
            }catch(Exception ex) {
                JOptionPane.showMessageDialog(null, "Customer with ID: " + customerID.getText() + " Cannot be updated");
                ex.printStackTrace();
            }         
    }//GEN-LAST:event_editUserButtonActionPerformed

    private void closeButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonEditActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeButtonEditActionPerformed

    private void editCustomerTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCustomerTypeActionPerformed
       
    }//GEN-LAST:event_editCustomerTypeActionPerformed

    private void editMOTDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMOTDateActionPerformed
        
    }//GEN-LAST:event_editMOTDateActionPerformed

    private void customerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIDActionPerformed

    }//GEN-LAST:event_customerIDActionPerformed

    private void mulitpleCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulitpleCloseActionPerformed
        addingExtraVeh.setVisible(false);
    }//GEN-LAST:event_mulitpleCloseActionPerformed

    private void addMulitpleVechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMulitpleVechActionPerformed
        try{
            int index = customerTable.getSelectedRow();
            mulitpleCustomerID.setText(customerTable.getValueAt(index, 0).toString());
            mulitpleName.setText(customerTable.getValueAt(index, 1).toString());
            buttons.setVisible(false);
            addingExtraVeh.setVisible(true);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Please select a customer you wish to add mulitple vehicle");
        }
    }//GEN-LAST:event_addMulitpleVechActionPerformed

    private void mulitpleAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulitpleAddActionPerformed
        try{
            String customerIDString = mulitpleCustomerID.getText();
            String nameString = mulitpleName.getText();
            String regNoString = mulitpleRegNo.getText();
            String makeString = mulitpleMake.getText();
            String modelString = mulitpleModel.getText();
            String engString = mulitpleEngSerial.getText();
            String chassString = mulitpleChassNumber.getText();
            String colourString = mulitpleColour.getText();
            String mulitpleMOTDateString = mulitpleMOTDate.getText();
            prestate = db.conn.prepareStatement("INSERT INTO `vehicle` (CustomerID, CustomerName,"
                    + "regNum, Make, Model, EngSerial, ChassieNumber, Colour, `MOT Date` ) "
                    + "Value(?,?,?,?,?,?,?,?,?) ");
            prestate.setString(1, customerIDString);
            prestate.setString(2, nameString);
            prestate.setString(3, regNoString);
            prestate.setString(4, makeString);
            prestate.setString(5, modelString);
            prestate.setString(6, engString);
            prestate.setString(7, chassString);
            prestate.setString(8, colourString);
            prestate.setString(9, mulitpleMOTDateString);
            int i = prestate.executeUpdate();
            if(i > 0){
               JOptionPane.showMessageDialog(null, "Customer: " + nameString + " has added another vehicle");
               addingExtraVeh.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Customer: " + nameString + " has not added another vehicle");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_mulitpleAddActionPerformed

    private void customerTypeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerTypeBoxActionPerformed
        customerTypeField.setText(customerTypeBox.getSelectedItem().toString());
    }//GEN-LAST:event_customerTypeBoxActionPerformed

    private void searchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerActionPerformed
       try{
            prestate = db.conn.prepareStatement("SELECT customers.CustomerID, customers.name, customers.address, "
                    + "customers.PostCode, customers.TelephoneNumber, customers.EMail, customers.CustomerType, "
                    + "customers.Discount, vehicle.regNum, vehicle.Make, vehicle.Model, vehicle.EngSerial, vehicle.ChassieNumber, "
                    + "vehicle.Colour FROM customers INNER JOIN vehicle on customers.CustomerID = vehicle.CustomerID WHERE customers.name like '%"+searchCustomerField.getText()+"%'");
            ResultSet result = prestate.executeQuery();
            prestate = db.conn.prepareStatement("SELECT count(*), customers.CustomerID, customers.name, customers.address, "
                    + "customers.PostCode, customers.TelephoneNumber, customers.EMail, customers.CustomerType, customers.Discount, "
                    + "vehicle.regNum, vehicle.Make, vehicle.Model, vehicle.EngSerial, vehicle.ChassieNumber, vehicle.Colour FROM customers "
                    + "INNER JOIN vehicle on customers.CustomerID = vehicle.CustomerID WHERE customers.name like '%"+searchCustomerField.getText()+"%'");
            ResultSet result2 = prestate.executeQuery();
            result2.next();
            int it = result2.getInt("Count(*)");
            if(it > 0){
            customerTable.setModel(DbUtils.resultSetToTableModel(result));
            }else{
                JOptionPane.showMessageDialog(null, "The Customer: " + searchCustomerField.getText() +" cannot be found");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
        }
    }//GEN-LAST:event_searchCustomerActionPerformed

    private void updateTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTableButtonActionPerformed
        updateTable();
    }//GEN-LAST:event_updateTableButtonActionPerformed

    private void discountBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountBoxActionPerformed

    private void editDiscountBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDiscountBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editDiscountBoxActionPerformed

    private void customerTypeBoxEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerTypeBoxEditActionPerformed
        editCustomerType.setText(customerTypeBox.getSelectedItem().toString());
    }//GEN-LAST:event_customerTypeBoxEditActionPerformed

    private void addMOTDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMOTDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addMOTDateActionPerformed

    private void deleteVehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteVehActionPerformed
       int index = customerTable.getSelectedRow();
       //7
       String veh = customerTable.getValueAt(index, 7).toString();
       try{
           prestate = db.conn.prepareStatement("DELETE FROM `vehicle` WHERE `regNum` = '"+veh+"' ");
           prestate.execute();
           updateTable();
           JOptionPane.showMessageDialog(null, "Vehicle: " + veh  + " has been deleted");
       }catch(Exception ex){
           
       }
    }//GEN-LAST:event_deleteVehActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomer;
    private javax.swing.JTextField addMOTDate;
    private javax.swing.JButton addMulitpleVech;
    private javax.swing.JPanel addPanel;
    private javax.swing.JPanel addingExtraVeh;
    private javax.swing.JPanel buttons;
    private javax.swing.JButton closeAddingCustomer;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton closeButtonEdit;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField customerID;
    private javax.swing.JTable customerTable;
    private javax.swing.JComboBox customerTypeBox;
    private javax.swing.JComboBox customerTypeBoxEdit;
    private javax.swing.JTextField customerTypeField;
    private javax.swing.JButton deleteCustomerButton;
    private javax.swing.JButton deleteVeh;
    private javax.swing.JComboBox discountBox;
    private javax.swing.JTextField editAddress;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField editChass;
    private javax.swing.JTextField editColour;
    private javax.swing.JTextField editCustomerType;
    private javax.swing.JComboBox editDiscountBox;
    private javax.swing.JTextField editEMail;
    private javax.swing.JTextField editEng;
    private javax.swing.JTextField editMOTDate;
    private javax.swing.JTextField editMake;
    private javax.swing.JTextField editModel;
    private javax.swing.JTextField editName;
    private javax.swing.JTextField editPhone;
    private javax.swing.JTextField editPostCode;
    private javax.swing.JTextField editReg;
    private javax.swing.JButton editUserButton;
    private javax.swing.JPanel editUserPanel;
    private javax.swing.JTextField insertAddress;
    private javax.swing.JTextField insertChass;
    private javax.swing.JTextField insertColour;
    private javax.swing.JTextField insertEMail;
    private javax.swing.JTextField insertEng;
    private javax.swing.JTextField insertMake;
    private javax.swing.JTextField insertModel;
    private javax.swing.JTextField insertName;
    private javax.swing.JTextField insertPhone;
    private javax.swing.JTextField insertPostCode;
    private javax.swing.JTextField insertReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mulitpleAdd;
    private javax.swing.JTextField mulitpleChassNumber;
    private javax.swing.JButton mulitpleClose;
    private javax.swing.JTextField mulitpleColour;
    private javax.swing.JTextField mulitpleCustomerID;
    private javax.swing.JTextField mulitpleEngSerial;
    private javax.swing.JTextField mulitpleMOTDate;
    private javax.swing.JTextField mulitpleMake;
    private javax.swing.JTextField mulitpleModel;
    private javax.swing.JTextField mulitpleName;
    private javax.swing.JTextField mulitpleRegNo;
    private javax.swing.JButton searchCustomer;
    private javax.swing.JTextField searchCustomerField;
    private javax.swing.JButton updateTableButton;
    // End of variables declaration//GEN-END:variables
}