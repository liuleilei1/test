package com.soft1841.util;

import java.util.Date;

public class Calendar {
    public static void main(String[] args) {
        java.util.Calendar c = java.util.Calendar.getInstance();
        int year = c.get(java.util.Calendar.YEAR);
        int month = c.get(java.util.Calendar.MONTH);
        int day = c.get(java.util.Calendar.DAY_OF_MONTH);
        int hour = c.get(java.util.Calendar.HOUR_OF_DAY);
        int minute = c.get(java.util.Calendar.MINUTE);
        int second = c.get(java.util.Calendar.SECOND);
        System.out.println("当前时间： " + year + "-" + month + "-" + day +"-" + hour
                + "-" + minute + "-" + second) ;
        Date date = c.getTime();
        Long time = c.getTimeInMillis();
        System.out.println("当前时间：" + date);
        System.out.println("当前毫秒数：" + time);



    }
}
