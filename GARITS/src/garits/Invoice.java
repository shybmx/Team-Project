package garits;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
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
        //Set up all the componets within this JPanel
        initComponents();
        //Passes in the database connection
        this.db = db;
        //Refresh this whole JPanel
        this.repaint();
        //Remove the background from the JButtons and JPanels
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
        //Set the size of the JPanel
        this.setSize(1300, 900);
        //Refresh the JTable with information from the database
        updateTable();
        //Set count to 0
        count = 0;
    }

    public File createFile(String name) throws IOException {
        //Creating a new file
        File f;
        //Creating a new file with the name
        f = new File(name);
        //If the file exisit 
        if (!f.exists()) {
            //It creates a new file
            f.createNewFile();
            //Return the File
            return f;
        } else {
            //The count is incrementeds
            count++;
            //A new File is created with the number in the file name
            f = createFile(name + (count) + "txt");
        }
        //Return the file
        return f;
    }

    public void updateTable() {
        try {
            //Creating a MySQL statement which will select data from the database where the status is complete
            prestate = db.conn.prepareStatement("SELECT * FROM jobsheets WHERE Status = 'complete'  ");
            //Execute the query and place it into a result set
            ResultSet result = prestate.executeQuery();
            //Make the table resize depending on the information
            invoiceTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            //Place all the information from the result into the JTable
            invoiceTable.setModel(DbUtils.resultSetToTableModel(result));
        } catch (Exception ex) {
            //Show an error with the MySQL statement or database connection 
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
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        //This will make the current JPanel invisable
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceActionPerformed
        try {
            //Creating a new File
            File file = new File("/Users/shahzad/Desktop/Invoice.txt");
            //If the file does not exist
            if (!file.exists()) {
                //Creates a new file
                file.createNewFile();
            } else {
                //The count increments
                count++;
                //A new file is created with the count number with the file name
                file = createFile("Invoice" + count + ".txt");
            }
            //Creating a new File writier
            FileWriter fr = new FileWriter(file.getAbsoluteFile());
            //Creating a new buffered writer which will allow us to write into the file
            BufferedWriter out = new BufferedWriter(fr);
            //Get the selected row
            int index = invoiceTable.getSelectedRow();
            //Get all the values of the selected and place a few of the columes into a string variable
            String jobNumber = invoiceTable.getValueAt(index, 0).toString();
            String customerName = invoiceTable.getValueAt(index, 1).toString();
            String vehReg = invoiceTable.getValueAt(index, 2).toString();
            String make = invoiceTable.getValueAt(index, 3).toString();
            String model = invoiceTable.getValueAt(index, 6).toString();
            //Creating a MySQL statement which will select the customer from the database
            prestate = db.conn.prepareStatement("SELECT * FROM customers WHERE name = " + "'" + customerName + "'");
            //Execute the statement and place it in a result set
            ResultSet rs = prestate.executeQuery();
            //Go to the next result which is not the header
            rs.next();
            //Write into the file the customer name and any other information
            out.write("Name " + customerName);
            //A new line
            out.newLine();
            out.write(rs.getString("address") + " " + rs.getString("PostCode"));
            out.newLine();
            out.newLine();
            out.write("Vehicle Registration No :" + vehReg);
            out.newLine();
            out.write("Make: " + make);
            out.newLine();
            out.write("Model: " + model);
            out.newLine();
            out.newLine();
            //Creating a MySQL statement which will select the Job number
            prestate = db.conn.prepareStatement("SELECT * FROM `work done` WHERE Job_Number = " + "'" + jobNumber + "'");
            //Execute the statement and place it in a result set 
            rs = prestate.executeQuery();
            //Go to the next result which is not the header
            rs.next();
            out.write("Description of work:");
            out.newLine();
            //A while look that loops through the result set and it is not the last value
            while (!rs.isAfterLast()) {
                //Print out all the values in the work done colume
                out.write(rs.getString("work done"));
                out.newLine();
                //The next value
                rs.next();
            }
            out.newLine();
            //Creating a MySQL statement which selects the job number from the job completed table
            prestate = db.conn.prepareStatement("SELECT * FROM `job completed` WHERE Job_Number = '" + jobNumber + "' ");
            //Execute the statement and place it in a result set
            rs = prestate.executeQuery();
            //The next result which is not the header
            rs.next();
            out.newLine();
            //Making a new double which is set to 0
            double unitTotal = 0;
            //Creating a list for the headers
            List<String> headers = Arrays.asList("ITEM", "PART NO", "UNIT COST", "QTY", "COST(£)");
            //Creating an ArrayList which has a list of Strings
            ArrayList<List<String>> rowData = new ArrayList<>();
            //Formatting all the doubles so they have a 0.00 
            DecimalFormat format = new DecimalFormat("0.00");
            //A string variable that will contain the formatted total
            String fUnitTotal;
            //A while loop that checks if it not the last element in the loop
            while (!rs.isAfterLast()) {
                //Parse the total price from the database from a string into a double and add it to the unit cost
                unitTotal = unitTotal + Double.parseDouble(rs.getString("Total Price"));
                //Format the unit cosr
                fUnitTotal = format.format(unitTotal);
                //Add all the into the ArrayList
                rowData.add(Arrays.asList(rs.getString("Description"), rs.getString("Part No"), String.valueOf(rs.getFloat("Unit Cost")), String.valueOf(rs.getInt("Qty")),
                        String.valueOf(format.format(rs.getFloat("Total Price")))));
                out.newLine();
                //The next element within the resultset
                rs.next();
            }
            //Creating the size within the text field for the colume
            Board board = new Board(90);
            //Creating the table within the text file
            String tableString = board.setInitialBlock(new Table(board, 90, headers, rowData).tableToBlocks()).build().getPreview();
            //Writing out the new table in the text file
            out.write(tableString);
            out.newLine();
            out.newLine();
            rs.absolute(1);
            //Parsing the labour rate from the database from a string to a double
            double rate = Double.parseDouble(rs.getString("Labour Rate"));
            //Parsing the duration from the database from a string to a double
            double duration = Double.parseDouble(rs.getString("Duration"));
            //Finding out the total cost of labour
            double labourTotal = rate * duration;
            //A String variable which contains the grand total from the database
            String grandTot = format.format(Double.parseDouble(rs.getString("Grand Total")));
            //A String variable which contains the VAT from the database
            String vat = format.format(Double.parseDouble(rs.getString("VAT")));
            //Formatting the labour total 
            String labourTot = format.format((labourTotal));
            //Formatting thr total from the labour cost and unit price
            String tot = format.format((labourTotal + unitTotal));
            //formattng the labour rate
            String labourRate = format.format(Double.parseDouble(rs.getString("Labour Rate")));
            //Displaying all our calucalations
            out.write("Labour:               £ " + labourRate);
            out.newLine();
            out.write("Duration              " + rs.getString("Duration"));
            out.newLine();
            out.write("Labour Total:         £" + labourTot);
            out.newLine();
            out.write("Total:                £" + tot);
            out.newLine();
            out.write("VAT:                  £" + vat);
            out.newLine();
            out.write("Grand Total:          £" + grandTot);
            out.newLine();
            out.newLine();
            out.write("Thank you for your valued custom. We look forward to receiving your payment in due course.");
            out.newLine();
            out.newLine();
            out.newLine();
            out.write("Your sincerely,");
            out.newLine();
            out.newLine();
            out.write("G.Lancaster");
            //Closing of wiritng into the file
            out.close();
        } catch (Exception ex) {
            //Prints any errors to the terminal
            ex.printStackTrace();
        }
    }//GEN-LAST:event_invoiceActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try {
            //Creating a MySQL statement which searches for a customer and the status is completed
            prestate = db.conn.prepareStatement("SELECT * FROM jobsheets WHERE Status = 'complete' AND `customer` LIKE '" + customerSearch.getText() + "' ");
            //Executing this query and placing the result into a result set
            ResultSet result = prestate.executeQuery();
            //Creating a MySQL statement which counts how many customer have been found
            prestate = db.conn.prepareStatement("SELECT Count(*) FROM jobsheets WHERE Status = 'complete' AND `customer` LIKE '" + customerSearch.getText() + "' ");
            //Executing the query and placing the result into a result set
            ResultSet result2 = prestate.executeQuery();
            //Going to the next result which is not the header
            result2.next();
            //Get the count from the result and placing it into a int variable
            int it = result2.getInt("Count(*)");
            if (it > 0) {
                //Placing the information from the MySQL into a JTable
                invoiceTable.setModel(DbUtils.resultSetToTableModel(result));
            } else {

            }
        } catch (Exception ex) {
            //Show an error message if there is a problem with the MySQL statement or database connection
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
        }

        try {
            //Creating a MySQL statement which selelcts the make and the status has been completed
            prestate = db.conn.prepareStatement("SELECT * FROM jobsheets WHERE Status = 'complete' AND `make` LIKE '" + customerSearch.getText() + "' ");
            //Executing the query and placing it into a result set
            ResultSet result = prestate.executeQuery();
            //Creating a MySQL statement which counts how many customer have been found
            prestate = db.conn.prepareStatement("SELECT Count(*) FROM jobsheets WHERE Status = 'complete' AND `make` LIKE '" + customerSearch.getText() + "' ");
            //Executing the query and placing the result into a result set
            ResultSet result2 = prestate.executeQuery();
            //Going to the next result which is not the header
            result2.next();
            //Get the count from the result and placing it into a int variable
            int it = result2.getInt("Count(*)");
            if (it > 0) {
                //Placing the information from the MySQL into a JTable
                invoiceTable.setModel(DbUtils.resultSetToTableModel(result));
            } else {

            }
        } catch (Exception ex) {
            //Placing the information from the MySQL into a JTable
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
        }

        try {
            //Creating a MySQL statement which selelcts the model and the status has been completed
            prestate = db.conn.prepareStatement("SELECT * FROM jobsheets WHERE Status = 'complete' AND `model` LIKE '" + customerSearch.getText() + "' ");
            //Executing the query and placing it into a result set
            ResultSet result = prestate.executeQuery();
            //Creating a MySQL statement which counts how many customer have been found
            prestate = db.conn.prepareStatement("SELECT Count(*) FROM jobsheets WHERE Status = 'complete' AND `model` LIKE '" + customerSearch.getText() + "' ");
            //Executing the query and placing the result into a result set
            ResultSet result2 = prestate.executeQuery();
            //Going to the next result which is not the header
            result2.next();
            int it = result2.getInt("Count(*)");
            if (it > 0) {
                //Placing the information from the MySQL into a JTable
                invoiceTable.setModel(DbUtils.resultSetToTableModel(result));
            } else {

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
        }
    }//GEN-LAST:event_searchActionPerformed

    private void refreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTableActionPerformed
        //Refresh the table
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
