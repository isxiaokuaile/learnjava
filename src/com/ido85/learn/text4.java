package com.ido85.learn;

import java.util.Scanner;

public class text4 {
    public static void main(String[] args) {
        //case循环的练习
//        int year=1;
//        if (year>0&&year<=12) {
//            switch ((year-2)/4) {
//                case 0:
//                    System.out.println("春季");
//                    break;
//                case  1:
//                    System.out.println("夏季");
//                    break;
//                case  2:
//                    System.out.println("秋季");
//                    break;
//                case  3:
//                    System.out.println("冬季");
//                    break;
//            }
//        }else {
//            System.out.println("输入有误");
//        }
            Scanner MyScanner=new Scanner(System.in);
        System.out.println("请输入月份");
        int month=MyScanner.next().codePointAt(0);
        if (month>0&&month<=12) {
            switch (month) {
                case 3:
                case 4:
                case 5:
                    System.out.println("春季");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("夏季");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("秋季");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("冬季");
                    break;
            }
        }
        else {
            System.out.println("输入有误");
        }


//        Scanner xi=new Scanner(System.in);
//        System.out.println("请输入：a-e");
//        char xiaoxie=xi.next().charAt(0);
//        switch (xiaoxie){
//            case 'a':
//            System.out.println("A");
//            break;
//            case 'b':
//                System.out.println("B");
//                    break;
//            default:
//                System.out.println("other");
//        }


//        Scanner MyScanner=new Scanner(System.in);
//        System.out.println("请输入成绩：");
//        int grade=MyScanner.next().charAt(0);
//        int grade=120;
//        if (grade>0 && grade<=100) {
//            switch (grade/60) {
//                case 1:
//                    System.out.println("合格");
//                    break;
//                case 0:
//                    System.out.println("不合格");
//                    break;
//            }
//        }else {
//            System.out.println("请输入0-100的数字");
//        }
    }
}
