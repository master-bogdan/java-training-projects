package com.average_stock_price;

public class Main {
    public static void main(String[] args) {
        Stock abcCompany = new Stock(40.0);
        abcCompany.buy(36.6, 2000);
        abcCompany.buy(39.7, 3000);
        abcCompany.sell(42.9, 1000);
        System.out.println(abcCompany.getShares());
        System.out.println(abcCompany.getPrice());
        System.out.println(abcCompany.getAveragePrice());
    }
}