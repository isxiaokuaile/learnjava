package com.ido85.learn;
/*
* 方法的练习
* */

public class text11 {
    public static void main(String[] args) {
        person p1=new person();
        p1.people();
        p1.ca101();
        int sums=p1.getSum(10,20);
        System.out.println(sums);
    }
}
class person{
    int age;
    String name;
    public void people(){
        System.out.println("n你是一个好人");
    }
    public void ca101(){
        int sum=0;
        for (int i = 1; i <= 1000; i++) {
            sum+=i;

        } System.out.println(sum);
    }

    public int getSum(int sum1,int sum2) {
        int sum=sum1+sum2;
        return sum;
    }
}