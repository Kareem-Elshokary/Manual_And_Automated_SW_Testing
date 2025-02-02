public class Arrays {

    public static void main(String[] args) {

        /*
        Array: is an object that hold multiple values in a single variable in a sequential way
        */
        int[] myArray = new int[5];
        int[] array = {10, 20, 30, 40, 50};


        //Accessing & iterating through an array
        int value = 10;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = value++;
        }

        for (int i : myArray){
            System.out.println(i);
        }


        //Multidimensional arrays
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        for (int[] i : matrix){
            for (int j : i){
                System.out.println(j);
            }
        }


    }

}
