package com.test.lingqiantong.ChapterExercises.test13;

import javax.naming.Name;

public class Teacher extends Person {
    private int work_age;   //工龄

    public String show() {   //展示基本信息
        return super.show() + "\n工龄：" + work_age;
    }

    public void teach(){
        System.out.println("我承诺，我会认真教课");
    }

    public Teacher(String name, int age, String sex, String hobby, int work_age) {
        super(name, age, sex, hobby);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
}
