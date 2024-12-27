import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Challenge1 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();


        while (flag){

            //Get the action

            printActions();
            switch (Integer.parseInt(scanner.nextLine())){
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

    }

    public static void printActions(){

        String textBlock = """
                Available Actions:
                0 -> to exit
                1 -> Insert items to the list
                2 -> Remove items from the list
                Enter the action number:""";
        System.out.println(textBlock + " ");
    }

    public static void addItems(ArrayList<String> groceries){

        System.out.println("Enter items to insert [separate items by comma]: ");
        String[] items = scanner.nextLine().split(",");

        //Check for repeated items
        for(String i : items){
            String trimmed = i.trim();
            if (!groceries.contains(trimmed)){
                groceries.add(trimmed);
            }
        }

    }

    public static void removeItems(ArrayList<String> groceries){

        System.out.println("Enter items to remove [separate items by comma]: ");
        String[] items = scanner.nextLine().split(",");

        for(String i : items){
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }

    }


}
