package com.ido85.staticTest;

public class StaticExercise {
    public static void main(String[] args) {

        new Test().count();
        new Test().count();
        System.out.println(Test.count);
        System.out.println(new Test().count1);
    }
}

class Test{
    static int count=9;
    int count1=9;
    public void count(){
        System.out.println("count="+(count++));
        System.out.println("count1="+(count1++));
    }
}
