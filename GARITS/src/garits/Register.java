package garits;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Register extends javax.swing.JPanel {
    JFrame myFrame;
    PreparedStatement prestate;
    DBConnect db;
    public Register(JFrame frame, DBConnect db) {
        //Setting up all the componets within this JFrame
        initComponents();
        //Passing in the database connection
        this.db = db;
        //Passing in the JFrame
        myFrame = frame;
        //Removing the background from all the JButtons and JPanels, Making certain textfields uneditable
        delete.setOpaque(false);
        delete.setContentAreaFilled(false); 
        delete.setBorderPainted(false);
        addUserOption.setOpaque(false);
        addUserOption.setContentAreaFilled(false); 
        addUserOption.setBorderPainted(false);
        editUser.setOpaque(false);
        editUser.setContentAreaFilled(false); 
        editUser.setBorderPainted(false);
        close.setOpaque(false);
        close.setContentAreaFilled(false); 
        close.setBorderPainted(false);
        closeAddUser.setOpaque(false);
        closeAddUser.setContentAreaFilled(false); 
        closeAddUser.setBorderPainted(false);
        addUser.setOpaque(false);
        addUser.setContentAreaFilled(false); 
        addUser.setBorderPainted(false);
        editUserButton.setOpaque(false);
        editUserButton.setContentAreaFilled(false); 
        editUserButton.setBorderPainted(false);
        closeEditUser.setOpaque(false);
        closeEditUser.setContentAreaFilled(false); 
        closeEditUser.setBorderPainted(false);
        buttons1.setOpaque(false);
        fieldsPanel.setOpaque(false);
        formPanel1.setOpaque(false);
        formPanel2.setOpaque(false);
        formPanel3.setOpaque(false);
        formPanel4.setOpaque(false);
        editUserButtons.setOpaque(false);
        buttons.setOpaque(false);
        editingUser.setVisible(false);
        editingUser.setOpaque(false);
        editUserName.setEditable(false);
        fieldsPanel.setVisible(false);
        search.setOpaque(false);
        search.setContentAreaFilled(false); 
        search.setBorderPainted(false);
        refreshTable.setOpaque(false);
        refreshTable.setContentAreaFilled(false); 
        refreshTable.setBorderPainted(false);
        //Refresing the JTable
        updateTable();
        //Setting the size of this JPanel
        this.setSize(1300, 900);
    }
    
    public void updateTable(){
        try{
            //Creating a MySQL statement which will get all from login
            prestate = db.conn.prepareStatement("SELECT * from `login`");
            //Executing the query and placing it in a result set
            ResultSet result = prestate.executeQuery();
            //Placing the result within a JTable
            userNames.setModel(DbUtils.resultSetToTableModel(result));
        }catch(Exception ex){
            //Showing any error message with the database connection or MySQL statement
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    }
    
    public boolean delete(String id){
        try{ 
            //Creating a MySQL statement which will delete a user from the database
            String sql = "DELETE FROM `login` WHERE `Username` = '" + id + "'";
            //Passing in the query into the database
            prestate = db.conn.prepareStatement(sql);
            //Executing the query
            prestate.execute();
            //Returning true
            return true;
        }catch(Exception ex){
            //An error message
            JOptionPane.showMessageDialog(close, ex);
            //Returning false
            return false;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttons = new javax.swing.JPanel();
        addUserOption = new javax.swing.JButton();
        editUser = new javax.swing.JButton();
        close = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        searchUser = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        refreshTable = new javax.swing.JButton();
        editingUser = new javax.swing.JPanel();
        formPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        editName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        editAddress = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        editPostCode = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        editPhone = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        editEMail = new javax.swing.JTextField();
        formPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        editUserName = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        editPassword = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        reTypePassWord = new javax.swing.JTextField();
        editUserButtons = new javax.swing.JPanel();
        editUserButton = new javax.swing.JButton();
        closeEditUser = new javax.swing.JButton();
        fieldsPanel = new javax.swing.JPanel();
        formPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        insertName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        insertAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        insertPostCode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        insertPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        insertEMail = new javax.swing.JTextField();
        insertPosition = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        insertLabourRate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        insertPositionText = new javax.swing.JTextField();
        formPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        insertUserName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        insertPassword = new javax.swing.JPasswordField();
        insertPassword1 = new javax.swing.JPasswordField();
        buttons1 = new javax.swing.JPanel();
        addUser = new javax.swing.JButton();
        closeAddUser = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userNames = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        addUserOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/addUserIcon.png"))); // NOI18N
        addUserOption.setPreferredSize(new java.awt.Dimension(120, 155));
        addUserOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserOptionActionPerformed(evt);
            }
        });

        editUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/editUserIcon.png"))); // NOI18N
        editUser.setPreferredSize(new java.awt.Dimension(120, 155));
        editUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserActionPerformed(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        close.setPreferredSize(new java.awt.Dimension(120, 155));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/delete.png"))); // NOI18N
        delete.setPreferredSize(new java.awt.Dimension(120, 155));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/searchicon.png"))); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
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
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addUserOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(editUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(searchUser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(buttonsLayout.createSequentialGroup()
                        .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(refreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addUserOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        add(buttons);
        buttons.setBounds(30, 280, 1100, 170);

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel13.setText("Name:");

        editName.setPreferredSize(new java.awt.Dimension(200, 30));
        editName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNameActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel14.setText("Address:");

        editAddress.setPreferredSize(new java.awt.Dimension(200, 30));
        editAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAddressActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel15.setText("Post Code:");

        editPostCode.setPreferredSize(new java.awt.Dimension(200, 30));
        editPostCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPostCodeActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel16.setText("Phone:");

        editPhone.setPreferredSize(new java.awt.Dimension(200, 30));
        editPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPhoneActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel17.setText("E-Mail:");

        editEMail.setPreferredSize(new java.awt.Dimension(200, 30));
        editEMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEMailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formPanel3Layout = new javax.swing.GroupLayout(formPanel3);
        formPanel3.setLayout(formPanel3Layout);
        formPanel3Layout.setHorizontalGroup(
            formPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(formPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(formPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(71, 71, 71)
                        .addComponent(editName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPanel3Layout.createSequentialGroup()
                        .addGroup(formPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(formPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editEMail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formPanel3Layout.setVerticalGroup(
            formPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(formPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(editName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(editAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(editPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(editPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(editEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(172, 172, 172))
        );

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel18.setText("Username:");

        editUserName.setMinimumSize(new java.awt.Dimension(200, 30));
        editUserName.setPreferredSize(new java.awt.Dimension(200, 30));
        editUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserNameActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel19.setText("Password:");

        editPassword.setPreferredSize(new java.awt.Dimension(200, 30));
        editPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPasswordActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel20.setText("Re-Type Password:");

        reTypePassWord.setMinimumSize(new java.awt.Dimension(200, 30));
        reTypePassWord.setPreferredSize(new java.awt.Dimension(200, 30));
        reTypePassWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reTypePassWordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formPanel4Layout = new javax.swing.GroupLayout(formPanel4);
        formPanel4.setLayout(formPanel4Layout);
        formPanel4Layout.setHorizontalGroup(
            formPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(105, 105, 105)
                        .addComponent(editUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(formPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(formPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(reTypePassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formPanel4Layout.setVerticalGroup(
            formPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(formPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(editUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(editPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(reTypePassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
        );

        editUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/editUserIcon.png"))); // NOI18N
        editUserButton.setPreferredSize(new java.awt.Dimension(120, 155));
        editUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserButtonActionPerformed(evt);
            }
        });
        editUserButtons.add(editUserButton);

        closeEditUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        closeEditUser.setMinimumSize(new java.awt.Dimension(120, 155));
        closeEditUser.setName(""); // NOI18N
        closeEditUser.setPreferredSize(new java.awt.Dimension(120, 155));
        closeEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeEditUserActionPerformed(evt);
            }
        });
        editUserButtons.add(closeEditUser);

        javax.swing.GroupLayout editingUserLayout = new javax.swing.GroupLayout(editingUser);
        editingUser.setLayout(editingUserLayout);
        editingUserLayout.setHorizontalGroup(
            editingUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editingUserLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(formPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editingUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(formPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editUserButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        editingUserLayout.setVerticalGroup(
            editingUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editingUserLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(editingUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editingUserLayout.createSequentialGroup()
                        .addComponent(formPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editUserButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(formPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(editingUser);
        editingUser.setBounds(170, 410, 930, 370);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Name:");

        insertName.setPreferredSize(new java.awt.Dimension(200, 30));
        insertName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Address:");

        insertAddress.setPreferredSize(new java.awt.Dimension(200, 30));
        insertAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertAddressActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Post Code:");

        insertPostCode.setPreferredSize(new java.awt.Dimension(200, 30));
        insertPostCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertPostCodeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Phone:");

        insertPhone.setPreferredSize(new java.awt.Dimension(200, 30));
        insertPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertPhoneActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("E-Mail:");

        insertEMail.setPreferredSize(new java.awt.Dimension(200, 30));
        insertEMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertEMailActionPerformed(evt);
            }
        });

        insertPosition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "ForePerson", "Franchisee", "Mechanic", "Receptionist" }));
        insertPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertPositionActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel10.setText("Position:");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel11.setText("Labour Rate:");

        insertLabourRate.setPreferredSize(new java.awt.Dimension(200, 30));
        insertLabourRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertLabourRateActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel12.setText("Position:");

        insertPositionText.setText("Admin");
        insertPositionText.setPreferredSize(new java.awt.Dimension(200, 30));
        insertPositionText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertPositionTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formPanel1Layout = new javax.swing.GroupLayout(formPanel1);
        formPanel1.setLayout(formPanel1Layout);
        formPanel1Layout.setHorizontalGroup(
            formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insertPositionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insertLabourRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insertPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insertAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insertName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanel1Layout.createSequentialGroup()
                        .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(insertPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(insertEMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(insertPosition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        formPanel1Layout.setVerticalGroup(
            formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(insertName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(insertAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(insertPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(insertPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(insertEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(insertPositionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(insertLabourRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setText("Username:");

        insertUserName.setMinimumSize(new java.awt.Dimension(200, 30));
        insertUserName.setPreferredSize(new java.awt.Dimension(200, 30));
        insertUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertUserNameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setText("Password:");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setText("Re-Type Password:");

        insertPassword.setPreferredSize(new java.awt.Dimension(200, 30));
        insertPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertPasswordActionPerformed(evt);
            }
        });

        insertPassword1.setPreferredSize(new java.awt.Dimension(200, 30));
        insertPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertPassword1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formPanel2Layout = new javax.swing.GroupLayout(formPanel2);
        formPanel2.setLayout(formPanel2Layout);
        formPanel2Layout.setHorizontalGroup(
            formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(105, 105, 105)
                        .addComponent(insertUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPanel2Layout.createSequentialGroup()
                        .addGroup(formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(formPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(110, 110, 110)))
                        .addGroup(formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insertPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(insertPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        formPanel2Layout.setVerticalGroup(
            formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(insertUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(insertPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(insertPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        addUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/add.png"))); // NOI18N
        addUser.setPreferredSize(new java.awt.Dimension(120, 155));
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });
        buttons1.add(addUser);

        closeAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        closeAddUser.setMinimumSize(new java.awt.Dimension(120, 155));
        closeAddUser.setName(""); // NOI18N
        closeAddUser.setPreferredSize(new java.awt.Dimension(120, 155));
        closeAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeAddUserActionPerformed(evt);
            }
        });
        buttons1.add(closeAddUser);

        javax.swing.GroupLayout fieldsPanelLayout = new javax.swing.GroupLayout(fieldsPanel);
        fieldsPanel.setLayout(fieldsPanelLayout);
        fieldsPanelLayout.setHorizontalGroup(
            fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsPanelLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(formPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fieldsPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(formPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fieldsPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttons1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        fieldsPanelLayout.setVerticalGroup(
            fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldsPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(fieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fieldsPanelLayout.createSequentialGroup()
                        .addComponent(formPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(fieldsPanelLayout.createSequentialGroup()
                        .addComponent(formPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttons1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        add(fieldsPanel);
        fieldsPanel.setBounds(10, 330, 1050, 470);

        userNames.setModel(new javax.swing.table.DefaultTableModel(
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
        userNames.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userNamesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userNames);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );

        add(tablePanel);
        tablePanel.setBounds(0, 470, 1310, 290);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1300, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        //Making this JPanel invisable
        this.setVisible(false);
        buttons.remove(this);
        this.remove(this);
    }//GEN-LAST:event_closeActionPerformed

    private void addUserOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserOptionActionPerformed
        //Closing the JPanels
        tablePanel.setVisible(false);
        buttons.setVisible(false);
        //Making this JPanel visable
        fieldsPanel.setVisible(true);
    }//GEN-LAST:event_addUserOptionActionPerformed

    private void editUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserActionPerformed
        try{
            //Getting the selected row and placing it in an int variable
            int index = userNames.getSelectedRow();
            //Getting the values fromt the JTables and convertin them to string
            editUserName.setText(userNames.getValueAt(index, 0).toString());
            editPassword.setText(userNames.getValueAt(index, 1).toString());
            editName.setText(userNames.getValueAt(index, 2).toString()); 
            editAddress.setText(userNames.getValueAt(index, 3).toString());
            editPostCode.setText(userNames.getValueAt(index, 4).toString());
            editPhone.setText(userNames.getValueAt(index, 5).toString());
            editEMail.setText(userNames.getValueAt(index, 6).toString());
            //Making the JPanels invisable
            tablePanel.setVisible(false);
            buttons.setVisible(false);
            //Making the JPanel visable
            editingUser.setVisible(true);
        }catch(Exception ex){
            //An error message if there was no user selected
            JOptionPane.showMessageDialog(null, "Please select a user you wish to edit");
        }
                
    }//GEN-LAST:event_editUserActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        //Array of strings which hold the options
        String[] options ={"Yes","No"};
        //A pop up box asking if the user should be deleted
        int answer = JOptionPane.showOptionDialog(null, "Are you sure you want to Delete?",
                "Confirmed", JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        //If the answer is yes
        if(answer == 0){
            //Get the user name
            int index = userNames.getSelectedRow();
            //Create a string id with the user name
            String id = userNames.getValueAt(index, 0).toString();
            //If returned true
            if(delete(id)){
                //Update the JTable
                updateTable();
                //A pop up box showing the user has been deleted
                JOptionPane.showMessageDialog(null, id + " has been deleted");
            }else{
                //A pop up box showing the user has not been deleted
                JOptionPane.showMessageDialog(null, id + " has not been deleted");
            }
        }       
    }//GEN-LAST:event_deleteActionPerformed

    private void userNamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNamesMouseClicked
    }//GEN-LAST:event_userNamesMouseClicked

    private void insertNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertNameActionPerformed

    private void insertAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertAddressActionPerformed

    private void insertPostCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPostCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertPostCodeActionPerformed

    private void insertPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertPhoneActionPerformed

    private void insertEMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertEMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertEMailActionPerformed

    private void insertPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPositionActionPerformed
        //Getting the selected items from the drop box menu and placing it in a text field
        insertPositionText.setText(insertPosition.getSelectedItem().toString());
    }//GEN-LAST:event_insertPositionActionPerformed

    private void insertLabourRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertLabourRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertLabourRateActionPerformed

    private void insertPositionTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPositionTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertPositionTextActionPerformed

    private void insertUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertUserNameActionPerformed

    private void insertPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertPasswordActionPerformed

    private void insertPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertPassword1ActionPerformed

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        //Getting all the Text field items and placing them into a string variable
        String username = insertUserName.getText();
        String password = insertPassword.getText();
        String name = insertName.getText();
        String address = insertAddress.getText();
        String postCode = insertPostCode.getText();
        String phonenumber = insertPhone.getText();
        String email = insertEMail.getText();
        String position = insertPositionText.getText();
        String labourRate = insertLabourRate.getText();
        try{
            //Creating a MySQL statement which will insert the details into the database
            prestate = db.conn.prepareStatement("INSERT INTO `garits`.`login`(Username, Loginpassword, "
                + "Name, Address, PostCode, Telephone, EMail, Position, LabourRate)"
                + "Values(?,?,?,?,?,?,?,?,?)");
            //Passing in the string variables into the MySQL query
            prestate.setString(1, username);
            prestate.setString(2, password);
            prestate.setString(3, name);
            prestate.setString(4, address);
            prestate.setString(5, postCode);
            prestate.setString(6, phonenumber);
            prestate.setString(7, email);
            prestate.setString(8, position);
            prestate.setString(9, labourRate);
            //Executing the query and placing it in an int variable
            int i = prestate.executeUpdate();
            if(i>0){
                //A pop up box showing that the user has been added
                JOptionPane.showMessageDialog(null, "User has been added");
            }else{
                //A pop up box showing an error with adding the user
                JOptionPane.showMessageDialog(null, "User cannot be added");
            }
        }catch(Exception ex){
            //Closing the JPanel
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_addUserActionPerformed

    private void closeAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAddUserActionPerformed
        //Closing this JPanel
        this.setVisible(false);
    }//GEN-LAST:event_closeAddUserActionPerformed

    private void editNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNameActionPerformed

    }//GEN-LAST:event_editNameActionPerformed

    private void editAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editAddressActionPerformed

    private void editPostCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPostCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editPostCodeActionPerformed

    private void editPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editPhoneActionPerformed

    private void editEMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editEMailActionPerformed

    private void editUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editUserNameActionPerformed

    private void editPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editPasswordActionPerformed

    private void reTypePassWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reTypePassWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reTypePassWordActionPerformed

    private void editUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserButtonActionPerformed
        try{
            //Creating a MySQL query that will update the information of the customer
            prestate = db.conn.prepareStatement("UPDATE `login` SET `Name` = '"  + editName.getText() +"', "
                + " `Loginpassword` = '" +  editPassword.getText() + "', `PostCode` = '"+ editPostCode.getText()+  "', "
                + " `Telephone` = '"+ editPhone.getText()+"', `EMail` = '"+ editEMail.getText()+"', "
                    + "`Address` = '"+editAddress.getText()+"' "
                + " WHERE `Username` = '" + editUserName.getText() +"' ");
            //Executing the query
            prestate.execute();
            //Making this JPanel invisable
            editingUser.setVisible(false);
            //A pop up menu which will show the user has been updated
            JOptionPane.showMessageDialog(null, "User: " + editUserName.getText() + " has been updated");
        }catch(Exception ex){
            //A pop up box showing an error with updating the user
            JOptionPane.showMessageDialog(null, "User: " + editUserName.getText() + " has not been updated");
        }
    }//GEN-LAST:event_editUserButtonActionPerformed

    private void closeEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeEditUserActionPerformed
        //Closing the JPanel
        this.setVisible(false);
    }//GEN-LAST:event_closeEditUserActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try{
            //Creating a MySQL statement which will select all from a search box
            prestate = db.conn.prepareStatement("SELECT * FROM `login` WHERE  `Username` = '"+searchUser.getText()+"' ");
            //Executing the query and placing it in a result set
            ResultSet result = prestate.executeQuery();
            //Placing the result into the JTable
            userNames.setModel(DbUtils.resultSetToTableModel(result));
        }catch(Exception ex){
            //Showing an error message that there was a problem with the database or MySQL statement
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
        }
        try{
            //Creating a MySQL statement which will select all from a search box
            prestate = db.conn.prepareStatement("SELECT * FROM `login` WHERE  `name` LIKE '"+searchUser.getText()+"' ");
            //Executing the query and placing it in a result set
            ResultSet result = prestate.executeQuery();
            //Creating the MySQL statement which will get the count from the search box
            prestate = db.conn.prepareStatement("Select Count(*) FROM `login` WHERE `name` LIKE  '"+searchUser.getText()+"' ");
            //Executing the query and placing it in a result set
            ResultSet result2 = prestate.executeQuery();
            //Goes to the next result which is not the header
            result2.next();
            //Getting the count and placing the count into a int variable
            int it = result2.getInt("Count(*)");
            //If the count is larger then 0
            if(it > 0){
                //Placing the results within the JTable
                userNames.setModel(DbUtils.resultSetToTableModel(result));
            }else{
                
            }
        }catch(Exception ex){
            //Showing an error message with a connection to the database or MySQL statement
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
        }
    }//GEN-LAST:event_searchActionPerformed

    private void refreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTableActionPerformed
        //Refreshing the JTable
        updateTable();
    }//GEN-LAST:event_refreshTableActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUser;
    private javax.swing.JButton addUserOption;
    private javax.swing.JPanel buttons;
    private javax.swing.JPanel buttons1;
    private javax.swing.JButton close;
    private javax.swing.JButton closeAddUser;
    private javax.swing.JButton closeEditUser;
    private javax.swing.JButton delete;
    private javax.swing.JTextField editAddress;
    private javax.swing.JTextField editEMail;
    private javax.swing.JTextField editName;
    private javax.swing.JTextField editPassword;
    private javax.swing.JTextField editPhone;
    private javax.swing.JTextField editPostCode;
    private javax.swing.JButton editUser;
    private javax.swing.JButton editUserButton;
    private javax.swing.JPanel editUserButtons;
    private javax.swing.JTextField editUserName;
    private javax.swing.JPanel editingUser;
    private javax.swing.JPanel fieldsPanel;
    private javax.swing.JPanel formPanel1;
    private javax.swing.JPanel formPanel2;
    private javax.swing.JPanel formPanel3;
    private javax.swing.JPanel formPanel4;
    private javax.swing.JTextField insertAddress;
    private javax.swing.JTextField insertEMail;
    private javax.swing.JTextField insertLabourRate;
    private javax.swing.JTextField insertName;
    private javax.swing.JPasswordField insertPassword;
    private javax.swing.JPasswordField insertPassword1;
    private javax.swing.JTextField insertPhone;
    private javax.swing.JComboBox insertPosition;
    private javax.swing.JTextField insertPositionText;
    private javax.swing.JTextField insertPostCode;
    private javax.swing.JTextField insertUserName;
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
    private javax.swing.JTextField reTypePassWord;
    private javax.swing.JButton refreshTable;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchUser;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JTable userNames;
    // End of variables declaration//GEN-END:variables
}