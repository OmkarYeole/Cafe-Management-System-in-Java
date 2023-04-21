 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.system;

import javax.swing.JOptionPane;
import basic_models.Customer;
import data_access_objects.CustomerDataAccessObject;

/**
 *
 * @author abhis
 */
public class ForgotPassword extends javax.swing.JFrame {
    private String customer_answer = null;
    private String email = null;
    private final String email_pattern = "^[\\w._%+-]+@[\\w.-]+.[a-zA-Z]{2,}$";
    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
        initComponents();
        btn_reset_password.setEnabled(false);
        tf_security_question.setEditable(false);
    }
    // Clear text fields
    public void ClearFields(){
        tf_email.setText("");
        tf_security_question.setText("");
        tf_answer.setText("");
        tf_new_password.setText("");
        tf_confirm_password.setText("");
        btn_reset_password.setEnabled(false);
        validateFields();
        
    }
    // Check if the text fields have information
    public void validateFields(){
        String email = tf_email.getText();
        String security_question = tf_security_question.getText();
        String answer = tf_answer.getText();
        String new_password = tf_new_password.getText();
        String confirm_password = tf_confirm_password.getText();
        if(email.matches(email_pattern) && !security_question.equals("") && !answer.equals("")
            && !new_password.equals("") && !confirm_password.equals("") 
            && new_password.equals(confirm_password)){
            btn_reset_password.setEnabled(true);
        } else {
            btn_reset_password.setEnabled(false);
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

        lbl_reset_password = new javax.swing.JLabel();
        lbl_email_id = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        lbl_new_password = new javax.swing.JLabel();
        lbl_confirm_password = new javax.swing.JLabel();
        tf_new_password = new javax.swing.JPasswordField();
        tf_confirm_password = new javax.swing.JPasswordField();
        lbl_security_question = new javax.swing.JLabel();
        lbl_answer = new javax.swing.JLabel();
        tf_security_question = new javax.swing.JTextField();
        tf_answer = new javax.swing.JTextField();
        btn_reset_password = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        btn_check = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_reset_password.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_reset_password.setText("Reset Password");

        lbl_email_id.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbl_email_id.setText("Email ID");

        tf_email.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tf_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_emailKeyReleased(evt);
            }
        });

        lbl_new_password.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbl_new_password.setText("New Password");

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

        lbl_security_question.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbl_security_question.setText("Security Question");

        lbl_answer.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbl_answer.setText("Answer");

        tf_security_question.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tf_security_question.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_security_questionKeyReleased(evt);
            }
        });

        tf_answer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tf_answer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_answerKeyReleased(evt);
            }
        });

        btn_reset_password.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_reset_password.setText("Reset Password");
        btn_reset_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reset_passwordActionPerformed(evt);
            }
        });

        btn_login.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_exit.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        btn_check.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_check.setText("Check");
        btn_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(628, 628, 628)
                .addComponent(lbl_reset_password, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(747, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_confirm_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_answer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_new_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_security_question, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_email_id, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_reset_password, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_security_question, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_answer, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_new_password, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45)
                .addComponent(btn_check, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(410, 410, 410))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(377, Short.MAX_VALUE)
                .addComponent(lbl_reset_password, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_check, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_security_question, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_security_question))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_answer))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_new_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_new_password))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_confirm_password)))
                    .addComponent(lbl_email_id))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reset_password, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_login)
                    .addComponent(btn_exit))
                .addGap(258, 258, 258))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Validate fields for key Releases
    private void tf_security_questionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_security_questionKeyReleased
        validateFields();
    }//GEN-LAST:event_tf_security_questionKeyReleased

    private void tf_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_emailKeyReleased
        validateFields();
    }//GEN-LAST:event_tf_emailKeyReleased

    private void tf_answerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_answerKeyReleased
        validateFields();
    }//GEN-LAST:event_tf_answerKeyReleased

    private void tf_new_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_new_passwordKeyReleased
        validateFields();
    }//GEN-LAST:event_tf_new_passwordKeyReleased

    private void tf_confirm_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_confirm_passwordKeyReleased
        validateFields();
    }//GEN-LAST:event_tf_confirm_passwordKeyReleased
    // Check for answer to Security question before resetting the password
    private void btn_reset_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reset_passwordActionPerformed
        // TODO add your handling code here:
        String answer = tf_answer.getText();
        String new_password = tf_new_password.getText();
        if(answer.equals(customer_answer)){
            CustomerDataAccessObject.reset_password(email, new_password);
            ClearFields();
        }
        else{
            JOptionPane.showMessageDialog(null, "Incorrect Answer","Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_reset_passwordActionPerformed
    // Clear all fields
    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        ClearFields();
        tf_email.setEditable(true);
    }//GEN-LAST:event_btn_clearActionPerformed
    // Navigate to the login page when 'Login' button is clicked
    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        new Login_Page().setVisible(true);
    }//GEN-LAST:event_btn_loginActionPerformed
    // Exit the application
    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null, "Do you want to close the application?","Select", JOptionPane.YES_NO_OPTION);
        if(x == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_btn_exitActionPerformed
    // Check if the email entered by customer is valid
    private void btn_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkActionPerformed
        // TODO add your handling code here:
        email=tf_email.getText();
        if (email == "" || email == null){
            return;
        } else {
            Customer customer = null;
            customer = CustomerDataAccessObject.getSecurityQuestion(email);
            if (customer == null){
                JOptionPane.showMessageDialog(null, "Invalid Email","Message",JOptionPane.ERROR_MESSAGE);
                tf_email.setEditable(true);
            } else {
                tf_email.setEditable(false);
                customer_answer=customer.getAnswer();
                tf_security_question.setText(customer.getSecurityQuestion());
                validateFields();
            }
        }
    }//GEN-LAST:event_btn_checkActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_check;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_reset_password;
    private javax.swing.JLabel lbl_answer;
    private javax.swing.JLabel lbl_confirm_password;
    private javax.swing.JLabel lbl_email_id;
    private javax.swing.JLabel lbl_new_password;
    private javax.swing.JLabel lbl_reset_password;
    private javax.swing.JLabel lbl_security_question;
    private javax.swing.JTextField tf_answer;
    private javax.swing.JPasswordField tf_confirm_password;
    private javax.swing.JTextField tf_email;
    private javax.swing.JPasswordField tf_new_password;
    private javax.swing.JTextField tf_security_question;
    // End of variables declaration//GEN-END:variables
}
