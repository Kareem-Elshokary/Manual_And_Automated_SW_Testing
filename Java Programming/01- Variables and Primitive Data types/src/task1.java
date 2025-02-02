/*
* Java Masterclass
* Kareem El-Shokary
* A program to calculate the BMI (Body Mass Index) based on user input for weight (kg) and height (m)
* */

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Get the weight
        System.out.println("Enter your weight: ");
        double weightVAR = scan.nextDouble();

        //Get the height
        System.out.println("Enter your height: ");
        double heightVAR = scan.nextDouble();

        double height = heightVAR / 100;         //Convert height from cm to m
        double BMI = weightVAR / (height*2);     //Calculate the BMI

        System.out.println("BMI = " + BMI);
    }
}
