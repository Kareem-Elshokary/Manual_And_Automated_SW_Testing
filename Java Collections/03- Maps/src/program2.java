/*
    Java Masterclass
    Kareem Abdelkader
    Create a search feature that keeps track of the last 5 searches a user made
*/


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class SearchHistory {

    private int maxSize = 5;
    LinkedHashMap<String, Integer> searchHistory;

    SearchHistory(){
        //For protection to ensure that the last 5 searches are stored
        this.searchHistory = new LinkedHashMap<>(maxSize, 0.75f, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > maxSize;
            }
        };
    }

    public void addSearch(String url){
        searchHistory.put(url, searchHistory.getOrDefault(url, 0) + 1);
        System.out.println("URL \"" + url + "\" was added");
    }

    public void displaySearchHistory(){
        for ( Map.Entry<String, Integer> e : searchHistory.entrySet() ){
            System.out.println(e);
        }
    }

}


public class program2 {

    public static void main(String[] args) {

        SearchHistory history = new SearchHistory();
        Scanner scan = new Scanner(System.in);

        String textBlock = """
                1. Search
                2. History Search
                3. Close
                
                Choose an Option:
                """;

        while (true){

            System.out.print(textBlock);
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter search term: ");
                    String term = scan.nextLine();
                    history.addSearch(term);
                    break;
                case 2:
                    history.displaySearchHistory();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid Option");
            }

        }


    }

}
