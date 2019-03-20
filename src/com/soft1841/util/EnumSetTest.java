package com.soft1841.util;

import java.util.Scanner;

enum Week {
    MONDAY("----星期一"), TUESDAY("----星期二"), WEDNESDAY("----星期三"), THURSDAY("----星期四"), FRIDAY("----星期五"), SATURDAY("----星期六"), SUNDAY("----星期天");
    String week;

    Week(String week) { // ����ö�ٹ��캯��
        this.week = week;
    }

    public String getName() { // ��ȡö�ٳ�����Ӧ��ֵ
        return week;
    }

    public static Week getWeek(String week) {
        switch (week) {
            case "mon":
                return Week.MONDAY;
            case "tues":
                return Week.TUESDAY;
            case "wed":
                return Week.WEDNESDAY;
            case "thru":
                return Week.THURSDAY;
            case "fri":
                return Week.FRIDAY;
            case "sat":
                return Week.SATURDAY;
            case "sun":
                return Week.SUNDAY;
            default:
                return Week.MONDAY;
        }
    }
}


public class EnumSetTest {
    public static void main(String[] args) {
        System.out.println("————星期的中英文对照————");
        Week weekArray[] = Week.values();
        for (Week k : weekArray) {
            System.out.println(k + "    " + k.getName());
        }

        System.out.print("\n");
        Scanner sc = new Scanner(System.in);
        Week week = Week.getWeek(sc.next());
        switch (week) {
            case MONDAY:
                System.out.println("MONDAY" + week.getName());
                break;
            case TUESDAY:
                System.out.println("TUESDAY" + week.getName());
                break;
            case WEDNESDAY:
                System.out.println("WEDNESDAY" + week.getName());
                break;
            case THURSDAY:
                System.out.println("THURSDAY" + week.getName());
                break;
            case FRIDAY:
                System.out.println("FRIDAY" + week.getName());
                break;
            case SATURDAY:
                System.out.println("SATURDAY" + week.getName());
                break;
            case SUNDAY:
                System.out.println("SUNDAY" + week.getName());
                break;
            default:
                System.out.println();
                break;
        }
        sc.close();
    }
}


