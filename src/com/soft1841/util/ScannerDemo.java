package com.soft1841.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\11.txt");
        InputStream inputStream = new FileInputStream(file);
        Scanner scanner = new Scanner(inputStream);

    }
}
