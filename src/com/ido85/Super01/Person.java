package com.ido85.Super01;

public class Person {
    private String name;
    private int age;

    public Person() {   //无参构造器
    }

    public Person(String name, int age) {   //有参构造器
        this.name = name;
        this.age = age;
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
    public String say(){
        return "我叫"+name+",今年"+age+"岁";
    }
}
