/*
 * Java Masterclass
 * Kareem El-Shokary
 * Program to Reverse an Array
 * */


import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {

        int[] array = getInput();
        reverse(array);
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

    public static void reverse(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int swap;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                swap = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = swap;
            }

        }

        System.out.println("Array after reversed: ");
        for(int i : arr){
            System.out.print(i + " ");
        }

    }

}
