package garits;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import wagu.Board;
import wagu.Table;

public class Invoice extends javax.swing.JPanel {

    DBConnect db;
    PreparedStatement prestate;
    int count;

    public Invoice(DBConnect db) {
        initComponents();
        this.db = db;
        this.repaint();
        refreshTable.setOpaque(false);
        refreshTable.setContentAreaFilled(false);
        refreshTable.setBorderPainted(false);
        close.setOpaque(false);
        close.setContentAreaFilled(false);
        close.setBorderPainted(false);
        invoice.setOpaque(false);
        invoice.setContentAreaFilled(false);
        invoice.setBorderPainted(false);
        search.setOpaque(false);
        search.setContentAreaFilled(false);
        search.setBorderPainted(false);
        searchPanel.setOpaque(false);
        tablePanel.setOpaque(false);
        buttons.setOpaque(false);
        this.setSize(1300, 900);
        updateTable();
        count = 0;
    }

    public File createFile(String name) throws IOException {
        File f;
        f = new File(name);
        if (!f.exists()) {
            f.createNewFile();
            return f;
        } else {
            count++;
            f = createFile(name + (count)+"txt");
        }
        return f;
    }

    public void updateTable() {
        try {
            prestate = db.conn.prepareStatement("SELECT * FROM jobsheets WHERE Status = 'complete' ");
            ResultSet result = prestate.executeQuery();
            invoiceTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            invoiceTable.setModel(DbUtils.resultSetToTableModel(result));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        customerSearch = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        refreshTable = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceTable = new javax.swing.JTable();
        buttons = new javax.swing.JPanel();
        invoice = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Customer:");

        customerSearch.setPreferredSize(new java.awt.Dimension(200, 30));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/searchicon.png"))); // NOI18N
        search.setPreferredSize(new java.awt.Dimension(120, 155));
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

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(customerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(customerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(refreshTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(searchPanel);
        searchPanel.setBounds(460, 200, 720, 170);

        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(invoiceTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(tablePanel);
        tablePanel.setBounds(60, 380, 970, 410);

        invoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/invoiceicon.png"))); // NOI18N
        invoice.setPreferredSize(new java.awt.Dimension(120, 155));
        invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceActionPerformed(evt);
            }
        });
        buttons.add(invoice);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        close.setPreferredSize(new java.awt.Dimension(120, 155));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        buttons.add(close);

        add(buttons);
        buttons.setBounds(1020, 510, 260, 160);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1300, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceActionPerformed
        try {
            File file = new File("/Users/shahzad/Desktop/Invoice.txt");
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Here1");
            } else {
                count++;
                file = createFile("Invoice" + count + ".txt");
            }
            FileWriter fr = new FileWriter(file.getAbsoluteFile());
            BufferedWriter out = new BufferedWriter(fr);
            int index = invoiceTable.getSelectedRow();
            String jobNumber = invoiceTable.getValueAt(index, 0).toString();
            String customerName = invoiceTable.getValueAt(index, 1).toString();
            String vehReg = invoiceTable.getValueAt(index, 2).toString();
            String make = invoiceTable.getValueAt(index, 3).toString();
            String model = invoiceTable.getValueAt(index, 6).toString(); 
            prestate = db.conn.prepareStatement("SELECT * FROM customers WHERE name = " + "'" + customerName +"'");
            ResultSet rs = prestate.executeQuery();
            rs.next();
            out.write("Name " + customerName);
            out.newLine();
            out.write(rs.getString("address") + " " + rs.getString("PostCode"));
            out.newLine();
            out.newLine();
            out.write("Vehicle Registration No :" + vehReg);
            out.newLine();
            out.write("Make: "+ make);
            out.newLine();
            out.write("Model: "+ model);
            out.newLine(); out.newLine();
            prestate = db.conn.prepareStatement("SELECT * FROM `work done` WHERE Job_Number = " + "'" + jobNumber +"'");
            rs = prestate.executeQuery();
            rs.next();
            out.write("Description of work:"); out.newLine();
            while(!rs.isAfterLast()){
                out.write(rs.getString("work done"));
                out.newLine();
                rs.next();
            }
            out.newLine();
            prestate = db.conn.prepareStatement("SELECT * FROM `job completed` WHERE Job_Number = '"+jobNumber+"' ");
            rs = prestate.executeQuery();
            rs.next();
            out.newLine();
           double unitTotal = 0 ;
           List<String> headers = Arrays.asList("ITEM", "PART NO" , "UNIT COST", "QTY", "COST(£)"); 
           ArrayList<List<String>> rowData= new ArrayList<>();
          while(!rs.isAfterLast()){
            unitTotal = unitTotal + Double.parseDouble(rs.getString("Total Price"));
            rowData.add(Arrays.asList(rs.getString("Description"), rs.getString("Part No"),  String.valueOf(rs.getFloat("Unit Cost")), String.valueOf(rs.getInt("Qty")), 
                String.valueOf(rs.getFloat("Total Price"))));
          out.newLine();
          rs.next();      
            }
            Board board = new Board(90);
            String tableString = board.setInitialBlock(new Table(board, 90, headers, rowData).tableToBlocks()).build().getPreview();
            System.out.println(tableString);
            out.write(tableString);
            out.newLine();
            out.newLine();
            rs.absolute(1);
            System.out.println(unitTotal);
            double rate = Double.parseDouble(rs.getString("Labour Rate"));
            double duration = Double.parseDouble(rs.getString("Duration"));
            double labourTotal = rate * duration;
            out.write("Labour:               "+rs.getString("Labour rate"));
            out.newLine();
            out.write("Duration              "+rs.getString("Duration"));
            out.newLine();
            out.write("Labour Total:         £"+labourTotal);
            out.newLine();
            out.write("Total:                £"+ (labourTotal + unitTotal)  );
            out.newLine();
            out.write("VAT:                  £"+rs.getString("VAT"));
            out.newLine();
            out.write("Grand Total:          £"+rs.getString("Grand Total"));
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("NOPE");
        }
    }//GEN-LAST:event_invoiceActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
       try{
            prestate = db.conn.prepareStatement("SELECT * FROM jobsheets WHERE Status = 'complete' AND `customer` LIKE '"+customerSearch.getText()+"' ");
            ResultSet result = prestate.executeQuery();
            prestate = db.conn.prepareStatement("SELECT Count(*) FROM jobsheets WHERE Status = 'complete' AND `customer` LIKE '"+customerSearch.getText()+"' ");
            ResultSet result2 = prestate.executeQuery();
            result2.next();
            int it = result2.getInt("Count(*)");
            if(it > 0){
                invoiceTable.setModel(DbUtils.resultSetToTableModel(result));
            }else{
                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
        }
       
       try{
            prestate = db.conn.prepareStatement("SELECT * FROM jobsheets WHERE Status = 'complete' AND `make` LIKE '"+customerSearch.getText()+"' ");
            ResultSet result = prestate.executeQuery();
            prestate = db.conn.prepareStatement("SELECT Count(*) FROM jobsheets WHERE Status = 'complete' AND `make` LIKE '"+customerSearch.getText()+"' ");
            ResultSet result2 = prestate.executeQuery();
            result2.next();
            int it = result2.getInt("Count(*)");
            if(it > 0){
                invoiceTable.setModel(DbUtils.resultSetToTableModel(result));
            }else{
                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
        }
       
       try{
            prestate = db.conn.prepareStatement("SELECT * FROM jobsheets WHERE Status = 'complete' AND `model` LIKE '"+customerSearch.getText()+"' ");
            ResultSet result = prestate.executeQuery();
            prestate = db.conn.prepareStatement("SELECT Count(*) FROM jobsheets WHERE Status = 'complete' AND `model` LIKE '"+customerSearch.getText()+"' ");
            ResultSet result2 = prestate.executeQuery();
            result2.next();
            int it = result2.getInt("Count(*)");
            if(it > 0){
                invoiceTable.setModel(DbUtils.resultSetToTableModel(result));
            }else{
                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
        }
    }//GEN-LAST:event_searchActionPerformed

    private void refreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTableActionPerformed
        updateTable();
    }//GEN-LAST:event_refreshTableActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttons;
    private javax.swing.JButton close;
    private javax.swing.JTextField customerSearch;
    private javax.swing.JButton invoice;
    private javax.swing.JTable invoiceTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshTable;
    private javax.swing.JButton search;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JPanel tablePanel;
    // End of variables declaration//GEN-END:variables
}
