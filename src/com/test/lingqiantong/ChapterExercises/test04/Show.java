package com.test.lingqiantong.ChapterExercises.test04;

public class Show {
    public static void main(String[] args) {
        Staff jack=new GeneralStaff("jack",100.0,30);
        Staff tom=new Manager("tom",100,30);
        System.out.println(jack.sal());
        System.out.println(tom.sal());
    }
}
