package com.ido85.learn;

import java.util.Scanner;

public class text9 {
    public static void main(String[] args) {
        //练习数组
//        double[] scores=new double[5];
//        Scanner myScanner=new Scanner(System.in);
//        for (int i=0;i<scores.length;i++){
//            System.out.println("请输入第"+(i+1)+"个数：");
//            scores[i]=myScanner.nextDouble();
//
//        }
//        for (int i=0;i<scores.length;i++){
//            System.out.println("第"+(i+1)+"个数为："+scores[i]);
//        }
//第一题，打印大写的A-Z
//        char[] scores=new char[26];
//        for (char i=0;i<scores.length;i++){
//            scores[i]=(char)('A'+i);
//        } System.out.println(scores);

        //第二题，求出数组的最大值，并得到相应的下标
//        int[] scores={4,-1,9,10,23,2};
//        int big=scores[0];
//        int maxIndex=0;
//        for (int i = 1; i < scores.length ; i++) {
//          if (big<scores[i]){
//              big=scores[i];
//              maxIndex=i;
//          }
//        } System.out.println("数组的最大值为："+big+"，下标为："+maxIndex);

//第3题，求出一个数组和的平均值
//        int[] scores={4,-1,9,10,23};
//        int sum=0;
//        for (int i = 0; i < scores.length; i++) {
//            sum+=scores[i];
//        }
//        System.out.println("数组的和为："+sum+",数组的平均值为："+(sum/scores.length));

//        int[] arr1={10,20,30};
//        int[] arr2=new int[arr1.length];
//        for (int i = 0; i < arr2.length; i++) {
//            int index=arr1.length-(i+1);
//            arr2[i] = arr1[index];
//            System.out.println(arr2[i]);
//        }
//        int[] arr={1,2,3};   //第一个数组
//        int[] arr1=new int[arr.length+1];   //定义一个新的数组
//        for (int i = 0; i < arr.length; i++) {
//            arr1[i]=arr[i];
//        }
//        arr1[arr.length]=4;
//        arr=arr1;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//用户动态输入数组，y表示继续输入，n表示不输入
//        Scanner myScanner=new Scanner(System.in);
//        int[] arr={1,2,3};
//        int[] newArr=new int[arr.length+1];
//        do {
//            for (int i = 0; i < arr.length; i++) {
//                newArr[i] = arr[i];   //拷贝数组
//            }
//            System.out.println("请输入要添加的数字：");
//            newArr[newArr.length - 1] = myScanner.nextInt();  //添加元素
//            System.out.print("新数组为：");
//            for (int i = 0; i < newArr.length; i++) {
//                System.out.print( newArr[i]+" ");
//            }System.out.println("是否还要添加数字？y-添加/n-不添加");
//            char key=myScanner.next().charAt(0);
//            if (key=='n'){
//                break;
//            }
//        }while (true);
//        System.out.println("结束输入");
//数组元素的缩减，数组只剩最后一个元素时提示不能缩减了
        Scanner myScanner=new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        int[] newArr=new int[arr.length];
        int index= newArr.length;
        do {
            System.out.println("是否要进行数组缩减？   请输入是/否");
            String key=myScanner.next().toString();
            if (key.equals("否")){
                break;
            }
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            System.out.println("数组为：");

            for (int i = 0; i < index-1; i++) {
                System.out.print(newArr[i]+" ");
            }
            index-=1;
            System.out.println("下次缩减数组的最后一位 "+newArr[index-1]);
            if (index==1){
                System.out.println("数组仅剩最后一位，不能再缩减");
                break;
            }
        }while (true);
        System.out.println("输入结束啦");
    }
}
