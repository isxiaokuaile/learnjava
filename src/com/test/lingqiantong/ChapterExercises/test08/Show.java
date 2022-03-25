package com.test.lingqiantong.ChapterExercises.test08;

public class Show {
    public static void main(String[] args) {
//        ChieckingAccount chieckingAccount = new SavingsAccount(0);
        SavingsAccount savingsAccount = new SavingsAccount(0);
//        chieckingAccount.deposit(200);
//        chieckingAccount.withdraw(100);
        System.out.println( savingsAccount.deposit(900));
        System.out.println(savingsAccount.withdraw(100));
        System.out.println( savingsAccount.deposit(200));
        System.out.println(savingsAccount.withdraw(100));
        System.out.println( savingsAccount.earnMonthlyInterest());
       ;
    }
}
