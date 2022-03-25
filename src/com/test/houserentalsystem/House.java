package com.test.houserentalsystem;

import java.util.Scanner;

/**
 * 新增房源，添加房屋
 */
public class House {
    private String name;   //姓名
    private String tel;    //电话
    private String address;  //地址
    private String rent;    //租金
    private String condition;   //出租状态
    private int id;
    private int key;
    private String key2;
    private Scanner scanner = new Scanner(System.in);
    private String add = "";   //接收数据
    private String[] information = {name, tel, address, rent, condition};   //暂时存放数据的数组
    boolean bool = true;

    /**
     * 新增房屋数据的方法
     */
    public String[] AddHouse() {
        System.out.println("\n================添加房屋================");
        id++;
        System.out.print("\n姓名：");
        information[0] = scanner.next();
        add += "\nid:" + id + "\t姓名：" + information[0];
        System.out.print("\n电话：");
        information[1] = scanner.next();
        add += "\t电话：" + information[1];
        System.out.print("\n地址：");
        information[2] = scanner.next();
        add += "\t地址：" + information[2];
        System.out.print("\n月租：");
        information[3] = scanner.next();
        add += "\t月租：" + information[3];
        System.out.print("\n状态(未出租/出租)：");
        information[4] = scanner.next();
        add += "\t状态(未出租/出租)：" + information[4];
        System.out.println("\n================添加完成================");
        return information;
//        for (int i = 0; i <information.length ; i++) {
//            information[i]=scanner.next();
//        }
    }

    /**
     * 查找房屋的方法
     */

    public void findHouse() {
        System.out.println("\n================查找房屋================");
        System.out.println(add);
        if (id == 0) {
            System.out.println("暂时没有房源信息");
        } else {
            System.out.print("请输入你要查找的id：");
            key = scanner.nextInt();
            if (id == key) {
                System.out.println(add);
            } else {
                System.out.println("================没有该房屋================");
            }
        }
    }

    /**
     * 删除房屋
     */
    public void deleteHouse() {
        System.out.println("\n================删除房屋================");
        System.out.print("请选择待删除房源编号(-1退出)：");
        key2 = scanner.next();
        if (key2.equals("-1")) {

        }
        //
        else {
            while (bool) {
                System.out.print("确认是否删除（Y/N），请小心选择：");
                System.out.print("请输入你的选择（Y/N）");
                key2 = scanner.next();
                if (key2.equals("Y") || key2.equals("N")) {
                    break;
                }
            }
            if (key2.equals("Y")) {
                System.out.println("\n================删除完成================");
                bool = false;
            }



        }

    }
}



