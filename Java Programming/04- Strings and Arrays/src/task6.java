/*
 * Java Masterclass
 * Kareem El-Shokary
 * Program to Count Even and Odd Numbers in an Array
 * */


import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {

        int[] array = getInput();
        int evenCount = 0, oddCount = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even number = " + evenCount);
        System.out.println("Odd number = " + oddCount);

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

}
