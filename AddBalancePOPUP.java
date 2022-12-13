/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Eustaquio
 */
import javax.swing.*;

public class AddBalancePOPUP extends javax.swing.JFrame {

    /**
     * Creates new form MainLogin
     */
    public AddBalancePOPUP() {
        initComponents();
    }
    
    public static float bal = 0;

    public float addBal(float enteredBal) {
    	bal += enteredBal;
    	return bal;  	
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        addBalance = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        backBTN = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(49, 52, 52));
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(49, 52, 52));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setForeground(new java.awt.Color(187, 89, 26));
        jPanel2.setLayout(null);

        addBalance.setBackground(new java.awt.Color(187, 89, 26));
        addBalance.setForeground(new java.awt.Color(187, 89, 26));
        addBalance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBalance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBalanceMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("ADD");

        javax.swing.GroupLayout addBalanceLayout = new javax.swing.GroupLayout(addBalance);
        addBalance.setLayout(addBalanceLayout);
        addBalanceLayout.setHorizontalGroup(
            addBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBalanceLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel7)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        addBalanceLayout.setVerticalGroup(
            addBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jPanel2.add(addBalance);
        addBalance.setBounds(130, 130, 120, 25);

        backBTN.setBackground(new java.awt.Color(187, 89, 26));
        backBTN.setForeground(new java.awt.Color(187, 89, 26));
        backBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBTNMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("MENU");

        javax.swing.GroupLayout backBTNLayout = new javax.swing.GroupLayout(backBTN);
        backBTN.setLayout(backBTNLayout);
        backBTNLayout.setHorizontalGroup(
            backBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backBTNLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        backBTNLayout.setVerticalGroup(
            backBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jPanel2.add(backBTN);
        backBTN.setBounds(10, 10, 90, 25);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Add Balance:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(50, 70, 90, 30);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(150, 70, 200, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBTNMouseClicked
        this.dispose();
    }//GEN-LAST:event_backBTNMouseClicked

    private void addBalanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBalanceMouseClicked
        float enteredBal = Float.parseFloat(jTextField1.getText());
        addBal(enteredBal);
        MenuScreen.totalBalance.setText("" + bal);
        JOptionPane.showMessageDialog(this, "Added Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_addBalanceMouseClicked

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
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel addBalance;
    private javax.swing.JPanel backBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
