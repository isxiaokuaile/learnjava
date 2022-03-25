package com.ido85.learn;

public class text1 {
    public static void main(String[] args) {
        //do whil循环的练习
//        int i=1;
//        int sum=1;
//     do {
//         System.out.println(i+"和"+sum);
//         i++;
//         sum=sum+i;
//     }while (i<=100);
//        int i=1;
//        int count=0;
//        do {
//            if (i%5==0 && i%3!=0){
//                count++;
//            }
//            i++;
//        }while (i<=200);
//        System.out.println(count);
        String i="不还钱";
        do {
            System.out.println("老韩问：还钱吗？并使出五连鞭");
            i="";

        }while (i!="不还钱");

        //基本数据类型的练习
        String name1="张三";
        byte age1 =17;
        float chengji=89.1f;
        char xingbie ='男';
        String AIHAO ="唱歌";

        System.out.println("姓名 "+"年龄 "+"成绩 "+"性别 "+"爱好");
        System.out.println(name1+" "+age1+"  "+chengji+" "+xingbie+"  "+AIHAO);
        System.out.println("姓名 年龄 成绩 性别 爱好\n"+name1+" "+age1+"  "+chengji+" "+xingbie+"  "+AIHAO);

    }
}
