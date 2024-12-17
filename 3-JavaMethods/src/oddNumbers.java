public class oddNumbers {

    public static void main(String[] args) {

        int result = sumOdd(1,100);
        if(result == -1){
            System.out.println("Invalid values....");
        } else {
            System.out.println("the sum = " + result);
        }
    }

    public static boolean isOdd(int number) {

        //Check for invalid values
        if (number < 0) {
            return false;
        }

        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd(int start, int end) {

        int sum = 0;

        if( (end >= start) && (start > 0) ) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        } else {
            return -1;
        }

        return sum;
    }

}