package com.ido85.learn;

import java.util.Arrays;

/***  练习题
 *
 * */

public class text15 {
    //1.求一个数组的最大值
    public static void main(String[] args) {
//    A01 a01=new A01();
//    double[] dmax={1.1,20.1,2.2,5.1};
//    a01.max(dmax);
//        System.out.println("数组的最大值为："+a01.max(dmax));
    //2.实现字符串中元素的查找，并返回索引
//        String[] dmax={"小明","小花"};
//        A02 a02=new A02();
//        System.out.println(a02.find(dmax,"小明"));
//3.更改某本书的价格，如果价格大于150则等于150，如果>100则等于100
//        Book book=new Book();
//        book.updatePrice(-1);
//        System.out.println(book.price);
//4.实现数组的复制，输入旧数组返回新数组
//        A03 a03=new A03();
//        int[] arr={1,2,3};
//        a03.copyArr(arr);
//        System.out.println(Arrays.toString(a03.newArr));
        //5.算圆的周长和半径
//        Circle Circle=new Circle();
//        Circle.getArea(2);
//        Circle.getPerimeter(3);
//        System.out.println("面积是："+Circle.area+" 周长是："+Circle.perimeter);
        //6.
//        Dog dog=new Dog("大黄");
//        dog.show();
       PassObjet p=new PassObjet();
       Circle c=new Circle();
        p.printAreas(c,5);
    }
}
class Circle{
    double radius;  //半径
    public double findArea(){  //计算圆的面积
        return Math.PI*radius*radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
}
class PassObjet{
    public void printAreas(Circle c,int times){
        for (int i = 1; i <= times; i++) {
          c.setRadius(i);
            System.out.println((double)i+"\t"+c.findArea());
        }
    }
}
//class Dog{
//    int age;
//    String color;
//    String name;
//    public Dog(String d){
//        this.name=d;
//    }
//    public void show(){
//        System.out.println("name="+this.name);
//    }
//}
//class Circle{
//    double perimeter;  //周长
//    double area;       //面积
//    int radius;  //半径
//    double pai=3.141;
//    public void getPerimeter(int n1){  //周长公式  2πr
//        perimeter=2*pai*n1;
//    }
//    public void getArea(int n1){  //面积公式  πr²
//        area=pai*n1*n1;
//    }
//}
//class A03{
//    int[] newArr;
//    public void copyArr(int[] oldArr){
//        newArr=new int[oldArr.length];
//        for (int i = 0; i <oldArr.length ; i++) {
//            newArr[i]=oldArr[i];
//            System.out.println("这是一个新数组");
//        }
//    }
//}
//class Book{
//        double price;
//    public void updatePrice(double arr){
//        if (arr<0){
//            System.out.println("输入错误，请重新输入");
//            return;
//        }
//        if (arr-150.0>=0){
//            price=150.0;
//        }else if (arr-150.0<0&&arr-100.0>=0){
//            price=100.0;
//        }
//    }
//}
//class A01{
//    //1.求数组的最大值
//    public double max(double[] arr ){
//        double maxs=arr[0];  //最大值
//        for (int i = 1; i < arr.length; i++) {  //遍历数组求最大值
//            if (maxs<arr[i]){
//                maxs=arr[i];
//            }
//        }
//        return maxs;
//    }
//}
//class A02{
//    public int find(String[] arr,String str){
//        int index=0;
//        for (int i = 0; i < arr.length; i++) {  //遍历数组
//            if (arr[i].equals(str)){
//                System.out.println("找到元素");
//                index+=i;
//                return index;
//            }else{
//                System.out.println("没有找到元素");
//                return -1;
//            }
//        }
//        return index;
//    }
//}
