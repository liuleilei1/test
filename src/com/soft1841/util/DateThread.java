package com.soft1841.util;

import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateThread extends Thread {
    private JLabel dateLabel;

    public void setDateLabel(JLabel dateLabel) {
        this.dateLabel = dateLabel;
    }
    @Override
    public void run() {
        while (true)
        {
            GregorianCalendar time = new GregorianCalendar();
            int year = time.get(java.util.Calendar.YEAR);
            int month = time.get(java.util.Calendar.MONTH)+1;
            int day = time.get(java.util.Calendar.DAY_OF_MONTH);
            int second = time.get(java.util.Calendar.SECOND);
            int hour = time.get(java.util.Calendar.HOUR_OF_DAY);
            int minute = time.get(Calendar.MINUTE);
            dateLabel.setText(
                    "当前日期时间:" + year + "-" + month + "-" + day +"-"+ hour+":"+ minute  +":"+ second );
            try {
                Thread.sleep(950);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
