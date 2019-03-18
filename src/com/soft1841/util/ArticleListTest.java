package com.soft1841.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

//import static com.soft1841.util.TimeCalculate.timeCal;

public class ArticleListTest {
    public static void main(String[] args) throws ParseException {
        List<Article> list = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        list.add(new Article(1, "我就喜欢你看不惯我又干不掉我的样子", "吾皇的白茶", simpleDateFormat.parse("2019-03-18 20:20:20")));
        list.add(new Article(2, "恋是樱草色1青春文学校园浪漫言情小说动漫画书籍天闻角川", "浙江人民   ", simpleDateFormat.parse("2019-03-18 18:18:18")));
        list.add(new Article(3, "没有俗不可耐的言情密语", "  局外人  ", simpleDateFormat.parse("2019-03-18 22:17:16")));
        System.out.println("id           标题             作者      写作时间");
        Iterator<Article> integer = list.iterator();
        while (integer.hasNext()) {
            Article article = integer.next();
            String result;
            result = timeCal(simpleDateFormat.format(article.getWriteTime()));
            System.out.println(article.getId() + "   "
                    + article.getTitle().substring(0, 10) + "..." +
                    article.getAuthor() + "   " + result);

        }
        }
        private static String timeCal(String time){
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d1;
            long diff = 0;
            try {
                d1 = format.parse(time);
                Date now = new Date();
                diff = now.getTime() - d1.getTime();
            } catch (ParseException e) {
                e.printStackTrace();
            }
            long seconds = diff / 1000;
            long minutes = seconds / 60;
            long hours = minutes / 60;
            long days = hours / 24;
            if (seconds < 60) {
                return "刚刚";
            } else if (minutes < 60) {
                return minutes + "分钟前";
            } else if (hours < 24) {
                return hours + "小时前";
            } else {
                return days + "天前";
            }
        }
    }
