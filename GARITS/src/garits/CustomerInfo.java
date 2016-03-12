package garits;

import net.proteanit.sql.DbUtils;
import java.sql.*;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

public class CustomerInfo extends javax.swing.JFrame {
    
    DBConnect db;
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement pst;    
    
    public CustomerInfo() {
        initComponents();
        newCustomer.setOpaque(false);
        newCustomer.setContentAreaFilled(false); 
        newCustomer.setBorderPainted(false);
        close.setOpaque(false);
        close.setContentAreaFilled(false); 
        close.setBorderPainted(false);
        editCustomer.setOpaque(false);
        editCustomer.setContentAreaFilled(false); 
        editCustomer.setBorderPainted(false);
        this.setSize(1300, 900);
        this.setResizable(false);
        
    }
    
    public void updateTable(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/garits","root","");
        String query = "select * from `garits`.`customers` ";
        pst=con.prepareStatement(query);
        rs=pst.executeQuery(query);
        //selectCustomer.setModel((ButtonModel)DbUtils.resultSetToTableModel(rs));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newCustomer = new javax.swing.JButton();
        close = new javax.swing.JButton();
        editCustomer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerDetails = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        newCustomer.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\addUserIcon.png")); // NOI18N
        newCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(newCustomer);
        newCustomer.setBounds(440, 240, 121, 143);

        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\closeicon.png")); // NOI18N
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(710, 240, 112, 143);

        editCustomer.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\editUserIcon.png")); // NOI18N
        editCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(editCustomer);
        editCustomer.setBounds(580, 240, 121, 143);

        CustomerDetails.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(CustomerDetails);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(400, 390, 456, 345);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\background.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1410, 910);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCustomerActionPerformed
       AddCustomer addc = new AddCustomer();
       addc.setVisible(true);
    }//GEN-LAST:event_newCustomerActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        MainMenu mainmenu = new MainMenu();
        this.setVisible(false);
        mainmenu.setVisible(true);
    }//GEN-LAST:event_closeActionPerformed

    private void editCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCustomerActionPerformed
        Update update = new Update();
        update.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editCustomerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CustomerDetails;
    private javax.swing.JButton close;
    private javax.swing.JButton editCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newCustomer;
    // End of variables declaration//GEN-END:variables
}