/*
 * Java Masterclass
 * Kareem El-Shokary
 * Implement a currency converter that converts from one currency to another using predefined conversion rates
 * */

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Get the amount
        System.out.println("Enter the amount of currency (in EGP): ");
        double currencyAmount = scan.nextDouble();

        double USD = currencyAmount / 50;
        double EUR = currencyAmount / 52.26;
        double GBP = currencyAmount / 61.98;
        double CHF = currencyAmount / 55.3156;
        double SAR = currencyAmount / 13;

        System.out.println("Your amount in USD = " + USD);
        System.out.println("Your amount in EUR = " + EUR);
        System.out.println("Your amount in GBP = " + GBP);
        System.out.println("Your amount in CHF = " + CHF);
        System.out.println("Your amount in SAR = " + SAR);
    }
}
