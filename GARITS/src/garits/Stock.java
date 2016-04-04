package garits;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
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
     double total;
     double grandTotal;
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
        orderGrandTotal.setEditable(false);
        total = 0;
        grandTotal = 0;
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
        orderFromList = new javax.swing.JButton();
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
        jLabel25 = new javax.swing.JLabel();
        orderDate1 = new javax.swing.JTextField();
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

        javax.swing.GroupLayout buttonsLayout = new javax.swing.GroupLayout(buttons);
        buttons.setLayout(buttonsLayout);
        buttonsLayout.setHorizontalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(addStock, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editStock, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchStock, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonsLayout.createSequentialGroup()
                        .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buttonsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(editStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(buttonsLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(searchStock, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(buttonsLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(addStock, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        add(buttons);
        buttons.setBounds(5, 247, 1290, 622);

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
        addStockPanel.setBounds(300, 190, 820, 420);

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
        editStockPanel.setBounds(150, 210, 820, 420);

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

        orderFromList.setText("ORDER");
        orderFromList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderFromListActionPerformed(evt);
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

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel25.setText("Order ID:");

        javax.swing.GroupLayout orderStockPanelLayout = new javax.swing.GroupLayout(orderStockPanel);
        orderStockPanel.setLayout(orderStockPanelLayout);
        orderStockPanelLayout.setHorizontalGroup(
            orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderStockPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(orderStockPanelLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orderNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jLabel23)
                    .addComponent(orderGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(orderStockPanelLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(orderStockPanelLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orderDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderStockPanelLayout.createSequentialGroup()
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(orderStockPanelLayout.createSequentialGroup()
                                .addGap(326, 326, 326)
                                .addComponent(orderFromList, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(orderStockPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderStockPanelLayout.createSequentialGroup()
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(orderStockPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addToOrderList, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(invoice))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(placeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orderListClose, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(orderStockPanelLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(supplierCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(selectSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(125, 125, 125))))
        );
        orderStockPanelLayout.setVerticalGroup(
            orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderStockPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(orderNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(supplierCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(selectSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderStockPanelLayout.createSequentialGroup()
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(orderPriceOfUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(orderSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(orderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(orderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(orderDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(685, 685, 685))
                    .addGroup(orderStockPanelLayout.createSequentialGroup()
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addToOrderList, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(placeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(orderStockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderListClose, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(orderFromList, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        add(orderStockPanel);
        orderStockPanel.setBounds(190, 940, 870, 730);

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
        // TODO add your handling code here:
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
                    + "`Manufacturer`, `VehicleType`, `Years`, `UnitCost`, `Quantity`) "
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
                    + "`Manufacturer`= '" + editManufacturer.getText() + "',`VehicleType`='" + editVehicleType.getText() + "',"
                    + "`Years`='" + editYear.getText() + "' ,`UnitCost`='" + editUnitCost.getText() + "' ,"
                    + "`Quantity`= '" + editQuantity.getText() + "' "
                    + "WHERE `PartNo` = '" + editPartNumber.getText() + "'  ");
            prestate.execute();
            editStockPanel.setVisible(false);
            JOptionPane.showMessageDialog(null, "Part: " + editPartNumber.getText() + " has been updated");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Part: " + editPartNumber.getText() + " has not been updated");
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
        try{
            prestate = db.conn.prepareStatement("INSERT INTO `temp part order` (`Order No`, `Description`, "
                    + "`Qty`, `Price`, `Supplier`, `Date`) Values (?,?,?,?,?,?) ");
            prestate.setString(1, orderNumberString);
            prestate.setString(2, orderDescriptionString);
            prestate.setString(3, orderQuantityString);
            prestate.setString(4, orderTotalString);
            prestate.setString(5, orderSupplierString);
            prestate.setString(6, orderDateString);
            prestate.executeUpdate();
            updateTempTable();
        }catch(Exception ex){
            System.out.println(prestate);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_addToOrderListActionPerformed

    private void orderFromListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderFromListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderFromListActionPerformed

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
        String orderNumberString = orderNumber.getText();
        String orderDescriptionString = orderDescription.getText();
        String orderQuantityString = orderQuantity.getText();
        String orderPriceOfUnitString = orderPriceOfUnit.getText();
        String orderSupplierString = orderSupplier.getText();
        //String orderTotalString = orderTotal.getText();
        try{
            prestate = db.conn.prepareStatement("INSERT INTO `part order` (Order Number ,Description, Quantity,"
                    + "Price, Supplier) Values (?,?,?,?,?) ");
            
            prestate.executeUpdate();
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_placeOrderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClose;
    private javax.swing.JTextField addManufacturer;
    private javax.swing.JTextField addPartName;
    private javax.swing.JTextField addPartNumber;
    private javax.swing.JTextField addQuantity;
    private javax.swing.JButton addStock;
    private javax.swing.JPanel addStockPanel;
    private javax.swing.JButton addStockToDB;
    private javax.swing.JButton addToOrderList;
    private javax.swing.JTextField addUnitCost;
    private javax.swing.JTextField addVehicleType;
    private javax.swing.JTextField addYear;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton order;
    private javax.swing.JTextField orderDate;
    private javax.swing.JTextField orderDate1;
    private javax.swing.JTextField orderDescription;
    private javax.swing.JButton orderFromList;
    private javax.swing.JTextField orderGrandTotal;
    private javax.swing.JTable orderList;
    private javax.swing.JButton orderListClose;
    private javax.swing.JTextField orderNumber;
    private javax.swing.JTextField orderPriceOfUnit;
    private javax.swing.JTextField orderQuantity;
    private javax.swing.JPanel orderStockPanel;
    private javax.swing.JTextField orderSupplier;
    private javax.swing.JTextField orderTotal;
    private javax.swing.JButton placeOrder;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchStock;
    private javax.swing.JButton selectSupplier;
    private javax.swing.JTable stockTable;
    private javax.swing.JComboBox supplierCombo;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
