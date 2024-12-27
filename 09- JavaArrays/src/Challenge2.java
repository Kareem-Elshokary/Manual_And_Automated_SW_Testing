import java.util.Arrays;
import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {

        int[] array = getInput();
        System.out.println("The min value = " + minValue(array));

    }

    public static int[] getInput(){

        Scanner input = new Scanner(System.in);

        //Get the size of the array
        System.out.println("Enter an array of integers, separated by comma:  ");
        String array = input.nextLine();

        //Get array values
        String[] splitsArray = array.split(",");        //Split string array values
        int[] userArray = new int[splitsArray.length];        //Determine the size of the array
        for (int i = 0; i < userArray.length; i++) {          //Assign each value to the corresponding index
            userArray[i] = Integer.parseInt(splitsArray[i]);
        }

        //Print the array
        System.out.println("Array = " + Arrays.toString(userArray));

        return userArray;
    }

    public static int minValue(int[] array){

        int[] copyArray = Arrays.copyOf(array,array.length);
        Arrays.sort(array);

        return array[0];
    }

}
