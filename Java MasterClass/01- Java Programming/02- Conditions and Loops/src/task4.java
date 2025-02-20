/*
 * Java Masterclass
 * Kareem El-Shokary
 * Write a program to classify a number as prime or not using conditional statements
 * */


import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter an Integer: ");
        int number = scan.nextInt();

        boolean isPrime = (number%2 != 0)? true : false;
        System.out.printf("Is " + number + " a prime number? " + isPrime);
    }
}
