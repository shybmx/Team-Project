package garits;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class MechanicMenu extends javax.swing.JFrame {
    Connection conn;
    PreparedStatement prestate;
    public MechanicMenu() {
        initComponents();
        editStatus.setOpaque(false);
        editStatus.setContentAreaFilled(false); 
        editStatus.setBorderPainted(false);
        logout.setOpaque(false);
        logout.setContentAreaFilled(false); 
        logout.setBorderPainted(false);
        updateTable();
        this.setResizable(false);
        this.setSize(1300, 900);
    }
    
    public void updateTable(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/garits","root","");
            prestate = conn.prepareStatement("SELECT `Job_Number`, `Customer`, `VehicleRegNumber` FROM `jobsheets`");
            ResultSet result = prestate.executeQuery();
            pendingJobTable.setModel(DbUtils.resultSetToTableModel(result));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        pendingHeader = new javax.swing.JLabel();
        editStatus = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pendingJobTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pendingHeader.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        pendingHeader.setText("Pending Jobs:");
        getContentPane().add(pendingHeader);
        pendingHeader.setBounds(6, 229, 155, 32);

        editStatus.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\editstatusicon.png")); // NOI18N
        editStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStatusActionPerformed(evt);
            }
        });
        getContentPane().add(editStatus);
        editStatus.setBounds(214, 0, 138, 146);

        logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\logouticon.png")); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(358, 0, 138, 146);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\imageedit_1_5745129201.gif")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 202, 205);

        pendingJobTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(pendingJobTable);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 260, 453, 403);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\City univeristy\\Year 2\\Team Project\\Project\\GARITS\\data\\background.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1390, 960);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStatusActionPerformed
        EditJobStatus editJobStatusPanel = new EditJobStatus();
        this.getContentPane().add(editJobStatusPanel);
        this.invalidate();
        this.validate();
    }//GEN-LAST:event_editStatusActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Pin logout = new  Pin();
        logout.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editStatus;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JLabel pendingHeader;
    private javax.swing.JTable pendingJobTable;
    // End of variables declaration//GEN-END:variables
}