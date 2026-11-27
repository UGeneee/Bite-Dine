
package oopfinals;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class FloorPlan extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FloorPlan.class.getName());

    
    public FloorPlan() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSidebar = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JButton();
        btnFloorplan = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnGuests = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        pnlMain = new javax.swing.JPanel();
        pnlTables = new javax.swing.JPanel();
        btnT01 = new javax.swing.JButton();
        btnT02 = new javax.swing.JButton();
        btnT03 = new javax.swing.JButton();
        btnT04 = new javax.swing.JButton();
        btnT05 = new javax.swing.JButton();
        btnT06 = new javax.swing.JButton();
        pnlAdd = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        txtCapacity = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        pnlDetails = new javax.swing.JPanel();
        lblTableName = new javax.swing.JLabel();
        lblCapacity = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        pnlRemove = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbRemove = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(875, 580));
        setPreferredSize(new java.awt.Dimension(1078, 580));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSidebar.setBackground(new java.awt.Color(66, 48, 33));
        pnlSidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblLogo.setText("Bite & Dine");
        pnlSidebar.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel11.setForeground(new java.awt.Color(157, 138, 124));
        jLabel11.setText("TABLE MANAGEMENT");
        pnlSidebar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        btnDashboard.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setText("Dashboard");
        btnDashboard.setBorderPainted(false);
        btnDashboard.setContentAreaFilled(false);
        btnDashboard.addActionListener(this::btnDashboardActionPerformed);
        pnlSidebar.add(btnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        btnFloorplan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnFloorplan.setForeground(new java.awt.Color(255, 255, 255));
        btnFloorplan.setText("Floor Plan");
        btnFloorplan.setBorderPainted(false);
        btnFloorplan.setContentAreaFilled(false);
        btnFloorplan.addActionListener(this::btnFloorplanActionPerformed);
        pnlSidebar.add(btnFloorplan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        btnAssign.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText("Assign Table");
        btnAssign.setBorderPainted(false);
        btnAssign.setContentAreaFilled(false);
        btnAssign.addActionListener(this::btnAssignActionPerformed);
        pnlSidebar.add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        btnGuests.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGuests.setForeground(new java.awt.Color(255, 255, 255));
        btnGuests.setText("Guest Lists");
        btnGuests.setBorderPainted(false);
        btnGuests.setContentAreaFilled(false);
        btnGuests.addActionListener(this::btnGuestsActionPerformed);
        pnlSidebar.add(btnGuests, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        btnLogout.setBackground(new java.awt.Color(107, 79, 58));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setBorderPainted(false);
        btnLogout.addActionListener(this::btnLogoutActionPerformed);
        pnlSidebar.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 120, -1));

        getContentPane().add(pnlSidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 580));

        pnlMain.setBackground(new java.awt.Color(240, 237, 231));
        pnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTables.setBackground(new java.awt.Color(240, 237, 231));
        pnlTables.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(107, 79, 58)));
        pnlTables.setLayout(new java.awt.GridLayout(3, 2, 10, 10));

        btnT01.setBackground(new java.awt.Color(79, 143, 63));
        btnT01.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnT01.setText("T01");
        pnlTables.add(btnT01);

        btnT02.setBackground(new java.awt.Color(211, 70, 56));
        btnT02.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnT02.setText("T02");
        btnT02.addActionListener(this::btnT02ActionPerformed);
        pnlTables.add(btnT02);

        btnT03.setBackground(new java.awt.Color(79, 143, 63));
        btnT03.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnT03.setText("T03");
        btnT03.addActionListener(this::btnT03ActionPerformed);
        pnlTables.add(btnT03);

        btnT04.setBackground(new java.awt.Color(211, 70, 56));
        btnT04.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnT04.setText("T04");
        btnT04.addActionListener(this::btnT04ActionPerformed);
        pnlTables.add(btnT04);

        btnT05.setBackground(new java.awt.Color(211, 70, 56));
        btnT05.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnT05.setText("T05");
        btnT05.addActionListener(this::btnT05ActionPerformed);
        pnlTables.add(btnT05);

        btnT06.setBackground(new java.awt.Color(79, 143, 63));
        btnT06.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnT06.setText("T06");
        pnlTables.add(btnT06);

        pnlMain.add(pnlTables, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 400, 230));

        pnlAdd.setBackground(new java.awt.Color(240, 237, 231));
        pnlAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(107, 79, 58)));
        pnlAdd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(107, 79, 58));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("  Add Table");
        jLabel6.setOpaque(true);
        pnlAdd.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(66, 48, 33));
        jLabel7.setText("Capacity *");
        pnlAdd.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(66, 48, 33));
        jLabel8.setText("Table Number *");
        pnlAdd.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtNumber.addActionListener(this::txtNumberActionPerformed);
        pnlAdd.add(txtNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, 40));
        pnlAdd.add(txtCapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 80, 40));

        btnAdd.setBackground(new java.awt.Color(107, 79, 58));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add Table");
        btnAdd.setBorderPainted(false);
        btnAdd.setOpaque(true);
        btnAdd.addActionListener(this::btnAddActionPerformed);
        pnlAdd.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        pnlMain.add(pnlAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 380, 230));

        pnlDetails.setBackground(new java.awt.Color(240, 237, 231));
        pnlDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(107, 79, 58)));
        pnlDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTableName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTableName.setForeground(new java.awt.Color(66, 48, 33));
        lblTableName.setText("Table 01");
        pnlDetails.add(lblTableName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 20));

        lblCapacity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCapacity.setForeground(new java.awt.Color(115, 115, 115));
        lblCapacity.setText("Capacity: 4");
        pnlDetails.add(lblCapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lblStatus.setBackground(new java.awt.Color(79, 143, 63));
        lblStatus.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("Available");
        lblStatus.setOpaque(true);
        pnlDetails.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 80, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(64, 48, 33));
        jLabel9.setText("Table Status");
        pnlDetails.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        cmbStatus.setBackground(new java.awt.Color(255, 255, 255));
        cmbStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Occupied" }));
        cmbStatus.addActionListener(this::cmbStatusActionPerformed);
        pnlDetails.add(cmbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 360, 30));

        btnUpdate.setBackground(new java.awt.Color(107, 79, 58));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update Table");
        btnUpdate.setBorderPainted(false);
        btnUpdate.setOpaque(true);
        pnlDetails.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 157, 360, 40));

        pnlMain.add(pnlDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 400, 230));

        pnlRemove.setBackground(new java.awt.Color(240, 237, 231));
        pnlRemove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(107, 79, 58)));
        pnlRemove.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(107, 79, 58));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Remove Table");
        jLabel1.setOpaque(true);
        pnlRemove.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 40));

        cmbRemove.setBackground(new java.awt.Color(255, 255, 255));
        cmbRemove.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cmbRemove.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Table 01", "Table 02", "Table 03", "Table 04" }));
        cmbRemove.addActionListener(this::cmbRemoveActionPerformed);
        pnlRemove.add(cmbRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 250, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(211, 70, 56));
        jLabel2.setText("<html>This action will permanently remove the table from the system.<html>");
        pnlRemove.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 240, 40));

        btnRemove.setBackground(new java.awt.Color(107, 79, 58));
        btnRemove.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("Remove");
        btnRemove.setBorderPainted(false);
        btnRemove.setOpaque(true);
        pnlRemove.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(66, 48, 33));
        jLabel5.setText("Select Table");
        pnlRemove.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        pnlMain.add(pnlRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 380, 230));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(66, 48, 33));
        jLabel3.setText("Floor Plan");
        pnlMain.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Select a table to manage its status");
        pnlMain.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        getContentPane().add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 900, 580));

        setBounds(0, 0, 1086, 588);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRemoveActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

    private void btnT02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnT02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnT02ActionPerformed

    private void btnT04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnT04ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnT04ActionPerformed

    private void btnT05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnT05ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnT05ActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnFloorplanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFloorplanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFloorplanActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void cmbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStatusActionPerformed

    private void btnGuestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuestsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuestsActionPerformed

    private void btnT03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnT03ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnT03ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new FloorPlan().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnFloorplan;
    private javax.swing.JButton btnGuests;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnT01;
    private javax.swing.JButton btnT02;
    private javax.swing.JButton btnT03;
    private javax.swing.JButton btnT04;
    private javax.swing.JButton btnT05;
    private javax.swing.JButton btnT06;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbRemove;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCapacity;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTableName;
    private javax.swing.JPanel pnlAdd;
    private javax.swing.JPanel pnlDetails;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlRemove;
    private javax.swing.JPanel pnlSidebar;
    private javax.swing.JPanel pnlTables;
    private javax.swing.JTextField txtCapacity;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
}
