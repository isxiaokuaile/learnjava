package com.ido85.abstracts;

public abstract class Test {

    public int sum() {
        return a() + b();
    }

    public abstract int a();

    public abstract int b();

}

class SUbtest extends Test {

    @Override
    public int a() {
        return 1;
    }

    @Override
    public int b() {
        return 2;
    }
}


class SUbtest2 extends Test {

    @Override
    public int a() {
        return 2;
    }

    @Override
    public int b() {
        return 2;
    }
}