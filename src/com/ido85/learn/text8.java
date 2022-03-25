package com.ido85.learn;
/***
 * 嵌套循环的练习
 */

public class text8 {
    public static void main(String[] args) {
        //第一题，10万块钱能过几次路口
//        double i=100000;    //i表示钱
//        int j=0;         //j表示经过路口的次数
//        while (i>50000){
//            i=i-i*0.05;    //计算剩余的钱
//            j++;
//            System.out.println("剩余"+i+"钱，第"+j+"次经过路口");
//        }
//        while (i<=50000){
//            i=i-1000;
//            j++;
//            System.out.println("剩余"+i+"钱，第"+j+"次经过路口");
//            if (i<1000){
//                break;
//            }
//
//        }
        //第二题，判断一个整数属于哪个范围：大于0，小于0，等于0；
//        int i=0;
//        if (i>0){
//            System.out.println(i+"大于0");
//        }else if (i<0){
//            System.out.println(i+"小于0");
//        }else {
//            System.out.println(i+"等于0");
//        }

        //第三题，判断一个年份是否为闰年
//        int year=3000;
//        if (year%4==0&&year%100!=0||year%400==0){
//            System.out.println(year+"年是闰年");
//        }else {
//            System.out.println(year+"年不是闰年");
//        }

        //第四题，判断一个整数是否是水仙花数，一个三位数，各个位上的数字立方和等于其本身，例如
        //153=1*1*1+3*3*3+5*5*5
//        int i=1;
//        int j=5;
//        int k=3;
//        int sum1=100*i+10*j+k;
//        int sum2=j*j*j+i*i*i+k*k*k;
//        if (sum1==sum2){
//            System.out.println(sum1+"为水仙花数");
//        }else{
//            System.out.println(sum1+"不是水仙花数");
//        }

//        int n=-153;
//        int n1=n/100;
//        int n2=n%100/10;
//        int n3=n%10;
//        if (n<1000&&n>=100) {
//            if (n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == n) {
//                System.out.println(n+"为水仙花数");
//            }else{
//                System.out.println(n+"不是水仙花数");
//            }
//        }else{
//            System.out.println("输入错误，请输入一个三位数数字");
//        }


        //第六题，输出1-100之间不能被五整除的数，每5个一行
//        int count=0;  //统计输出的个数
//        for (int i=1;i<=100;i++){
//           if (i%5!=0){
//               count++;
//               System.out.print(i+" ");
//               if (count==5){
//                   System.out.println("");
//                   count=0;
//               }
//           }
//        }

        //第七题，输出小写的a-z以及大写的Z-A
////        char yi='a';
//        for (char yi='a';yi<='z';yi++){
//            System.out.print(yi+" ");
//        }
//        System.out.println(" ");
//        for (char yi1='Z';yi1>='A';yi1--){
//            System.out.print(yi1+" ");
//        }


        //第八题，求出1-1/2+1/3-1/4......1/100的和
//            double sum1=0;
//            double sum2=0;
//            for (int i=1;i<=100;i++){
//                if (i%2==0){    //偶数
//                    sum1=1.0/i+sum1;
//
//                }else{   //奇数
//                    sum2=1.0/i+sum2;
//                }
//
//            }
//        System.out.println(sum2-sum1);

        //第九题，求1+（1+2）+（1+2+3）+（1+2+3+4）+....+（1+2+3+..+100）的结果
        int sum=0;
        for (int i=1;i<=100;i++){
                for (int j=1;j<=i;j++){
                    sum=j+sum;
                }
            }System.out.println(sum);
    }
}
