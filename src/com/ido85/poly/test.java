package com.ido85.poly;

import javafx.concurrent.Worker;

public class test {
    public static void main(String[] args) {
        Normal tom = new Normal("tom", 2000);
        Manage manage = new Manage("jack", 10000, 20000);
        test test=new test();
        test.showEmpAnnual(tom);
        test.showEmpAnnual(manage);
        test.testEm(tom);
        test.testEm(manage);

    }
    public void showEmpAnnual(Employee e){
        System.out.println(e.getName()+":"+"年工资"+e.getAnnual());
    }
    public void testEm(Employee e){
        if (e instanceof Normal){
            ((Normal) e).work();
        }else if (e instanceof  Manage){
            ((Manage) e).manage();
        }
    }
}
