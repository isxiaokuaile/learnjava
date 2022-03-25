package com.ido85.abstracts;

public abstract class Employee {
    private String name;
    private String id;
    private double salary;
    public abstract void work();

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}
//普通员工
class CommonEmployee extends Employee{

    @Override
    public void work() {

    }

    public CommonEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }
}

class Manager  extends Employee{
    private double bouns;


    public Manager(String name, String id, double salary, double bouns) {
        super(name, id, salary);
        this.bouns = bouns;
    }

    @Override
    public void work() {

    }
}