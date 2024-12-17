public class calculateYearsAndDays {

    public static void main(String[] args) {

        printYearsAndDays(561600);
    }

    public static void printYearsAndDays (long minutes){

        //Check for invalid values
        if( minutes < 0 ){
            System.out.println("Invalid Value");
        }

        // 1 day = 24 hours = 1440 minutes
        // 1 year = 365 days = 525,600 minutes
        int year = (int) (minutes / 525600);
        int days = (int) (minutes / 1440) % 365;

        System.out.println(minutes + " min = " + year + " y and " + days + " d" );
    }
}
