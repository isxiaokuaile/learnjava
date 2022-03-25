package com.test.houserentalsystem.house;

/**
 * 一个house对象表示一个房屋信息
 */
public class House {
    private int id;
    private String name;   //姓名
    private String tel;    //电话
    private String address;  //地址
    private int rent;    //租金
    private String condition;   //出租状态

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public House(int id, String name, String tel, String address, int rent, String condition) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.rent = rent;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return id +
                "\t\t" + name +
                "\t" + tel +
                "\t" + address +
                "\t" + rent +
                "\t" + condition;
    }
}
