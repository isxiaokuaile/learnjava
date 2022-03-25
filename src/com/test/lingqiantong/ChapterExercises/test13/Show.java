package com.test.lingqiantong.ChapterExercises.test13;

public class Show {
    public static void main(String[] args) {
        Student pp1=new Student("小明",15,"男","足球","00023102");
        Teacher pp2=new Teacher("王飞",30,"男","象棋",5);
        System.out.println(pp2.show());
        pp2.teach();
        System.out.println(pp2.play());
        System.out.println("------------------------------");
        System.out.println(pp1.show());
        pp1.study();
        System.out.println(pp1.play());
    }
}
//class  Arr{
//    public void arrList(Person[] p) {
//        int count=0;
//        for (int i = 0; i < p.length; i++) {
//            if (p[i]>p[i+1]){
//                count=p[i+1] ;
//            }else {
//
//            }
//        }
//    }
//}
