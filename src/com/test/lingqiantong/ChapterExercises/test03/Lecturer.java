package com.test.lingqiantong.ChapterExercises.test03;

/**
 * 讲师类  子类
 */
public class Lecturer extends Teacher{
    private double scale=1.1;         //工资级别
    public String introduce(){   //重写父类的方法，输出老师的信息
        return super.introduce()+"+"+scale;
    }

    public Lecturer(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }
}
