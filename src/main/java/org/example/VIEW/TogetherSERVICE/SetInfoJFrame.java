/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.VIEW.TogetherSERVICE;

import org.example.ENTITY.Computer.Computer;
import org.example.ENTITY.USER.Role;
import org.example.ENTITY.USER.User;
import org.example.SERVICE.ComputerService;
import org.example.SERVICE.UserService;
import org.example.VIEW.BOSS.HomeBossJFrame;
import org.example.VIEW.USER.HomeUserJFrame;
import org.mindrot.jbcrypt.BCrypt;

import javax.swing.*;

import java.util.Arrays;

import static org.example.DAO.Main.entityManager;

/**
 *
 * @author HELLO MAIN_CA
 */
public class SetInfoJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SetInfoJFrame
     */
    public SetInfoJFrame() {
        initComponents();
    }
    public SetInfoJFrame(String phone, Role role) {
        initComponents();
        this.RoleNow.setText(String.valueOf(role));
        this.PhoneNow.setText(phone);
        UserService userService = new UserService();
        User user = userService.findUser(PhoneNow.getText());
        this.SetPhoneTXT.setText(user.getPhone());
        this.SetNameTXT.setText(user.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PhoneNow = new javax.swing.JTextField();
        RoleNow = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SetPhoneTXT = new javax.swing.JTextField();
        SetNameTXT = new javax.swing.JTextField();
        YesSetInforButton = new javax.swing.JButton();
        ExitSetInforButton = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        SetPassACTXT = new javax.swing.JPasswordField();
        SetPassTXT = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        PhoneNow.setText("jTextField1");

        RoleNow.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(235, 254, 254));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Số điện thoại");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Họ và Tên");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Mật khẩu");

        SetPhoneTXT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        SetNameTXT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        YesSetInforButton.setText("Hoàn tất");
        YesSetInforButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesSetInforButtonActionPerformed(evt);
            }
        });

        ExitSetInforButton.setText("Hủy");
        ExitSetInforButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitSetInforButtonActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setText("Xác nhận mật khẩu");

        SetPassACTXT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        SetPassTXT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SetNameTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addComponent(SetPhoneTXT)
                            .addComponent(SetPassTXT, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(YesSetInforButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExitSetInforButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SetPassACTXT)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetPhoneTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetNameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetPassTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(SetPassACTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YesSetInforButton)
                    .addComponent(ExitSetInforButton)))
        );

        jLabel1.setBackground(new java.awt.Color(243, 243, 254));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Sửa thông tin tài khoản");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void YesSetInforButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesSetInforButtonActionPerformed
        // TODO add your handling code here:
        if(SetNameTXT.getText().isBlank() || SetPhoneTXT.getText().isBlank() || String.valueOf(SetPassTXT.getPassword()).isBlank() || String.valueOf(SetPassACTXT).isBlank()){
            JOptionPane.showMessageDialog(this,"Không để trống thông tin",
                    "Thông báo lỗi", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int check = JOptionPane.showConfirmDialog(this, "Xác nhận thay đổi",
                "THÔNG BÁO", JOptionPane.OK_OPTION);
        if(check == JOptionPane.OK_OPTION) {
            UserService userService = new UserService();
            if(userService.checkPAss(this.SetPassTXT.getPassword(),this.SetPassACTXT.getPassword())){
                if(RoleNow.getText().equals(String.valueOf(Role.ADMIN))){
                    User oldUser = userService.findUser(PhoneNow.getText());
                    userService.deleteUser(oldUser);
                    User newUser = userService.setUser(
                            oldUser,this.SetPhoneTXT.getText(), this.SetNameTXT.getText(), this.SetPassACTXT.getPassword());
                    userService.addUser(newUser);
                    this.PhoneNow.setText(newUser.getPhone());
                    this.setVisible(false);
                    new HomeBossJFrame(this.PhoneNow.getText()).setVisible(true);
                } else {
                    ComputerService computerService = new ComputerService();
                    Computer computer = computerService.findUserComputer(PhoneNow.getText());
                    computerService.deleteComputer(computer);
                    User oldUser = userService.findUser(PhoneNow.getText());
                    userService.deleteUser(oldUser);
                    User newUser = userService.setUser(
                            oldUser,this.SetPhoneTXT.getText(), this.SetNameTXT.getText(), this.SetPassACTXT.getPassword());
                    userService.addUser(newUser);
                    computer.setUser(newUser);
                    computerService.addComputer(computer);
                    this.PhoneNow.setText(newUser.getPhone());
                    this.setVisible(false);
                    new HomeUserJFrame(this.PhoneNow.getText()).setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(this,"Mật khẩu không khấp",
                        "Thông báo",JOptionPane.WARNING_MESSAGE);
                return;
            }
            ImageIcon icon = new ImageIcon(getClass().getResource("/images/logoTichXanh.png"));
            JOptionPane.showMessageDialog(this, "Đã sửa thành công",
                    "Thông báo", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_YesSetInforButtonActionPerformed

    private void ExitSetInforButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitSetInforButtonActionPerformed
        // TODO add your handling code here:
        int check = JOptionPane.showConfirmDialog(this,"Xác nhận hủy",
                "Thông báo",JOptionPane.INFORMATION_MESSAGE);
        if(check == JOptionPane.OK_OPTION){
            if(RoleNow.getText().equals(String.valueOf(Role.ADMIN))){
                this.setVisible(false);
                new HomeBossJFrame(this.PhoneNow.getText()).setVisible(true);
                return;
            }
            this.setVisible(false);
            new HomeUserJFrame(this.PhoneNow.getText()).setVisible(true);
        }
    }//GEN-LAST:event_ExitSetInforButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SetInfoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetInfoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetInfoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetInfoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetInfoJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitSetInforButton;
    private javax.swing.JTextField PhoneNow;
    private javax.swing.JTextField RoleNow;
    private javax.swing.JTextField SetNameTXT;
    private javax.swing.JPasswordField SetPassACTXT;
    private javax.swing.JPasswordField SetPassTXT;
    private javax.swing.JTextField SetPhoneTXT;
    private javax.swing.JButton YesSetInforButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

