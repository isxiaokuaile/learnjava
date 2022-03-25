package com.test.houserentalsystem.houseview;

import com.test.houserentalsystem.house.House;
import com.test.houserentalsystem.houseservice.HouseService;
import com.test.houserentalsystem.utility.Utility;

/**
 * 界面类
 * 1.显示界面
 * 2.接收用户的输入
 * 3.调用HouseService方法完成对房屋信息的各种操作
 */
public class HouseView {
    boolean boo = true;  //控制显示菜单
    char key = ' ';  //接收用户输入
    //设置数组大小为10
    private HouseService houseservice = new HouseService(10);

    //完成退出确认
    public void exit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            boo = false;
        }
    }

    //修改房屋信息的方法，接收输入的id
    public void updateHouse() {
        System.out.println("\n================修改房屋信息================");
        System.out.print("请选择待修改房源编号(-1退出)：");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("放弃了修改");
            return;//结束一个方法
        }
        //根据输入的updateId查找对象,house返回的是引用类型，下面的修改会用想到数组中的house
        House house = houseservice.find(updateId);
        if (house == null) {
            System.out.println("你要修改的房屋信息编号不存在，无法修改");
            return;
        }
        System.out.print("姓名(" + house.getName() + "):");
        //如果不修改，默认为空“”
        String name = Utility.readString(8, "");
        if (!"".equals(name)) {  //修改
            house.setName(name);
        }
        System.out.print("电话(" + house.getTel() + "):");
        String tel = Utility.readString(12, "");
        if (!"".equals(tel)) {  //修改
            house.setTel(tel);
        }
        System.out.print("地址(" + house.getAddress() + "):");
        String address = Utility.readString(50, "");
        if (!"".equals(address)) {  //修改
            house.setAddress(address);
        }
        System.out.print("月租(" + house.getRent() + "):");
        int rent = Utility.readInt(-1);
        if (rent != -1) {  //修改
            house.setRent(rent);
        }
        System.out.print("状态(" + house.getCondition() + "):");
        String condition = Utility.readString(3, "");
        if (!"".equals(condition)) {  //修改
            house.setCondition(condition);
        }
        System.out.println("\n================修改完成================");

    }

    //查找方法，接收用户id
    public void findHouse() {
        System.out.println("\n================查找房屋信息================");
        System.out.print("请输入你要查找的id：");
        int findId = Utility.readInt();
        //调用方法
        House house = houseservice.find(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("没有找到该房屋信息");
        }

    }

    //接收用户输入id,调用del方法
    public void delHouse() {
        System.out.println("\n================删除房屋================");
        System.out.print("请选择待删除房源编号(-1退出)：");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("放弃了删除");
            return;//结束一个方法
        }
        //该方法必须输入y/n不然出不来
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            if (houseservice.del(delId)) {
                System.out.println("删除房屋信息成功");
            } else {
                System.out.println("房屋编号不存在，删除失败");
            }
        } else {
            System.out.println("\n==============放弃删除房屋信息===========");

        }


    }

    //添加房屋界面,接收输入，创建House对象，调用add方法
    public void addHouse() {
        System.out.println("\n================添加房屋================");
        System.out.print("姓名:");
        String name = Utility.readString(8);
        System.out.print("电话:");
        String tel = Utility.readString(12);
        System.out.print("地址:");
        String address = Utility.readString(50);
        System.out.print("月租:");
        int rent = Utility.readInt();
        System.out.print("状态:");
        String condition = Utility.readString(3);
        //创建一个新的House对象,id是系统分配的，不能用户输入
        House house = new House(1, name, tel, address, rent, condition);
        if (houseservice.add(house)) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }

    }

    //显示房屋列表
    public void listHouses() {
        System.out.println("\n================房屋列表================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(出租/未出租)");
        //得到所有房屋信息
        House[] houses = houseservice.listHouses();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null) {
                System.out.println(houses[i]);
            } else {
                break;
            }
        }
        System.out.println("\n================房屋列表显示完毕================");

    }

    // 显示主菜单
    public void mainMenu() {
        do {
            System.out.println("\n================房屋出租系统================");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 源");
            System.out.println("\t\t\t3 删 除 房 源");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.print("请输入你的选择（1-6）:");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    //删除有问题，房屋编号不存在
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
                default:
                    System.out.println("\n输入错误，请重新输入");
                    break;
            }

        } while (boo);

    }
}



