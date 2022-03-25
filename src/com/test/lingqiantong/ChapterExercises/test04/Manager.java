package com.test.lingqiantong.ChapterExercises.test04;

/**
 * 经理类   子类
 */
public class Manager extends Staff {
    private double grade=1.2;  //等级

    public double sal() {   //重写打印员工的工资数的方法
        return 1000+super.sal()*grade;
    }

    public Manager(String name, double salary, int day) {
        super(name, salary, day);
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
