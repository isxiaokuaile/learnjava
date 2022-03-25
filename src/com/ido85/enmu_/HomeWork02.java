package com.ido85.enmu_;

public class HomeWork02 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        System.out.println(new Frock());
        System.out.println(new Frock());
        System.out.println(new Frock());
    }
}
class Frock{
    //衣服出厂的序号起始值
    private static int currentNum=100000;
    //序列号
    private int serialNumber;
    //生成上衣唯一的序号
    public static int getNextNum(){
        return currentNum+=100;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public Frock() {
        this.serialNumber = getNextNum();
    }

    @Override
    public String toString() {
        return  "唯一序列号："+serialNumber ;
    }
}