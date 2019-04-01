package com.soft1841.util;

import java.io.File;

public class FolderTest {

        public static void main(String[] args) {
            //要遍历的路径
            String path = "D:\\360downloads";
            //获取其file对象
            File file = new File(path);
            //遍历path下的文件和目录，放在File数组中
            File[] fs = file.listFiles();
            //遍历File[]数组
            for(File f:fs){
                //若非目录(即文件)，则打印
                if(!f.isDirectory())
                    System.out.println(f);
            }
        }
    }

