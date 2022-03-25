package com.ido85.learn;

import java.util.Random;
/****
 * 老孙给的练习
 */

public class text13 {
    public static void main(String[] args) {
        //克隆对象的练习
//        Cat gouzi=new Cat();
//        gouzi.eat();    //调用eat这个方法
//        System.out.println("第一次调用"+gouzi.getWeight());
//        gouzi.eat();   //在此调用
//        System.out.println("第二次调用"+gouzi.getWeight());  //输出体重的值
//        System.out.println(gouzi.getGender());//没调用变性方法之前的性别
//        gouzi.genderChange();
//        System.out.println(gouzi.getGender());//调用变性方法之后的性别
//        gouzi.genderChange();
//        System.out.println(gouzi.getGender());//测试变性方法的正确定
//        System.out.println("调用变性方法之前的性别 "+gouzi.getGender());
//        gouzi.genderSpecifyChange("1");   //调用指定性别的变性方法
//        System.out.println("调用变性方法之后的性别 "+gouzi.getGender());
//        gouzi.colorChange();    //调用改变颜色的方法
//        System.out.println(gouzi.getColor());   //显示颜色
//        Cat gou2=new Cat();
        //猫配对练习
        Cat cat1 = new Cat(); //公猫
        Cat cat2 = new Cat();//母猫
        cat1.color="蓝白";
        cat2.color="橘黄";
        cat1.weight=10;
        cat2.weight=20;
        cat1.age=3;
        cat2.age=4;
        cat1.gender="公猫";
        cat2.gender="母猫";
        Cat cat3=cat1.newCat(cat2);  //cat3用来接收newCat的返回值
        System.out.println(cat3.color+" "+cat3.weight+" "+cat3.gender+" "+cat3.age);
    }
}
class Cat {
    String color;
    String gender ;  //性别初始值为0，男性
    int weight;
    int age;
    public Cat newCat(Cat c) {  //配对的方法
        Cat catOne=new Cat();
        String[] cols={c.color,color};  //公猫母猫颜色的数组
        int indexColor=new Random().nextInt(cols.length);//下标的随机数
        catOne.color=cols[indexColor];  //新猫的颜色
        catOne.weight=(c.weight+weight)/2;  //新猫的体重
        catOne.age=0;  //新猫的年龄
        String[] genders={c.gender,gender};
        int indexGender=new Random().nextInt(genders.length);
        catOne.gender=genders[indexGender];  //新猫的性别，随机
        return catOne;
    }


//    public int getWeight(){   //得到具体的体重，体重是私有的值
//        return weight;
//    }
//    public String getGender(){  //得到具体的性别
//        return  gender;
//    }
//    public String getColor(){
//        return color;
//    }
//
//    public void eat(){   //每调用一次体重加一
//        weight++;
//    }
//    public void genderChange(){  //没调用一次这个变性方法，性别就会转换
//        if (gender.equals("0")){  //默认0是性别男
//            gender="1";
//        }else {
//            gender="0";
//        }
//    }
//    public void genderSpecifyChange(String changeGender){
//        if (changeGender.equals("0")){   //用户指定性别的变性方法
//            gender="0";
//        }else if (changeGender.equals("1")){
//            gender="1";
//        }
//    }
//    public void colorChange(){   //每调用一次，颜色在规定的集合范围内随机取值
//        String[] colors={"红","黄","蓝","绿"};   //颜色范围的数组
//        int index=new Random().nextInt(colors.length-1);   //数组下标的随机数
//        color=colors[index];   //从数组中随机取一个颜色
//
//    }
//
//    public void colorSpecifyChange(String[] colorcc){  //用户输入一组颜色
//    }
}