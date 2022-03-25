package com.ido85.Extend;
//子类
public class Sub extends Base{
//    Sub sub=new Sub();
    public Sub() {  //构造器
        System.out.println("Sub()...");
    }
    public void sayOk(){
        System.out.println(n1+"+"+n2+"+"+n3+"+"+getN4());
        test100();
        test200();
        test300();
        callTest400();
    }
}
