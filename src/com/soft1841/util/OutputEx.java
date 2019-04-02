package com.soft1841.util;

import java.io.*;

public class OutputEx {
    public static void main(String[] args) throws IOException {
        String str = "I Love Java";
        File file1 = new File("D:/book");
        if (!file1.exists()) {
            file1.createNewFile();
             //字节流
//            OutputStream outputStream = new FileOutputStream(file1);
//            outputStream.write(str.getBytes());
//            outputStream.close();
            //
//            Writer writer = new FileWriter(file1);
//            writer.write(str.toCharArray());
//            writer.close();
            //打印流
            OutputStream out = new FileOutputStream(file1);
            PrintStream printStream = new PrintStream(out);
            printStream.print(str);
            System.out.println(str);
            printStream.close();

        }
    }
}
