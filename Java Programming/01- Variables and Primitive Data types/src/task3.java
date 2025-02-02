/*
 * Java Masterclass
 * Kareem El-Shokary
 * Create a program to calculate the compound interest. Take principal, rate of interest, and time (years) as input
 * */

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the initial amount: ");
        double initialAmount = scan.nextDouble();

        System.out.println("Enter the annual interest rate (in %): ");
        double interestRate = scan.nextDouble() / 100;

        System.out.println("Enter the number of years: ");
        int numberOfYears = scan.nextInt();

        System.out.println("Enter Number of Compounding Periods per Year: ");
        int noOfCompoundedInterest = scan.nextInt();

        // Final Amount (A) = P * (1 + r/n) ^ n*t
        double finalAmount = initialAmount * Math.pow((1+ interestRate/noOfCompoundedInterest),numberOfYears*noOfCompoundedInterest);

        System.out.println("Final amount = " + finalAmount);
    }
}
