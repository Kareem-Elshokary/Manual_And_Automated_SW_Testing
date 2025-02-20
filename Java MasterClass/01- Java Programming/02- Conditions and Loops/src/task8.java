/*
 * Java Masterclass
 * Kareem El-Shokary
 * Print the Fibonacci sequence up to n terms using a loop
 * */


import java.util.Scanner;

public class task8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter the number of terms: ");
        int numTerms = scan.nextInt();

        int t1 = 0, t2 = 1, nextTerm;

        System.out.print("Fibonacci series 0, 1, ");
        for(int i = 0; i < numTerms-2 ; i++){
            nextTerm = t1 + t2;
            System.out.print(nextTerm +", ");
            t1 = t2;
            t2 = nextTerm;
        }

    }
}
