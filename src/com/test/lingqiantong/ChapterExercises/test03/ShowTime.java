package com.test.lingqiantong.ChapterExercises.test03;

/**
 * 这个类不知道怎么调用
 */
public class ShowTime {
    public static void main(String[] args) {
        Teacher teacher = new Professor("jack",38,"教授",8000);
//        Test test = new Test();
//        test.FindOne(teacher);
        System.out.println(teacher.introduce());

    }
}
//class Test{
//    public void FindOne(Teacher t){
//        ShowTime showTime=new ShowTime();
//        if (t.getPost().equals("教授")){
//
//        }
//    }



//}
