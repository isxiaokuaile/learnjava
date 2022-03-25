package com.test.lingqiantong.ChapterExercises.test08;

/**
 * 父类，员工类
 */
public class BankAccount {
    private double balance;  //余额
    public BankAccount(double initialBalance) {  //初始余额
        this.balance = initialBalance;
    }

    public double deposit(double amount) {  //定金    数量
       return balance += amount;
    }

    public double withdraw(double amount) {  //提取   数量
        return balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

/**
 * 存取款手续费
 */
class ChieckingAccount extends BankAccount{   //每次存款和取款都收取1元的手续费
    public double deposit(double amount) {  //定金    数量
         super.deposit(amount);
         this.pay();
         return super.getBalance();
    }

    public double withdraw(double amount) {  //提取   数量
        super.withdraw(amount);
        this.pay();
        return super.getBalance();
    }
    protected void pay(){
        if(shouldCut()){
            super.setBalance(super.getBalance()-1);   //扣除手续费的方法
        }
    }

    // 是否扣除 true 扣除
    protected boolean shouldCut(){
        return true;
    }

    public ChieckingAccount(double initialBalance) {
        super(initialBalance);
    }
}

/**
 * 利息，存取款前三次免费
 */
class SavingsAccount extends  ChieckingAccount{
    int cut=0;  //次数
    protected boolean shouldCut(){
        if (cut>=3){
        return true;
        }else {
            cut++;
            return false;
        }
    }
    public double earnMonthlyInterest(){  //利息
      return   super.getBalance()*0.03;
    }

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
}