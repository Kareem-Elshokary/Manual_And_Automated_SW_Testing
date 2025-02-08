/*
*  Java Masterclass
*  Kareem Abdelkader
*  Implement a system that ensures all registered usernames are unique
*/


import java.util.HashSet;
import java.util.Scanner;

public class program1 {

    public static void main(String[] args) {

            HashSet<String> usernames = new HashSet<>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Enter a username (or type 'exit' to stop): ");
                String username = scanner.nextLine().trim();

                if (username.equalsIgnoreCase("exit")) {
                    break;
                }

                if (usernames.contains(username)) {
                    System.out.println("This username is already taken. Try another one.");
                } else {
                    usernames.add(username);
                    System.out.println("Username added successfully!");
                }
            }

            System.out.println("\nUnique Usernames Collected: " + usernames);
            scanner.close();
    }

}
