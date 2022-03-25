package com.ido85.Super01;

public class testPersom {
    public static void main(String[] args) {
        Student student = new Student("小华",15,101,89.8);
        Person person = new Person("小明",12);
//        person.setName("小明");
//        person.setAge(18);
//        student.setId(101);
//        student.setScore(98.8);
////        person.say();
//        student.say();
        System.out.println(person.say());
        System.out.println(student.say());
    }
}
