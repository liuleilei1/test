package com.soft1841.util;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GridLayoutTest extends JFrame {
    private  JPanel[] panels;
    private JLabel content;
    private JLabel imgLabel;
    private Icon icon;
    private JTextField textField;
    private GridLayoutTest(){
        init();
        setTitle("GridLayout网格布局管理器");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void init(){
        getContentPane().setBackground(new Color(255,255,255));
        GridLayout gridLayout = new GridLayout(3,3,50,30);
        setLayout(gridLayout);
        panels = new JPanel[9];
        for (int  i = 0 ;i < 9;i++){
            panels[i]= new JPanel();
            panels[i].setBorder(BorderFactory.createTitledBorder("面板"+(i+1)));
            add(panels[i]);
        }
        //一
        panels[0].setBackground(new Color(255,212,0));
        for (int i = 0; i < 5; i++) {
            panels[0].add(new JButton("Java"));
        }
        //二
        panels[1].setLayout(new BorderLayout(20, 20));
        panels[1].setBackground(new Color(46, 122, 229));
        panels[1].add(new JButton("north"), BorderLayout.NORTH);
        panels[1].add(new JButton("south"), BorderLayout.SOUTH);
        panels[1].add(new JButton("east"), BorderLayout.EAST);
        panels[1].add(new JButton("west"), BorderLayout.WEST);
        panels[1].add(new JButton("center"), BorderLayout.CENTER);
        //三
        panels[2].setLayout(new GridLayout(3, 3, 10, 10));
        panels[2].setBackground(new Color(247, 163, 111));
        //依次加入9个按钮
        for (int i = 0; i < 9; i++) {
            panels[2].add(new JButton(String.valueOf(i + 1)));
        }
        //四
        panels[3].setBackground(new Color(89,168,105));
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String date = format.format(new Date());
        content = new JLabel(date);
        panels[3].add(content);
        //五
        panels[4].setBackground(new Color(130,21,232));
        imgLabel = new JLabel();//可以为空
        //读入本地的图片到字节数组
        File srcFile = new File("D:/b1.jpg");
        byte[] bytes = null;
        InputStream inputStream;
        try {
            //图片到bytes
            inputStream = new FileInputStream(srcFile);
            bytes= new byte[(int) srcFile.length()];
            inputStream.read(bytes);
            inputStream.close();
        } catch (IOException e) {
            System.out.println("IO异常");
        }
//        icon = new ImageIcon(bytes);
//        imgLabel.setIcon(icon);
//        panels[4].add(imgLabel);

        //六
        panels[5].setBackground(new Color(155,11,22));
        textField = new JTextField("我就是喜欢你看不惯我又干不掉我的样子");
        panels[5].add(textField);

        //七
        panels[6].setBackground(new Color(120,30,230));
        JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.setBounds(110,11,80,21);
        comboBox.addItem("100");
        comboBox.addItem("200");
        comboBox.addItem("500");
        comboBox.addItem("1000");
        getContentPane().add(comboBox);
        JLabel label = new JLabel(" ");
        label.setBounds(77,57,146,15);
        getContentPane().add(label);
        JButton bt = new JButton("确定");
        bt.setBounds(200,10,67,23);
        getContentPane().add(bt);
        textField = new JTextField("请选择");
        panels[6].add(textField);
        panels[6].add(comboBox);
        panels[6].add(label);
        panels[6].add(bt);
        //八
        panels[7].setBackground(new Color(110,210,23));
        String[] contents ={"00","01","02","03","04"};
        JList<String> jList = new JList<>(contents);
        JScrollPane jScrollPane = new JScrollPane(jList);
        jScrollPane.setBounds(100,10,109,100);
        panels[7].add(jScrollPane);
        //九
        panels[8].setBackground(new Color(132,21,222));
        JButton button1 = new JButton("喝tui");
        JButton button2 = new JButton("啊pei");
        JButton button3 = new JButton("喝tui");
//        JCheckBox comboBox1 = new JCheckBox("1");
//        JCheckBox comboBox2 = new JCheckBox("2");
//        JCheckBox comboBox3 = new JCheckBox("3");
        panels[8].add(button1);
        panels[8].add(button2);
        panels[8].add(button3);

    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new GridLayoutTest();
    }
}

