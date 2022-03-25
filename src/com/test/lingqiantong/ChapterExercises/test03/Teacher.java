package com.test.lingqiantong.ChapterExercises.test03;
/**
 * 教师类   父类
 * */

class Teacher{
    protected String name;       //姓名
    protected int age;          //年龄
    protected String post;     //职称
    protected double salary;   //工资
    public String introduce(){   //输出一个老师的信息
        return name+"+"+age+"+"+post+"+"+salary;
    }

//    @Override
//    public String toString() {
//        return "Teacher{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", post='" + post + '\'' +
//                ", salary=" + salary +
//                '}';
//    }

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    protected double getScale(){
        return 0d;
    }

}
