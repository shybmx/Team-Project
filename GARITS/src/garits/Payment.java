package garits;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Payment extends javax.swing.JPanel {

    DBConnect db;
    PreparedStatement prestate;

    public Payment(DBConnect db) {
        initComponents();
        this.db = db;
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
        this.setSize(1300, 900);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        buttons = new javax.swing.JPanel();
        cashPayment = new javax.swing.JButton();
        cardPayment = new javax.swing.JButton();
        chequePayment = new javax.swing.JButton();
        close = new javax.swing.JButton();
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
                .addGap(110, 110, 110)
                .addComponent(searchCustomerCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchCustomerChequeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chequeNameFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chequePaymentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(memoFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(68, 68, 68)
                        .addComponent(jobNumberCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chequePaymentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chequeDiscountType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chequeCustomerType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chequePaymentPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paymentCheque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chequePaymentPanelLayout.createSequentialGroup()
                                .addComponent(storeChequePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(closeChequePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        chequePaymentPanelLayout.setVerticalGroup(
            chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chequePaymentPanelLayout.createSequentialGroup()
                .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchCustomerChequeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, chequePaymentPanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(searchCustomerCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(paymentCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jobNumberCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
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
                        .addComponent(memoFieldCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chequeDiscountType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chequeCustomerType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(chequePaymentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chequePaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(closeChequePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storeChequePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113))
        );

        add(chequePaymentPanel);
        chequePaymentPanel.setBounds(400, 50, 430, 740);

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
        cardPaymentPanel.setBounds(310, 170, 860, 640);

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
        buttons.setBounds(370, 710, 530, 173);

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
        cashPaymentPanel.setBounds(510, 10, 407, 630);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1300, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void cashPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashPaymentActionPerformed
        buttons.setVisible(false);
        cashPaymentPanel.setVisible(true);
    }//GEN-LAST:event_cashPaymentActionPerformed

    private void cardPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardPaymentActionPerformed
        buttons.setVisible(false);
        cardPaymentPanel.setVisible(true);
    }//GEN-LAST:event_cardPaymentActionPerformed

    private void chequePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chequePaymentActionPerformed
        buttons.setVisible(false);
        chequePaymentPanel.setVisible(true);
    }//GEN-LAST:event_chequePaymentActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void storeCardPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeCardPaymentActionPerformed
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
            prestate = db.conn.prepareStatement("INSERT INTO `garits`.`cardpayment` (CustomerName, CardOwnerName, "
                    + "Amount, CardNumber, ExpiryDate, SortCode, AccountNumber, SecuirtyNumber) "
                    + "Values(?,?,?,?,?,?,?,?)");
            prestate.setString(1, name);
            prestate.setString(2, nameOnCard);
            prestate.setString(3, amount);
            prestate.setString(4, cardNumber);
            prestate.setString(5, expiryDate);
            prestate.setString(6, sortCode);
            prestate.setString(7, accountNumber);
            prestate.setString(8, securityNumber);
            prestate.executeUpdate();
            prestate = db.conn.prepareStatement("INSERT INTO `garits`.`payment` (PaymentType, "
                    + "Amount, CustomerName)"
                    + "Values (?,?,?) ");
            prestate.setString(1, paymentType);
            prestate.setString(2, amount);
            prestate.setString(3, name);
            prestate.executeUpdate();
            prestate = db.conn.prepareStatement("SELECT `Spent` FROM `customers` WHERE  name = '" + customerNameFieldCard.getText() + "' ");
            ResultSet gs = prestate.executeQuery();
            gs.next();
            double getSpent = gs.getDouble("Spent");
            getSpent = getSpent + Double.parseDouble(amountFieldCard.getText());
            prestate = db.conn.prepareStatement("UPDATE `customers` Set  `Spent` = '" + getSpent + "' WHERE `name` = '" + customerNameFieldCard.getText() + "' ");
            prestate.execute();
            prestate = db.conn.prepareStatement("UPDATE `jobsheets` SET `HasPaid` = 'Yes' WHERE `Customer`= '"+name+"' ");
            prestate.execute();
            prestate = db.conn.prepareStatement("UPDATE `customers` SET `Status` = 'Clear' Where `name` = '"+name+"' ");
            prestate.execute();
            cardPaymentPanel.setVisible(false);
            JOptionPane.showMessageDialog(null, "Payment successfully recorded");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
        }        
    }//GEN-LAST:event_storeCardPaymentActionPerformed

    private void closeCardPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeCardPaymentActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeCardPaymentActionPerformed

    private void storeChequePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeChequePaymentActionPerformed
        String name = nameFieldCheque.getText();
        String amount = amountFieldCheque.getText();
        String chequeDate = chequeDateFieldCheque.getText();
        String payToName = payToNameFieldCheque.getText();
        String chequeName = chequeNameFieldCheque.getText();
        String memo = memoFieldCheque.getText();
        String paymentType = paymentCheque.getText();
        try {
            prestate = db.conn.prepareStatement("INSERT INTO  `garits`.`chequepayment` (CustomerName, Amount, ChequeDate,"
                    + "PayToName, ChequeName, Memo) "
                    + "Values(?,?,?,?,?,?);");
            prestate.setString(1, name);
            prestate.setString(2, amount);
            prestate.setString(3, chequeDate);
            prestate.setString(4, payToName);
            prestate.setString(5, chequeName);
            prestate.setString(6, memo);
            prestate.executeUpdate();
            prestate = db.conn.prepareStatement("INSERT INTO `garits`.`payment` (PaymentType, "
                    + "Amount, CustomerName)"
                    + "Values (?,?,?) ");
            prestate.setString(1, paymentType);
            prestate.setString(2, amount);
            prestate.setString(3, name);
            prestate.executeUpdate();
            prestate = db.conn.prepareStatement("SELECT `Spent` FROM `customers` WHERE  name = '" + nameFieldCheque.getText() + "' ");
            ResultSet gs = prestate.executeQuery();
            gs.next();
            double getSpent = gs.getDouble("Spent");
            getSpent = getSpent + Double.parseDouble(amountFieldCheque.getText());
            prestate = db.conn.prepareStatement("UPDATE `customers` Set  `Spent` = '" + getSpent + "' WHERE `name` = '" + nameFieldCheque.getText() + "' ");
            prestate.execute();
            prestate = db.conn.prepareStatement("UPDATE `jobsheets` SET `HasPaid` = 'Yes' WHERE `Customer`= '"+name+"' ");
            prestate.execute();
            prestate = db.conn.prepareStatement("UPDATE `customers` SET `Status` = 'Clear' Where `name` = '"+name+"' ");
            prestate.execute();
            cardPaymentPanel.setVisible(false);
            JOptionPane.showMessageDialog(null, "Payment successfully recorded");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Cannot connect to the database");
        }
    }//GEN-LAST:event_storeChequePaymentActionPerformed

    private void closeChequePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeChequePaymentActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeChequePaymentActionPerformed

    private void storeCashPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeCashPaymentActionPerformed
        String name = customerName.getText().toString();
        String amount = amountPaid.getText().toString();
        String paymentType = cashPaymentField.getText();
        try{
            prestate = db.conn.prepareStatement("INSERT INTO  `garits`.`cashpayment` (CustomerName, Amount) "
                    + "Values(?,?);");
            prestate.setString(1, name);
            prestate.setString(2, amount);
            prestate.executeUpdate();
            prestate = db.conn.prepareStatement("INSERT INTO `garits`.`payment` (PaymentType, "
                    + "Amount, CustomerName)"
                    + "Values (?,?,?) ");
            prestate.setString(1, paymentType);
            prestate.setString(2, amount);
            prestate.setString(3, name);
            prestate.executeUpdate();
            prestate = db.conn.prepareStatement("SELECT `Spent` FROM `customers` WHERE  name = '" + customerName.getText() + "' ");
            ResultSet gs = prestate.executeQuery();
            gs.next();
            double getSpent = gs.getDouble("Spent");
            getSpent = getSpent + Double.parseDouble(amountPaid.getText());
            prestate = db.conn.prepareStatement("UPDATE `customers` Set  `Spent` = '" + getSpent + "' WHERE `name` = '" + customerName.getText() + "' ");
            prestate.execute();
            prestate = db.conn.prepareStatement("UPDATE `jobsheets` SET `HasPaid` = 'Yes' WHERE `Customer`= '"+name+"' ");
            prestate.execute();
            prestate = db.conn.prepareStatement("UPDATE `customers` SET `Status` = 'Clear' Where `name` = '"+name+"' ");
            prestate.execute();
            cardPaymentPanel.setVisible(false);
            JOptionPane.showMessageDialog(null, "Payment successfully recorded");
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_storeCashPaymentActionPerformed

    private void closeCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeCashActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeCashActionPerformed

    private void searchCustomerCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerCardButtonActionPerformed
        String name = searchCustomerCard.getText().toString();
        SearchCustomerPayment searchCustomerPaymentFrame = new SearchCustomerPayment(db, name, jobNumberCard, customerNameFieldCard, amountFieldCard, customerTypeCard, discountTypeCard);
        searchCustomerPaymentFrame.setVisible(true);
    }//GEN-LAST:event_searchCustomerCardButtonActionPerformed

    private void searchCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCashActionPerformed
        String name = searchCustomerCash.getText().toString();
        SearchCustomerPayment searchCustomerPaymentFrame = new SearchCustomerPayment(db, name, jobNumberCash, customerName, amountPaid, cashCustomerType, cashDiscountType);
        searchCustomerPaymentFrame.setVisible(true);
    }//GEN-LAST:event_searchCashActionPerformed

    private void customerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameActionPerformed

    private void searchCustomerChequeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerChequeButtonActionPerformed
       String name = searchCustomerCheque.getText().toString();
       SearchCustomerPayment searchCustomerPaymentFrame = new SearchCustomerPayment(db, name, jobNumberCheque, nameFieldCheque, amountFieldCheque, chequeCustomerType, chequeDiscountType);
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
