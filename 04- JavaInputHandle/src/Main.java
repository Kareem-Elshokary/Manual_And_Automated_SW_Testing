import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String myName = "Kareem"; int myAge = 23;

        // Java Output
        System.out.print("Welcome.... \n");
        System.out.println("My name is " + myName);
        System.out.printf("My age is %d \n",myAge);

        // Java Input
        Scanner input = new Scanner(System.in);     // Scanner object
        System.out.println("What is your job? ");
        String yourJobTitle = input.nextLine();
        System.out.println("What is your salary? ");
        int yourSalary = input.nextInt();
        System.out.println("Your job title is "+ yourJobTitle + ", And your salary = "+ yourSalary);

        //Example 1
//        int sum = get5ValidNumbers();
//        System.out.println("The sum of numbers = " + sum);

        //Example 2
        System.out.println("The Max. number is " + getTheMaxNumber());

    }

    public static int get5ValidNumbers (){

        int sum = 0, count = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome... enter 5 numbers");
        while (count <= 5){
            System.out.println("Enter num"+count+": ");
            String input = scanner.nextLine();
            try {
                sum += Integer.parseInt(input);
                count++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input");
            }
        }

        return sum;
    }

    public static int getTheMaxNumber(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int numOne = input.nextInt();
        System.out.println("Enter the second number: ");
        int numTwo = input.nextInt();
        int maxNum = numOne > numTwo ? numOne : numTwo;

        return maxNum;
    }
}
