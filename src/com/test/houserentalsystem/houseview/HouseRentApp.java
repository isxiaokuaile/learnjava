package com.test.houserentalsystem.houseview;

import com.test.houserentalsystem.MainMenu;

/**
 * 程序入口
 * 创建HouseView对象
 * 调用该对象，显示主菜单
 */
public class HouseRentApp {
    public static void main(String[] args) {
        new HouseView().mainMenu();
        System.out.println("\n================你退出了房屋出租系统================");
    }
}
