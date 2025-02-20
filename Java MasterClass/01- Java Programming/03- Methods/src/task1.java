/*
 * Java Masterclass
 * Kareem El-Shokary
 * A method that accepts a number and returns its reverse
 * */


import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter an Integer Number:  \n");
        int number = scan.nextInt();

        System.out.println(reverseNumber(number));
    }

    public static int reverseNumber(int number){
        int remNumber, revNumber = 0;

        while (number != 0){
            remNumber = number % 10;
            revNumber = (revNumber * 10) + remNumber;
            number /= 10;
        }

        return revNumber;
    }
}
