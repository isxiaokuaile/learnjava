package com.test.lingqiantong;
/**
 *第一遍跟练
  */
import jdk.nashorn.internal.ir.CaseNode;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class menuShow {
    public static void main(String[] args) {
        boolean boo = true;   //判断条件
        Scanner scanner = new Scanner(System.in);
        String key = " ";  //输入的序号
        String datails = "-----------------零钱tong明细-----------------";
        double money = 0;   //收益入账金额
        double balance = 0;  //剩余金额,余额
        Date date = new Date();   //日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm");
        String shop = "";
        do {
            System.out.println("-----------------零钱菜单菜单-----------------");
            System.out.println("               1  零钱通明细");
            System.out.println("               2  收益入账");
            System.out.println("               3  消费");
            System.out.println("               4  退    出");
            System.out.print("请选择(1-4):");
            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(datails);
                    break;
                case "2":

                    System.out.print("收益入账金额：");
                    money = scanner.nextDouble();
                    //money应该校验一下
                    if (money < 0) {
                        System.out.println("金额不能小于0");
                        break;
                    }
                    balance += money;  //获取余额
                    datails += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + "余额：" + balance;
                    System.out.println("入账成功");
                    break;
                case "3":
                    System.out.print("支付物品：");
                    shop = scanner.next();
                    //money应该校验一下
                    System.out.print("支付金额：");
                    money = scanner.nextDouble();
                    if (money <= 0 || money >= balance) {
                        System.out.println("输入有误，您的消费金额应在1-" + balance + "之间");
                        break;
                    }
                    balance -= money;
                    datails += "\n\t" + shop + "\t-" + money + "\t" + sdf.format(date) + "\t" + "余额：" + balance;
                    System.out.println("消费成功");
                    break;
                case "4":
                    while (true) {   //输入结果必须为y/n
                        System.out.println("你确定要退出吗？退出-y/不退出-n");
                        key = scanner.next();
                        if (key.equals("y") || key.equals("n")) {
                            break;
                        }
                    }
                    if (key.equals("y")) {   //判断输入的是否为y，是就退出，不是就循环
                        boo = false;
                    }
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        } while (boo);
        System.out.println("-----------------退出了零钱通项目-----------------");


    }
}
