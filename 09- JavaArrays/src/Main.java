/*
 * Java Masterclass
 * Description: Java Arrays
 * Author     : Kareem Abdelkader
 * */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Init arrays
        int[]    myIntArray = {1,2,3,4,5};
        double[] myDoubleArray = {2.5,5.36,8.88};
        String[] myStringArray = {"Text1", "Text2"};

        System.out.println("myIntegerArray length = " + myIntArray.length);
        for(int i = 0; i < myIntArray.length; i++){
            System.out.printf("e[%d]: %d ",i,myIntArray[i]);
        }

        System.out.println("");
        System.out.println("-----------------------------------------");

        getArray();

    }

    public static void getArray(){

        // Init array with size of 10 elements
        int[] userArray = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 integer elements...");
        for(int i = 0; i < userArray.length; i++){      //Get values from console
            System.out.printf("e[%d]: \n", i+1);
            userArray[i] = input.nextInt();
        }

        System.out.println("Your integers: ");
        for(int i = 0; i < userArray.length; i++){      //Print user array
            System.out.printf("e[%d]: %d ",i+1,userArray[i]);
        }
    }

}
