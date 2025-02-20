/*
 * Java Masterclass
 * Kareem El-Shokary
 * Create a program to find the sum of all digits of a number using a loop
 * */


public class task6 {

    public static void main(String[] args) {

        int number = 5648, sum = 0;

        do {
            sum += number%10;
            number /= 10;
        } while (number != 0);

        System.out.printf("Sum of digits = " + sum);
    }

}
