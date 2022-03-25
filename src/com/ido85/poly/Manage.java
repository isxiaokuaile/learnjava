package com.ido85.poly;

public class Manage extends Employee{
    private double bonus;   //奖金
    public void manage(){   //管理方法
        System.out.println("经理"+getName()+"在管理");
    }
    public double getAnnual(){  //年工资
        return super.getAnnual()+bonus;
    }
    public Manage(String name, double sal, double bonus) {
        super(name, sal);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
