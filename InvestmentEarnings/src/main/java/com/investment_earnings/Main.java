package com.investment_earnings;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static private int day = 1;
    static private double buyingPrice;
    static private double closingPrice = 0.0;

    static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        writeBuyingPrice();

        while(true) {
            writeClosingPrice();
            double earnings = closingPrice - buyingPrice;

            if (closingPrice < 0.0) {
                break;
            }

            printEarningsMessage(earnings);
            day+=1;
        }
        scan.close();
    }

    private static void writeBuyingPrice() {
        System.out.println("Enter your buying price per share:");
        buyingPrice = scan.nextDouble();
    }

    private static void writeClosingPrice() {
        String message = String.format("Enter the closing price for day %s (any negative value to leave): ", day);
        System.out.println(message);
        closingPrice = scan.nextDouble();
    }

    private static void printEarningsMessage(double earnings) {
        DecimalFormat df = new DecimalFormat("0.00");

        String earnMessage = String.format("After day %s, you earned %s ", day, df.format(earnings));
        String lostMessage = String.format("After day %s, you lost %s ", day, df.format(earnings));
        String message = String.format("After day %s, you have no earnings ", day);

        if (earnings > 0.0) {
            System.out.println(earnMessage);
        } else if (earnings < 0.0) {
            System.out.println(lostMessage);
        } else {
            System.out.println(message);
        }
    }
}