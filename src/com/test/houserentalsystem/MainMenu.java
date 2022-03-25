package com.test.houserentalsystem;

import java.util.Scanner;

/**
 * 主菜单，可以打印以及调用所有信息
 */
public class MainMenu {
    public static void main(String[] args) {
        boolean boo = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        House house = new House();
        do {
            System.out.println("\n================房屋出租系统================");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 源");
            System.out.println("\t\t\t3 删 除 房 源");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.print("请输入编号：");
            String king = scanner.next();
            switch (king) {
                case "1":
                    house.AddHouse();
                    break;
                case "2":
//                    house.findHouse();
                    break;
                case "3":
                    house.deleteHouse();
                    break;
                case "4":
                    System.out.println("\n\n================修改房源================");
                    break;
                case "5":
                    house.findHouse();
                    break;
                case "6":
                    while (true) {
                        System.out.println("\n请确认是都要退出，确认y/取消n");
                        key = scanner.next();
                        if (key.equals("y")|| key.equals("n")) {
                            break;
                        } else {
                            System.out.println("输入错误，请重新输入(确认y/取消n)");
                        }
                    }
                    if (key.equals("y")) {
                        boo = false;
                    }
                    break;
                default:
                    System.out.println("\n输入错误，请重新输入");
                    break;
            }

        } while (boo);
        System.out.println("\n================退出系统================");
    }
}
