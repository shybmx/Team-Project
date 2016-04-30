package garits;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class SupplierParts extends javax.swing.JFrame {
    String supplier;
    DBConnect db;
    PreparedStatement prestate;
    Stock stock;
    public SupplierParts(String supplier, DBConnect db, Stock stock) {
        initComponents();
        this.db = db;
        this.supplier = supplier;
        this.stock = stock;
        this.setSize(1280, 470);
        this.setResizable(false);
        updateTable();
         setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
         selectToOrder.setOpaque(false);
        selectToOrder.setContentAreaFilled(false);
        selectToOrder.setBorderPainted(false);
        closeFrame.setOpaque(false);
        closeFrame.setContentAreaFilled(false);
        closeFrame.setBorderPainted(false);
    }
    
    public void updateTable(){
        try{
            prestate = db.conn.prepareStatement("SELECT * FROM parts WHERE Supplier = '"+supplier+"'");
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

        selectToOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/Select.png"))); // NOI18N
        selectToOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectToOrderActionPerformed(evt);
            }
        });
        getContentPane().add(selectToOrder);
        selectToOrder.setBounds(1140, 60, 110, 150);

        closeFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        closeFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeFrameActionPerformed(evt);
            }
        });
        getContentPane().add(closeFrame);
        closeFrame.setBounds(1140, 210, 110, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectToOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectToOrderActionPerformed
        try{
            int index = partsTable.getSelectedRow();
            String unitCost = partsTable.getValueAt(index, 5).toString();
            String supplierName = partsTable.getValueAt(index, 2).toString();
            String partName = partsTable.getValueAt(index, 1).toString();
            stock.setTextFields(unitCost, partName, supplierName);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_selectToOrderActionPerformed

    private void closeFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeFrameActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_closeFrameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable partsTable;
    private javax.swing.JButton selectToOrder;
    // End of variables declaration//GEN-END:variables
}
