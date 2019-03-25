package com.soft1841.util;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutPosition extends JFrame {
        public BorderLayoutPosition(){
            setTitle("这个窗体使用边界布局管理器");
            Container c = getContentPane();
            setLayout(new BorderLayout());
            JButton centerBtn = new JButton("中");
            JButton northBtn = new JButton("北");
            JButton southBtn = new JButton("南");
            JButton westBtn = new JButton("西");
            JButton eastBtn = new JButton("东");
            c.add(centerBtn,BorderLayout.CENTER);
            c.add(northBtn,BorderLayout.NORTH);
            c.add(southBtn,BorderLayout.SOUTH);
            c.add(westBtn,BorderLayout.WEST);
            c.add(eastBtn,BorderLayout.EAST);
            setSize(350,200);
            setVisible(true);
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        }

        public static void main(String[] args) {
            new BorderLayoutPosition();
        }
    }

