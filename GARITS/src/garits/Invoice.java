package garits;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class Invoice extends javax.swing.JPanel {

    DBConnect db;
    PreparedStatement prestate;
    int count;

    public Invoice(DBConnect db) {
        initComponents();
        this.db = db;
        this.repaint();
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
        searchPanel.add(jLabel1);

        customerSearch.setPreferredSize(new java.awt.Dimension(200, 30));
        searchPanel.add(customerSearch);

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/searchicon.png"))); // NOI18N
        search.setPreferredSize(new java.awt.Dimension(120, 155));
        searchPanel.add(search);

        add(searchPanel);
        searchPanel.setBounds(560, 220, 450, 170);

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
            out.write(rs.getString("address"));
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
            String x = String.format("ITEM:" + "                " + "PART" + "                            " +"UNIT COST"+"          " +"QTY"+"          "+ "COST"+"\n%s                 %s             %s              %s          %s" ,"Life", "xsdawawdadwawdawdaw", "12.90", "200", "1000");
            System.out.println(x);
            double unitTotal = 0 ;
            while(!rs.isAfterLast()){
                //String x1 = String.format("ITEM:" + "                " + "PART" + "                            " +"UNIT COST"+"          " +"QTY"+"          "+ "COST"+"\n%s                 %s             %s              %s          %s" ,rs.getString("Description"), rs.getString("Part No"), rs.getString("Unit Cost"), rs.getString("Qty"), rs.getString("Total Price") );
                unitTotal = unitTotal + Double.parseDouble(rs.getString("Total Price"));
                out.write(rs.getString("Description") + "             "+rs.getString("Part No") + "          " + rs.getFloat("Unit Cost")+ "         "+rs.getInt("Qty")+"          "+rs.getFloat("Total Price"));
                //out.write(x1.replaceAll("\n", "\r\n"));
                out.newLine();
                rs.next();
            }
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
          /*  prestate = db.conn.prepareStatement("SELECT `jobsheets`.job_Number, `jobsheets`.customer, "
                    + "`jobsheets`.`VehicleRegNumber`, `jobsheets`.`make`, `jobsheets`.`model`, `work done`.`work done`, "
                    + "`job completed`.Description, `job completed`.`part No`, `Job completed`.`unit cost` , `job completed`.Qty, "
                    + "`job completed`.`Total Price`, `job completed`.`Labour Rate`, `job completed`.`VAT`, `job completed`.`Grand Total` "
                    + "FROM `jobsheets` INNER JOIN `work done` ON `work done`.Job_Number = `jobsheets`.Job_Number INNER JOIN "
                    + "`job completed` ON `work done`.`Job_Number` = `job completed`.`Job_Number` Where `work done`.job_Number = 7");
            ResultSet rs = prestate.executeQuery();
          
            rs.next();
            
            
            out.write("Name:    " + rs.getString("customer"));
            out.newLine();
            out.write("Description of Work:");
            out.newLine();
            
            while(!rs.isAfterLast()){
                out.write(rs.getString("work done"));
                out.newLine();
                rs.next();
            }
            
           rs.absolute(1);
           out.newLine();
          while(!rs.isAfterLast()){
                out.write(rs.getString("Description") + "     "  + rs.getFloat("Total Price") + "       " + rs.getInt("Qty"));
                out.newLine();
                rs.next();
          }*/
            
            
            
            out.close();

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("NOPE");
        }
    }//GEN-LAST:event_invoiceActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttons;
    private javax.swing.JButton close;
    private javax.swing.JTextField customerSearch;
    private javax.swing.JButton invoice;
    private javax.swing.JTable invoiceTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JPanel tablePanel;
    // End of variables declaration//GEN-END:variables
}
