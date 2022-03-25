package com.test.lingqiantong.ChapterExercises.test13;

/**
 * 父类
 */
public class Person {
    private String name;
    private int age;
    private String sex;   //性别
    private String hobby;  //爱好

    public String show(){   //展示基本信息
        return "姓名："+name+"\n年龄："+age+"\n性别："+sex;
    }
    public String play(){
        return name+"爱玩"+hobby;
    }
    public Person(String name, int age, String sex, String hobby) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
