
import javax.swing.ButtonGroup;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Eustaquio
 */
public class MenuScreen extends javax.swing.JFrame {

    // Enable
    public void baggueteEnable(){
        baguetteQTY.setEnabled(true);
    }
    
    public void croissantEnable(){
        croissantQTY.setEnabled(true);
    }
    
    public void goldleafEnable(){
        goldleafQTY.setEnabled(true);
    }
    public void sourdoughEnable(){
        sourdoughQTY.setEnabled(true);
    }
    
    //Disable
    public void baggueteDisable(){
        baguetteQTY.setEnabled(false);
    }
    
    public void croissantDisable(){
        croissantQTY.setEnabled(false);
    }
    
    public void goldleafDisable(){
        goldleafQTY.setEnabled(false);
    }
    public void sourdoughDisable(){
        sourdoughQTY.setEnabled(false);
    }

    /**
     * Creates new form MainLogin
     */
    public MenuScreen() {
        initComponents();
        baguetteQTY.setEnabled(false);
        croissantQTY.setEnabled(false);
        goldleafQTY.setEnabled(false);
        sourdoughQTY.setEnabled(false);  
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
        closeBTN = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        baguetteRBTN = new javax.swing.JRadioButton();
        baguetteQTY = new javax.swing.JSpinner();
        croissantRBTN = new javax.swing.JRadioButton();
        croissantQTY = new javax.swing.JSpinner();
        goldleafRBTN = new javax.swing.JRadioButton();
        goldleafQTY = new javax.swing.JSpinner();
        sourdoughQTY = new javax.swing.JSpinner();
        sourdoughRBTN = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        logoutBTN = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        totalBALANCE = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addBalance = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cartBTN = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        checkoutBTN = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(49, 52, 52));
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(49, 52, 52));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setForeground(new java.awt.Color(187, 89, 26));
        jPanel2.setLayout(null);

        closeBTN.setBackground(java.awt.Color.white);
        closeBTN.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        closeBTN.setForeground(java.awt.Color.white);
        closeBTN.setText("x");
        closeBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBTNMouseClicked(evt);
            }
        });
        jPanel2.add(closeBTN);
        closeBTN.setBounds(390, 7, 18, 17);

        jPanel4.setBackground(new java.awt.Color(187, 89, 26));
        jPanel4.setForeground(new java.awt.Color(187, 89, 26));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Bread Menu");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(73, 73, 73))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(40, 40, 230, 20);

        baguetteRBTN.setForeground(java.awt.Color.white);
        baguetteRBTN.setText("Baguette");
        baguetteRBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                baguetteRBTNMouseClicked(evt);
            }
        });
        jPanel2.add(baguetteRBTN);
        baguetteRBTN.setBounds(40, 180, 80, 20);
        jPanel2.add(baguetteQTY);
        baguetteQTY.setBounds(140, 180, 50, 20);

        croissantRBTN.setForeground(java.awt.Color.white);
        croissantRBTN.setText("Croissant");
        croissantRBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                croissantRBTNMouseClicked(evt);
            }
        });
        jPanel2.add(croissantRBTN);
        croissantRBTN.setBounds(220, 180, 80, 20);
        jPanel2.add(croissantQTY);
        croissantQTY.setBounds(320, 180, 50, 20);

        goldleafRBTN.setForeground(java.awt.Color.white);
        goldleafRBTN.setText("Gold Leaf");
        goldleafRBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goldleafRBTNMouseClicked(evt);
            }
        });
        jPanel2.add(goldleafRBTN);
        goldleafRBTN.setBounds(40, 320, 80, 20);
        jPanel2.add(goldleafQTY);
        goldleafQTY.setBounds(140, 320, 50, 20);
        jPanel2.add(sourdoughQTY);
        sourdoughQTY.setBounds(320, 320, 50, 20);

        sourdoughRBTN.setForeground(java.awt.Color.white);
        sourdoughRBTN.setText("Sourdough");
        sourdoughRBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sourdoughRBTNMouseClicked(evt);
            }
        });
        jPanel2.add(sourdoughRBTN);
        sourdoughRBTN.setBounds(220, 320, 90, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/rsz_sourdough.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(220, 220, 150, 90);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/rsz_baguette.jpg"))); // NOI18N
        jLabel10.setText("jLabel9");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(40, 80, 150, 90);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/rsz_croissant.jpg"))); // NOI18N
        jLabel11.setText("jLabel9");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(220, 80, 150, 90);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/rsz_gold.jpg"))); // NOI18N
        jLabel12.setText("jLabel9");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(40, 220, 150, 90);

        logoutBTN.setBackground(new java.awt.Color(187, 89, 26));
        logoutBTN.setForeground(new java.awt.Color(187, 89, 26));
        logoutBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBTNMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("LOGOUT");

        javax.swing.GroupLayout logoutBTNLayout = new javax.swing.GroupLayout(logoutBTN);
        logoutBTN.setLayout(logoutBTNLayout);
        logoutBTNLayout.setHorizontalGroup(
            logoutBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutBTNLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        logoutBTNLayout.setVerticalGroup(
            logoutBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutBTNLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        jPanel2.add(logoutBTN);
        logoutBTN.setBounds(280, 40, 90, 20);

        jPanel3.setBackground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(40, 40, 61));
        jPanel1.setForeground(new java.awt.Color(40, 40, 61));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel1.setText("Total Balance");

        totalBALANCE.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        totalBALANCE.setForeground(java.awt.Color.white);
        totalBALANCE.setText("P20,000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(totalBALANCE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(totalBALANCE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Welcome");

        addBalance.setBackground(new java.awt.Color(187, 89, 26));
        addBalance.setForeground(new java.awt.Color(187, 89, 26));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("ADD BALANCE");

        javax.swing.GroupLayout addBalanceLayout = new javax.swing.GroupLayout(addBalance);
        addBalance.setLayout(addBalanceLayout);
        addBalanceLayout.setHorizontalGroup(
            addBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBalanceLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        addBalanceLayout.setVerticalGroup(
            addBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        cartBTN.setBackground(new java.awt.Color(187, 89, 26));
        cartBTN.setForeground(new java.awt.Color(187, 89, 26));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("CART");

        javax.swing.GroupLayout cartBTNLayout = new javax.swing.GroupLayout(cartBTN);
        cartBTN.setLayout(cartBTNLayout);
        cartBTNLayout.setHorizontalGroup(
            cartBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartBTNLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(45, 45, 45))
        );
        cartBTNLayout.setVerticalGroup(
            cartBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        checkoutBTN.setBackground(new java.awt.Color(187, 89, 26));
        checkoutBTN.setForeground(new java.awt.Color(187, 89, 26));
        checkoutBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkoutBTNMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("CHECKOUT");

        javax.swing.GroupLayout checkoutBTNLayout = new javax.swing.GroupLayout(checkoutBTN);
        checkoutBTN.setLayout(checkoutBTNLayout);
        checkoutBTNLayout.setHorizontalGroup(
            checkoutBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkoutBTNLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        checkoutBTNLayout.setVerticalGroup(
            checkoutBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        userName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userName.setForeground(java.awt.Color.red);
        userName.setText("[footlongusername]");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userName)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cartBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkoutBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(28, 28, 28))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(addBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cartBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBTNMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBTNMouseClicked

    private void checkoutBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkoutBTNMouseClicked
        CheckOutScreen check = new CheckOutScreen();
        check.show();
        this.dispose();
    }//GEN-LAST:event_checkoutBTNMouseClicked

    private void logoutBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBTNMouseClicked
        MainLogin log = new MainLogin();
        log.show();
        this.dispose();
    }//GEN-LAST:event_logoutBTNMouseClicked

    private void baguetteRBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baguetteRBTNMouseClicked
        if (baguetteRBTN.isSelected()){
            baggueteEnable();
        } else {
            baggueteDisable();
        }
       
    }//GEN-LAST:event_baguetteRBTNMouseClicked

    private void goldleafRBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goldleafRBTNMouseClicked
        if (goldleafRBTN.isSelected()){
            goldleafEnable();
        } else {
            goldleafDisable();
        }
    }//GEN-LAST:event_goldleafRBTNMouseClicked

    private void sourdoughRBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sourdoughRBTNMouseClicked
        if (sourdoughRBTN.isSelected()){
            sourdoughEnable();
        } else {
            sourdoughDisable();
        }
    }//GEN-LAST:event_sourdoughRBTNMouseClicked

    private void croissantRBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_croissantRBTNMouseClicked
        if (croissantRBTN.isSelected()){
            croissantEnable();
        } else {
            croissantDisable();
        }
    }//GEN-LAST:event_croissantRBTNMouseClicked
    
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
    private javax.swing.JPanel addBalance;
    private javax.swing.JSpinner baguetteQTY;
    private javax.swing.JRadioButton baguetteRBTN;
    private javax.swing.JPanel cartBTN;
    private javax.swing.JPanel checkoutBTN;
    private javax.swing.JLabel closeBTN;
    private javax.swing.JSpinner croissantQTY;
    private javax.swing.JRadioButton croissantRBTN;
    private javax.swing.JSpinner goldleafQTY;
    private javax.swing.JRadioButton goldleafRBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel logoutBTN;
    private javax.swing.JSpinner sourdoughQTY;
    private javax.swing.JRadioButton sourdoughRBTN;
    private javax.swing.JLabel totalBALANCE;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
