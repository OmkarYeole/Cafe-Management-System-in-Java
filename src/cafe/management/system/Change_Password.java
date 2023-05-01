/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.system;

import basic_models.Customer;
import data_access_objects.CustomerDataAccessObject;
/**
 *
 * @author abhis
 */
public class Change_Password extends javax.swing.JFrame {

    /**
     * Creates new form Change_Password
     */
    public Change_Password() {
        initComponents();
        btn_change_password.setEnabled(false);
    }
    public String email_id;
    public Change_Password(String email) {
        initComponents();
        email_id = email;
        btn_change_password.setEnabled(false);
    }
    // Clear text fields
    public void ClearFields(){
        tf_old_password.setText("");
        tf_new_password.setText("");
        tf_confirm_password.setText("");  
    }
    public void validateFields(){
        String oldPassword = tf_old_password.getText();
        String newPassword = tf_new_password.getText();
        String confirmPassword = tf_confirm_password.getText();
        if(!oldPassword.equals("") && !newPassword.equals("") && !confirmPassword.equals("") && newPassword.equals(confirmPassword)){
            btn_change_password.setEnabled(true);
        }
        else
        {
            btn_change_password.setEnabled(false);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_change_password = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        lbl_new_password = new javax.swing.JLabel();
        btn_signout = new javax.swing.JButton();
        lbl_confirm_password = new javax.swing.JLabel();
        tf_new_password = new javax.swing.JPasswordField();
        tf_confirm_password = new javax.swing.JPasswordField();
        btn_change_password = new javax.swing.JButton();
        lbl_old_password = new javax.swing.JLabel();
        tf_old_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_change_password.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_change_password.setText("Change Password");

        btn_back.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        lbl_new_password.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbl_new_password.setText("New Password");

        btn_signout.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_signout.setText("Signout");
        btn_signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signoutActionPerformed(evt);
            }
        });

        lbl_confirm_password.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbl_confirm_password.setText("Confirm Password");

        tf_new_password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tf_new_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_new_passwordKeyReleased(evt);
            }
        });

        tf_confirm_password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tf_confirm_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_confirm_passwordKeyReleased(evt);
            }
        });

        btn_change_password.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_change_password.setText("Change Password");
        btn_change_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_change_passwordActionPerformed(evt);
            }
        });

        lbl_old_password.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbl_old_password.setText("Old Password");

        tf_old_password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tf_old_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_old_passwordKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(636, 636, 636)
                        .addComponent(lbl_change_password, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(613, 613, 613)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_change_password, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_signout, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(584, 584, 584)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_confirm_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_new_password, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(128, 128, 128)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_new_password, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_old_password, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(tf_old_password, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(739, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(324, Short.MAX_VALUE)
                .addComponent(lbl_change_password, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_old_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_old_password))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_new_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_new_password))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_confirm_password))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_change_password, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_back)
                    .addComponent(btn_signout))
                .addGap(360, 360, 360))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        if (email_id.equals("manager@gmail.com")){
                new HomepageManager().setVisible(true);
            }else{
                new HomepageCustomer(email_id).setVisible(true);
            }
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        ClearFields();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_signoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signoutActionPerformed
        // TODO add your handling code here:
        new Login_Page().setVisible(true);
    }//GEN-LAST:event_btn_signoutActionPerformed

    private void tf_new_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_new_passwordKeyReleased
        validateFields();
    }//GEN-LAST:event_tf_new_passwordKeyReleased

    private void tf_confirm_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_confirm_passwordKeyReleased
        validateFields();
    }//GEN-LAST:event_tf_confirm_passwordKeyReleased

    private void btn_change_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_change_passwordActionPerformed
        // TODO add your handling code here:
        String old_password = tf_old_password.getText();
        String new_password = tf_new_password.getText();
        CustomerDataAccessObject.change_password(email_id, old_password, new_password);
        ClearFields();
    }//GEN-LAST:event_btn_change_passwordActionPerformed

    private void tf_old_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_old_passwordKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_old_passwordKeyReleased

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Change_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_change_password;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_signout;
    private javax.swing.JLabel lbl_change_password;
    private javax.swing.JLabel lbl_confirm_password;
    private javax.swing.JLabel lbl_new_password;
    private javax.swing.JLabel lbl_old_password;
    private javax.swing.JPasswordField tf_confirm_password;
    private javax.swing.JPasswordField tf_new_password;
    private javax.swing.JPasswordField tf_old_password;
    // End of variables declaration//GEN-END:variables
}