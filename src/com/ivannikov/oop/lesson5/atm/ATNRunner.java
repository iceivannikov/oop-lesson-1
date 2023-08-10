package com.ivannikov.lesson5.atm;

public class ATNRunner {
    public static void main(String[] args) {
        ATM atm = new ATM(60, 30, 10);
        int amountOfMoneyInAnATM = atm.amountOfMoneyInAnATM();
        System.out.println(amountOfMoneyInAnATM);
        boolean b = atm.cashWithdrawal(2680);
        atm.addToATM(10,10,1);
        System.out.println(b);
    }
}
