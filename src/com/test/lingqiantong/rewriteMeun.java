package com.test.lingqiantong;
/**
 *第二遍自己写
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class rewriteMeun {
    public static void main(String[] args) {
        boolean boo = true;
        Scanner scanner = new Scanner(System.in);
        String detail = "--------------------零钱通明细--------------------";
        String key = "";
        double money = 0;   //金额变动
        double balance = 0;  //余额
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm");
        do {
            System.out.println("\n\n--------------------零钱通菜单--------------------");
            System.out.println("\t\t\t\t\t1 零钱通明细");
            System.out.println("\t\t\t\t\t2 收益入账");
            System.out.println("\t\t\t\t\t3 消费");
            System.out.println("\t\t\t\t\t4 退    出");
            System.out.print("请选择（1-4）：");
            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(detail);
                    break;
                case "2":
                    System.out.print("请输入收益金额：");
                    money = scanner.nextDouble();
                    if (money < 0) {
                        System.out.println("输入错误，金额必须大于0");  //收益金额进行校验
                        break;
                    }

                    balance += money;
                    detail += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
                    break;
                case "3":
                    System.out.println("请输入支出金额：");
                    money = scanner.nextDouble();
                    if (money <= 0 || money > balance) {
                        System.out.println("输入错误，金额必须在1-" + balance + "之间");  //收益金额进行校验
                        break;
                    }
                    balance -= money;
                    detail += "\n追出入账\t-" + money + "\t" + sdf.format(date) + "\t余额：" + balance;
                    break;
                case "4":
                    while (true) {
                        System.out.println("你确定要退出吗？确定输入y/不退出输入n：");
                        key = scanner.next();
                        if (key.equals("y") || key.equals("n")) {
                            break;
                        } else {
                            System.out.println("输入有误，请重新输入");
                        }
                    }
                    if (key.equals("y")) {
                        boo = false;
                    }
                    break;
                default:
                    System.out.println("输入错误请重新输入");
                    break;
            }
        } while (boo);
        System.out.println("\n\n================已退出零钱通系统================");
    }

}
