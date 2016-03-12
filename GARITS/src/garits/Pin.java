package garits;

import javax.swing.JOptionPane;

public class Pin extends javax.swing.JFrame {
    private String check;
    private String franpass = "fran";
    private String mechpass = "mech";
    private String reppass = "rep";
    private String forpass = "for";
    private String adminpass = "admin";
    
    public Pin() {
        initComponents();
        login.setOpaque(false);
        login.setContentAreaFilled(false); 
        login.setBorderPainted(false);
        this.setSize(1300, 900);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userName = new javax.swing.JTextField();
        passWord = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 900));
        getContentPane().setLayout(null);

        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        getContentPane().add(userName);
        userName.setBounds(598, 463, 207, 40);
        getContentPane().add(passWord);
        passWord.setBounds(598, 509, 207, 40);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Username:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(469, 471, 117, 32);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(469, 517, 112, 32);

        login.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\loginicon.png")); // NOI18N
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(690, 555, 115, 155);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\imageedit_1_5745129201.gif")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 224, 202, 205);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\background.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1740, 1030);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
       try{
            String username = userName.getText();
            char[] pwd = passWord.getPassword();
            String password = new String (pwd);
                if((username.equals("fran")) && (password.equals(franpass))){
                    MainMenu mainmenu = new MainMenu();
                    mainmenu.setVisible(true);
                    this.setVisible(false);
                }else if((username.equals("mech")) && (password.equals(mechpass))){
                    MechanicMenu mechmenu = new MechanicMenu();
                    mechmenu.setVisible(true);
                    this.setVisible(false);
                }else if((username.equals("rep")) && (password.equals(reppass))){
                    ReceptionistMenu repmenu = new ReceptionistMenu();
                    repmenu.setVisible(true);
                    this.setVisible(false);
                }else if((username.equals("for")) && (password.equals(forpass))){
                    ForePerson formenu = new ForePerson();
                    formenu.setVisible(true);
                    this.setVisible(false);
                }else if((username.equals("admin")) && (password.equals(adminpass))){
                    AdminMenu adminmenu = new AdminMenu();
                    adminmenu.setVisible(true);
                    this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Username Or PassWord incorrect");
                }
       }catch(Exception ex){
        System.out.println(ex.getMessage());
        }
       
    }//GEN-LAST:event_loginActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pin().setVisible(true);
                DBConnect connect = new DBConnect();
                connect.getData();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField passWord;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
