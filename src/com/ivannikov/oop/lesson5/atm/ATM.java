package com.ivannikov.lesson5.atm;

public class ATM {
    public static final int FIFTY_DENOMINATION_OF_THE_BILL = 50;
    public static final int TWENTY_DENOMINATION_OF_THE_BILL = 20;
    public static final int TEN_DENOMINATION_OF_THE_BILL = 10;
    private int fifty; //шт
    private int twenty; //шт
    private int ten; //шт

    public ATM(int fifty, int twenty, int ten) {
        this.fifty = fifty;
        this.twenty = twenty;
        this.ten = ten;
    }

    public void addToATM(int fifty, int twenty, int ten) {
        System.out.println("Ваш баланс пополнен на " +
                (fifty * FIFTY_DENOMINATION_OF_THE_BILL +
                twenty * TWENTY_DENOMINATION_OF_THE_BILL +
                ten * TEN_DENOMINATION_OF_THE_BILL));
    }

    public boolean cashWithdrawal(int sum) { //1000р
        if (sum <= amountOfMoneyInAnATM()) {
            int cash50Rub = sum / FIFTY_DENOMINATION_OF_THE_BILL;
            int balanceAfterIssuanceOf50Rubles = sum - cash50Rub * FIFTY_DENOMINATION_OF_THE_BILL;
            int cash20Rub = balanceAfterIssuanceOf50Rubles / TWENTY_DENOMINATION_OF_THE_BILL;
            int balanceAfterIssuanceOf20Rubles = balanceAfterIssuanceOf50Rubles - cash20Rub*TWENTY_DENOMINATION_OF_THE_BILL;
            int cash10Rub = balanceAfterIssuanceOf20Rubles / TEN_DENOMINATION_OF_THE_BILL;

            System.out.println("Банкомат выдал "
                    + cash50Rub + " купюр по " + FIFTY_DENOMINATION_OF_THE_BILL + " рублей "
                    + cash20Rub + " купюр по " + TWENTY_DENOMINATION_OF_THE_BILL + " рублей "
                    + cash10Rub + " купюр по " + TEN_DENOMINATION_OF_THE_BILL + " рублей");
            return true;
        }
        System.out.println("В банкомате не достаточно средств");
        return false;
    }

    public int amountOfMoneyInAnATM() {
        return fifty * FIFTY_DENOMINATION_OF_THE_BILL +
                twenty * TWENTY_DENOMINATION_OF_THE_BILL +
                ten * TEN_DENOMINATION_OF_THE_BILL;
    }

    public int getFifty() {
        return fifty;
    }

    public void setFifty(int fifty) {
        this.fifty = fifty;
    }

    public int getTwenty() {
        return twenty;
    }

    public void setTwenty(int twenty) {
        this.twenty = twenty;
    }

    public int getTen() {
        return ten;
    }

    public void setTen(int ten) {
        this.ten = ten;
    }
}
