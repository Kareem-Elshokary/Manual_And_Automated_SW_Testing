/*
 * Java Masterclass
 * Kareem El-Shokary
 * Reverse Words in a Sentence
 * */


import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Get the sentence
        System.out.println("Enter a sentence: ");
        String sentence = scan.nextLine();

        //Split string's sentence into words
        String[] splitString = sentence.split(" ");

        //reverse the array of words
        StringBuilder revSentence = new StringBuilder();
        for(int i = splitString.length - 1; i >= 0; i--){
            revSentence.append(splitString[i]);
            if( i != 0){    //Add a space
                revSentence.append(" ");
            }
        }

        //Print the output
        System.out.println("Sentence before reverse -> " + sentence);
        System.out.println("Sentence after reverse  -> " + revSentence);
    }

}
