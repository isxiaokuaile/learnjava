package com.ido85.poly;

public class Normal extends Employee{
    public Normal(String name, double sal) {
        super(name, sal);
    }

    public void work(){
        System.out.println("员工:"+getName()+"在工作");
    }
    public double getAnnual(){
        return super.getAnnual();
    }
}
