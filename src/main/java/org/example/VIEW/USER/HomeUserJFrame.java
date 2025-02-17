/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.VIEW.USER;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.example.ENTITY.USER.Role;
import org.example.ENTITY.USER.User;
import org.example.SERVICE.UserService;
import org.example.VIEW.TogetherSERVICE.HomeJFrame;
import org.example.VIEW.TogetherSERVICE.SetInfoJFrame;

import javax.swing.*;
import static org.example.DAO.Main.entityManager;

/**
 *
 * @author HELLO MAIN_CA
 */
public class HomeUserJFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeUserJFrame
     */
    public HomeUserJFrame() {
        initComponents();
    }
    public HomeUserJFrame(String username) {
        initComponents();
        this.PhoneUserTXT.setText(username);
        User user = entityManager.find(User.class, PhoneUserTXT.getText());
        double time = (double) user.getMoney() /8000;
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        LocalDateTime endTime = LocalDateTime.now().plusSeconds((long) (time * 60 * 60));
        LocalDateTime firstTime = LocalDateTime.now().plusSeconds((long) (0));
        scheduler.scheduleAtFixedRate(() -> {
            LocalDateTime currentTime = LocalDateTime.now();
            Duration remainingTime = Duration.between(currentTime, endTime);
            Duration startTime = Duration.between(firstTime,currentTime);
            long secondsLeft = remainingTime.getSeconds();
            long timeuse = startTime.getSeconds();
            if (secondsLeft <= 0) {
                System.out.println("Hết giờ! Máy sẽ tự động khóa.");
                scheduler.shutdown();
                return;
            }
            long hourss = timeuse / 3600;
            long minutess = (timeuse % 3600) / 60;
            long secondss = timeuse % 60;
            long hours = secondsLeft / 3600;
            long minutes = (secondsLeft % 3600) / 60;
            long seconds = secondsLeft % 60;
            timeUser.setText(hourss + ":" + minutess + ":" +secondss );
            lastTime.setText(hours + ":" + minutes + ":" +seconds);
        }, 0, 1, TimeUnit.SECONDS);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RechargeDailog = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        moneyTXT = new javax.swing.JTextField();
        AddMoneyButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        OderDialog = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Uong3 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        Do1 = new javax.swing.JCheckBox();
        Do2 = new javax.swing.JCheckBox();
        Do3 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        Uong1 = new javax.swing.JCheckBox();
        Uong2 = new javax.swing.JCheckBox();
        OderButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();
        mainBoard = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        Food = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        timeUser = new javax.swing.JTextField();
        lastTime = new javax.swing.JTextField();
        SetUserButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        PhoneUserTXT = new javax.swing.JTextField();
        UserButton = new javax.swing.JToggleButton();

        RechargeDailog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        RechargeDailog.setTitle("Nạp tiền");
        RechargeDailog.setAlwaysOnTop(true);
        RechargeDailog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RechargeDailog.setLocation(new java.awt.Point(450, 250));
        RechargeDailog.setModal(true);
        RechargeDailog.setResizable(false);
        RechargeDailog.setSize(new java.awt.Dimension(350, 165));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nhập số tiền");

        moneyTXT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        moneyTXT.setText("0");

        AddMoneyButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddMoneyButton.setForeground(new java.awt.Color(0, 204, 0));
        AddMoneyButton.setText("Nạp Tiền");
        AddMoneyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMoneyButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("VND");

        javax.swing.GroupLayout RechargeDailogLayout = new javax.swing.GroupLayout(RechargeDailog.getContentPane());
        RechargeDailog.getContentPane().setLayout(RechargeDailogLayout);
        RechargeDailogLayout.setHorizontalGroup(
            RechargeDailogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RechargeDailogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RechargeDailogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddMoneyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RechargeDailogLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moneyTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RechargeDailogLayout.setVerticalGroup(
            RechargeDailogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RechargeDailogLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(RechargeDailogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moneyTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(AddMoneyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        OderDialog.setTitle("Đặt hàng online");
        OderDialog.setAlwaysOnTop(true);
        OderDialog.setLocation(new java.awt.Point(350, 200));
        OderDialog.setModal(true);
        OderDialog.setResizable(false);
        OderDialog.setSize(new java.awt.Dimension(558, 555));

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(246, 254, 254));

        Uong3.setText("Đồ uống 3");
        Uong3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Uong3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Đồ Ăn");

        jCheckBox1.setText("Đồ ăn 4");

        Do1.setText("Đồ ăn 1");
        Do1.setActionCommand("JCheckBox1");
        Do1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Do1ActionPerformed(evt);
            }
        });

        Do2.setText("Đồ ăn 2");

        Do3.setText("Đồ ăn 3");
        Do3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Do3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Đồ Uống");

        Uong1.setText("Đồ uống 1");
        Uong1.setActionCommand("JCheckBox1");
        Uong1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Uong1ActionPerformed(evt);
            }
        });

        Uong2.setText("Đồ uống 2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Uong1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Do2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Do1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Do3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Uong3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Uong2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(376, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Do1)
                .addGap(4, 4, 4)
                .addComponent(Do2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Do3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addGap(72, 72, 72)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Uong1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Uong2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Uong3)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        OderButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OderButton.setText("Đặt hàng");
        OderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OderButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("MENU");

        javax.swing.GroupLayout OderDialogLayout = new javax.swing.GroupLayout(OderDialog.getContentPane());
        OderDialog.getContentPane().setLayout(OderDialogLayout);
        OderDialogLayout.setHorizontalGroup(
            OderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OderDialogLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(OderDialogLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OderDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        OderDialogLayout.setVerticalGroup(
            OderDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OderDialogLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Desktop");
        setBackground(new java.awt.Color(224, 224, 224));
        setResizable(false);

        desktop.setBackground(new java.awt.Color(253, 231, 253));
        desktop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        desktop.setForeground(new java.awt.Color(14, 146, 118));

        mainBoard.setBackground(new java.awt.Color(204, 204, 204));
        mainBoard.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mainBoard.setForeground(new java.awt.Color(255, 255, 255));
        mainBoard.setTitle("Thông tin tài khoản");
        mainBoard.setToolTipText("");
        mainBoard.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu");

        Food.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Food.setText("Đặt đồ ăn, thức uống");
        Food.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Exit.setText("Đăng xuất");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jLabel2.setText("Thời gian còn lại");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Thời gian sử dụng");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        timeUser.setText("60'");
        timeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeUserActionPerformed(evt);
            }
        });

        lastTime.setText("10'");
        lastTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastTimeActionPerformed(evt);
            }
        });

        SetUserButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SetUserButton.setText("Sửa thông tin");
        SetUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetUserButtonActionPerformed(evt);
            }
        });

        jLabel9.setText("Số điện thoại");

        javax.swing.GroupLayout mainBoardLayout = new javax.swing.GroupLayout(mainBoard.getContentPane());
        mainBoard.getContentPane().setLayout(mainBoardLayout);
        mainBoardLayout.setHorizontalGroup(
            mainBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainBoardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Food, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SetUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainBoardLayout.createSequentialGroup()
                        .addGroup(mainBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mainBoardLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PhoneUserTXT))
                            .addGroup(mainBoardLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastTime, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainBoardLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timeUser)))
                        .addGap(31, 31, 31)))
                .addContainerGap())
        );
        mainBoardLayout.setVerticalGroup(
            mainBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainBoardLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(mainBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(PhoneUserTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lastTime, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Food, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(SetUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        UserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IconLogo.png"))); // NOI18N
        UserButton.setToolTipText("");
        UserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserButtonActionPerformed(evt);
            }
        });

        desktop.setLayer(mainBoard, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(UserButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                .addGap(0, 753, Short.MAX_VALUE)
                .addComponent(mainBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addComponent(mainBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(UserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(desktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodActionPerformed
        // TODO add your handling code here:
        OderDialog.setVisible(true);
    }//GEN-LAST:event_FoodActionPerformed

    private void Do1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Do1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Do1ActionPerformed

    private void Do3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Do3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Do3ActionPerformed

    private void Uong1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Uong1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Uong1ActionPerformed

    private void Uong3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Uong3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Uong3ActionPerformed

    private void OderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OderButtonActionPerformed
        // TODO add your handling code here:
        OderDialog.setVisible(false);
        JOptionPane.showMessageDialog(this,"Đặt hàng thành công",
                "Thông báo",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_OderButtonActionPerformed

    private void lastTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastTimeActionPerformed

    private void UserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserButtonActionPerformed
        // TODO add your handling code here:
        mainBoard.setVisible(!mainBoard.isVisible());
    }//GEN-LAST:event_UserButtonActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        int check = JOptionPane.showConfirmDialog(this, "XÁC NHẬN ĐĂNG XUẤT", 
                "THÔNG BÁO", JOptionPane.INFORMATION_MESSAGE);
        if(check == JOptionPane.OK_OPTION) {
            this.setVisible(false);
            new HomeJFrame().setVisible(true);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void timeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeUserActionPerformed

    private void AddMoneyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMoneyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddMoneyButtonActionPerformed

    private void SetUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetUserButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new SetInfoJFrame(PhoneUserTXT.getText(), Role.USER).setVisible(true);
    }//GEN-LAST:event_SetUserButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HomeUserJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeUserJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeUserJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeUserJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeUserJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddMoneyButton;
    private javax.swing.JCheckBox Do1;
    private javax.swing.JCheckBox Do2;
    private javax.swing.JCheckBox Do3;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Food;
    private javax.swing.JButton OderButton;
    private javax.swing.JDialog OderDialog;
    private javax.swing.JTextField PhoneUserTXT;
    private javax.swing.JDialog RechargeDailog;
    private javax.swing.JButton SetUserButton;
    private javax.swing.JCheckBox Uong1;
    private javax.swing.JCheckBox Uong2;
    private javax.swing.JCheckBox Uong3;
    private javax.swing.JToggleButton UserButton;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastTime;
    private javax.swing.JInternalFrame mainBoard;
    private javax.swing.JTextField moneyTXT;
    private javax.swing.JTextField timeUser;
    // End of variables declaration//GEN-END:variables
}
