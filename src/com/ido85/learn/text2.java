package com.ido85.learn;
/**
 * 重载的练习，比较大小的写法，可变参数的练习
 * */
public class text2 {
    public static void main(String[] args) {
//        myCalculator myCalculator=new myCalculator();
////        System.out.println(myCalculator.calculate(1,2)+" "+myCalculator.calculate(1,1.1)+" "
////                + myCalculator.calculate(1.2,1)+" "+ myCalculator.calculate(1,2,3));
//        System.out.println(myCalculator.calculate(1,2));
//        Methods Methods=new Methods();
//        System.out.println(Methods.m(2));
//        System.out.println(Methods.m(1,2));
//        System.out.println(Methods.m("最后一个"));
//        Methods Methods=new Methods();
//        System.out.println(Methods.max(1,2));
//        System.out.println(Methods.max(2.5,3.1));
//        System.out.println(Methods.max(1.1,2.2,3.3));
//        System.out.println(Methods.max(1.1,4.4,3.3));
        HspMethod HspMethod=new HspMethod();
        System.out.println(HspMethod.showScore("小明",90,100));
        System.out.println(HspMethod.showScore("小华",90,100,200));
    }
}
class HspMethod{  //计算一个同学，n门成绩的和
    public String showScore(String name,double...nums){
        double sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        return name+"同学,"+nums.length+"门成绩总和为："+sum;
    }
}

//class myCalculator{
//    public int calculate(int n1,int n2){  //计算两个整数的和
//        return n1+n2;
//    }
//    public double calculate(int n1,double n2){  //计算一个整数，一个小数的和
//        return n1+n2;
//    }
//    public double calculate(double n1,int n2){  //计算一个整数，一个小数的和
//        return n1+n2;
//    }
//    public int calculate(int n1,int n2,int n3){  //计算三个整数的和
//        return n1+n2+n3;
//    }
//}

//class Methods{
//    public int m(int n1){
//        return n1*n1;
//    }
//    public int m(int n1,int n2){
//        return n1*n2;
//    }
//    public String m(String n1){
//        return n1;
//    }
//}
//class Methods{
//    public int max(int n1,int n2){
//        if (n1>n2){
//            return n1;
//        }else {
//            return n2;
//        }
//    }
//    public double max(double n1,double n2){
//      return Math.max(n1, n2);
//    }
//    public double max(double n1,double n2,double n3){
////        if (n1>n2&&n1>n3){
////            return n1;
////        }else if (n2>n3){
////            return n2;
////        }else {
////            return n3;
////        }
//        double max1=n1>n2?n1:n2;
//        return max1>n3?max1:n3;   //比较大小的另一种写法
//    }
//}