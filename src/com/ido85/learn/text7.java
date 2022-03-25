package com.ido85.learn;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
/**
 * 嵌套循环的练习
 * */
public class text7 {
    public static void main(String[] args) {
//      for (int i=1;i<=1000;i++){
//          int j=(int)(Math.random()*100+1);
////          System.out.println(j);
//          if (j==97){
//              System.out.println("得到97了"+i);
//              break;
//          }
//      }
//1-100以内的随机数求和，第一次大于130的数
//        for (int i=1;i<=100;i++){
//            int k1=(int)(Math.random()*100+1);  //1-100的随机数1
//            int k2=(int)(Math.random()*100+1);   //1-100的随机数2
//            int sum=k1+k2;
//            if (sum>130){
//                System.out.println(sum+"大于20了  "+i);
//                break;
//            }
//        }System.out.println("结束for循环");

//        Scanner myScanner=new Scanner(System.in);
//        System.out.println("请输入用户名");
//        String name= myScanner.next();
//        int mima=myScanner.nextInt();
        String name= "丁真";
        int mima=666;
        int cishu=3;
        for (int i=1;i<=cishu;i++){
            if (name=="丁真"){
                System.out.println("用户名输入正确");
            if (mima==666){
                System.out.println("密码输入正确,登录成功");
                break;
            }else {
                System.out.println("密码输入错误，请重新输入，剩余输入次数为"+(cishu-i));
            }
        }else {
                System.out.println("用户名输入错误，请重新输入,剩余输入次数为"+(cishu-i));
            }
            if (cishu-i==0){
                System.out.println(cishu+"次机会已用尽，请明天再来");
            }

        }

    }
}
