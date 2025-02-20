/*
 * Java Masterclass
 * Kareem El-Shokary
 * Remove Duplicate Characters from a string
 * */


import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        //Get a sentence from the user
        String sentence = getInput();
        StringBuilder newSentence = new StringBuilder();

        //Iterate through the string and check for duplicates
        for(int i = 0; i < sentence.length(); i++){

            char specificChar = sentence.charAt(i);
            boolean isDuplicate = false;

            for(int j = 0; j < newSentence.length(); j++){
                if(newSentence.charAt(j) == specificChar){
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate){
                newSentence.append(specificChar);
            }
        }

        System.out.println(newSentence);

    }

    public static String getInput(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String input = scan.nextLine();

        scan.close();
        return input;
    }

}
