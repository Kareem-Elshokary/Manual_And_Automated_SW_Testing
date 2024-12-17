public class Main {

    /*
    * Methods in Java:
    *
    * accessModifier returnType methodName (Parameters) {
    *   body;
    * }
    *
    * */

    public static void main(String[] args) {
//        System.out.println("Reversed = " + reverse(123));
//        System.out.println("No. of digits = " + getDigitCount(123));

        numberToWords(0);
    }

    public static int reverse (int number){

        int revNumber = 0;

        if(number == 0){
            return 0;
        }

        while(number != 0){
            revNumber += (number % 10);  //assign the last digit in number variable into reverse variable
            number /= 10;                //get the next digit
            if (!(number == 0)){
                revNumber *= 10;         //check for number of digits
            }
        }

        return revNumber;
    }

    public static int getDigitCount (int number){
        int count = 0;

        //check for invalid values
        if(number < 0){
            return -1;
        }

        do{                     //Check for the number of digits in tne number
            number /= 10;
            count++;
        } while(number != 0);

        return count;
    }

    public static void numberToWords (int number){

        //Check for number of digits & invalid value
        int numDigits = getDigitCount(number);
        if(numDigits == -1){
            System.out.println("Invalid Value");
        }

        //reverse the number to avoid print in reverse order
        int revNumber = reverse(number);

        int checkNum, count = 0;

        while( revNumber != 0){
            checkNum = revNumber % 10;
            revNumber /= 10;

            switch(checkNum){
                case 0: System.out.print("Zero "); break;
                case 1: System.out.print("One "); break;
                case 2: System.out.print("Two "); break;
                case 3: System.out.print("Three "); break;
                case 4: System.out.print("Four "); break;
                case 5: System.out.print("Five "); break;
                case 6: System.out.print("Six "); break;
                case 7: System.out.print("Seven "); break;
                case 8: System.out.print("Eight "); break;
                case 9: System.out.print("Nine "); break;
            }

            count++;
        }

        //check for any reversed number with leading zeroes (e.g. the reversed number for 100 is 001).
        while(numDigits > count){
            System.out.print("Zero ");
            count++;
        }

    }
}
