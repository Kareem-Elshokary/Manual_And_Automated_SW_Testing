import java.util.Scanner;

public class simpleCalculator {

    public static void main(String[] args) {

        startCalculator();
    }

    public static void startCalculator (){

        Scanner input = new Scanner(System.in);
        int result , firstOp, secondOp;
        char operator, loop;
        boolean isContinue = true;

        while (isContinue){
            System.out.println("Welcome... ");
            System.out.println("Enter first operand: ");
            firstOp = input.nextInt();
            System.out.println("Enter operator (+,-,*,/,%): ");
            operator = input.next().charAt(0);
            System.out.println("Enter second operand: ");
            secondOp = input.nextInt();

            switch (operator){
                case '+':
                    result = firstOp + secondOp;
                    System.out.println(firstOp +" "+ operator +" "+ secondOp + " = " + result);
                    break;
                case '-':
                    result = firstOp - secondOp;
                    System.out.println(firstOp +" "+ operator +" "+ secondOp + " = " + result);
                    break;
                case '*':
                    result = firstOp * secondOp;
                    System.out.println(firstOp +" "+ operator +" "+ secondOp + " = " + result);
                    break;
                case '/':
                    if(secondOp == 0){
                        System.out.println("Invalid.. can not divide by zero");
                    } else {
                        result = firstOp / secondOp;
                        System.out.println(firstOp + " " + operator + " " + secondOp + " = " + result);
                    }
                    break;
                case '%':
                    result = firstOp % secondOp;
                    System.out.println(firstOp +" "+ operator +" "+ secondOp + " = " + result);
                    break;
                default: System.out.println("Please enter a valid operator"); break;
            }

            System.out.println("To exist press q... To continue press c");
            loop = input.next().charAt(0);
            if(loop == 'q'){
                isContinue = false;
            }
        }

    }

}
