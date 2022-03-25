package com.ido85.poly;

public class testEmployee {
    Object n = new Object();

    public static void main(String[] args) {  //测试类
        Employee[] em = new Employee[3];
        em[0] = new Employee("jack", 1000);
        em[1] = new Normal("tom", 2000);
        em[2] = new Manage("jerry", 3000, 2000);
//        employee.getAnnual();
        for (int i = 0; i < em.length; i++) {
            if (em[i] instanceof Normal) {
                ((Normal) em[i]).work();
                System.out.println(em[i].getAnnual());
            } else if (em[i] instanceof Manage) {
                ((Manage) em[i]).manage();
                System.out.println(em[i].getAnnual());
            } else if (em[i] instanceof Employee) {
                System.out.println(em[i].getAnnual());
            } else {
                System.out.println("输入错误");
            }
        }
    }
}

