/*
 * Java Masterclass
 * Kareem El-Shokary
 * Create a program to classify a character entered by the user as a vowel,
        consonant, digit, or special symbol
 * */


import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char character = scan.nextLine().toLowerCase().charAt(0);

        if(character >= 'a' && character <= 'z'){
            if(character=='a' || character=='e' || character=='i' || character=='o' || character=='u'){
                System.out.println(character + " is a vowel character");
            } else {
                System.out.println(character + " is a consonant character");
            }
        }
        else if(character >= '0' && character <= '9'){
            System.out.println(character + " is a digit");
        }
        else {
            System.out.println(character + " is a special character");
        }


    }

}
