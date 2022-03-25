package com.ido85.interfaces;

import java.lang.annotation.Target;

/**
 * 匿名内部类
 */
public class NiMingNBL {
    public static void main(String[] args) {
        Out01 out01=new Out01();
        out01.te();
    }
}
class Out01{
    private int in =1;
    public void te(){
        IA tager=new IA(){  //匿名内部类
            @Override
            public void say() {
                System.out.println("老虎叫");
            }
        };
        tager.say();
        Father father=new Father("jack"){
            @Override
            public void test() {
                System.out.println("重新test");
            }
        };
        father.test();
        Animal animal=new Animal(){
            @Override
            void eat() {
                System.out.println("抽象类");
            }
        };
        animal.eat();
    }
}
interface IA{
    void say();
}
class Father{
    public Father(String name){
    }
    public void test(){

    }
}

abstract class Animal{
    abstract void eat();
}