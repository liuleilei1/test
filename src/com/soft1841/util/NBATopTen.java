package com.soft1841.util;

import java.util.ArrayList;
import java.util.List;

public class NBATopTen {
    public static void main(String[] args) {
        System.out.println("————————————NBA历史十大巨星————————————");
        List<NBA> list = new ArrayList<>();
        list.add(new NBA("乔  丹", "飞 人/神", 30.1, 6.2, 5.3));
        list.add(new NBA("拉塞尔", "指 环 王", 15.1, 22.5, 4.3));
        list.add(new NBA("贾巴尔", " 天  钩 ", 24.6, 11.2, 3.6));
        System.out.println(" 球员        " + "绰号      " + "得分     "  + "篮板     " + "助攻");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getName() + "     " + list.get(i).getNickname() + "     " + list.get(i).getScore() + "     " + list.get(i).getRebound() + "     " + list.get(i).getAssist());
            System.out.println();
        }
        }
    }

