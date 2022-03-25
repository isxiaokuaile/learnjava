package com.test.lingqiantong.ChapterExercises.test13;

public class Student extends Person {
    private String stu_id;   //学号

    public String show() {   //展示基本信息
        return super.show() + "\n学号：" + stu_id;
    }

    public void study() {
        System.out.println("我承诺，我会好好学习");
    }

    public Student(String name, int age, String sex, String hobby, String stu_id) {
        super(name, age, sex, hobby);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
}
