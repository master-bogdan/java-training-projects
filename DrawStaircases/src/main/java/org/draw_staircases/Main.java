package org.draw_staircases;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number of steps:");
        int numSteps = scan.nextInt();
        System.out.println("Enter step width:");
        int stepWidth = scan.nextInt();
        scan.close();

        Staircase staircase = new Staircase(numSteps, stepWidth);
        staircase.drawStaircase();
    }
}