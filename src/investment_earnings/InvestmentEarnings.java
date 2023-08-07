package investment_earnings;

import java.util.Scanner;

public class InvestmentEarnings {
    static private final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double buyingPrice = getPricePerShare();
    }

    private static double getPricePerShare() {
        String pricePerShareMessage = "Enter your buying price per share:";
        System.out.println(pricePerShareMessage);

        double buyingPrice;
        buyingPrice = scan.nextDouble();

        scan.close();

        return buyingPrice;
    }
}
