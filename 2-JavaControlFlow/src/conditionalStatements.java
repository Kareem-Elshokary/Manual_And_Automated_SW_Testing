/*
* Java Masterclass
* Conditional Statements in Java
* */

public class conditionalStatements {
    public static void main(String[] args) {

        /*
         * if-else statement
         * if(condition1){
         *    statements;
         * } else if (condition2) {
         *    statements;
         * } else {
         *    statements;
         * }
         * */
        int gradeA = 85, gradeB = 75, gradeC = 65, gradeD = 50, gradeF = 49;
        boolean pass = true;
        float myGrade = 90.23f;

        if (pass){
            System.out.println("Congratulations... you passed");

            if(myGrade >= gradeA){
                System.out.println("Your grade is A " + myGrade);
            }
            else if ((myGrade >= gradeB) && (myGrade < gradeA)) {
                System.out.println("Your grade is B " + myGrade);
            }
            else if ((myGrade >= gradeC) && (myGrade < gradeB)) {
                System.out.println("Your grade is C " + myGrade);
            } else {
                System.out.println("Your grade is D " + myGrade);
            }
        }
        else {
            System.out.println("Sorry... you failed");
        }


        /*
         * Ternary Operator --> operand1 ? op2 : op3;
         * if the operand1 is true, op2 will be returned
         * if the operand1 is false, op3 will be returned
         * */
        boolean checkVar = true;
        int checkVar1 = checkVar ? 10 : 20;
        System.out.println(checkVar1);


        /*
        * switch case statement
        * switch(var) {         //var can be any data type except float/double/long/boolean
        *   case value1 :
        *       code;
        *       break;          //using break to avoid continue through all cases
        *   case value2 :
        *       code;
        *       break;
        *   default :           //Act as else
        *       code;
        *       break;
        * }
        * */
        String month = "May";
        switch (month){
            case "January": case "February": case "March":
                System.out.println(month + " is in 1st quarter");
                break;
            case "April": case "May": case "June":
                System.out.println(month + " is in 2nd quarter");
                break;
            case "July": case "August": case "September":
                System.out.println(month + " is in 3rd quarter");
                break;
            case "October": case "November": case "December":
                System.out.println(month + " is in 4th quarter");
                break;
        }
    }
}
