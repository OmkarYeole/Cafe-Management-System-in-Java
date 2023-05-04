  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.system;

import javax.swing.JOptionPane;
import basic_models.Customer;
import data_access_objects.CustomerDataAccessObject;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Acer
 */
public class Signup_Page extends javax.swing.JFrame {
    Subject sub = new Subject();
    Tracker tra = new Tracker(sub);
    public String name;
    public String pattern_email = "^[\\w._%+-]+@[\\w.-]+.[a-zA-Z]{2,}$";
    public String pattern_mobile_number = "^[0-9]{10}$";
    /**
     * Creates new form Signup_Page
     */
    public Signup_Page() throws IOException {
        initComponents();
        btn_create_account.setEnabled(false);
    }
    // Clear text fields
    public void ClearFields(){
        tf_name.setText("");
        tf_email.setText("");
        tf_mobile_number.setText("");
        tf_password.setText("");
        tf_confirm_password.setText("");
        tf_security_question.setText("");
        tf_answer.setText("");
        btn_create_account.setEnabled(false);
        
    }
    // Check if the text fields have information
    public void validateFields(){
        name = tf_name.getText();
        String email = tf_email.getText();
        String mobile_number = tf_mobile_number.getText();
        String password = tf_password.getText();
        String confirm_password = tf_confirm_password.getText();
        String security_question = tf_security_question.getText();
        String answer = tf_answer.getText();
        if(!name.equals("") && email.matches(pattern_email) && mobile_number.matches(pattern_mobile_number) && !password.equals("") && !confirm_password.equals("") && password.equals(confirm_password) && !security_question.equals("") && !answer.equals("")){
            btn_create_account.setEnabled(true);
        }
        else{    
            btn_create_account.setEnabled(false);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        tf_mobile_number = new javax.swing.JTextField();
        tf_answer = new javax.swing.JTextField();
        btn_create_account = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tf_security_question = new javax.swing.JTextField();
        tf_password = new javax.swing.JPasswordField();
        tf_confirm_password = new javax.swing.JPasswordField();
        btn_clear = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("     Create New Account");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Mobile Number");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Security Question");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Answer");

        tf_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tf_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_nameKeyReleased(evt);
            }
        });

        tf_email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tf_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_emailKeyReleased(evt);
            }
        });

        tf_mobile_number.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tf_mobile_number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_mobile_numberKeyReleased(evt);
            }
        });

        tf_answer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tf_answer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_answerKeyReleased(evt);
            }
        });

        btn_create_account.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_create_account.setText("Create Account");
        btn_create_account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_accountActionPerformed(evt);
            }
        });

        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Confirm Password");

        tf_security_question.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tf_security_question.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_security_questionKeyReleased(evt);
            }
        });

        tf_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_passwordKeyReleased(evt);
            }
        });

        tf_confirm_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_confirm_passwordKeyReleased(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(539, 539, 539)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_login)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_exit))
                            .addComponent(tf_answer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_mobile_number, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_confirm_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_security_question, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn_create_account)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_clear))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(519, 519, 519)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1001, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_mobile_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_security_question, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_create_account)
                    .addComponent(btn_clear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_exit)
                    .addComponent(btn_login))
                .addGap(417, 417, 417))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Exit application whe exit button clicked
    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null, "Do you want to close the application?","Select", JOptionPane.YES_NO_OPTION);
        if(x == 0){
            try {
                CafeManagementSystem.writer1.close();
            } catch (IOException ex) {
                Logger.getLogger(Login_Page.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.exit(0);
        }
    }//GEN-LAST:event_btn_exitActionPerformed
    //Check for all fields and create account for customer
    private void btn_create_accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_accountActionPerformed
        // TODO add your handling code here:
        Customer customer = new Customer();
        customer.setName(tf_name.getText());
        customer.setEmail(tf_email.getText());
        customer.setMobilenumber(tf_mobile_number.getText());
        customer.setPassword(tf_password.getText());
        customer.setSecurityQuestion(tf_security_question.getText());
        customer.setAnswer(tf_answer.getText());
        CustomerDataAccessObject.saveValue(customer);
        ClearFields();
        try {
            sub.signupOutcome(name);
        } catch (IOException ex) {
            Logger.getLogger(Signup_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_create_accountActionPerformed
    // Clear Text Fields
    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        ClearFields();
    }//GEN-LAST:event_btn_clearActionPerformed
    //Validate Fields
    private void tf_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nameKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_tf_nameKeyReleased

    private void tf_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_emailKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_tf_emailKeyReleased

    private void tf_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_passwordKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_tf_passwordKeyReleased

    private void tf_confirm_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_confirm_passwordKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_tf_confirm_passwordKeyReleased

    private void tf_mobile_numberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_mobile_numberKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_tf_mobile_numberKeyReleased

    private void tf_security_questionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_security_questionKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_tf_security_questionKeyReleased

    private void tf_answerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_answerKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_tf_answerKeyReleased
    // Navigate to the login page when 'Login' button is clicked.
    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        try {
            new Login_Page().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Signup_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Signup_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CafeManagementSystem.trackerOutput();
                    new Signup_Page().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Signup_Page.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_create_account;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tf_answer;
    private javax.swing.JPasswordField tf_confirm_password;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_mobile_number;
    private javax.swing.JTextField tf_name;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JTextField tf_security_question;
    // End of variables declaration//GEN-END:variables
} 
