package com.test.houserentalsystem.houseservice;

import com.test.houserentalsystem.house.House;
import com.test.houserentalsystem.utility.Utility;

/**
 * 业务层类
 * 定义一个House数组，保存House对象
 * 1.响应HouseView的调用
 * 2.完成对用户信息的各种操作（增删改查crud）
 */
public class HouseService {
    //保存house对象
    private House[] houses;
    //记录当前有多少个房屋信息
    private int houseNums = 1;
    //记录当前id自增长到哪个值了
    private int idCounter = 1;

    public HouseService(int size) {
        houses = new House[size];
        //为了配合测试，初始化一个house对象
        houses[0] = new House(1, "jack", "12345", "jinan", 2000, "未出租");
    }

    //添加新对象，返回boolean
    public boolean add(House newHouse) {
        if (houseNums == houses.length) {//不能再添加了
            System.out.println("数组已满，不能再添加了");
            return false;
        }
        //把newHouse对象加入到数组里
        houses[houseNums++] = newHouse;
        //设计id自增长的机制,更新newHouse的id
        newHouse.setId(++idCounter);
        return true;
    }

    //返回所有的房屋信息
    public House[] listHouses() {
        return houses;
    }

    //完成真正的删除命令，返回boolean值,传入的参数就是要删除的ID
    public boolean del(int delld) {
        //先找到删除的房屋信息对应的下标，和房屋编号不是一回事
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            //删除的id在数组下标为i的元素
            if (delld == houses[i].getId()) {
                index = i;  //记录这个下标
            }
        }
        //说明delId在数组中不存在
        if (index == -1) {
            return false;
        }
        //把后面的移到前面来，最后一个数组置空，houseNums-1中没有-1不然会造成空指针异常
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        //前--，先减去后赋值，把当前存在的房屋信息的最后一个置空
        houses[--houseNums] = null;
        //如果找到了则删除，思考怎么删除
        return true;
    }

    //返回House对象，如果没有，返回null
    public House find(int findId) {
        for (int i = 0; i < houseNums; i++) {
            if (findId==houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }



}
