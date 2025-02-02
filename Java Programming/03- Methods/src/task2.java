/*
 * Java Masterclass
 * Kareem El-Shokary
 * Implement a recursive method to calculate the factorial of a number
 * */


public class task2 {

    public static void main(String[] args) {

        System.out.println(factorial(4));
    }

    public static int factorial(int number){

        if(number < 0){
            System.out.println("factorial is undefined for negative numbers");
            return 0;
        } else if (number == 0 || number == 1) {
            return 1;
        }


        return number * factorial(number - 1);
    }
}
