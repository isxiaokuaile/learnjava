package com.ido85.Super01;

public class Student extends Person{
    private int id;
    private double score;
    public Student() {
    }

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public String say(){
        return super.say()+"\n我的id是："+id+"，我考了"+score+"分";
    }
}
