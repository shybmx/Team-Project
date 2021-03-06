package garits;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Payment extends javax.swing.JPanel {

    DBConnect db;
    PreparedStatement prestate;

    public Payment(DBConnect db) {
        //Setting up all the componets within this JPanel
        initComponents();
        //Passing in the database connection
        this.db = db;
        //Removing the background from from all the JButtons and JPanels
        searchCustomerChequeButton.setOpaque(false);
        searchCustomerChequeButton.setContentAreaFilled(false);        
        searchCustomerChequeButton.setBorderPainted(false);
        searchCustomerCardButton.setOpaque(false);
        searchCustomerCardButton.setContentAreaFilled(false);        
        searchCustomerCardButton.setBorderPainted(false);
        searchCash.setOpaque(false);
        searchCash.setContentAreaFilled(false);        
        searchCash.setBorderPainted(false);
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
        jobNumberCard.setEditable(false);
        customerNameFieldCard.setEditable(false);
        amountFieldCard.setEditable(false);
        jobNumberCash.setEditable(false);
        customerName.setEditable(false);
        amountPaid.setEditable(false);
        cashPaymentField.setEditable(false);
        //Setting the size of the JPanel
        this.setSize(1300, 900);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttons = new javax.swing.JPanel();
        cashPayment = new javax.swing.JButton();
        cardPayment = new javax.swing.JButton();
        chequePayment = new javax.swing.JButton();
        close = new javax.swing.JButton();
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
        jLabel20 = new javax.swing.JLabel();
        jobNumberCheque = new javax.swing.JTextField();
        searchCustomerCheque = new javax.swing.JTextField();
        searchCustomerChequeButton = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        chequeDiscountType = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        chequeCustomerType = new javax.swing.JTextField();
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
        searchCustomerCardButton = new javax.swing.JButton();
        searchCustomerCard = new javax.swing.JTextField();
        jobNumberCard = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        customerTypeCard = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        discountTypeCard = new javax.swing.JTextField();
        cashPaymentPanel = new javax.swing.JPanel();
        customerName = new javax.swing.JTextField();
        storeCashPayment = new javax.swing.JButton();
        closeCash = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        amountPaid = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jobNumberCash = new javax.swing.JTextField();
        searchCash = new javax.swing.JButton();
        searchCustomerCash = new javax.swing.JTextField();
        cashDiscountType = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        cashCustomerType = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cashPaymentField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

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

        add(buttons);
        buttons.setBounds(370, 360, 530, 173);

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

        amountFieldCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountFieldChequeActionPerformed(evt);
            }
        });

        paymentCheque.setText("Cheque Payment");

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel20.setText("Job Number:");

        searchCustomerChequeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/searchicon.png"))); // NOI18N
        searchCustomerChequeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerChequeButtonActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel23.setText("Discount Type:");

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel24.setText("Customer Type:");

        javax.swing.GroupLayout chequePaymentPanelLayout = new javax.swing.GroupLayout(chequePaymentPanel);
        chequePaymentPanel.setLayout(chequePaymentPanelLayout);
        chequePaymentPanelLayout.setHorizontalGroup(
            chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel15)
                        .addGap(117, 117, 117)
                        .addComponent(amountFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chequeDiscountType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, chequePaymentPanelLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(searchCustomerCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(searchCustomerChequeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, chequePaymentPanelLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(paymentCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, chequePaymentPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(58, 58, 58)
                                .addComponent(chequeDateFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel24))
                            .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(55, 55, 55)
                                .addComponent(payToNameFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chequeCustomerType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chequePaymentPanelLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(137, 137, 137)
                                .addComponent(nameFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel14)
                                .addGap(111, 111, 111))
                            .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(68, 68, 68)
                                .addComponent(jobNumberCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel13)
                                .addGap(21, 21, 21)))
                        .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(memoFieldCheque, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(chequeNameFieldCheque)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, chequePaymentPanelLayout.createSequentialGroup()
                        .addGap(503, 503, 503)
                        .addComponent(storeChequePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(closeChequePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        chequePaymentPanelLayout.setVerticalGroup(
            chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(searchCustomerCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchCustomerChequeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(paymentCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                        .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jobNumberCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel13))))
                            .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(chequeNameFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(nameFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel14)))
                        .addGap(5, 5, 5)
                        .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(amountFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(chequeDiscountType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(3, 3, 3)
                        .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chequeDateFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel24)
                                        .addComponent(chequeCustomerType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(1, 1, 1)
                        .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(payToNameFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(closeChequePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(storeChequePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(memoFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        add(chequePaymentPanel);
        chequePaymentPanel.setBounds(230, 270, 860, 580);

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

        paymentCard.setText("Cash Payment");

        searchCustomerCardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/searchicon.png"))); // NOI18N
        searchCustomerCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerCardButtonActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel18.setText("Job Number:");

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel21.setText("Customer Type:");

        customerTypeCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerTypeCardActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel22.setText("Discount Type:");

        discountTypeCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountTypeCardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardPaymentPanelLayout = new javax.swing.GroupLayout(cardPaymentPanel);
        cardPaymentPanel.setLayout(cardPaymentPanelLayout);
        cardPaymentPanelLayout.setHorizontalGroup(
            cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPaymentPanelLayout.createSequentialGroup()
                .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cardPaymentPanelLayout.createSequentialGroup()
                        .addComponent(storeCardPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeCardPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cardPaymentPanelLayout.createSequentialGroup()
                        .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(cardPaymentPanelLayout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(paymentCard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPaymentPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jobNumberCard, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(cardPaymentPanelLayout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addGap(30, 30, 30)
                                                    .addComponent(nameOnCardFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cardPaymentPanelLayout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(109, 109, 109)
                                                    .addComponent(amountFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cardPaymentPanelLayout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(customerNameFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPaymentPanelLayout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(searchCustomerCard, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(searchCustomerCardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(cardPaymentPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cardNumberFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPaymentPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(69, 69, 69)
                                    .addComponent(expiryDateFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPaymentPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(84, 84, 84)
                                    .addComponent(sortCodeFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPaymentPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(accountNumberFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPaymentPanelLayout.createSequentialGroup()
                                    .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPaymentPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(cardPaymentPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel21)
                                            .addGap(28, 28, 28)))
                                    .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(customerTypeCard)
                                        .addComponent(securityNumberFieldCard, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                            .addGroup(cardPaymentPanelLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(discountTypeCard, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        cardPaymentPanelLayout.setVerticalGroup(
            cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPaymentPanelLayout.createSequentialGroup()
                .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardPaymentPanelLayout.createSequentialGroup()
                        .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cardPaymentPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(searchCustomerCardButton))
                            .addGroup(cardPaymentPanelLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(searchCustomerCard, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(paymentCard, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPaymentPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel22)
                            .addComponent(discountTypeCard, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardPaymentPanelLayout.createSequentialGroup()
                        .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jobNumberCard, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
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
                        .addComponent(jLabel5))
                    .addGroup(cardPaymentPanelLayout.createSequentialGroup()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cardNumberFieldCard, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(customerTypeCard))))
                .addGap(18, 18, 18)
                .addGroup(cardPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(storeCardPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeCardPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(371, 371, 371))
        );

        add(cardPaymentPanel);
        cardPaymentPanel.setBounds(210, 220, 860, 640);

        customerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameActionPerformed(evt);
            }
        });

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

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel19.setText("Job Number:");

        searchCash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/searchicon.png"))); // NOI18N
        searchCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCashActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel25.setText("Discount Type:");

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel26.setText("Customer Type:");

        cashPaymentField.setText("Cash Payment");

        javax.swing.GroupLayout cashPaymentPanelLayout = new javax.swing.GroupLayout(cashPaymentPanel);
        cashPaymentPanel.setLayout(cashPaymentPanelLayout);
        cashPaymentPanelLayout.setHorizontalGroup(
            cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashPaymentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashPaymentPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashPaymentPanelLayout.createSequentialGroup()
                                .addComponent(searchCustomerCash, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchCash, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashPaymentPanelLayout.createSequentialGroup()
                                .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashPaymentPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cashCustomerType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashPaymentPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addGap(22, 22, 22)
                                        .addComponent(cashDiscountType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))
                    .addGroup(cashPaymentPanelLayout.createSequentialGroup()
                        .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cashPaymentPanelLayout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(storeCashPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(closeCash, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashPaymentPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashPaymentPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(38, 38, 38)
                                        .addComponent(amountPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashPaymentPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(72, 72, 72)
                                        .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashPaymentPanelLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cashPaymentField)
                                    .addComponent(jobNumberCash, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        cashPaymentPanelLayout.setVerticalGroup(
            cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cashPaymentPanelLayout.createSequentialGroup()
                .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashPaymentPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(searchCash, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cashPaymentPanelLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(searchCustomerCash, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(cashPaymentField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jobNumberCash, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(amountPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(cashDiscountType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(cashCustomerType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cashPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(closeCash, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storeCashPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        add(cashPaymentPanel);
        cashPaymentPanel.setBounds(440, 250, 407, 630);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1300, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void cashPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashPaymentActionPerformed
        //Removing the JPanel
        buttons.setVisible(false);
        //Making another JPanel visable
        cashPaymentPanel.setVisible(true);
    }//GEN-LAST:event_cashPaymentActionPerformed

    private void cardPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardPaymentActionPerformed
        //Removing the JPanel
        buttons.setVisible(false);
        //Making another JPanel visable
        cardPaymentPanel.setVisible(true);
    }//GEN-LAST:event_cardPaymentActionPerformed

    private void chequePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chequePaymentActionPerformed
        //Removing the JPanel
        buttons.setVisible(false);
        //Making another JPanel visable
        chequePaymentPanel.setVisible(true);
    }//GEN-LAST:event_chequePaymentActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        //Making this JPanel invisable
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void storeCardPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeCardPaymentActionPerformed
        //Getting all the values from the Text fields and placing them in a String variable
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
            //Creating a MySQL statement which will insert the details into the database
            prestate = db.conn.prepareStatement("INSERT INTO `garits`.`cardpayment` (CustomerName, CardOwnerName, "
                    + "Amount, CardNumber, ExpiryDate, SortCode, AccountNumber, SecuirtyNumber) "
                    + "Values(?,?,?,?,?,?,?,?)");
            //Getting the String and placing them in the MySQL statement
            prestate.setString(1, name);
            prestate.setString(2, nameOnCard);
            prestate.setString(3, amount);
            prestate.setString(4, cardNumber);
            prestate.setString(5, expiryDate);
            prestate.setString(6, sortCode);
            prestate.setString(7, accountNumber);
            prestate.setString(8, securityNumber);
            //Executing the query
            prestate.executeUpdate();
            //Creating a MySQL statement which will insert the payment details into the database
            prestate = db.conn.prepareStatement("INSERT INTO `garits`.`payment` (PaymentType, "
                    + "Amount, CustomerName)"
                    + "Values (?,?,?) ");
            //Getting the String and placing them in the MySQL statement
            prestate.setString(1, paymentType);
            prestate.setString(2, amount);
            prestate.setString(3, name);
            //Executing the query
            prestate.executeUpdate();
            //Creating a MySQL statement where it will select the amount spent in a month
            prestate = db.conn.prepareStatement("SELECT `Spent` FROM `customers` WHERE  name = '" + customerNameFieldCard.getText() + "' ");
            //Executing the query
            ResultSet gs = prestate.executeQuery();
            //Goes to the next result which is not the header
            gs.next();
            //Creating a double variable which will get the spent
            double getSpent = gs.getDouble("Spent");
            //Doing the maths to get the spent and parsing a string to a double
            getSpent = getSpent + Double.parseDouble(amountFieldCard.getText());
            //Creating a MySQL statement which will update the amount spent
            prestate = db.conn.prepareStatement("UPDATE `customers` Set  `Spent` = '" + getSpent + "' WHERE `name` = '" + customerNameFieldCard.getText() + "' ");
            //Executing the query
            prestate.execute();
            //Creating a MySQL statement which will update the has paid to yes
            prestate = db.conn.prepareStatement("UPDATE `jobsheets` SET `HasPaid` = 'Yes' WHERE `Customer`= '"+name+"' ");
            //Executing the query
            prestate.execute();
            //Creating a MySQL statement which will update there statues to cleared
            prestate = db.conn.prepareStatement("UPDATE `customers` SET `Status` = 'Clear' Where `name` = '"+name+"' ");
            //Executing the query
            prestate.execute();
            //Make the Panel invisable
            cardPaymentPanel.setVisible(false);
            //A pop up box showing the payment was successful
            JOptionPane.showMessageDialog(null, "Payment successfully recorded");
        } catch (Exception ex) {
            //An errors message to show a an error with the database connection or MySQL statement 
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
        }        
    }//GEN-LAST:event_storeCardPaymentActionPerformed

    private void closeCardPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeCardPaymentActionPerformed
        //Making the JPanel invisable
        this.setVisible(false);
    }//GEN-LAST:event_closeCardPaymentActionPerformed

    private void storeChequePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeChequePaymentActionPerformed
        //Getting all the values from the Text fields and placing them in a String variable
        String name = nameFieldCheque.getText();
        String amount = amountFieldCheque.getText();
        String chequeDate = chequeDateFieldCheque.getText();
        String payToName = payToNameFieldCheque.getText();
        String chequeName = chequeNameFieldCheque.getText();
        String memo = memoFieldCheque.getText();
        String paymentType = paymentCheque.getText();
        try {
            //Creating a MySQL statement which will insert the details into the database
            prestate = db.conn.prepareStatement("INSERT INTO  `garits`.`chequepayment` (CustomerName, Amount, ChequeDate,"
                    + "PayToName, ChequeName, Memo) "
                    + "Values(?,?,?,?,?,?);");
            //Getting the String and placing them in the MySQL statement
            prestate.setString(1, name);
            prestate.setString(2, amount);
            prestate.setString(3, chequeDate);
            prestate.setString(4, payToName);
            prestate.setString(5, chequeName);
            prestate.setString(6, memo);
            //Executing the query
            prestate.executeUpdate();
            //Creating a MySQL statement which will insert the payment details into the database
            prestate = db.conn.prepareStatement("INSERT INTO `garits`.`payment` (PaymentType, "
                    + "Amount, CustomerName)"
                    + "Values (?,?,?) ");
            //Getting the String and placing them in the MySQL statement
            prestate.setString(1, paymentType);
            prestate.setString(2, amount);
            prestate.setString(3, name);
            //Executing the query
            prestate.executeUpdate();
            //Creating a MySQL statement which will insert the payment details into the database
            prestate = db.conn.prepareStatement("SELECT `Spent` FROM `customers` WHERE  name = '" + nameFieldCheque.getText() + "' ");
            //Executing the query
            ResultSet gs = prestate.executeQuery();
            //Goes to the next result which is not the header
            gs.next();
            //Creating a double variable which will get the spent
            double getSpent = gs.getDouble("Spent");
            //Doing the maths to get the spent and parsing a string to a double
            getSpent = getSpent + Double.parseDouble(amountFieldCheque.getText());
            //Creating a MySQL statement which will update the amount spent
            prestate = db.conn.prepareStatement("UPDATE `customers` Set  `Spent` = '" + getSpent + "' WHERE `name` = '" + nameFieldCheque.getText() + "' ");
            //Executing the query
            prestate.execute();
            //Creating a MySQL statement which will update the has paid to yes
            prestate = db.conn.prepareStatement("UPDATE `jobsheets` SET `HasPaid` = 'Yes' WHERE `Customer`= '"+name+"' ");
            //Executing the query
            prestate.execute();
            //Creating a MySQL statement which will update there statues to cleared
            prestate = db.conn.prepareStatement("UPDATE `customers` SET `Status` = 'Clear' Where `name` = '"+name+"' ");
            //Executing the query
            prestate.execute();
            //Make the Panel invisable
            cardPaymentPanel.setVisible(false);
            //A pop up box showing the payment was successful
            JOptionPane.showMessageDialog(null, "Payment successfully recorded");
        } catch (Exception ex) {
            //An errors message to show a an error with the database connection or MySQL statement
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
        }
    }//GEN-LAST:event_storeChequePaymentActionPerformed

    private void closeChequePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeChequePaymentActionPerformed
        //Make this JPanel invisable
        this.setVisible(false);
    }//GEN-LAST:event_closeChequePaymentActionPerformed

    private void storeCashPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeCashPaymentActionPerformed
        //Getting all the values from the Text fields and placing them in a String variable
        String name = customerName.getText().toString();
        String amount = amountPaid.getText().toString();
        String paymentType = cashPaymentField.getText();
        try{
            //Creating a MySQL statement which will insert the details into the database
            prestate = db.conn.prepareStatement("INSERT INTO  `garits`.`cashpayment` (CustomerName, Amount) "
                    + "Values(?,?);");
            //Getting the String and placing them in the MySQL statement
            prestate.setString(1, name);
            prestate.setString(2, amount);
            //Execute the query
            prestate.executeUpdate();
            //Creating a MySQL statement which will insert the payment details into the database
            prestate = db.conn.prepareStatement("INSERT INTO `garits`.`payment` (PaymentType, "
                    + "Amount, CustomerName)"
                    + "Values (?,?,?) ");
            //Getting the String and placing them in the MySQL statement
            prestate.setString(1, paymentType);
            prestate.setString(2, amount);
            prestate.setString(3, name);
            //Execute the query
            prestate.executeUpdate();
            //Creating a MySQL statement which will update the amount spent
            prestate = db.conn.prepareStatement("SELECT `Spent` FROM `customers` WHERE  name = '" + customerName.getText() + "' ");
            //Execute the query and place it in a result set
            ResultSet gs = prestate.executeQuery();
            //Goes to the next result which is not the header
            gs.next();
            //Creating a double variable which will get the spent
            double getSpent = gs.getDouble("Spent");
            //Doing the maths to get the spent and parsing a string to a double
            getSpent = getSpent + Double.parseDouble(amountPaid.getText());
            //Creating a MySQL statement which will update the amount spent
            prestate = db.conn.prepareStatement("UPDATE `customers` Set  `Spent` = '" + getSpent + "' WHERE `name` = '" + customerName.getText() + "' ");
            //Execute the query
            prestate.execute();
            //Creating a MySQL statement which will update the has paid to yes
            prestate = db.conn.prepareStatement("UPDATE `jobsheets` SET `HasPaid` = 'Yes' WHERE `Customer`= '"+name+"' ");
            //Execute the query
            prestate.execute();
            //Creating a MySQL statement which will update there statues to cleared
            prestate = db.conn.prepareStatement("UPDATE `customers` SET `Status` = 'Clear' Where `name` = '"+name+"' ");
            //Execute the query
            prestate.execute();
            //Make the Panel invisable
            cardPaymentPanel.setVisible(false);
            //A pop up box showing the payment was successful
            JOptionPane.showMessageDialog(null, "Payment successfully recorded");
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_storeCashPaymentActionPerformed

    private void closeCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeCashActionPerformed
        //Make this JPanel invisable
        this.setVisible(false);
    }//GEN-LAST:event_closeCashActionPerformed

    private void searchCustomerCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerCardButtonActionPerformed
        //Getting a Text field and placing it in a string variable
        String name = searchCustomerCard.getText().toString();
        //Creating a new search customer payment frame JFrame
        SearchCustomerPayment searchCustomerPaymentFrame = new SearchCustomerPayment(db, name, jobNumberCard, customerNameFieldCard, amountFieldCard, customerTypeCard, discountTypeCard);
        //Making the new JFrame visable
        searchCustomerPaymentFrame.setVisible(true);
    }//GEN-LAST:event_searchCustomerCardButtonActionPerformed

    private void searchCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCashActionPerformed
        //Getting a Text field and placing it in a string variable
        String name = searchCustomerCash.getText().toString();
        //Creating a new search customer payment frame JFrame
        SearchCustomerPayment searchCustomerPaymentFrame = new SearchCustomerPayment(db, name, jobNumberCash, customerName, amountPaid, cashCustomerType, cashDiscountType);
        //Making the new JFrame visable
        searchCustomerPaymentFrame.setVisible(true);
    }//GEN-LAST:event_searchCashActionPerformed

    private void customerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameActionPerformed

    private void searchCustomerChequeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerChequeButtonActionPerformed
       //Getting a Text field and placing it in a string variable
       String name = searchCustomerCheque.getText().toString();
       //Creating a new search customer payment frame JFrame
        SearchCustomerPayment searchCustomerPaymentFrame = new SearchCustomerPayment(db, name, jobNumberCash, customerName, amountPaid, cashCustomerType, cashDiscountType);
        //Making the new JFrame visable
        searchCustomerPaymentFrame.setVisible(true);
    }//GEN-LAST:event_searchCustomerChequeButtonActionPerformed

    private void amountFieldChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountFieldChequeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountFieldChequeActionPerformed

    private void customerTypeCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerTypeCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerTypeCardActionPerformed

    private void discountTypeCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountTypeCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountTypeCardActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountNumberFieldCard;
    private javax.swing.JTextField amountFieldCard;
    private javax.swing.JTextField amountFieldCheque;
    private javax.swing.JTextField amountPaid;
    private javax.swing.JPanel buttons;
    private javax.swing.JTextField cardNumberFieldCard;
    private javax.swing.JButton cardPayment;
    private javax.swing.JPanel cardPaymentPanel;
    private javax.swing.JTextField cashCustomerType;
    private javax.swing.JTextField cashDiscountType;
    private javax.swing.JButton cashPayment;
    private javax.swing.JTextField cashPaymentField;
    private javax.swing.JPanel cashPaymentPanel;
    private javax.swing.JTextField chequeCustomerType;
    private javax.swing.JTextField chequeDateFieldCheque;
    private javax.swing.JTextField chequeDiscountType;
    private javax.swing.JTextField chequeNameFieldCheque;
    private javax.swing.JButton chequePayment;
    private javax.swing.JPanel chequePaymentPanel;
    private javax.swing.JButton close;
    private javax.swing.JButton closeCardPayment;
    private javax.swing.JButton closeCash;
    private javax.swing.JButton closeChequePayment;
    private javax.swing.JTextField customerName;
    private javax.swing.JTextField customerNameFieldCard;
    private javax.swing.JTextField customerTypeCard;
    private javax.swing.JTextField discountTypeCard;
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
    private javax.swing.JTextField jobNumberCard;
    private javax.swing.JTextField jobNumberCash;
    private javax.swing.JTextField jobNumberCheque;
    private javax.swing.JTextField memoFieldCheque;
    private javax.swing.JTextField nameFieldCheque;
    private javax.swing.JTextField nameOnCardFieldCard;
    private javax.swing.JTextField payToNameFieldCheque;
    private javax.swing.JTextField paymentCard;
    private javax.swing.JTextField paymentCheque;
    private javax.swing.JButton searchCash;
    private javax.swing.JTextField searchCustomerCard;
    private javax.swing.JButton searchCustomerCardButton;
    private javax.swing.JTextField searchCustomerCash;
    private javax.swing.JTextField searchCustomerCheque;
    private javax.swing.JButton searchCustomerChequeButton;
    private javax.swing.JTextField securityNumberFieldCard;
    private javax.swing.JTextField sortCodeFieldCard;
    private javax.swing.JButton storeCardPayment;
    private javax.swing.JButton storeCashPayment;
    private javax.swing.JButton storeChequePayment;
    // End of variables declaration//GEN-END:variables
}
