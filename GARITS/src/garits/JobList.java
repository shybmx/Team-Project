package garits;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class JobList extends javax.swing.JPanel {
    JFrame myFrame;
    Connection conn;
    PreparedStatement prestate = null;
    public JobList(JFrame frame) {
        initComponents();
        myFrame = frame;
        this.repaint();
        close.setOpaque(false);
        close.setContentAreaFilled(false); 
        close.setBorderPainted(false);
        editJob.setOpaque(false);
        editJob.setContentAreaFilled(false); 
        editJob.setBorderPainted(false);
        editStatus.setOpaque(false);
        editStatus.setContentAreaFilled(false); 
        editStatus.setBorderPainted(false);
        buttons.setOpaque(false);
        updateTable();
        this.setSize(1300, 900);
    }
    
    public void updateTable(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/garits","root","");
            prestate = conn.prepareStatement("SELECT * from `garits`.`jobsheets`");
            ResultSet result = prestate.executeQuery();
            jobListTable.setModel(DbUtils.resultSetToTableModel(result));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cannot connect to Database");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttons = new javax.swing.JPanel();
        editJob = new javax.swing.JButton();
        editStatus = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jobListTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        editJob.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\editjob.png")); // NOI18N
        editJob.setPreferredSize(new java.awt.Dimension(120, 155));
        editJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJobActionPerformed(evt);
            }
        });
        buttons.add(editJob);

        editStatus.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\editstatusicon.png")); // NOI18N
        editStatus.setPreferredSize(new java.awt.Dimension(140, 155));
        editStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStatusActionPerformed(evt);
            }
        });
        buttons.add(editStatus);

        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\closeicon.png")); // NOI18N
        close.setPreferredSize(new java.awt.Dimension(120, 155));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        buttons.add(close);

        jobListTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jobListTable);

        buttons.add(jScrollPane1);

        add(buttons);
        buttons.setBounds(570, 330, 490, 520);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\shahzad\\Documents\\Team-Project\\GARITS\\data\\background.jpg")); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1310, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void editStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStatusActionPerformed
        buttons.setVisible(false);
        EditJobStatus editJobStatusPanel = new EditJobStatus();
        myFrame.getContentPane().add(editJobStatusPanel);
    }//GEN-LAST:event_editStatusActionPerformed

    private void editJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJobActionPerformed
        buttons.setVisible(false);
        EditJob editJobPanel = new EditJob();
        myFrame.getContentPane().add(editJobPanel);
    }//GEN-LAST:event_editJobActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttons;
    private javax.swing.JButton close;
    private javax.swing.JButton editJob;
    private javax.swing.JButton editStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jobListTable;
    // End of variables declaration//GEN-END:variables
}