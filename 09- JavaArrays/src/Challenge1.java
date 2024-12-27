import java.util.Arrays;
import java.util.Random;

public class Challenge1 {

    public static void main(String[] args) {

        //Size of the array
        int length = 5;

        int[] arr = getRandomArray(length);

        //Print the random array's values
        System.out.println(Arrays.toString(arr));
        //Print the array after sorted
        System.out.println(Arrays.toString(sortedArray(arr)));
        //Print the array after descending sorted
        System.out.println(Arrays.toString(descendSortArray(arr)));

    }

    public static int[] getRandomArray(int length){

        Random random = new Random();
        int[] randArray = new int[length];

        //Array of randomly generated integers from 0 to 100
        for(int i = 0; i < length; i++){
            randArray[i] = random.nextInt(101);
        }

        return randArray;
    }

    public static int[] sortedArray(int[] array){

        //Get a copy from the origin array
        int[] sortedArray = Arrays.copyOf(array, array.length);

        //Sort array values
        Arrays.sort(sortedArray);

        return sortedArray;
    }

    public static int[] descendSortArray(int[] array){

        //Get a copy from the origin array
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true; int temp;

        while (flag){

            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                //Check for the value of current index if it less than the value of the next index
                if (sortedArray[i] < sortedArray[i+1]){
                    //Avoid loosing current index value
                    temp = sortedArray[i];
                    //Move the next index value to the current index value
                    sortedArray[i] = sortedArray[i+1];
                    //Move the current index value to next index value
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
