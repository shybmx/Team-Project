package garits;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class CustomerInfo extends javax.swing.JPanel {
    JFrame myFrame;
    DBConnect db;
    PreparedStatement prestate;
    public CustomerInfo(JFrame frame, DBConnect db) {
        initComponents();
        this.db = db;
        myFrame = frame;
        close.setOpaque(false);
        close.setContentAreaFilled(false); 
        close.setBorderPainted(false);
        create.setOpaque(false);
        create.setContentAreaFilled(false); 
        create.setBorderPainted(false);
        edit.setOpaque(false);
        edit.setContentAreaFilled(false); 
        edit.setBorderPainted(false);
        buttons.setOpaque(false);
        updateTable();
        this.setSize(1300, 900);
    }
    
    public boolean delete(String id){
        try{ 
            String sql = "DELETE FROM `customers` WHERE `CustomerID` = '" + id + "'";
            prestate = db.conn.prepareStatement(sql);
            prestate.execute();
            System.out.println(sql);
            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(close, ex);
            return false;
        }
    }
    
    public void updateTable(){
        try{
            prestate = db.conn.prepareStatement("SELECT * FROM `customers`");
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
        create = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        close = new javax.swing.JButton();
        deleteCustomer = new javax.swing.JButton();
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

        create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/createcustomer.png"))); // NOI18N
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/editCustomer.png"))); // NOI18N
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        deleteCustomer.setText("Delete Customer");
        deleteCustomer.setPreferredSize(new java.awt.Dimension(120, 155));
        deleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsLayout = new javax.swing.GroupLayout(buttons);
        buttons.setLayout(buttonsLayout);
        buttonsLayout.setHorizontalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsLayout.createSequentialGroup()
                .addContainerGap(334, Short.MAX_VALUE)
                .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(443, 443, 443))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(buttons);
        buttons.setBounds(10, 310, 1280, 577);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1300, 940);
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        buttons.setVisible(false);
        AddCustomer addCustomerPanel = new AddCustomer();
        myFrame.getContentPane().add(addCustomerPanel);
    }//GEN-LAST:event_createActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        buttons.setVisible(false);
        EditCustomer editCustomerPanel = new EditCustomer();
        myFrame.getContentPane().add(editCustomerPanel);
    }//GEN-LAST:event_editActionPerformed

    private void deleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerActionPerformed
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
    }//GEN-LAST:event_deleteCustomerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttons;
    private javax.swing.JButton close;
    private javax.swing.JButton create;
    private javax.swing.JTable customerTable;
    private javax.swing.JButton deleteCustomer;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
