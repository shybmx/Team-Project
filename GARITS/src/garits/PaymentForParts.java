package garits;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import wagu.Board;
import wagu.Table;

public class PaymentForParts extends javax.swing.JFrame {
    DBConnect db;
    PreparedStatement prestate;
    ArrayList<List<String>> rowData;
    double basketTotal;
    double mPerc;
    double vPerc;
    double markPrice;
    double vatPrice;
    double grandTotal;
    String paymentType;
    public PaymentForParts(DBConnect db, ArrayList<List<String>> rowData, double basketTotal) {
        //Setting up all the componets within this JFrame
        initComponents();
        //Passing in the database connection
        this.db = db;
        //Setting the size of this JFrame
        this.setSize(600, 680);
        //Removes the background from the JButtons and JPanels
        cardPayment.setOpaque(false);
        cardPayment.setContentAreaFilled(false);
        cardPayment.setBorderPainted(false);
        cashPayment.setOpaque(false);
        cashPayment.setContentAreaFilled(false);
        cashPayment.setBorderPainted(false);
        chequePayment.setOpaque(false);
        chequePayment.setContentAreaFilled(false);
        chequePayment.setBorderPainted(false);
        close.setOpaque(false);
        close.setContentAreaFilled(false);
        close.setBorderPainted(false);
        buttons.setOpaque(false);
        cardPaymentPanel.setOpaque(false);
        cardPaymentPanel.setVisible(false);
        storeCardPayment.setOpaque(false);
        storeCardPayment.setContentAreaFilled(false);
        storeCardPayment.setBorderPainted(false);
        closeCardPayment.setOpaque(false);
        closeCardPayment.setContentAreaFilled(false);
        closeCardPayment.setBorderPainted(false);
        chequePaymentPanel.setOpaque(false);
        chequePaymentPanel.setVisible(false);
        storeChequePayment.setOpaque(false);
        storeChequePayment.setContentAreaFilled(false);
        storeChequePayment.setBorderPainted(false);
        closeChequePayment.setOpaque(false);
        closeChequePayment.setContentAreaFilled(false);
        closeChequePayment.setBorderPainted(false);
        cashPaymentPanel.setOpaque(false);
        cashPaymentPanel.setVisible(false);
        storeCashPayment.setOpaque(false);
        storeCashPayment.setContentAreaFilled(false);
        storeCashPayment.setBorderPainted(false);
        closeCash.setOpaque(false);
        closeCash.setContentAreaFilled(false);
        closeCash.setBorderPainted(false);
        paymentCard.setEditable(false);
        amountFieldCard.setEditable(false);
        amountFieldCash.setEditable(false);
        cashPaymentType.setEditable(false);
        paymentCheque.setEditable(false);
        amountFieldCheque.setEditable(false);
        //Make the JFrame non resaizeable
        this.setResizable(false);
        //Passing in the data
        this.rowData = rowData;
        this.basketTotal = basketTotal;
        //Doing the calculations
        calculations();
        //Setting the text fields
        amountFieldCard.setText(String.valueOf(grandTotal));
        amountFieldCheque.setText(String.valueOf(grandTotal));
        amountFieldCash.setText(String.valueOf(grandTotal));
    }

    public void calculations() {
        //Formatting the numbers
        DecimalFormat format = new DecimalFormat("0.00");
        try {
            //Creating a MySQL statement where it will select the mark up price
            prestate = db.conn.prepareStatement("SELECT * FROM `system config` WHERE `Variables` = 'mark up for parts' ");
            //Executing the query and placing it in a result set
            ResultSet markR = prestate.executeQuery();
            //Creating a MySQL statement that will get the VAT
            prestate = db.conn.prepareStatement("SELECT * FROM `system config` WHERE `Variables`= 'VAT'");
            //Executing the query and placing it in a result set
            ResultSet vatR = prestate.executeQuery();
            //Goes to the next result which is not the header
            markR.next();
            vatR.next();
            //placing the values into variables
            mPerc = markR.getDouble("Value");
            vPerc = vatR.getDouble("Value");
        } catch (Exception ex) {
                
        }
        //Calculate everything that is needed
        markPrice = ((mPerc / 100) * basketTotal);
        vatPrice = ((vPerc / 100) * (markPrice + basketTotal));
        grandTotal = basketTotal + markPrice + vatPrice;
        String sGTotal = format.format(grandTotal);
        grandTotal = Double.parseDouble(sGTotal);
    }

    public void payment() {
        //Creating a file on a certain path
        File file = new File("/Users/shahzad/Desktop/PartStoreInvoice.txt");
        //A List for the headers of the file
        List<String> headers = Arrays.asList("ITEM", "PART NO", "UNIT COST", "QTY", "COST(£)");
        try {
            //Creating a new file writer
            FileWriter fr = new FileWriter(file.getAbsoluteFile());
            //Creating a new buffered writer which will let use wirte to the file
            BufferedWriter out = new BufferedWriter(fr);
            //Starting to write all the information into the file
            out.write("Customer Name: " + customerNameFieldCard.getText());
            //Creating a new line
            out.newLine();
            out.newLine();
            //Setting the size of the table
            Board board = new Board(90);
            //Creating the table
            String tableString = board.setInitialBlock(new Table(board, 90, headers, rowData).tableToBlocks()).build().getPreview();
            //writing in the table to the file
            out.write(tableString);
            out.newLine();
            out.newLine();
            //Writing in more relevent information
            out.write("Payment Type: " + paymentType);
            out.newLine();
            out.write("VAT:" + " £" + vatPrice);
            out.newLine();
            out.write("Grand Total:" + " £" + grandTotal);
            //Close the writing file
            out.close();
        } catch (Exception ex) {
            //Prints out any error to the terminal
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cashPaymentPanel = new javax.swing.JPanel();
        customerName = new javax.swing.JTextField();
        storeCashPayment = new javax.swing.JButton();
        closeCash = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        amountFieldCash = new javax.swing.JTextField();
        cashPaymentType = new javax.swing.JTextField();
        buttons = new javax.swing.JPanel();
        cashPayment = new javax.swing.JButton();
        cardPayment = new javax.swing.JButton();
        chequePayment = new javax.swing.JButton();
        close = new javax.swing.JButton();
        cardPaymentPanel = new javax.swing.JPanel();
        amountFieldCard = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cardNumberFieldCard = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        expiryDateFieldCard = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sortCodeFieldCard = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        accountNumberFieldCard = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        securityNumberFieldCard = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        storeCardPayment = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        closeCardPayment = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        customerNameFieldCard = new javax.swing.JTextField();
        nameOnCardFieldCard = new javax.swing.JTextField();
        paymentCard = new javax.swing.JTextField();
        chequePaymentPanel = new javax.swing.JPanel();
        storeChequePayment = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        closeChequePayment = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nameFieldCheque = new javax.swing.JTextField();
        chequeDateFieldCheque = new javax.swing.JTextField();
        payToNameFieldCheque = new javax.swing.JTextField();
        chequeNameFieldCheque = new javax.swing.JTextField();
        memoFieldCheque = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        amountFieldCheque = new javax.swing.JTextField();
        paymentCheque = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        storeCashPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/storeicon.png"))); // NOI18N
        storeCashPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeCashPaymentActionPerformed(evt);
            }
        });

        closeCash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        closeCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeCashActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel16.setText("Customer:");

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel17.setText("Amount Paid:");

        cashPaymentType.setText("Cash Payment");

        javax.swing.GroupLayout cashPaymentPanelLayout = new javax.swing.GroupLayout(cashPaymentPanel);
        cashPaymentPanel.setLayout(cashPaymentPanelLayout);
        cashPaymentPanelLayout.setHorizontalGroup(
            cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashPaymentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashPaymentPanelLayout.createSequentialGroup()
                        .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountFieldCash, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cashPaymentType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashPaymentPanelLayout.createSequentialGroup()
                        .addComponent(storeCashPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(closeCash, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        cashPaymentPanelLayout.setVerticalGroup(
            cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashPaymentPanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(cashPaymentType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(amountFieldCash, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(closeCash, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storeCashPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        getContentPane().add(cashPaymentPanel);
        cashPaymentPanel.setBounds(100, 150, 386, 390);

        cashPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/cashicon.png"))); // NOI18N
        cashPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashPaymentActionPerformed(evt);
            }
        });

        cardPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/cardpaymenticon.png"))); // NOI18N
        cardPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardPaymentActionPerformed(evt);
            }
        });

        chequePayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/cheque.png"))); // NOI18N
        chequePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chequePaymentActionPerformed(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        close.setPreferredSize(new java.awt.Dimension(120, 155));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsLayout = new javax.swing.GroupLayout(buttons);
        buttons.setLayout(buttonsLayout);
        buttonsLayout.setHorizontalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cashPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cardPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chequePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cashPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cardPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(chequePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        getContentPane().add(buttons);
        buttons.setBounds(30, 220, 530, 173);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Customer Name:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Name On Card:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("Amount:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Card Number:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("Expiry Date:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setText("Sort Code:");

        storeCardPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/storeicon.png"))); // NOI18N
        storeCardPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeCardPaymentActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel8.setText("Account Number:");

        closeCardPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        closeCardPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeCardPaymentActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel9.setText("Security Number:");

        paymentCard.setText("Card Payment");

        javax.swing.GroupLayout cardPaymentPanelLayout = new javax.swing.GroupLayout(cardPaymentPanel);
        cardPaymentPanel.setLayout(cardPaymentPanelLayout);
        cardPaymentPanelLayout.setHorizontalGroup(
            cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPaymentPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPaymentPanelLayout.createSequentialGroup()
                        .addComponent(storeCardPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeCardPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(cardPaymentPanelLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameOnCardFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cardPaymentPanelLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amountFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(cardPaymentPanelLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cardNumberFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(cardPaymentPanelLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(expiryDateFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(cardPaymentPanelLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sortCodeFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(cardPaymentPanelLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(accountNumberFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cardPaymentPanelLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(paymentCard, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(customerNameFieldCard))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPaymentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(securityNumberFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        cardPaymentPanelLayout.setVerticalGroup(
            cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPaymentPanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(paymentCard, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(customerNameFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameOnCardFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(amountFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardNumberFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expiryDateFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortCodeFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountNumberFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(securityNumberFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(storeCardPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeCardPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(cardPaymentPanel);
        cardPaymentPanel.setBounds(80, 60, 423, 580);

        storeChequePayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/storeicon.png"))); // NOI18N
        storeChequePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeChequePaymentActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel10.setText("Name:");

        closeChequePayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/closeicon.png"))); // NOI18N
        closeChequePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeChequePaymentActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel11.setText("Cheque Date:");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel12.setText("Pay To Name:");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel13.setText("Cheque Name:");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel14.setText("Memo:");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel15.setText("Amount:");

        paymentCheque.setText("Cheque Payment");

        javax.swing.GroupLayout chequePaymentPanelLayout = new javax.swing.GroupLayout(chequePaymentPanel);
        chequePaymentPanel.setLayout(chequePaymentPanelLayout);
        chequePaymentPanelLayout.setHorizontalGroup(
            chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chequePaymentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(amountFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chequePaymentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(payToNameFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chequePaymentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chequeDateFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chequePaymentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(chequeNameFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chequePaymentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(memoFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chequePaymentPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chequePaymentPanelLayout.createSequentialGroup()
                                .addComponent(storeChequePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(closeChequePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chequePaymentPanelLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(117, 117, 117)
                                .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(paymentCheque)
                                    .addComponent(nameFieldCheque, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        chequePaymentPanelLayout.setVerticalGroup(
            chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chequePaymentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paymentCheque, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nameFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amountFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(chequeDateFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payToNameFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                        .addComponent(chequeNameFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(memoFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)))
                .addGap(29, 29, 29)
                .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(closeChequePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storeChequePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(chequePaymentPanel);
        chequePaymentPanel.setBounds(80, 110, 411, 470);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void storeCardPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeCardPaymentActionPerformed
        //Get the text fields and place them into a String variable
        String name = customerNameFieldCard.getText();
        String nameOnCard = nameOnCardFieldCard.getText();
        String amount = amountFieldCard.getText();
        String cardNumber = cardNumberFieldCard.getText();
        String expiryDate = expiryDateFieldCard.getText();
        String sortCode = sortCodeFieldCard.getText();
        String accountNumber = accountNumberFieldCard.getText();
        String securityNumber = securityNumberFieldCard.getText();
        String paymentType = paymentCard.getText();
        try {
            //Creating a MySQL statement which will insert the card payment details
            prestate = db.conn.prepareStatement("INSERT INTO `garits`.`cardpayment` (CustomerName, CardOwnerName, "
                    + "Amount, CardNumber, ExpiryDate, SortCode, AccountNumber, SecuirtyNumber) "
                    + "Values(?,?,?,?,?,?,?,?)");
            //Get the string variables and place them into the query
            prestate.setString(1, name);
            prestate.setString(2, nameOnCard);
            prestate.setString(3, amount);
            prestate.setString(4, cardNumber);
            prestate.setString(5, expiryDate);
            prestate.setString(6, sortCode);
            prestate.setString(7, accountNumber);
            prestate.setString(8, securityNumber);
            //Executing the query and placing it into an int 
            int i = prestate.executeUpdate();
            //If the result is more then 0
            if (i > 0) {
                //Show a pop up which shows a payment successful
                JOptionPane.showMessageDialog(null, "Payment successfully saved");
                //Make this JPanel invisable
                this.setVisible(false);
            } else {
                //A pop up menu which shows the payment not successful
                JOptionPane.showMessageDialog(null, "Payment has not been saved");
            }
        } catch (Exception ex) {
            //A pop up box to show that there was an error with the database connection or MySQL statement
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
        }
        try {
            //Creating a MySQL statement which will insert the card payment details
            prestate = db.conn.prepareStatement("INSERT INTO `garits`.`payment` (PaymentType, "
                    + "Amount, CustomerName)"
                    + "Values (?,?,?) ");
            //Getting the string variables and placing them into the MySQL statement
            prestate.setString(1, paymentType);
            prestate.setString(2, amount);
            prestate.setString(3, name);
            //Execute the query
            prestate.executeUpdate();
        } catch (Exception ex) {
            //A pop up showing there was an error with the database connection or MySQL statement
            JOptionPane.showMessageDialog(null, "Cannot connect to database");
        }
        //Creating the invoice for payment
        payment();
    }//GEN-LAST:event_storeCardPaymentActionPerformed

    private void closeCardPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeCardPaymentActionPerformed
        //Close the JPanel
        this.setVisible(false);
    }//GEN-LAST:event_closeCardPaymentActionPerformed

    private void cashPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashPaymentActionPerformed
        //Closing the payment JPanel
        buttons.setVisible(false);
        //Making the String variable equal to cash payment
        paymentType = "Cash Payment";
        //Making the JPanel visable
        cashPaymentPanel.setVisible(true);
    }//GEN-LAST:event_cashPaymentActionPerformed

    private void cardPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardPaymentActionPerformed
        //Making the JPanel invisable
        buttons.setVisible(false);
        //Making the String variable equal to card payment
        paymentType = "Card Payment";
        //Making the JPanel visable
        cardPaymentPanel.setVisible(true);
    }//GEN-LAST:event_cardPaymentActionPerformed

    private void chequePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chequePaymentActionPerformed
        //Makes the buttons JPanel invisable
        buttons.setVisible(false);
        //Making the String variable equal to cheque payment
        paymentType = "Cheque Payment";
        //Making the JPanel visable
        chequePaymentPanel.setVisible(true);
    }//GEN-LAST:event_chequePaymentActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        //Making this JPanel invisable
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void storeChequePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeChequePaymentActionPerformed
        //Getting the text fields and placing them into a string variable
        String name = nameFieldCheque.getText();
        String amount = amountFieldCheque.getText();
        String chequeDate = chequeDateFieldCheque.getText();
        String payToName = payToNameFieldCheque.getText();
        String chequeName = chequeNameFieldCheque.getText();
        String memo = memoFieldCheque.getText();
        String paymentType = paymentCheque.getText();
        try {
            //Creating a MySQL statement that will insert the details into the database
            prestate = db.conn.prepareStatement("INSERT INTO  `garits`.`chequepayment` (CustomerName, Amount, ChequeDate,"
                    + "PayToName, ChequeName, Memo) "
                    + "Values(?,?,?,?,?,?);");
            //Getting the strinag variables and placing them into A the query
            prestate.setString(1, name);
            prestate.setString(2, amount);
            prestate.setString(3, chequeDate);
            prestate.setString(4, payToName);
            prestate.setString(5, chequeName);
            prestate.setString(6, memo);
            //Execute they query and place it in an int variable
            int i = prestate.executeUpdate();
            if (i > 0) {
                //A pop up showing the payment was successful
                JOptionPane.showMessageDialog(null, "Payment successfully saved");
                //Making the JPanel invisable
                this.setVisible(false);
            } else {
                //Showing an error message if one of the variables was not right
                JOptionPane.showMessageDialog(null, "Payment has not been saved");
            }
        } catch (Exception ex) {
            //Showing an error message if there was a problem with the database connection or MySQL statement
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
        }
        try {
            //Creating a MySQL statement which will insert the details into the database
            prestate = db.conn.prepareStatement("INSERT INTO `garits`.`payment` (PaymentType, "
                    + "Amount, CustomerName)"
                    + "Values (?,?,?) ");
            //Getting the strinag variables and placing them into A the query
            prestate.setString(1, paymentType);
            prestate.setString(2, amount);
            prestate.setString(3, name);
            //Executing the query
            prestate.executeUpdate();
        } catch (Exception ex) {
            //Showing a error message that there was connection with the database or MySQL statement
            JOptionPane.showMessageDialog(null, "Cannot connect to database");
        }
        //Creates an invoice
        payment();
    }//GEN-LAST:event_storeChequePaymentActionPerformed

    private void closeChequePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeChequePaymentActionPerformed
        //Makes the JPanel invisable
        this.setVisible(false);
    }//GEN-LAST:event_closeChequePaymentActionPerformed

    private void storeCashPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeCashPaymentActionPerformed
        //Getting the text fields and placing them into a String variable
        String customerNameString = customerName.getText();
        String amountFieldCashString = amountFieldCash.getText();
        String paymentTypeString = cashPaymentType.getText();
        try {
            //Creating a MySQL statement which will insert into the database
            prestate = db.conn.prepareStatement("INSERT INTO `cashpayment`(CustomerName, Amount) "
                    + "Values(?,?)");
            //Getting the string variables and placing them into the MySQL statement
            prestate.setString(1, customerNameString);
            prestate.setString(2, amountFieldCashString);
            //Executing the query
            prestate.executeUpdate();
        } catch (Exception ex) {
            //Print any errors to the terminal
            ex.printStackTrace();
        }
        try {
            //Creating a MySQL statement which will insert into the database
            prestate = db.conn.prepareStatement("INSERT INTO `payment` (PaymentType, Amount, CustomerName)"
                    + "Values(?,?,?)");
            //Gettng the string variables and placing them into the MySQL query
            prestate.setString(1, paymentTypeString);
            prestate.setString(2, amountFieldCashString);
            prestate.setString(3, customerNameString);
            //Executing the query
            prestate.executeUpdate();
        } catch (Exception ex) {
        }
        //Creating an invoice
        payment();
    }//GEN-LAST:event_storeCashPaymentActionPerformed

    private void closeCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeCashActionPerformed
        //Making this JPanel invisable
        this.setVisible(false);
    }//GEN-LAST:event_closeCashActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountNumberFieldCard;
    private javax.swing.JTextField amountFieldCard;
    private javax.swing.JTextField amountFieldCash;
    private javax.swing.JTextField amountFieldCheque;
    private javax.swing.JPanel buttons;
    private javax.swing.JTextField cardNumberFieldCard;
    private javax.swing.JButton cardPayment;
    private javax.swing.JPanel cardPaymentPanel;
    private javax.swing.JButton cashPayment;
    private javax.swing.JPanel cashPaymentPanel;
    private javax.swing.JTextField cashPaymentType;
    private javax.swing.JTextField chequeDateFieldCheque;
    private javax.swing.JTextField chequeNameFieldCheque;
    private javax.swing.JButton chequePayment;
    private javax.swing.JPanel chequePaymentPanel;
    private javax.swing.JButton close;
    private javax.swing.JButton closeCardPayment;
    private javax.swing.JButton closeCash;
    private javax.swing.JButton closeChequePayment;
    private javax.swing.JTextField customerName;
    private javax.swing.JTextField customerNameFieldCard;
    private javax.swing.JTextField expiryDateFieldCard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField memoFieldCheque;
    private javax.swing.JTextField nameFieldCheque;
    private javax.swing.JTextField nameOnCardFieldCard;
    private javax.swing.JTextField payToNameFieldCheque;
    private javax.swing.JTextField paymentCard;
    private javax.swing.JTextField paymentCheque;
    private javax.swing.JTextField securityNumberFieldCard;
    private javax.swing.JTextField sortCodeFieldCard;
    private javax.swing.JButton storeCardPayment;
    private javax.swing.JButton storeCashPayment;
    private javax.swing.JButton storeChequePayment;
    // End of variables declaration//GEN-END:variables
}
