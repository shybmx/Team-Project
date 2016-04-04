package garits;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class SelectParts extends javax.swing.JFrame {
    String supplier;
    DBConnect db;
    PreparedStatement prestate;
    Stock stock;
    MechanicMenu men;
    int tableQty;
    int qty;
    public SelectParts(DBConnect db, MechanicMenu men) {
        initComponents();
        this.db = db;
        this.men = men;
        this.setSize(1400, 470);
        this.setResizable(false);
        updateTable();
         setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
         tableQty = 0;
         qty = 0;
         descText.setEditable(false);
         partNo.setEditable(false);
         totalPrice.setEditable(false);
    }
    
    public void updateTable(){
        try{
            prestate = db.conn.prepareStatement("SELECT * FROM parts ");
            ResultSet result = prestate.executeQuery();
            partsTable.setModel(DbUtils.resultSetToTableModel(result));
            this.setVisible(false);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        partsTable = new javax.swing.JTable();
        selectToOrder = new javax.swing.JButton();
        closeFrame = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        desLabel = new javax.swing.JLabel();
        descText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        partNo = new javax.swing.JTextField();
        putInBox = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        partsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(partsTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 12, 1120, 403);

        selectToOrder.setText("Select");
        selectToOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectToOrderActionPerformed(evt);
            }
        });
        getContentPane().add(selectToOrder);
        selectToOrder.setBounds(1270, 20, 92, 25);

        closeFrame.setText("Close");
        closeFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeFrameActionPerformed(evt);
            }
        });
        getContentPane().add(closeFrame);
        closeFrame.setBounds(1270, 50, 92, 25);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Quantity:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1140, 210, 100, 30);

        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        getContentPane().add(quantity);
        quantity.setBounds(1280, 210, 110, 30);

        desLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        desLabel.setText("Description:");
        getContentPane().add(desLabel);
        desLabel.setBounds(1140, 170, 140, 30);
        getContentPane().add(descText);
        descText.setBounds(1280, 170, 110, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Part no:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1140, 250, 100, 30);
        getContentPane().add(partNo);
        partNo.setBounds(1280, 250, 110, 30);

        putInBox.setText("Put in box");
        putInBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putInBoxActionPerformed(evt);
            }
        });
        getContentPane().add(putInBox);
        putInBox.setBounds(1140, 50, 90, 25);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Total Price:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1140, 290, 130, 30);

        totalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceActionPerformed(evt);
            }
        });
        getContentPane().add(totalPrice);
        totalPrice.setBounds(1280, 290, 110, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1400, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectToOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectToOrderActionPerformed
       qty =  Integer.parseInt(quantity.getText());
       DecimalFormat format = new DecimalFormat("0.00");
        try{
            
                if(qty > tableQty){
             JOptionPane.showMessageDialog(null, "Quantity too high");
         }else{
            int index = partsTable.getSelectedRow();
            double unitCost = Double.parseDouble(partsTable.getValueAt(index, 5).toString());
            double tPrice = qty * unitCost;
            String sTotal = format.format(tPrice);
            totalPrice.setText(sTotal);
            prestate = db.conn.prepareStatement("INSERT INTO `temp parts`(`Job_Number` `Description`, `Part No`, `Qty`, `Total Price`) "
                    + "VALUES ( '"+men.getNo()+"',  "+descText.getText()+"' , '"+partNo.getText()+"', '"+quantity.getText()+" ', '"+totalPrice.getText()+"' ) ");
            prestate.executeUpdate();
            men.updatePartsTable();
            int newQty = tableQty - qty;
            prestate = db.conn.prepareStatement("UPDATE `parts` SET Quantity = '"+newQty+"' WHERE  `PartNo` = '"+partNo.getText()+"'  ");
            prestate.execute();
            updateTable();
            this.setVisible(true);
          }
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_selectToOrderActionPerformed

    private void closeFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeFrameActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_closeFrameActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed

    }//GEN-LAST:event_quantityActionPerformed

    private void putInBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putInBoxActionPerformed
        int index = partsTable.getSelectedRow();
        tableQty = Integer.parseInt(partsTable.getValueAt(index, 6).toString());
        descText.setText(partsTable.getValueAt(index, 1).toString());
        partNo.setText(partsTable.getValueAt(index, 0).toString());
    }//GEN-LAST:event_putInBoxActionPerformed

    private void totalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPriceActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeFrame;
    private javax.swing.JLabel desLabel;
    private javax.swing.JTextField descText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField partNo;
    private javax.swing.JTable partsTable;
    private javax.swing.JButton putInBox;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton selectToOrder;
    private javax.swing.JTextField totalPrice;
    // End of variables declaration//GEN-END:variables
}
