package com.ido85.poly;

public class Employee {//员工类   父类
    private String name;
    private double sal;   //工资
    public double getAnnual(){  //年工资
        return sal*12;
    }
    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
