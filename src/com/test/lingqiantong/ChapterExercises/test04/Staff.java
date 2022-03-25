package com.test.lingqiantong.ChapterExercises.test04;

/**
 * 父类   员工类
 */
public class Staff {
    private String name;
    private double salary;  //单日工资
    private int day;  //工作天数

    public double sal() {   //打印员工的工资数
        return salary * day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Staff(String name, double salary, int day) {
        this.name = name;
        this.salary = salary;
        this.day = day;
    }
}
