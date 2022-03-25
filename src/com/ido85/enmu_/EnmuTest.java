package com.ido85.enmu_;

public class EnmuTest {
    public static void main(String[] args) {
        Week monday = Week.MONDAY;
        System.out.println("===所有星期的信息如下===");
        Week[] valus=Week.values();
        for (Week week : valus) {
            System.out.println(week);
        }
    }
}

/**
 * 枚举类，包含周一到周天的定义，返回所有枚举数组
 */
enum Week {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"),
    FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期天");
    private String name;
    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name ;
    }
}