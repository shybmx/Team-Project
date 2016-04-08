package garits;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class SelectPartsFor extends javax.swing.JFrame {
    String supplier;
    DBConnect db;
    PreparedStatement prestate;
    Stock stock;
    int tableQty;
    int qty;
    JobList jl;
    
       public SelectPartsFor(DBConnect db, JobList jl) {
        initComponents();
        this.db = db;
        this.setSize(1500, 470);
        this.setResizable(false);
        updateTable();
         setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
         tableQty = 0;
         qty = 0;
         descText.setEditable(false);
         partNo.setEditable(false);
         totalPrice.setEditable(false);
         unitCostField.setEditable(false);
         totalPrice.setVisible(false);
         this.jl = jl;
         putInBox.setOpaque(false);
        putInBox.setContentAreaFilled(false); 
        putInBox.setBorderPainted(false);
        selectToOrder.setOpaque(false);
        selectToOrder.setContentAreaFilled(false); 
        selectToOrder.setBorderPainted(false);
        closeFrame.setOpaque(false);
        closeFrame.setContentAreaFilled(false); 
        closeFrame.setBorderPainted(false);
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
        totalPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        unitCostField = new javax.swing.JTextField();
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

        selectToOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/confirm.png"))); // NOI18N
        selectToOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectToOrderActionPerformed(evt);
            }
        });
        getContentPane().add(selectToOrder);
        selectToOrder.setBounds(1250, 15, 110, 150);

        closeFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        closeFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeFrameActionPerformed(evt);
            }
        });
        getContentPane().add(closeFrame);
        closeFrame.setBounds(1360, 15, 110, 150);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Quantity:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1190, 230, 100, 30);

        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        getContentPane().add(quantity);
        quantity.setBounds(1330, 230, 110, 30);

        desLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        desLabel.setText("Description:");
        getContentPane().add(desLabel);
        desLabel.setBounds(1190, 190, 140, 30);
        getContentPane().add(descText);
        descText.setBounds(1330, 190, 110, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Part no:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1190, 270, 100, 30);
        getContentPane().add(partNo);
        partNo.setBounds(1330, 270, 110, 30);

        putInBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/Select.png"))); // NOI18N
        putInBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putInBoxActionPerformed(evt);
            }
        });
        getContentPane().add(putInBox);
        putInBox.setBounds(1140, 15, 110, 150);

        totalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceActionPerformed(evt);
            }
        });
        getContentPane().add(totalPrice);
        totalPrice.setBounds(1330, 350, 110, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Unit Cost:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1190, 310, 130, 30);

        unitCostField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitCostFieldActionPerformed(evt);
            }
        });
        getContentPane().add(unitCostField);
        unitCostField.setBounds(1330, 310, 110, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1500, 470);

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
            prestate = db.conn.prepareStatement("INSERT INTO `temp parts`(`Job_Number`, `Description`, `Part No`,  `Unit Cost`, `Qty`, `Total Price`) "
                    + "VALUES ( "+jl.getNo() +", ' "+descText.getText()+"' , '"+partNo.getText()+"',    '"+unitCostField.getText() +"'    ,  '"+quantity.getText()+" ', '"+totalPrice.getText()+"' ) ");
            prestate.executeUpdate();
            jl.updatePartsTable();
            int newQty = tableQty - qty;
            prestate = db.conn.prepareStatement("UPDATE `parts` SET Quantity = '"+newQty+"' WHERE  `PartNo` = '"+partNo.getText()+"'  ");
            prestate.execute();
            updateTable();
          }
        }catch(Exception ex){
            ex.printStackTrace();
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
        unitCostField.setText(partsTable.getValueAt(index, 5).toString());
    }//GEN-LAST:event_putInBoxActionPerformed

    private void totalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPriceActionPerformed

    private void unitCostFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitCostFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitCostFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeFrame;
    private javax.swing.JLabel desLabel;
    private javax.swing.JTextField descText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField partNo;
    private javax.swing.JTable partsTable;
    private javax.swing.JButton putInBox;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton selectToOrder;
    private javax.swing.JTextField totalPrice;
    private javax.swing.JTextField unitCostField;
    // End of variables declaration//GEN-END:variables
}
