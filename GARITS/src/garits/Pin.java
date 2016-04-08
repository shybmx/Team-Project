package garits;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Pin extends javax.swing.JFrame {  
    DBConnect db = new DBConnect();
     static String loggedUser;
    public Pin(){
        initComponents();
        login.setOpaque(false);
        login.setContentAreaFilled(false); 
        login.setBorderPainted(false);
        this.setResizable(false);
        this.setSize(1300, 900);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insertUserName = new javax.swing.JTextField();
        insertPassWord = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        insertUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertUserNameActionPerformed(evt);
            }
        });
        getContentPane().add(insertUserName);
        insertUserName.setBounds(598, 463, 207, 40);
        getContentPane().add(insertPassWord);
        insertPassWord.setBounds(598, 509, 207, 40);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Username:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(469, 471, 117, 32);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(469, 517, 112, 32);

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/loginicon.png"))); // NOI18N
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginKeyPressed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(690, 555, 115, 155);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/imageedit_1_5745129201.gif"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 224, 202, 205);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/images/background.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1300, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
       PreparedStatement prestate;
       String userName = insertUserName.getText();
       String password = insertPassWord.getText();
       loggedUser = userName;
       try {
            prestate = db.conn.prepareStatement("SELECT * FROM `login` WHERE `Username` = ? "
                    + "AND `Loginpassword`= ?"
                    + " AND `Position`= 'admin'");
            prestate.setString(1, userName);
            prestate.setString(2, password);
            ResultSet resultadmin = prestate.executeQuery();
            int i = 0;
            while(resultadmin.next()){
                i++;
            }
            if(i == 1){
                AdminMenu admin = new AdminMenu(db);
                this.setVisible(false);
                admin.setVisible(true);
            }else{
               prestate = db.conn.prepareStatement("SELECT * FROM `login` WHERE `Username` = ? "
                    + "AND `Loginpassword`= ?"
                    + " AND `Position`= 'foreperson'");
               prestate.setString(1, userName);
               prestate.setString(2, password);
               ResultSet resultfore = prestate.executeQuery();
               while(resultfore.next()){
                   i++;
               }
               if(i == 1){
                   ForePerson forepersonmenu = new ForePerson(db);
                   this.setVisible(false);
                   forepersonmenu.setVisible(true);
               }else{
                     prestate = db.conn.prepareStatement("SELECT * FROM `login` WHERE `Username` = ? "
                    + "AND `Loginpassword`= ?"
                    + " AND `Position`= 'mechanic'");
               prestate.setString(1, userName);
               prestate.setString(2, password);
               ResultSet resultmech = prestate.executeQuery();
               while(resultmech.next()){
                   i++;
               }
               if(i == 1){
                   MechanicMenu mechanicmenu = new MechanicMenu(db);
                   this.setVisible(false);
                   mechanicmenu.setVisible(true);
               }else{
                   prestate = db.conn.prepareStatement("SELECT * FROM `login` WHERE `Username` = ? "
                    + "AND `Loginpassword`= ?"
                    + " AND `Position`= 'franchisee'");
               prestate.setString(1, userName);
               prestate.setString(2, password);
               ResultSet resultfran = prestate.executeQuery();
               while(resultfran.next()){
                   i++;
               }
               if(i == 1){
                   MainMenu franmenu = new MainMenu(db);
                   this.setVisible(false);
                   franmenu.setVisible(true);
               }else{
                   prestate = db.conn.prepareStatement("SELECT * FROM `login` WHERE `Username` = ? "
                    + "AND `Loginpassword`= ?"
                    + " AND `Position`= 'receptionist'");
                   prestate.setString(1, userName);
                   prestate.setString(2, password);
                   ResultSet resultrep = prestate.executeQuery();
                   while(resultrep.next()){
                       i++;
                   }
                   if(i == 1){
                       ReceptionistMenu receptionistmenu = new ReceptionistMenu(db);
                       this.setVisible(false);
                       receptionistmenu.setVisible(true);
                   }else{
                       JOptionPane.showMessageDialog(null, "Username or Password is incorrect");
                   }
               }
               }
               }     
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Cannot connect with the database, Please try again later");
        } 
    }//GEN-LAST:event_loginActionPerformed

    private void insertUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertUserNameActionPerformed

    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            System.out.println("it works");
        }
    }
    
    public  void startThread(){
                Thread t = new Thread(new CreateReports());
                 t.start();
                 Thread t1 =new Thread(new ReminderCount());
                 t1.start();
    }
    
    private void loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginKeyPressed
    }//GEN-LAST:event_loginKeyPressed

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
                Pin p = new Pin();
                p.setVisible(true);
                p.startThread();
            }
        });
        
  
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField insertPassWord;
    private javax.swing.JTextField insertUserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
}
