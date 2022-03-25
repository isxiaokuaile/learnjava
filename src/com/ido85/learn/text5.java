package com.ido85.learn;


import java.util.Scanner;

public class text5 {
    public static void main(String[] args) {
        //for循环的练习
        //打印金字塔
        //先打印矩形
//        String k = "*";
//        for (int i = 1; i <= 6; i++) {  //行数
//            for (int j = 1; j <= i; j++) {   //列数
//                System.out.print("*");
//
//            }
//            System.out.println("");
//        }


//        99乘法表
//            for (int a=1;a<10;a++){
//                for (int b=1;b<=a;b++){
//                    System.out.print(b+"*"+a+"="+(a*b)+"\t");
////                    System.out.print(a+"*"+b+"="+(a*b)+"\t");
//                }
//                System.out.println("");
//            }
// 统计3个班，每个班5个学生，总成绩和平均分以及及格人数
//        Scanner myScanner = new Scanner(System.in);
//        double sums = 0; //累计所有学生的成绩
//        int j = 0;  //累计及格人数
//        for (int gar = 1; gar <= 3; gar++) {   //gar 累计班级数量
//            double sum = 0;
//            for (int stu = 1; stu <= 5; stu++) {   //stu统计学生数量
//                System.out.println("请输入第" + gar + "个班，第" + stu + "个学生的成绩:");
//                double score = myScanner.nextDouble();
//                sum += score;  //一个班的分数
//                System.out.println("成绩：" + score);
//                if (score >= 60) {
//                    j++;   //及格人数
//                }
//            }
//            System.out.println("总成绩:" + sum + "，平均分:" + (sum / 5));
//            sums += sum;
//        }
//        System.out.println("总成绩:" + sums + "，平均分:" + (sums / 15) + "及格人数为：" + j);
        middle(6);
        middle2(6);
    }

    static void middle(int lineNum) {
        // 最多多少个星，代表底数
        int total = (lineNum - 1) * 2 + 1;
        // 中值是多少，并以此向左向右加星
        int middle = middleNum(total);
        for (int i = 0; i < lineNum; i++) {
            String print = "";
            // 本行展示几个星
            int showNum = 2 * i + 1;
            // 向左向右的加减量
            int temp = (showNum - 1) / 2;
            // 左下标
            int indexLeft = middle - temp;
            // 右下标
            int indexRight = middle + temp;
            for (int j = 1; j <= total; j++) {
                if (j < indexLeft) {
                    print += " ";
                } else if (j >= indexLeft && j <= indexRight) {
                    print += "*";
                } else {
                    print += " ";
                }
            }
            System.out.println(print);
        }
    }


    static void middle2(int lineNum) {
        int total = (lineNum - 1) * 2 + 1;
        int middle = middleNum(total);
        for (int i = 0; i < lineNum; i++) {
            String print = "";
            int showNum = 2 * i + 1;
            int temp = (showNum - 1) / 2;
            int indexLeft = middle - temp;
            int indexRight = middle + temp;
            for (int j = 1; j <= total; j++) {
                if (j < indexLeft) {
                    print += " ";
                } else if (j >= indexLeft && j <= indexRight) {
                    if(j > indexLeft && j < indexRight && i > 0 && i < (lineNum -1 )){
                        print += " ";
                    }else{
                        print += "*";
                    }
                } else {
                    print += " ";
                }
            }
            System.out.println(print);
        }
    }

    static int middleNum(int num) {
        if (num % 2 == 1) {
            return num / 2 + 1;
        } else {
            return num/2;
        }
    }
}
