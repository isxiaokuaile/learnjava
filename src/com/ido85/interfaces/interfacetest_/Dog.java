package com.ido85.interfaces.interfacetest_;

/**
 * 狗类
 */
public class Dog extends Pet{
    public Dog( String name, double heavey, double speed) {
        super( name, heavey, speed);
    }

    public void say(){
        System.out.println(getName()+"汪汪叫");
    }

    @Override
    public double powers() {
        return super.powers()*2;
    }
}
