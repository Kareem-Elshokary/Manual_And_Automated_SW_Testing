/*
 * Java Masterclass
 * Kareem El-Shokary
 * Create a program that converts an integer into binary, octal, and hexadecimal formats
 * */

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Get the value
        System.out.println("Enter the decimal number: ");
        int decimalNUM = scan.nextInt();

        String binaryVAL = Integer.toBinaryString(decimalNUM);  //Convert into binary
        String octalVAL  = Integer.toOctalString(decimalNUM);   //Convert into octal
        String HexaVAL   = Integer.toHexString(decimalNUM);     //Convert into hexadecimal

        System.out.println("Binary = " + binaryVAL +"\n"+
                "Octal  = " + octalVAL +"\n"+
                "Hexa   = " + HexaVAL);
    }
}
