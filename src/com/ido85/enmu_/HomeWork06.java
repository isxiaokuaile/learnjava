package com.ido85.enmu_;

import jdk.nashorn.internal.ir.IfNode;

public class HomeWork06 {
    public static void main(String[] args) {
        Person person1 = new Person("唐僧","马");
        Person person2 = new Person("唐僧","船");
        VehicleFactory vehicleFactory = new VehicleFactory();
        String boat = vehicleFactory.getBoat(person1.getVehicle());
        String horse = vehicleFactory.getHorse(person1.getVehicle());
        System.out.println(boat);
        System.out.println(horse);
    }
}

/**
 * 人类，可以选择交通工具
 */
class Person{
    //名字和工具属性，在构造器中赋值
    private String name;
    private String vehicle;

    public Person() {
    }

    public Person(String name, String vehicle) {
        this.name = name;
        this.vehicle = vehicle;
        String boat = VehicleFactory.getBoat();
    }

    public String getVehicle() {
        return vehicle;
    }

    public String getName() {
        return name;
    }
}
//交通工具接口
interface Vehicles{
    void work();
}
//交通工具—马
class Horse implements Vehicles{
    @Override
    public void work() {
        Person person = new Person();
        System.out.println("骑马");
    }
}
//交通工具—船
class Boat implements Vehicles{
    @Override
    public void work() {
        Person person = new Person();
        System.out.println("坐船");
    }
}
//交通工具工厂类
class VehicleFactory{
    private String type;
    //马
    public static Horse getHorse(String planA){
        return new Horse();
    }
    //船
    public static Boat getBoat(String planB){
        return new Boat();
    }
}