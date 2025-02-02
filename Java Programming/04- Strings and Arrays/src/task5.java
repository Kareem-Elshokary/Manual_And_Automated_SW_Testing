/*
 * Java Masterclass
 * Kareem El-Shokary
 * Find All Permutations of a String
 * */


import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        String words = getInput();
        System.out.println("All permutations of \'" + words + "\' are ");
        findPermutations(words, "");
    }

    public static String getInput(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter characters: ");
        String input = scan.nextLine();

        scan.close();
        return input;
    }

    public static void findPermutations(String sentence, String result){

        if(sentence.isEmpty() || sentence.length() < 1){
            System.out.println(sentence);
            return;
        }


        for (int i = 0; i < sentence.length(); i++) {
            // Fix one character at index i
            char fixedChar = sentence.charAt(i);

            // Create a new string excluding the fixed character
            String remaining = sentence.substring(0, i) + sentence.substring(i + 1);

            // Recursive call with the remaining string
            findPermutations(remaining, result + fixedChar);
        }

    }
}
