/*
 * Java Masterclass
 * Kareem El-Shokary
 * Implement a program that calculates the factorial of a number using a while loop
 * */


public class task5 {

    public static void main(String[] args) {

        int number = 4, res = 1;
        boolean flag = true;

        while(number != 0){
            res *= number;
            number--;
        }

        System.out.printf("Factorial of the number = " + res);

    }


}
