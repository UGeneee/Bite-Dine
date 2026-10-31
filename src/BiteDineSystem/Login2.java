/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BiteDineSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login2 extends javax.swing.JFrame {

    public Login2() {
        initComponents();
        
        setFocusable(true);
        requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo_img = new javax.swing.JLabel();
        welcome_hero = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginUser = new javax.swing.JTextField();
        loginPass = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(980, 580));
        setMinimumSize(new java.awt.Dimension(980, 580));
        setPreferredSize(new java.awt.Dimension(980, 580));

        logo_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bite/dine/Resources/Bite & Dine_Logo Resized.png"))); // NOI18N
        logo_img.setToolTipText("");

        welcome_hero.setText("Welcome Back");

        loginUser.setForeground(new java.awt.Color(153, 153, 153));
        loginUser.setText("Username");
        loginUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginUserFocusLost(evt);
            }
        });
        loginUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUserActionPerformed(evt);
            }
        });

        loginPass.setForeground(new java.awt.Color(153, 153, 153));
        loginPass.setText("Password");
        loginPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginPassFocusLost(evt);
            }
        });
        loginPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPassActionPerformed(evt);
            }
        });

        btnLogin.setText("Login ->");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logo_img)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(691, 691, 691)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcome_hero)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(loginPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(loginUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(691, 691, 691)
                        .addComponent(btnLogin)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo_img, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(welcome_hero)
                .addGap(94, 94, 94)
                .addComponent(loginUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUserActionPerformed

    }//GEN-LAST:event_loginUserActionPerformed

    private void loginPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPassActionPerformed

    }//GEN-LAST:event_loginPassActionPerformed

    private void loginUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginUserFocusGained
        if (loginUser.getText().equals("Username")) {
            loginUser.setText("");
            loginUser.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_loginUserFocusGained

    private void loginPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginPassFocusGained
    if (loginPass.getText().equals("Password")) {
        loginPass.setText("");
        loginPass.setForeground(Color.BLACK);
    }
    }//GEN-LAST:event_loginPassFocusGained

    private void loginUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginUserFocusLost
        if (loginUser.getText().trim().isEmpty()) {
            loginUser.setText("Username");
            loginUser.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_loginUserFocusLost

    private void loginPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginPassFocusLost
        if (loginPass.getText().trim().isEmpty()) {
            loginPass.setText("Password");
            loginPass.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_loginPassFocusLost

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField loginPass;
    private javax.swing.JTextField loginUser;
    private javax.swing.JLabel logo_img;
    private javax.swing.JLabel welcome_hero;
    // End of variables declaration//GEN-END:variables
}
