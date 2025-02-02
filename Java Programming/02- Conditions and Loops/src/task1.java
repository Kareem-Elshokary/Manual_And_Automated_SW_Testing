/*
 * Java Masterclass
 * Kareem El-Shokary
 * Write a program to check if a year is a leap year or not
 * */


import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the year to check: ");
        int year = scan.nextInt();

        if( year <= 0 || year > 2025 ){              //Check for invalid inputs
            System.out.println("Invalid Input");
        } else {
            //Leap year divisible by 4 but not by 100
            if(year % 4 == 0 && year % 100 != 0){
                System.out.println(year + " is a leap year");
            }
            //Leap year divisible by 100 and by 400
            else if (year % 100 == 0 && year % 400 == 0) {
                System.out.println(year + " is a leap year");
            }
            else {
                System.out.println(year + " is not a leap year");
            }
        }

    }
}
