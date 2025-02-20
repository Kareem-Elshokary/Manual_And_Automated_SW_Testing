/*
 * Java Masterclass
 * Kareem El-Shokary
 * A program to calculate the number of days in a specific month
 * */


public class task8 {

    public static void main(String[] args) {

        int days = getDaysInMonth(2,2012);

        if(days == -1){
            System.out.println("Invalid input...");
        } else {
            System.out.println(days + " Days");
        }
    }

    public static boolean isLeapYear_ (int year){
        //Check for invalid inputs
        if( (year < 1) || (year > 9999)){
            return false;
        }

        // A leap year is a year that is divisible by 4 but not 100.
        // If it's divisible by 100, it has to be divisible by 400.
        if( ((year%4 == 0) && (year%100 != 0)) || ((year%100 == 0) && (year%400 == 0)) ){
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth (int month, int year){

        //Check for invalid inputs
        if( ((year < 1) || (year > 9999)) || ((month < 1) || (month > 12)) ){
            return -1;
        }

        int numberOfDays = 0;
        switch(month){
            case 1, 3, 5, 7, 8, 10, 12 -> numberOfDays = 31;
            case 2 -> {
                if (isLeapYear_(year)) {
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }
            }
            case 4, 6, 9, 11 -> numberOfDays = 30;
        }

        return numberOfDays;
    }

}
