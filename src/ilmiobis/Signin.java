/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilmiobis;

import com.mysql.jdbc.PreparedStatement;
import ilmiobis.Konfig;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;


/**
 *
 * @author Afifah
 */
public class Signin extends javax.swing.JFrame {
    Connection conn=null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Object set;

    /**
     * Creates new form Login
     */
    public Signin() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
        this.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        txtusername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        btnexit = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        btnsignup = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        btnsignin = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\iconbus.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 250, 200));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\User-Interface-Exit-icon.png")); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, 30));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 80, 20));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 37, 78));
        jLabel2.setText("Come and Go With Us");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 240, 20));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username");
        jLabel6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel6FocusGained(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, 20));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 255));
        jLabel7.setText("<html>\n<body>\n<u>Terms and Conditions</u>\n</body>\n</html>");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 120, 20));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 37, 78));
        jLabel11.setText("Sign In");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel12.setText("Sign Up");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\btnSignUpSwitch.png")); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 90, -1));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\btnSignUpSwitch2.png")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 90, -1));

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 37, 78));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Sign In");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 90, 30));

        jCheckBox1.setBackground(new java.awt.Color(51, 37, 78));
        jCheckBox1.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Agree ");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        txtusername.setBackground(new java.awt.Color(51, 37, 78));
        txtusername.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        txtusername.setForeground(new java.awt.Color(153, 153, 153));
        txtusername.setText("Enter Username");
        txtusername.setBorder(null);
        txtusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtusernameFocusGained(evt);
            }
        });
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 290, 30));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 37, 78));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Sign Up");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 90, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 290, 30));

        jLabel19.setFont(new java.awt.Font("Berlin Sans FB", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 37, 78));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Exit");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 60, 30));

        btnexit.setBackground(new java.awt.Color(201, 232, 223));
        btnexit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\btnSignUpSwitch2.png")); // NOI18N
        btnexit.setBorder(null);
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel1.add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 90, 30));

        txtpassword.setBackground(new java.awt.Color(51, 37, 78));
        txtpassword.setForeground(new java.awt.Color(153, 153, 153));
        txtpassword.setText("jPasswordField1");
        txtpassword.setBorder(null);
        txtpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpasswordFocusGained(evt);
            }
        });
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 300, -1));

        btnsignup.setBackground(new java.awt.Color(51, 37, 78));
        btnsignup.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\btnSignUpSwitch2.png")); // NOI18N
        btnsignup.setBorder(null);
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        jPanel1.add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 90, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("Don't have account?");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, -1));

        btnsignin.setBackground(new java.awt.Color(51, 37, 78));
        btnsignin.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnsignin.setForeground(new java.awt.Color(51, 37, 78));
        btnsignin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\btnSignUpSwitch2.png")); // NOI18N
        btnsignin.setBorder(null);
        btnsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsigninActionPerformed(evt);
            }
        });
        jPanel1.add(btnsignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 90, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 290, 20));

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\btnSignUpSwitch.png")); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 90, -1));

        jLabel3.setBackground(new java.awt.Color(51, 37, 78));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\rightPanel.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 360, 450));

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 37, 78));
        jLabel17.setText("Sign In");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afifah\\Documents\\PBO\\leftPanelBack.png")); // NOI18N
        jLabel4.setText("ddd");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jLabel6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel6FocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel6FocusGained

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
        txtusername.setText("");
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusGained
        // TODO add your handling code here:
        txtpassword.setText("");
    }//GEN-LAST:event_txtpasswordFocusGained

    private void txtusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusGained
        // TODO add your handling code here:
        txtusername.setText("");
    }//GEN-LAST:event_txtusernameFocusGained

    private void btnsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsigninActionPerformed
        // TODO add your handling code here:
        String sql = "select* from signup where username=? and password=?";
        try {
               conn = Konfig.configDB();
               pst = (PreparedStatement)conn.prepareStatement(sql);
               pst.setString(1, txtusername.getText());
               pst.setString(2, txtpassword.getText());
               rs = pst.executeQuery();
                if (rs.next()){
                    JOptionPane.showMessageDialog(null, "LOGIN BERHASIL");
                    new Halmenu().setVisible(true);
                    this.dispose();
                    
                }else{
                    JOptionPane.showMessageDialog(null,"FAILED LOGIN","PESAN",JOptionPane.ERROR_MESSAGE);
                    txtusername.setText("");
                    txtpassword.setText("");
                    }}
           catch (Exception e){
                JOptionPane.showMessageDialog(null, e); 
           }
    }//GEN-LAST:event_btnsigninActionPerformed

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        // TODO add your handling code here:
        new SignUp().show();
        this.dispose();
    }//GEN-LAST:event_btnsignupActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

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
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnsignin;
    private javax.swing.JButton btnsignup;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
