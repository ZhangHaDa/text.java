package com.ui.game;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame(){
        //设置界面的宽和高
        this.setSize(488,430);

        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");

        //设置界面的置顶
        this.setAlwaysOnTop(true);

        //设置界面的居中
        this.setLocationRelativeTo(null);

        //设置界面的关闭模式
        this.setDefaultCloseOperation(3);

        //显示界面
        this.setVisible(true);
    }
}
