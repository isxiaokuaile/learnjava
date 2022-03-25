package com.test.lingqiantong.ChapterExercises.test10;

public class Doctor {
//    private String email;
    private String name;
    private int  age;   //年龄
    private String job;   //工作
    private String gender;  //性别
    private double sal;   //工资

    public Doctor(String name, int age, String job, String gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    public boolean equals(Object obj){
        if (obj==this) {
            return true;
        }else if (obj instanceof Doctor) {
            Doctor doctor =(Doctor) obj;
            return doctor.name.equals(this.name) && doctor.job.equals(this.job) && doctor.gender.equals(this.gender);
        }
        return false;
    }

    public static void main(String[] args) {
        Doctor d1 = new Doctor("小明",42,"医生","男",4500);
        Doctor d2 = new Doctor("小明",42,"医生","男",4500);
        System.out.println(d1.equals(d2));
    }
}
