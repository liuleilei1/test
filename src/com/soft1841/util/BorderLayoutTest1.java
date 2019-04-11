package com.soft1841.util;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BorderLayoutTest1 extends JFrame {
    private JPanel[] panels;
    private JLabel content;
    private JLabel imgLabel;
    private Icon icon;
    private JTextField textField;

    private BorderLayoutTest1() {
        setTitle("这个窗体使用边界布局管理器");
        Container c = getContentPane();
        setLayout(new BorderLayout());
        JButton westBtn = new JButton("西");
        JButton eastBtn = new JButton("东");
        c.add(westBtn,BorderLayout.WEST);
        c.add(eastBtn,BorderLayout.EAST);
        setSize(350,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public void init() {
        getContentPane().setBackground(new Color(255, 255, 255));
        GridLayout gridLayout = new GridLayout(3, 3, 50, 30);
        setLayout(gridLayout);
        panels = new JPanel[2];
        for (int i = 0; i < 2; i++) {
            panels[i] = new JPanel();
            panels[i].setBorder(BorderFactory.createTitledBorder("面板" + (i + 1)));
            add(panels[i]);
        }
        //一
        panels[0].setBackground(new Color(255, 255, 255));

        //二
        panels[1].setLayout(new BorderLayout(20, 20));
        panels[1].setBackground(new Color(255, 122, 229));
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        panels[1].add(new TextField(format.format(new Date())));


    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new BorderLayoutTest1();
    }
}

