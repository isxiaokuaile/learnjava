package com.ido85.enmu_;

public class HomeWork04 {
    public static void main(String[] args) {
        new CellPhone().work();
    }
}
//计算机接口
interface Computer{
    //work方法，功能是运算
    void work();
}
//手机类
class CellPhone implements Computer{
//测试计算机功能
    @Override
    public void work() {
        System.out.println("手机在工作");
    }
}