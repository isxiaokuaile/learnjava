package com.test.lingqiantong.ChapterExercises.test04;

/**
 * 普通员工类    子类
 */
public class GeneralStaff extends Staff{
    private double grade=1.0;  //等级

    public double sal() {   //重写打印员工的工资数的方法
        return super.sal()*grade;
    }

    public GeneralStaff(String name, double salary, int day) {
        super(name, salary, day);
    }
}
