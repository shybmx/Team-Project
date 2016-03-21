package garits;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Register extends javax.swing.JPanel {
    JFrame myFrame;
    Connection conn = null;
    PreparedStatement prestate = null;
    
    public Register(JFrame frame) {
        initComponents();
        myFrame = frame;
        addUser.setOpaque(false);
        addUser.setContentAreaFilled(false); 
        addUser.setBorderPainted(false);
        editUser.setOpaque(false);
        editUser.setContentAreaFilled(false); 
        editUser.setBorderPainted(false);
        close.setOpaque(false);
        close.setContentAreaFilled(false); 
        close.setBorderPainted(false);
        buttons.setOpaque(false);
        updateTable();
        this.setSize(1300, 900);
    }
    
    public void updateTable(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/garits","root","");
            prestate = conn.prepareStatement("SELECT * from `garits`.`login`");
            ResultSet result = prestate.executeQuery();
            userNames.setModel(DbUtils.resultSetToTableModel(result));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    }
    
    public boolean delete(String id){
        try{ 
            Connection con;
            String sql = "DELETE  FROM `login` WHERE 'Username' =  ' " + id + " ' ";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/garits","root","");
            Statement state = con.prepareStatement(sql);
            state.execute(sql);
            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(close, ex);
            return false;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttons = new javax.swing.JPanel();
        addUser = new javax.swing.JButton();
        editUser = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userNames = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        addUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\addUserIcon.png")); // NOI18N
        addUser.setPreferredSize(new java.awt.Dimension(120, 155));
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        editUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\editUserIcon.png")); // NOI18N
        editUser.setPreferredSize(new java.awt.Dimension(120, 155));
        editUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserActionPerformed(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\closeicon.png")); // NOI18N
        close.setPreferredSize(new java.awt.Dimension(120, 155));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

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

        delete.setText("Delete");
        delete.setPreferredSize(new java.awt.Dimension(120, 155));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsLayout = new javax.swing.GroupLayout(buttons);
        buttons.setLayout(buttonsLayout);
        buttonsLayout.setHorizontalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(editUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(413, Short.MAX_VALUE))
        );
        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(buttons);
        buttons.setBounds(20, 200, 1270, 520);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\background.jpg")); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1310, 920);
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.setVisible(false);
         buttons.remove(this);
        this.remove(this);
       
    }//GEN-LAST:event_closeActionPerformed

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        buttons.setVisible(false);
        AddUser addUserPanel = new AddUser();
        myFrame.getContentPane().add(addUserPanel);
    }//GEN-LAST:event_addUserActionPerformed

    private void editUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserActionPerformed
        buttons.setVisible(false);
        EditUser edituserPanel = new EditUser();
        myFrame.getContentPane().add(edituserPanel);
    }//GEN-LAST:event_editUserActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        String[] options ={"Yes","No"};
        int answer = JOptionPane.showOptionDialog(null, "Are you sure you want to Delete?",
                "Confirmed", JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if(answer == 0){
            int index = userNames.getSelectedRow();
            String id = userNames.getValueAt(index, 0).toString();
            if(delete(id)){
                JOptionPane.showMessageDialog(null, id + " has been deleted");
            }else{
                JOptionPane.showMessageDialog(null, id + " has not been deleted");
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void userNamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNamesMouseClicked
        String username = userNames.getValueAt(userNames.getSelectedRow(), 1).toString();
        String logingpassword = userNames.getValueAt(userNames.getSelectedRow(), 2).toString();
        String name = userNames.getValueAt(userNames.getSelectedRow(), 3).toString();
        String address = userNames.getValueAt(userNames.getSelectedRow(), 4).toString();
        String postcode = userNames.getValueAt(userNames.getSelectedRow(), 5).toString();
        String phone = userNames.getValueAt(userNames.getSelectedRow(), 6).toString();
        String email = userNames.getValueAt(userNames.getSelectedRow(), 7).toString();
        String position = userNames.getValueAt(userNames.getSelectedRow(), 8).toString();
        String labourrate = userNames.getValueAt(userNames.getSelectedRow(), 9).toString();
    }//GEN-LAST:event_userNamesMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUser;
    private javax.swing.JPanel buttons;
    private javax.swing.JButton close;
    private javax.swing.JButton delete;
    private javax.swing.JButton editUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable userNames;
    // End of variables declaration//GEN-END:variables
}

