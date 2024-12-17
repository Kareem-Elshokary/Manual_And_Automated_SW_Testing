/*
 * Java Masterclass
 * Author     : Kareem Abdelkader
 * Description: Convert from kilometersPerHour to rounded milesPerHour
 * */

public class speedConverter {

    public static void main(String[] args) {
        printConvert(10.25);
    }

    public static long toMilesPerHour (double kilometersPerHour){

        if (kilometersPerHour < 0){         // Check for invalid inputs (less than 0)
            return -1;
        } else {                            // Convert from kilometers to miles, and round the value
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConvert (double kilometersPerHour){
        // Calculate miles
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour+ " Km/h = " + milesPerHour + " mi/h");
        }
    }

}

