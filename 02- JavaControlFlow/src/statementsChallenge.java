public class statementsChallenge {

    public static void main(String[] args) {

        int dayNumber = 7;

        switch(dayNumber){
            case 1 -> System.out.println("Day " + dayNumber + ": Sunday");
            case 2 -> System.out.println("Day " + dayNumber + ": Monday");
            case 3 -> System.out.println("Day " + dayNumber + ": Tuesday");
            case 4 -> System.out.println("Day " + dayNumber + ": Wednesday");
            case 5 -> System.out.println("Day " + dayNumber + ": Thursday");
            case 6 -> System.out.println("Day " + dayNumber + ": Friday");
            case 7 -> System.out.println("Day " + dayNumber + ": Saturday");
            default -> System.out.println("Invalid input...");
        }
    }
}
