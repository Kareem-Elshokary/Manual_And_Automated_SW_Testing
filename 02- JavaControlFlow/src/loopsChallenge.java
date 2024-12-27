public class loopsChallenge {

    public static void main(String[] args) {

        int sumDigit = sumDigits(2659);
        if(sumDigit == -1){
            System.out.println("Invalid input...");
        } else {
            System.out.println("Sum of digits = " + sumDigit);
        }
    }

    public static int sumDigits (int number){
        //Check for invalid inputs
        if(number < 0){
            return -1;
        }

        int sum = 0;
        while(number != 0){
            double digit = (double) number / 10;
            int remDigit = number % 10;
            sum += remDigit;
            number /= 10;
        }

        return sum;
    }
}
