/*
 * Java Masterclass
 * Kareem El-Shokary
 * Program to Remove Duplicates from an Array
 * */


import java.util.Scanner;

public class task8 {

    public static void main(String[] args) {

        int[] array = getInput();
    }

    public static int[] getInput(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();

        int[] inputArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Enter %d element:  \n",i+1);
            inputArray[i] = scan.nextInt();
        }

        scan.close();
        return inputArray;
    }

    public static void removeDuplicate(int[] arr){
        
    }

}
