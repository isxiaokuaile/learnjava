package com.ido85.learn;
/****
 * 奇数类的练习
 */
public class text14 {
    public static void main(String[] args) {
//        AA aa=new AA();
////        aa.judgeOdd(14);
//        if (aa.judgeOdd(1)){
//            System.out.println("奇数");
//        }else{
//            System.out.println("偶数");
//        }
//        fibonacci fibonacci=new fibonacci();
////        fibonacci.amount(5);
//        System.out.println(fibonacci.amount(5));
        Person p1=new Person("小明",10);
        Person p2=new Person("小华",20);
        System.out.println(p1.compareTo(p2));

    }
}
class AA{
    public static boolean judgeOdd(int odd){
        //方法一：最直接最基础的方法
//        if (odd%2!=0){
//            return true;
//        }else {
//            return false;
//        }
        //方法二：三元运算符
//        return odd%2!=0?true:false;
        //方法三：最简单的方法，以后常用
        return odd%2!=0;
    }
}
//class fibonacci{
//    public int amount(int n){
//        int sum=0;
//        if (n>=3){
//          return   amount(n-1+n)+;
//        }else{
//            sum+=n;
//            return sum;
//            System.out.println(sum);
//        }
//    }
//}
class Person {
    String name;
    int age;

    public Person(String name, int age) { //构造器
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Person p) {  //比较类
        return this.name.equals(p.name) && this.age == p.age;
    }
}