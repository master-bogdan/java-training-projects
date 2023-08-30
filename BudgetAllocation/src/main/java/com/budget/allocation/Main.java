package com.budget.allocation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static double total;
    private static double sum;
    private static int index = 0;

    private static final ArrayList<Double> proportion = new ArrayList<>();

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        setSpend();
        System.out.println("Enter your proportion of various expenses.");
        System.out.println("The system stops if cumulative proportion exceeds 100%");
        setProportions();
        scan.close();
        printProportions();
    }

    private static void setSpend() {
        System.out.println("How much can you spend?");
        total = scan.nextDouble();
    }

    private static void setProportions() {
        do {
            System.out.println("Your proportion of expense " + (index + 1) + ":");
            double value = scan.nextDouble();
            proportion.add(value);
            sum += proportion.get(index);
            index++;
        } while (sum <= 100);

        if (sum > 100) {
            double cumulativeSum = 0.0;
            for (int k = 0; k < proportion.size() - 1; k++) {
                cumulativeSum += proportion.get(k);
            }
            proportion.set(proportion.size() - 1,  100.0 - cumulativeSum);
        }
    }

    private static void printProportions() {
        for (double value : proportion) {
            double expense = value * total / 100.0;
            System.out.println("Your " + value + "% equals $" + expense);
        }
    }
}