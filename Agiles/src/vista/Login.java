/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.AutentificacionCtrl;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.Rol;
import modelo.Usuario;

/**
 *
 * @author Jorge Aguirre
 */
public class Login extends javax.swing.JFrame {
    
    private final AutentificacionCtrl autentificacionCtrl;

    /**
     * Creates new form Login
     */
    public Login() {
        autentificacionCtrl = new AutentificacionCtrl();
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_LoginPanel = new javax.swing.JPanel();
        lbl_Login = new javax.swing.JLabel();
        lbl_Password = new javax.swing.JLabel();
        txt_Login = new javax.swing.JTextField();
        btn_Log = new javax.swing.JButton();
        lbl_SilacName = new javax.swing.JLabel();
        txt_Password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_LoginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        lbl_Login.setText("Login:");

        lbl_Password.setText("Password:");
        lbl_Password.setToolTipText("");

        txt_Login.setToolTipText("");

        btn_Log.setText("Login");
        btn_Log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_LogMouseClicked(evt);
            }
        });
        btn_Log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogActionPerformed(evt);
            }
        });

        lbl_SilacName.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_SilacName.setText("SILAC");

        txt_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_PasswordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pn_LoginPanelLayout = new javax.swing.GroupLayout(pn_LoginPanel);
        pn_LoginPanel.setLayout(pn_LoginPanelLayout);
        pn_LoginPanelLayout.setHorizontalGroup(
            pn_LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_LoginPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pn_LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_SilacName, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_LoginPanelLayout.createSequentialGroup()
                        .addGroup(pn_LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Password)
                            .addComponent(lbl_Login))
                        .addGap(60, 60, 60)
                        .addGroup(pn_LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Login, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(txt_Password))))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_LoginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Log, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        pn_LoginPanelLayout.setVerticalGroup(
            pn_LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_LoginPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbl_SilacName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(pn_LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Login)
                    .addComponent(txt_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(pn_LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Password)
                    .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btn_Log)
                .addGap(28, 28, 28))
        );

        lbl_Login.getAccessibleContext().setAccessibleName("login");
        lbl_Password.getAccessibleContext().setAccessibleName("password");
        txt_Login.getAccessibleContext().setAccessibleName("loginTxtField");
        btn_Log.getAccessibleContext().setAccessibleName("loginBtn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogMouseClicked
        Usuario usuario = autentificacionCtrl.autentificar(txt_Login.getText(), txt_Password.getPassword());
        if(usuario != null) {
            Rol rol = usuario.getPersona().getRol();
            if (Rol.logeable(rol)) {
                new Principal(usuario).setVisible(true);
               // this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Credenciales incorrectas intente otra vez.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
                
                cleanPassword();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas intente otra vez.",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        cleanPassword();
    }//GEN-LAST:event_btn_LogMouseClicked

    private void txt_PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PasswordKeyPressed
        int key=evt.getKeyCode();
        if(key==KeyEvent.VK_ENTER)
        { 
            btn_LogMouseClicked(null);
        }
    }//GEN-LAST:event_txt_PasswordKeyPressed

    private void btn_LogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_LogActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Log;
    private javax.swing.JLabel lbl_Login;
    private javax.swing.JLabel lbl_Password;
    private javax.swing.JLabel lbl_SilacName;
    private javax.swing.JPanel pn_LoginPanel;
    private javax.swing.JTextField txt_Login;
    private javax.swing.JPasswordField txt_Password;
    // End of variables declaration//GEN-END:variables

    private void cleanPassword() {
        txt_Password.setText("");
    }
}
