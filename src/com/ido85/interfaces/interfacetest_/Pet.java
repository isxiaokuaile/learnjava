package com.ido85.interfaces.interfacetest_;

public class Pet implements Power {
//    private String type;  //种类
    private String name;  //名字
    private double heavey;  //体重
    private  double speed;  //速度
    //攻击力
    @Override
    public double powers() {
        return heavey*speed;
    }
    public Pet( String name, double heavey, double speed) {
        this.name = name;
        this.heavey = heavey;
        this.speed = speed;
    }

//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeavey() {
        return heavey;
    }

    public void setHeavey(double heavey) {
        this.heavey = heavey;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return
                 name  +
                ", 体重" +heavey +",速度"+
                 speed+",攻击力"+powers()
                ;
    }
}
