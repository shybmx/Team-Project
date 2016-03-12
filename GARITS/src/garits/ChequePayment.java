package garits;

public class ChequePayment extends javax.swing.JFrame {

    public ChequePayment() {
        initComponents();
        close.setOpaque(false);
        close.setContentAreaFilled(false); 
        close.setBorderPainted(false);
        store.setOpaque(false);
        store.setContentAreaFilled(false); 
        store.setBorderPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        close = new javax.swing.JButton();
        store = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(22, 69, 70, 32);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel2.setText("Cheque Date:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(22, 127, 149, 32);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel3.setText("Pay To Name:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(22, 185, 152, 32);

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel4.setText("Cheque Name:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(22, 243, 162, 32);

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel5.setText("Memo:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(22, 309, 72, 32);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(206, 69, 146, 40);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(206, 119, 146, 40);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(206, 185, 146, 40);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(206, 243, 146, 40);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(206, 301, 146, 40);

        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\closeicon.png")); // NOI18N
        getContentPane().add(close);
        close.setBounds(236, 381, 116, 145);

        store.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\storeicon.png")); // NOI18N
        getContentPane().add(store);
        store.setBounds(117, 381, 113, 145);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\background.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1965, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton store;
    // End of variables declaration//GEN-END:variables
}