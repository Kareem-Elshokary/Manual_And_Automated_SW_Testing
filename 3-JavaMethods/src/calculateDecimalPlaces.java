/*
 * Java Masterclass
 * Author: Kareem Abdelkader
 * */

public class calculateDecimalPlaces {

    public static void main(String[] args) {

        boolean result = areEqualByThreeDecimalPlaces(3.555, 3.555);
        System.out.println(result);
    }

    public static boolean areEqualByThreeDecimalPlaces (double numOne, double numTwo){

        // Cast to convert from real to integer
        return  (((int) (numOne * 1000)) == ((int) (numTwo * 1000)));
    }
}
