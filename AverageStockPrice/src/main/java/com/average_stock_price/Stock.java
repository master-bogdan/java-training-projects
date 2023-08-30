package com.average_stock_price;

interface IStock {
    public void buy(double pricePerShare, int amount);

    public void sell(double pricePerShare, int amount);

    public int getShares();
    public double getPrice();
    public double getAveragePrice();
}

public class Stock implements IStock {
    private int shares;
    private double price;
    private double capital;

    public Stock(double price) {
        this.price = price;
        this.shares = 0;
        this.capital = 0;
    }
    @Override
    public void buy(double pricePerShare, int amount) {
        shares += amount;
        price = pricePerShare;
        capital += amount * pricePerShare;
    }

    @Override
    public void sell(double pricePerShare, int amount) {
        shares -= amount;
        price = pricePerShare;
        capital -= amount * pricePerShare;
    }

    @Override
    public int getShares() {
        return shares;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getAveragePrice() {
        return capital / getShares();
    }
}
