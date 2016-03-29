package garits;

public class Invoice extends javax.swing.JPanel {
    DBConnect db;
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
        jList1 = new javax.swing.JList();
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

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setPreferredSize(new java.awt.Dimension(200, 200));
        jScrollPane1.setViewportView(jList1);

        tablePanel.add(jScrollPane1);

        add(tablePanel);
        tablePanel.setBounds(430, 390, 230, 160);

        invoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/invoiceicon.png"))); // NOI18N
        invoice.setPreferredSize(new java.awt.Dimension(120, 155));
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
        buttons.setBounds(420, 560, 260, 160);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1300, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttons;
    private javax.swing.JButton close;
    private javax.swing.JTextField customerSearch;
    private javax.swing.JButton invoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JPanel tablePanel;
    // End of variables declaration//GEN-END:variables
}