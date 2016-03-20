package garits;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttons = new javax.swing.JPanel();
        addUser = new javax.swing.JButton();
        editUser = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userNames = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        addUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\addUserIcon.png")); // NOI18N
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });
        buttons.add(addUser);

        editUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\editUserIcon.png")); // NOI18N
        editUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserActionPerformed(evt);
            }
        });
        buttons.add(editUser);

        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\closeicon.png")); // NOI18N
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        buttons.add(close);

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
        jScrollPane1.setViewportView(userNames);

        buttons.add(jScrollPane1);

        add(buttons);
        buttons.setBounds(460, 200, 570, 520);

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUser;
    private javax.swing.JPanel buttons;
    private javax.swing.JButton close;
    private javax.swing.JButton editUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable userNames;
    // End of variables declaration//GEN-END:variables
}

