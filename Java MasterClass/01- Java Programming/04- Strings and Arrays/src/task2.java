/*
 * Java Masterclass
 * Kareem El-Shokary
 * Check if Two Strings are Anagrams
 * */


import java.util.Arrays;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        String firstWord  = getInput();
        String secondWord = getInput();

        checkAnagrams(firstWord, secondWord);
    }

    public static String getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = scan.nextLine();
        return word;
    }

    public static void checkAnagrams(String word1, String word2){
        if(word1.length() != word2.length()){
            System.out.println("Two words are not Anagrams");
            return;
        }

        char[] firstWord  = word1.toLowerCase().toCharArray();
        char[] secondWord = word2.toLowerCase().toCharArray();

        Arrays.sort(firstWord);
        Arrays.sort(secondWord);

        if(firstWord.equals(secondWord)){
            System.out.println("Two words are Anagrams");
        } else {
            System.out.println("Two words are not Anagrams");
        }

    }

}
