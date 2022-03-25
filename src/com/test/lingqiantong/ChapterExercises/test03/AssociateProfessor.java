package com.test.lingqiantong.ChapterExercises.test03;

/**
 * 副教授类   子类
 */
public class AssociateProfessor extends Teacher {
    private double scale = 1.2;         //工资级别

    public String introduce() {   //重写父类的方法，输出老师的信息
        return super.introduce() + "+" + scale;
    }

    public AssociateProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }
}
