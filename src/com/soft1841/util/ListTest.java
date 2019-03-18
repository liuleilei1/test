package com.soft1841.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("高数");
        list.add("HTML");
        list.add("高数");
        int length = list.size();
        System.out.println(length);
        Random random = new Random();
        int index = random.nextInt(length);
        System.out.println(index);
        System.out.println(list.get(index));

        for (int i = 0;i < length;i++){
            System.out.println(list.get(i));
        }

    }
}
