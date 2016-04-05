package garits;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Stock extends javax.swing.JPanel {
    
    DBConnect db;
    PreparedStatement prestate;
    Vector<String> vec = new Vector<>();
     Vector<String> orderVec = new Vector<>();
     ArrayList<List<String>> rowData= new ArrayList<>();
     double total; // reset to 0
     double grandTotal; // reset to 0
     double basketTotal; // reset to 0
     Vector<String> basketVec = new Vector<>();
    public Stock(DBConnect db) {
        initComponents();
        this.db = db;
        close.setOpaque(false);
        close.setContentAreaFilled(false);
        close.setBorderPainted(false);
        editStock.setOpaque(false);
        editStock.setContentAreaFilled(false);
        editStock.setBorderPainted(false);
        order.setOpaque(false);
        order.setContentAreaFilled(false);
        order.setBorderPainted(false);
        update.setOpaque(false);
        update.setContentAreaFilled(false);
        update.setBorderPainted(false);
        editClose.setOpaque(false);
        editClose.setContentAreaFilled(false);
        editClose.setBorderPainted(false);
        buttons.setOpaque(false);
        editStockToDB.setOpaque(false);
        editStockToDB.setContentAreaFilled(false);
        editStockToDB.setBorderPainted(false);
        placeOrder.setOpaque(false);
        placeOrder.setContentAreaFilled(false);
        placeOrder.setBorderPainted(false);
        updateTable();
        insertCombo();
        addStockPanel.setVisible(false);
        addStockPanel.setOpaque(false);
        addStockToDB.setOpaque(false);
        addStockToDB.setContentAreaFilled(false);
        addStockToDB.setBorderPainted(false);
        addClose.setOpaque(false);
        addClose.setContentAreaFilled(false);
        addClose.setBorderPainted(false);
        editPartNumber.setEditable(false);
        editStockPanel.setVisible(false);
        editStockPanel.setOpaque(false);
        orderStockPanel.setVisible(false);
        orderStockPanel.setOpaque(false);
        addToOrderList.setOpaque(false);
        addToOrderList.setContentAreaFilled(false);
        addToOrderList.setBorderPainted(false);
        orderListClose.setOpaque(false);
        orderListClose.setContentAreaFilled(false);
        orderListClose.setBorderPainted(false);
        orderPriceOfUnit.setEditable(false);
        orderTotal.setEditable(false);
        orderSupplier.setEditable(false);
        this.setSize(1300, 900);
        updateSalesTable();
        orderGrandTotal.setEditable(false);
        total = 0;
        grandTotal = 0;
        basketTotal = 0;
        saleToCustomerPanel.setVisible(false);
        saleToCustomerPanel.setOpaque(false);
        addToBasket.setOpaque(false);
        addToBasket.setContentAreaFilled(false);
        addToBasket.setBorderPainted(false);
        pay.setOpaque(false);
        pay.setContentAreaFilled(false);
        pay.setBorderPainted(false);
    }

    public void updateTable() {
        try {
            prestate = db.conn.prepareStatement("SELECT * from `garits`.`parts`");
            ResultSet result = prestate.executeQuery();
            stockTable.setModel(DbUtils.resultSetToTableModel(result));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    }
    
    public void updateTempTable(){
        try{
            prestate = db.conn.prepareStatement("SELECT * from `temp part order` ");
            ResultSet result = prestate.executeQuery();
            orderList.setModel(DbUtils.resultSetToTableModel(result));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    }
    
    public void updateSalesTable(){
        try{
            prestate = db.conn.prepareStatement("SELECT * from `parts` ");
            ResultSet result = prestate.executeQuery();
            salesTable.setModel(DbUtils.resultSetToTableModel(result));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    }

    public void insertCombo() {
        try {
            prestate = db.conn.prepareStatement("SELECT * FROM suppliers");
            ResultSet result = prestate.executeQuery();
            result.next();
            PreparedStatement prestate2 = db.conn.prepareStatement("Select Count(*) FROM suppliers ");
            ResultSet result2 = prestate2.executeQuery();
            result2.next();
            int it = result2.getInt("Count(*)");
            for (int i = it; i != 0; i--) {
                supplierCombo.addItem(result.getString("Supplier"));
                result.next();
            }
        } catch (SQLException ex) {
            System.out.println("");
        }
    }

    public void setTextFields(String cost, String partName, String suppName) {
        orderPriceOfUnit.setText(cost);
        orderSupplier.setText(suppName);
        orderDescription.setText(partName);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttons = new javax.swing.JPanel();
        order = new javax.swing.JButton();
        update = new javax.swing.JButton();
        editStock = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        stockTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        searchStock = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        addStock = new javax.swing.JButton();
        saleToCustomer = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        addStockPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        addPartNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addPartName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addManufacturer = new javax.swing.JTextField();
        addVehicleType = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addYear = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addUnitCost = new javax.swing.JTextField();
        addQuantity = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        addStockToDB = new javax.swing.JButton();
        addClose = new javax.swing.JButton();
        editStockPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        editPartNumber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        editPartName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        editManufacturer = new javax.swing.JTextField();
        editVehicleType = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        editYear = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        editUnitCost = new javax.swing.JTextField();
        editQuantity = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        editStockToDB = new javax.swing.JButton();
        editClose = new javax.swing.JButton();
        orderStockPanel = new javax.swing.JPanel();
        addToOrderList = new javax.swing.JButton();
        orderListClose = new javax.swing.JButton();
        invoice = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        orderNumber = new javax.swing.JTextField();
        supplierCombo = new javax.swing.JComboBox();
        selectSupplier = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        orderDescription = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        orderQuantity = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        orderPriceOfUnit = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        orderSupplier = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        orderTotal = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        placeOrder = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        orderGrandTotal = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderList = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        orderDate = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        orderID = new javax.swing.JTextField();
        saleToCustomerPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        salesTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        basket = new javax.swing.JList();
        addToBasket = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        newQty = new javax.swing.JTextField();
        pay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        order.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/order.png"))); // NOI18N
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/update.png"))); // NOI18N
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        editStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/editstock.png"))); // NOI18N
        editStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStockActionPerformed(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        stockTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(stockTable);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Search Stock:");

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/searchicon.png"))); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        addStock.setText("Add Stock");
        addStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStockActionPerformed(evt);
            }
        });

        saleToCustomer.setText("sale to customer");
        saleToCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleToCustomerActionPerformed(evt);
            }
        });

        jButton1.setText("Bring up order");

        javax.swing.GroupLayout buttonsLayout = new javax.swing.GroupLayout(buttons);
        buttons.setLayout(buttonsLayout);
        buttonsLayout.setHorizontalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(buttonsLayout.createSequentialGroup()
                        .addComponent(addStock, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editStock, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(saleToCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchStock, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
        );
        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addStock, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(buttonsLayout.createSequentialGroup()
                                        .addComponent(saleToCustomer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1))
                                    .addComponent(editStock, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(buttonsLayout.createSequentialGroup()
                        .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buttonsLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(searchStock, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(buttonsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        add(buttons);
        buttons.setBounds(10, 290, 1290, 616);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Part Number:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Part Name:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Manufacturer:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("Vehicle Type:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setText("Years:");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setText("Unit Cost:");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setText("Quantity:");

        addStockToDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/add.png"))); // NOI18N
        addStockToDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStockToDBActionPerformed(evt);
            }
        });

        addClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        addClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addStockPanelLayout = new javax.swing.GroupLayout(addStockPanel);
        addStockPanel.setLayout(addStockPanelLayout);
        addStockPanelLayout.setHorizontalGroup(
            addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStockPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addStockPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(addPartNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addStockPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPartName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addStockPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addStockPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addStockPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addYear, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addStockPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addUnitCost, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addStockPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(283, 283, 283)
                .addGroup(addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addStockToDB, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addClose, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        addStockPanelLayout.setVerticalGroup(
            addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStockPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addStockPanelLayout.createSequentialGroup()
                        .addGroup(addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(addPartNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(addPartName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(addManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(addVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(addYear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(addUnitCost, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(addQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addStockPanelLayout.createSequentialGroup()
                        .addComponent(addStockToDB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addClose)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        add(addStockPanel);
        addStockPanel.setBounds(160, 260, 820, 420);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel10.setText("Part Number:");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel11.setText("Part Name:");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel12.setText("Manufacturer:");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel13.setText("Vehicle Type:");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel14.setText("Years:");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel15.setText("Unit Cost:");

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel16.setText("Quantity:");

        editStockToDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/edit.png"))); // NOI18N
        editStockToDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStockToDBActionPerformed(evt);
            }
        });

        editClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        editClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editStockPanelLayout = new javax.swing.GroupLayout(editStockPanel);
        editStockPanel.setLayout(editStockPanelLayout);
        editStockPanelLayout.setHorizontalGroup(
            editStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editStockPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(editStockPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(30, 30, 30)
                        .addComponent(editPartNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editStockPanelLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editPartName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editStockPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editStockPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editStockPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editYear, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editStockPanelLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editUnitCost, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editStockPanelLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(283, 283, 283)
                .addGroup(editStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editStockToDB, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editClose, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        editStockPanelLayout.setVerticalGroup(
            editStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editStockPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(editStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editStockPanelLayout.createSequentialGroup()
                        .addGroup(editStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(editPartNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(editStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(editPartName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(editStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(editManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(editStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(editVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(editStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(editYear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(editStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(editUnitCost, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(editStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(editQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(editStockPanelLayout.createSequentialGroup()
                        .addComponent(editStockToDB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editClose)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        add(editStockPanel);
        editStockPanel.setBounds(200, 220, 820, 420);

        addToOrderList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/add.png"))); // NOI18N
        addToOrderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToOrderListActionPerformed(evt);
            }
        });

        orderListClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        orderListClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderListCloseActionPerformed(evt);
            }
        });

        invoice.setText("INVOICE");
        invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel17.setText("Order Number:");

        supplierCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierComboActionPerformed(evt);
            }
        });

        selectSupplier.setText("select");
        selectSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSupplierActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel18.setText("Description:");

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel19.setText("Quantity:");

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel20.setText("Price of Unit:");

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel21.setText("Supplier:");

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel22.setText("Total:");

        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        placeOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/order.png"))); // NOI18N
        placeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel23.setText("Grand total:");

        orderList.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(orderList);

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel24.setText("Date:");

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel26.setText("Order ID:");

        javax.swing.GroupLayout orderStockPanelLayout = new javax.swing.GroupLayout(orderStockPanel);
        orderStockPanel.setLayout(orderStockPanelLayout);
        orderStockPanelLayout.setHorizontalGroup(
            orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderStockPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderStockPanelLayout.createSequentialGroup()
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(orderStockPanelLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(orderDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(orderStockPanelLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(orderQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(orderStockPanelLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(orderPriceOfUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(orderStockPanelLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(orderSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(orderStockPanelLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(orderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(orderStockPanelLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(orderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(orderGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderStockPanelLayout.createSequentialGroup()
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel26))
                        .addGap(60, 60, 60)
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(orderID)
                            .addComponent(orderNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addComponent(supplierCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(orderStockPanelLayout.createSequentialGroup()
                                .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addToOrderList, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(placeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orderListClose, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(selectSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );
        orderStockPanelLayout.setVerticalGroup(
            orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderStockPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderStockPanelLayout.createSequentialGroup()
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderPriceOfUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(orderStockPanelLayout.createSequentialGroup()
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(supplierCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addToOrderList, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(placeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderListClose, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(orderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(orderStockPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(790, 790, 790))
        );

        add(orderStockPanel);
        orderStockPanel.setBounds(320, 240, 870, 570);

        salesTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(salesTable);

        basket.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(basket);

        addToBasket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/add.png"))); // NOI18N
        addToBasket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToBasketActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel25.setText("Quantity:");

        pay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/payment.png"))); // NOI18N
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout saleToCustomerPanelLayout = new javax.swing.GroupLayout(saleToCustomerPanel);
        saleToCustomerPanel.setLayout(saleToCustomerPanelLayout);
        saleToCustomerPanelLayout.setHorizontalGroup(
            saleToCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saleToCustomerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(saleToCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(saleToCustomerPanelLayout.createSequentialGroup()
                        .addComponent(addToBasket, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(saleToCustomerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(newQty)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        saleToCustomerPanelLayout.setVerticalGroup(
            saleToCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saleToCustomerPanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(saleToCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(saleToCustomerPanelLayout.createSequentialGroup()
                        .addGroup(saleToCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addToBasket, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(saleToCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel25)
                            .addGroup(saleToCustomerPanelLayout.createSequentialGroup()
                                .addComponent(newQty)
                                .addGap(2, 2, 2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(saleToCustomerPanel);
        saleToCustomerPanel.setBounds(360, 260, 870, 450);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1300, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        orderStockPanel.setVisible(true);
        buttons.setVisible(false);
    }//GEN-LAST:event_orderActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        updateTable();
    }//GEN-LAST:event_updateActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try{
            prestate = db.conn.prepareStatement("SELECT * FROM `parts` WHERE PartNo = '"+searchStock.getText()+"' ");
            ResultSet result = prestate.executeQuery();
            stockTable.setModel(DbUtils.resultSetToTableModel(result));
        }catch(Exception ex){
            
        }
        
        try{
            prestate = db.conn.prepareStatement("SELECT * FROM `parts` WHERE  `VehicleType` = '"+searchStock.getText()+"' ");
            ResultSet result = prestate.executeQuery();
            prestate = db.conn.prepareStatement("Select Count(*) FROM `parts` WHERE `VehicleType` = '"+searchStock.getText()+"' ");
            ResultSet result2 = prestate.executeQuery();
            result2.next();
            int it = result2.getInt("Count(*)");
            if(it > 0){
                stockTable.setModel(DbUtils.resultSetToTableModel(result));
            }else{
                
            }
         }catch(Exception ex){
            
         }
        
        try{
            prestate = db.conn.prepareStatement("SELECT * FROM `parts` WHERE  `PartName` = '"+searchStock.getText()+"' ");
            ResultSet result = prestate.executeQuery();
            prestate = db.conn.prepareStatement("Select Count(*) FROM `parts` WHERE `PartName` = '"+searchStock.getText()+"' ");
            ResultSet result2 = prestate.executeQuery();
            result2.next();
            int it = result2.getInt("Count(*)");
            if(it > 0){
                stockTable.setModel(DbUtils.resultSetToTableModel(result));
            }else{
                
            }
         }catch(Exception ex){
            
         }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void addStockToDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStockToDBActionPerformed
        String partNumber = addPartNumber.getText();
        String partName = addPartName.getText();
        String manufacturer = addManufacturer.getText();
        String vehicleType = addVehicleType.getText();
        String year = addYear.getText();
        String unitCost = addUnitCost.getText();
        String quantity = addQuantity.getText();
        try {
            prestate = db.conn.prepareStatement("INSERT INTO `parts`(`PartNo`, `PartName`, "
                    + "`Supplier`, `VehicleType`, `Years`, `UnitCost`, `Quantity`) "
                    + "VALUES (?,?,?,?,?,?,?)");
            prestate.setString(1, partNumber);
            prestate.setString(2, partName);
            prestate.setString(3, manufacturer);
            prestate.setString(4, vehicleType);
            prestate.setString(5, year);
            prestate.setString(6, unitCost);
            prestate.setString(7, quantity);
            int i = prestate.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Part has been added");
                addStockPanel.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Part has not been added");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_addStockToDBActionPerformed

    private void addCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCloseActionPerformed
        addStockPanel.setVisible(false);
    }//GEN-LAST:event_addCloseActionPerformed

    private void addStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStockActionPerformed
        buttons.setVisible(false);
        addStockPanel.setVisible(true);
    }//GEN-LAST:event_addStockActionPerformed

    private void editStockToDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStockToDBActionPerformed
        try {
            prestate = db.conn.prepareStatement("UPDATE `parts` SET `PartName`= '" + editPartName.getText() + "' ,"
                    + "`Supplier`= '" + editManufacturer.getText() + "',`VehicleType`='" + editVehicleType.getText() + "',"
                    + "`Years`='" + editYear.getText() + "' ,`UnitCost`='" + editUnitCost.getText() + "' ,"
                    + "`Quantity`= '" + editQuantity.getText() + "' "
                    + "WHERE `PartNo` = '" + editPartNumber.getText() + "'  ");
            prestate.execute();
            editStockPanel.setVisible(false);
            JOptionPane.showMessageDialog(null, "Part: " + editPartNumber.getText() + " has been updated");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Part: " + editPartNumber.getText() + " has not been updated");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_editStockToDBActionPerformed

    private void editCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCloseActionPerformed
        editStockPanel.setVisible(false);
    }//GEN-LAST:event_editCloseActionPerformed

    private void editStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStockActionPerformed
        try {
            int index = stockTable.getSelectedRow();
            editPartNumber.setText(stockTable.getValueAt(index, 0).toString());
            editPartName.setText(stockTable.getValueAt(index, 1).toString());
            editManufacturer.setText(stockTable.getValueAt(index, 2).toString());
            editVehicleType.setText(stockTable.getValueAt(index, 3).toString());
            editYear.setText(stockTable.getValueAt(index, 4).toString());
            editUnitCost.setText(stockTable.getValueAt(index, 5).toString());
            editQuantity.setText(stockTable.getValueAt(index, 6).toString());
            editStockPanel.setVisible(true);
            buttons.setVisible(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "You must select a part you wish to edit");
        }
    }//GEN-LAST:event_editStockActionPerformed

    private void addToOrderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToOrderListActionPerformed
        DecimalFormat format = new DecimalFormat("0.00");
        total = Double.parseDouble(orderTotal.getText().replace('£', '\0'));
        String sTotal = format.format(total);
        grandTotal = grandTotal + total;
        String sTotal2 = format.format(grandTotal);
        
        orderGrandTotal.setText(String.valueOf(sTotal2));
        String orderNumberString = orderNumber.getText();
        String orderDescriptionString = orderDescription.getText();
        String orderQuantityString = orderQuantity.getText();
        String orderSupplierString = orderSupplier.getText();
        String orderTotalString = String.valueOf(total);
        String orderDateString = orderDate.getText();
        String orderIDString = orderID.getText();
        try{
            prestate = db.conn.prepareStatement("INSERT INTO `temp part order` (`Order No`, `Description`, "
                    + "`Qty`, `Price`, `Supplier`, `Date`, `Order ID`) Values (?,?,?,?,?,?,?) ");
            prestate.setString(1, orderNumberString);
            prestate.setString(2, orderDescriptionString);
            prestate.setString(3, orderQuantityString);
            prestate.setString(4, orderTotalString);
            prestate.setString(5, orderSupplierString);
            prestate.setString(6, orderDateString);
            prestate.setString(7, orderIDString);
            prestate.executeUpdate();
            updateTempTable();
        }catch(Exception ex){
            System.out.println(prestate);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_addToOrderListActionPerformed

    private void invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invoiceActionPerformed

    private void supplierComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierComboActionPerformed

    }//GEN-LAST:event_supplierComboActionPerformed

    private void selectSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSupplierActionPerformed
        String x = supplierCombo.getSelectedItem().toString();
        SupplierParts supplierFrame = new SupplierParts(x, db, this);
        supplierFrame.setVisible(true);
    }//GEN-LAST:event_selectSupplierActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        int quantity = Integer.parseInt(orderQuantity.getText());
        double price = Float.parseFloat(orderPriceOfUnit.getText());
        double total = quantity * price;
        DecimalFormat format = new DecimalFormat("0.00");
        String sTotal = format.format(total);
        orderTotal.setText("£ " + sTotal);
    }//GEN-LAST:event_calculateActionPerformed

    private void orderListCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderListCloseActionPerformed
        try{
            prestate = db.conn.prepareStatement("delete from `temp part order`");
            prestate.execute();
            orderStockPanel.setVisible(false);
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_orderListCloseActionPerformed

    private void placeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderActionPerformed
        try{
            prestate = db.conn.prepareStatement("INSERT INTO `part order` SELECT * FROM `temp part order` ");
            prestate.executeUpdate();
            prestate = db.conn.prepareStatement("DELETE FROM `temp part order` ");
            prestate.execute();
            updateTempTable();
            orderStockPanel.setVisible(false);
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_placeOrderActionPerformed

    private void addToBasketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToBasketActionPerformed
        try{
            int index = salesTable.getSelectedRow();
            int tableQty = Integer.parseInt(salesTable.getValueAt(index, 6).toString());
            String partNo = salesTable.getValueAt(index, 0).toString();
            String partName = salesTable.getValueAt(index, 1).toString();
            String unitCost = salesTable.getValueAt(index, 5).toString();
            int nQty = tableQty - (Integer.parseInt(newQty.getText()));
            System.out.println(nQty);
            prestate = db.conn.prepareStatement("UPDATE `parts` SET `Quantity` = '"+nQty+"' WHERE  `PartNo` = '"+partNo+"'  ");
            prestate.execute();
            double totalUnitCost = (Double.parseDouble(newQty.getText())) * (Double.parseDouble(unitCost));
            rowData.add(Arrays.asList(partName, partNo, unitCost, newQty.getText(), String.valueOf(totalUnitCost)));
            basketTotal = basketTotal +totalUnitCost;
            basketVec.add(partNo + "  " + partName + "("+newQty.getText()+")");
            basket.setListData(basketVec);
            updateSalesTable();
         }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "You must select an item from the menu you wish to add to the basket");
        }
    }//GEN-LAST:event_addToBasketActionPerformed

    private void saleToCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleToCustomerActionPerformed
        buttons.setVisible(false);
        saleToCustomerPanel.setVisible(true);
    }//GEN-LAST:event_saleToCustomerActionPerformed

    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        PaymentForParts pFrame = new PaymentForParts(db,rowData, basketTotal);
        pFrame.setVisible(true);
    }//GEN-LAST:event_payActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClose;
    private javax.swing.JTextField addManufacturer;
    private javax.swing.JTextField addPartName;
    private javax.swing.JTextField addPartNumber;
    private javax.swing.JTextField addQuantity;
    private javax.swing.JButton addStock;
    private javax.swing.JPanel addStockPanel;
    private javax.swing.JButton addStockToDB;
    private javax.swing.JButton addToBasket;
    private javax.swing.JButton addToOrderList;
    private javax.swing.JTextField addUnitCost;
    private javax.swing.JTextField addVehicleType;
    private javax.swing.JTextField addYear;
    private javax.swing.JList basket;
    private javax.swing.JPanel buttons;
    private javax.swing.JButton calculate;
    private javax.swing.JButton close;
    private javax.swing.JButton editClose;
    private javax.swing.JTextField editManufacturer;
    private javax.swing.JTextField editPartName;
    private javax.swing.JTextField editPartNumber;
    private javax.swing.JTextField editQuantity;
    private javax.swing.JButton editStock;
    private javax.swing.JPanel editStockPanel;
    private javax.swing.JButton editStockToDB;
    private javax.swing.JTextField editUnitCost;
    private javax.swing.JTextField editVehicleType;
    private javax.swing.JTextField editYear;
    private javax.swing.JButton invoice;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField newQty;
    private javax.swing.JButton order;
    private javax.swing.JTextField orderDate;
    private javax.swing.JTextField orderDescription;
    private javax.swing.JTextField orderGrandTotal;
    private javax.swing.JTextField orderID;
    private javax.swing.JTable orderList;
    private javax.swing.JButton orderListClose;
    private javax.swing.JTextField orderNumber;
    private javax.swing.JTextField orderPriceOfUnit;
    private javax.swing.JTextField orderQuantity;
    private javax.swing.JPanel orderStockPanel;
    private javax.swing.JTextField orderSupplier;
    private javax.swing.JTextField orderTotal;
    private javax.swing.JButton pay;
    private javax.swing.JButton placeOrder;
    private javax.swing.JButton saleToCustomer;
    private javax.swing.JPanel saleToCustomerPanel;
    private javax.swing.JTable salesTable;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchStock;
    private javax.swing.JButton selectSupplier;
    private javax.swing.JTable stockTable;
    private javax.swing.JComboBox supplierCombo;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
