package com.soft1841.util;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;

/**
 * 使用卡片布局实现多图浏览功能
 * @author 柳磊磊
 */

public class ImageViewerFrame extends JFrame implements ActionListener {
    private JButton chooseBtn,preBtn,nextBtn,firstBtn,lastBtn;
    private JFileChooser fileChooser;
    private JPanel centerPanel,bottonPanel;
    private CardLayout cardLayout;
    private Icon icon;

    public ImageViewerFrame(){
        init();
        setTitle("CardLayout卡片布局");
        setSize(new Dimension(1024,768));
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }


    public void init(){
        //底部面板加上三个按钮，设置监听
        chooseBtn = new JButton("选择图片");
        preBtn = new JButton("前一张");
        nextBtn = new JButton("后一张");
        firstBtn = new JButton("第一张");
        lastBtn = new JButton("最后一张");
        bottonPanel = new JPanel();
        bottonPanel.add(preBtn);
        bottonPanel.add(nextBtn);
        bottonPanel.add(firstBtn);
        bottonPanel.add(lastBtn);
        bottonPanel.add(chooseBtn);
        //监听事件
        firstBtn.addActionListener(this);
        lastBtn.addActionListener(this);
        preBtn.addActionListener(this);
        nextBtn.addActionListener(this);
        chooseBtn.addActionListener(this);
        add(bottonPanel,BorderLayout.SOUTH);

        //创建中间面板，并设置布局为卡片布局
        centerPanel = new JPanel();
        cardLayout = new CardLayout();
        centerPanel.setLayout(cardLayout);
        centerPanel.setBackground(new Color(199, 233, 250));
        add(centerPanel);
    }

    public static void main(String[] args) {

        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.frameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }catch (Exception e){
            e.printStackTrace();
        }
        new ImageViewerFrame();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == chooseBtn){
            //创建文件选择器对象
            fileChooser = new JFileChooser();
            //设置文件选择器的默认路径
            fileChooser.setCurrentDirectory(new File("G:\\tupian"));
            //当前文件位置
//        fileChooser.setCurrentDirectory(new File("G:\\"));
            //设置文件为多选模式
            fileChooser.setMultiSelectionEnabled(true);
            //打开对话框
            int result = fileChooser.showOpenDialog(null);
//        System.out.println(result);
            //用户选择了文件
            if (result ==JFileChooser.APPROVE_OPTION){
                //获取选中的所有文件,放到一个文件类型的数组中
                File[] files = fileChooser.getSelectedFiles();
                for (File f:files) {
                    System.out.println(f.getAbsolutePath());
                    //对每个f文件，创建字节输入流读入字节数组，构建Icon,并设置给JLabel
                    try {
                        byte[] bytes = new byte[(int) f.length()];
                        InputStream inputStream = new FileInputStream(f);
                        inputStream.read(bytes);
                        Icon icon = new ImageIcon(bytes);
                        JLabel imageLabel = new JLabel();
                        imageLabel.setIcon(icon);
                        imageLabel.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                super.mouseClicked(e);
                            }
                        });
                        centerPanel.add(imageLabel);
                    }catch (IOException e1) {
                        JOptionPane.showMessageDialog(null,"IO操作异常！");
                    }
                }
            }
        }
        if (e.getSource() ==preBtn){
            cardLayout.previous(centerPanel);
        }
        if (e.getSource() ==nextBtn){
            cardLayout.next(centerPanel);
        }
        if (e.getSource() ==firstBtn) {
            cardLayout.first(centerPanel);
        }
        if (e.getSource() ==lastBtn) {
            cardLayout.last(centerPanel);
        }
    }
}
