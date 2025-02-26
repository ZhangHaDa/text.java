package com.ui.game;

import javax.swing.*;

public class GameJFrame extends JFrame {
    public GameJFrame() {
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMnuBar();


        //显示界面
        this.setVisible(true);
    }

    //初始化菜单
    private void initJMnuBar() {
        //创造整个菜单的对象
        JMenuBar JMenuBer = new JMenuBar();

        //创造两个选项(功能，关于我们)
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //创造选项的条目
        JMenuItem replayItem = new JMenu("重新游戏");
        JMenuItem reLoginItem = new JMenu("重新登录");
        JMenuItem closeItem = new JMenu("关闭游戏");

        JMenuItem accountItem = new JMenu("公众号");

        //将条目填进选项
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //将选项填进对象
        JMenuBer.add(functionJMenu);
        JMenuBer.add(aboutJMenu);

        //设置菜单
        this.setJMenuBar(JMenuBer);
    }

    //初始化界面
    private void initJFrame() {

        //设置界面的宽和高
        this.setSize(603, 680);

        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");

        //设置界面的置顶
        this.setAlwaysOnTop(true);

        //设置界面的居中
        this.setLocationRelativeTo(null);

        //设置界面的关闭模式
        this.setDefaultCloseOperation(3);
    }
}
