package com.ido85.learn;

public class text6 {
    public static void main(String[] args) {
        //for循环的练习
        //打印实心金字塔
//        for (int i=1;i<=5;i++){    //行数
//            for (int k=1;k<=5-i;k++){    //前面的空格数
//                System.out.print(" ");
//            }
//            for (int j=1;j<=(2*i-1);j++){   //列数
//                System.out.print("*");
//            } System.out.println("");
//        }

//        int maxh=20;
//        for (int i=1;i<=maxh;i++){
//            for (int k=1;k<=maxh-i;k++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=(2*i-1);j++){
//                if (j==1||j==2*i-1||i==maxh){   //j为列数
//                    System.out.print("*");
//                }else{
//                System.out.print(" ");
//            }
//            }
//            System.out.println("");
//
//        }
        int maxh=5;  //五行
        for (int i=1;i<=maxh;i++){
            for (int k=1;k<=maxh-i;k++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i-1);j++){
                if (j==1||j==2*i-1||i==(maxh/2+1)){
                    if (i>(maxh/2+1)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }else {
                System.out.print(" ");
            }
            }
            System.out.println("");
        }



        //打印非实心金字塔
//        for (int i=1;i<=5;i++){    //行数
//            for (int k=1;k<=5-i;k++){    //前面的空格数
//                System.out.print(" ");
//            }
//            for (int j=1;j<=(2*i-1);j++){//列数
//                if(j!=1&&j!=(2*i-1)){  //行数除了第一位和最后一位输出星号，其他都输出空格
//                    if (i==5){   //第五行全部输出
//                        System.out.print("*");
//                    }else {
//                    System.out.print(" ");
//                    }
//                }else{
//                System.out.print("*");}
//            } System.out.println("");
//        }




    }
}
