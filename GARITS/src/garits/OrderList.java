package garits;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class OrderList extends javax.swing.JFrame {
    PreparedStatement prestate;
    DBConnect db;
    public OrderList(DBConnect db) {
        //Setting up the componets within the JFrame
        initComponents();
        //Setting the size of the JFrame
        this.setSize(890, 620);
        //Making the size of the JFrame non resizeable
        this.setResizable(false);
        //Passing in the database connection
        this.db = db;
        //Updating the JTable
        updateTable();
        //Removing the background from the JButtons and JPanels
        searchTable.setOpaque(false);
        searchTable.setContentAreaFilled(false); 
        searchTable.setBorderPainted(false);
        resetTable.setOpaque(false);
        resetTable.setContentAreaFilled(false); 
        resetTable.setBorderPainted(false);
        closeFrame.setOpaque(false);
        closeFrame.setContentAreaFilled(false); 
        closeFrame.setBorderPainted(false);
        //Making the program not close when the close button is hit
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    public void updateTable(){
        try{
            //Creating a MySQL statement that will select everything from the parts table
            prestate = db.conn.prepareStatement("SELECT * FROM `part order`");
            //Executing the query and placing it in a result set
            ResultSet result = prestate.executeQuery();
            //Placing the result within a JTable
            orderListTable.setModel(DbUtils.resultSetToTableModel(result));
        }catch(Exception ex){
            //A pop up box to show an error with thr database connection or the mySQL statement
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        orderListTable = new javax.swing.JTable();
        searchTable = new javax.swing.JButton();
        searchOrderNumber = new javax.swing.JTextField();
        resetTable = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        closeFrame = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        orderListTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(orderListTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 165, 860, 403);

        searchTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/searchicon.png"))); // NOI18N
        searchTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTableActionPerformed(evt);
            }
        });
        getContentPane().add(searchTable);
        searchTable.setBounds(409, 11, 118, 143);
        getContentPane().add(searchOrderNumber);
        searchOrderNumber.setBounds(223, 78, 180, 30);

        resetTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/update.png"))); // NOI18N
        resetTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetTableActionPerformed(evt);
            }
        });
        getContentPane().add(resetTable);
        resetTable.setBounds(530, 10, 110, 140);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Search Order ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 70, 190, 40);

        closeFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        closeFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeFrameActionPerformed(evt);
            }
        });
        getContentPane().add(closeFrame);
        closeFrame.setBounds(640, 10, 110, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 890, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTableActionPerformed
        try{
            //Creating a MySQL query that will select all the parts with a ID
            prestate = db.conn.prepareStatement("SELECT * FROM `part order` WHERE  `Order ID` = '"+searchOrderNumber.getText()+"' ");
            //Executing the query and placing it in a result set
            ResultSet result = prestate.executeQuery();
            //Creating a MySQL statement that will get the count
            prestate = db.conn.prepareStatement("Select Count(*) FROM `part order` WHERE `Order ID` = '"+searchOrderNumber.getText()+"' ");
            //Executing the query and placing it in a result set
            ResultSet result2 = prestate.executeQuery();
            //Goes to the next result which is not the header
            result2.next();
            //Getting the count from the database and placing it in a result set
            int it = result2.getInt("Count(*)");
            //If the count is larger then 0
            if(it > 0){
                //Placing the result within a JTable
                orderListTable.setModel(DbUtils.resultSetToTableModel(result));
            }else{
                //Showing an error message if a Order ID cannot be found
                JOptionPane.showMessageDialog(null, "The item you are searching for cannot be found in the database");
            }
        }catch(Exception ex){
            //Error if there is a problem witht the database connection or MySQL statement
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
        }
    }//GEN-LAST:event_searchTableActionPerformed

    private void resetTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetTableActionPerformed
       //Refreshing the JTable
        updateTable();
    }//GEN-LAST:event_resetTableActionPerformed

    private void closeFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeFrameActionPerformed
        //Making the JPanel invisable
        this.setVisible(false);
    }//GEN-LAST:event_closeFrameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderListTable;
    private javax.swing.JButton resetTable;
    private javax.swing.JTextField searchOrderNumber;
    private javax.swing.JButton searchTable;
    // End of variables declaration//GEN-END:variables
}
