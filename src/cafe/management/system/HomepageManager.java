/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.system;

/**
 *
 * @author abhis
 */
public class HomepageManager extends javax.swing.JFrame {

    /**
     * Creates new form HomepageManager
     */
    public HomepageManager() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_order_log = new javax.swing.JButton();
        btn_modify_categories = new javax.swing.JButton();
        btn_accept_order = new javax.swing.JButton();
        lbl_homepage_customer = new javax.swing.JLabel();
        btn_change_password = new javax.swing.JButton();
        btn_signout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_order_log.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btn_order_log.setText("Order Log");

        btn_modify_categories.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btn_modify_categories.setText("Modify Categories");

        btn_accept_order.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btn_accept_order.setText("Accept Order");

        lbl_homepage_customer.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        lbl_homepage_customer.setText(" HomePage");

        btn_change_password.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btn_change_password.setText("Change Password");

        btn_signout.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btn_signout.setText("Signout");
        btn_signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(699, 699, 699)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_signout, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_change_password, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_modify_categories, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_order_log, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_homepage_customer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_accept_order, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1021, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(lbl_homepage_customer)
                .addGap(89, 89, 89)
                .addComponent(btn_accept_order)
                .addGap(32, 32, 32)
                .addComponent(btn_order_log)
                .addGap(28, 28, 28)
                .addComponent(btn_modify_categories)
                .addGap(32, 32, 32)
                .addComponent(btn_change_password)
                .addGap(31, 31, 31)
                .addComponent(btn_signout)
                .addContainerGap(605, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void btn_signoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signoutActionPerformed
        // TODO add your handling code here:
        new Login_Page().setVisible(true);
    }//GEN-LAST:event_btn_signoutActionPerformed

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
            java.util.logging.Logger.getLogger(HomepageManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomepageManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomepageManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomepageManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomepageManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_accept_order;
    private javax.swing.JButton btn_change_password;
    private javax.swing.JButton btn_modify_categories;
    private javax.swing.JButton btn_order_log;
    private javax.swing.JButton btn_signout;
    private javax.swing.JLabel lbl_homepage_customer;
    // End of variables declaration//GEN-END:variables
}
