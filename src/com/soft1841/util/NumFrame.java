package com.soft1841.util;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NumFrame extends JFrame {
    private JLabel numLabel;
    private BorderLayout borderLayout;
    private Field field;
    private JLabel dateLabel;

    public NumFrame() {
        init();
        setTitle("随机数");
        setSize(new Dimension(900, 600));
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }





    private void init() {
        numLabel = new JLabel("随机数");

        Font font = new Font("微软雅黑",Font.BOLD,60);
       getContentPane().setBackground(new Color(25, 255, 255));

        numLabel.setFont(font);

        setLayout(new FlowLayout(FlowLayout.LEFT,200,200));
        add(numLabel);
        NumThread numThread = new NumThread();
        numThread.setNumberLabel(numLabel);
        numThread.start();


        dateLabel = new JLabel("日期的变换");
        Font font1 = new Font("微软雅黑",Font.PLAIN,150);
        dateLabel.setText(String.valueOf(font1));
        setLayout(new FlowLayout(FlowLayout.CENTER,200,150));
        add(dateLabel);
        DateThread dateThread = new DateThread();
        dateThread.setDateLabel(dateLabel);
        dateThread.start();

    }

    public static void main(String[] args) {
        new NumFrame();
    }
}
