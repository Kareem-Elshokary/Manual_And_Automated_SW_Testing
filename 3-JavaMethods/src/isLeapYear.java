/*
 * Java Masterclass
 * Author     : Kareem Abdelkader
 * Description: Check if year is leap year or not
 * */

public class isLeapYear {
    public static void main(String[] args) {
        boolean leapYear = isLeapYear_ (2015);
        System.out.println(leapYear);
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
}
