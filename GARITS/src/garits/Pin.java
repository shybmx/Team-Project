package garits;

import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Pin extends javax.swing.JFrame {  
    DBConnect db = new DBConnect();
    static String loggedUser;
    PreparedStatement prestate;
    public Pin(){
        //Setting up the components within this JFrame
        initComponents();
        //Removing the background from the JButtons
        login.setOpaque(false);
        login.setContentAreaFilled(false); 
        login.setBorderPainted(false);
        //Making the JFrame none resize able 
        this.setResizable(false);
        //Setting the size of the JFrame
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
       //Getting the items from the text fields and placing them into a string variable
       String userName = insertUserName.getText();
       String password = insertPassWord.getText();
       //Getting the username
       loggedUser = userName;
       try {
           //Creating a MySQL statement which will check if the username, password is correct with the right position
            prestate = db.conn.prepareStatement("SELECT * FROM `login` WHERE `Username` = ? "
                    + "AND `Loginpassword`= ?"
                    + " AND `Position`= 'admin'");
            //Getting the string variables and placing them into the MySQL statement
            prestate.setString(1, userName);
            prestate.setString(2, password);
            //Executing the query and placing it in a result set
            ResultSet resultadmin = prestate.executeQuery();
            //Seting i equal to 0
            int i = 0;
            //While the the next result
            while(resultadmin.next()){
                //Goes up by 1
                i++;
            }
            //If i equals to 1
            if(i == 1){
                //Create a new admin menu object
                AdminMenu admin = new AdminMenu(db);
                //Make JFrame invisable
                this.setVisible(false);
                //Make the new JFrame visable
                admin.setVisible(true);
            }else{
               //Creating a MySQL statement which will check if the username, password is correct with the right position
               prestate = db.conn.prepareStatement("SELECT * FROM `login` WHERE `Username` = ? "
                    + "AND `Loginpassword`= ?"
                    + " AND `Position`= 'foreperson'");
               //Getting the string variables and placing them into the MySQL statement
               prestate.setString(1, userName);
               prestate.setString(2, password);
               //Executing the query and placing it in a result set
               ResultSet resultfore = prestate.executeQuery();
               //While the the next result
               while(resultfore.next()){
                   //Goes up by 1
                   i++;
               }
               //If i equals to 1
               if(i == 1){
                   //Creating a new fore person menu object
                   ForePerson forepersonmenu = new ForePerson(db);
                   //Make this JFrame invisable
                   this.setVisible(false);
                   //Make the new JFrame visable
                   forepersonmenu.setVisible(true);
               }else{
                    //Creating a MySQL statement which will check if the username, password is correct with the right position
                     prestate = db.conn.prepareStatement("SELECT * FROM `login` WHERE `Username` = ? "
                    + "AND `Loginpassword`= ?"
                    + " AND `Position`= 'mechanic'");
               //Getting the string variables and placing them into the MySQL statement
               prestate.setString(1, userName);
               prestate.setString(2, password);
               //Executing the query and placing it in a result set
               ResultSet resultmech = prestate.executeQuery();
               //While the the next result
               while(resultmech.next()){
                   //Goes up by 1
                   i++;
               }
               //If i equals to 1
               if(i == 1){
                   //Create a new mechanic menu objects
                   MechanicMenu mechanicmenu = new MechanicMenu(db);
                   //Making this JFrame invisable
                   this.setVisible(false);
                   //Making the new JFrame visable
                   mechanicmenu.setVisible(true);
               }else{
                   //Creating a MySQL statement which will check if the username, password is correct with the right position
                   prestate = db.conn.prepareStatement("SELECT * FROM `login` WHERE `Username` = ? "
                    + "AND `Loginpassword`= ?"
                    + " AND `Position`= 'franchisee'");
               //Getting the string variables and placing them into the MySQL statement    
               prestate.setString(1, userName);
               prestate.setString(2, password);
               //Executing the query and placing it in a result set
               ResultSet resultfran = prestate.executeQuery();
               //While the the next result
               while(resultfran.next()){
                   //Goes up by 1
                   i++;
               }
               //If i equals to 1
               if(i == 1){
                   //Creating a franchisee menu object
                   MainMenu franmenu = new MainMenu(db);
                   //Making this JFrame invisable
                   this.setVisible(false);
                   //Making the new JFrame visable
                   franmenu.setVisible(true);
               }else{
                   //Creating a MySQL statement which will check if the username, password is correct with the right position
                   prestate = db.conn.prepareStatement("SELECT * FROM `login` WHERE `Username` = ? "
                    + "AND `Loginpassword`= ?"
                    + " AND `Position`= 'receptionist'");
                   //Getting the string variables and placing them into the MySQL statement
                   prestate.setString(1, userName);
                   prestate.setString(2, password);
                   //Executing the query and placing it in a result set
                   ResultSet resultrep = prestate.executeQuery();
                   //While the the next result
                   while(resultrep.next()){
                       //Goes up by 1
                       i++;
                   }
                   //If i equals to 1
                   if(i == 1){
                       //Creating a receptionist menu object
                       ReceptionistMenu receptionistmenu = new ReceptionistMenu(db);
                       //Making this JFrame invisable
                       this.setVisible(false);
                       //Making the new JFrame visable
                       receptionistmenu.setVisible(true);
                   }else{
                       //A pop up box showing there was an error with the inserted details
                       JOptionPane.showMessageDialog(null, "Username or Password is incorrect");
                   }
               }
               }
               }     
            }
        } catch (Exception ex) {
            //Showing a problem connecting to the database or MySQL statement
            JOptionPane.showMessageDialog(null, "Cannot connect with the database, Please try again later");
        } 
    }//GEN-LAST:event_loginActionPerformed

    private void insertUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertUserNameActionPerformed

    public void keyPressed(KeyEvent e){
    }
    
    public  void startThread(){
        //Creating a new thread to create reports at the end of the month
        Thread t = new Thread(new CreateReports());
        //Start the thread
         t.start();
         //Creating a new thread to create a reminder count at the end of the month
        Thread t1 =new Thread(new ReminderCount());
        //Started the thread
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
            //Start the system
            public void run() {
                //Creating the Object
                Pin p = new Pin();
                //Make this JFrame visable
                p.setVisible(true);
                //Start both threads
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
