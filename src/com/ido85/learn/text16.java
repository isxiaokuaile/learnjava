package com.ido85.learn;

public class text16 {
    public static void main(String[] args) {
        AccountTest accountTest = new AccountTest();
        accountTest.account();

    }
}
class Account{
    private String name;
    private double yue;
    private String password;
    public Account(String name, double yue, String password) {
        this.name = name;
        this.yue = yue;
        this.password = password;
    }
    public Account(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()<=4&&name.length()>=2){
        this.name = name;
        }else {
            System.out.println("名字输入错误，必须为1-4位，给定初始值");
            this.name="小明";
        }
    }

    public double getYue() {
        return yue;
    }

    public void setYue(double yue) {
        if (yue>20){
        this.yue = yue;
        }else {
            System.out.println("输入错误，余额必须大于20，默认为0");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length()==6){
        this.password = password;
        }else {
            System.out.println("输入错误，密码必须为6位数，默认为000000");
            this.password="000000";
        }
    }
}
class AccountTest{
    public void account(){
        Account account = new Account();
        account.setName("xiaomingming");
        account.setYue(123.1);
        account.setPassword("123456789");
        System.out.println("姓名："+account.getName()+" 余额"+account.getYue()+"密码"
                +account.getPassword());
    }
}