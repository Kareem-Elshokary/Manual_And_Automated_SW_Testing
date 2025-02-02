/*
 * Java Masterclass
 * Kareem El-Shokary
 * Implement a basic calculator that performs addition, subtraction, multiplication, and division
 * */


import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Get operands
        System.out.println("Enter first operand: ");
        double operand1 = scan.nextDouble();
        System.out.println("Enter second operand: ");
        double operand2 = scan.nextDouble();

        //Get operator
        System.out.println("Enter operator (+,-,*,/): ");
        char operator = scan.next().charAt(0);

        double res;

        switch (operator){
            case '+':
                res = operand1 + operand2;
                System.out.printf(operand1 +" + "+ operand2 +" = "+ res);
                break;
            case '-':
                res = operand1 - operand2;
                System.out.printf(operand1 +" - "+ operand2 +" = "+ res);
                break;
            case '*':
                res = operand1 * operand2;
                System.out.printf(operand1 +" * "+ operand2 +" = "+ res);
                break;
            case '/':
                res = operand1 / operand2;
                System.out.printf(operand1 +" / "+ operand2 +" = "+ res);
                break;
            default:
                System.out.printf("Invalid operator");
                break;
        }

    }


}
