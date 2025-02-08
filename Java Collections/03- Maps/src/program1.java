/*
    Java Masterclass
    Kareem Abdelkader
    Create a system that stores and retrieves student grades efficiently
*/


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class GradeTracker {

    HashMap<String, Double> studentGrades = new HashMap<>();

    GradeTracker (){
        this.studentGrades = new HashMap<>();
    }

    public void addStudents(String name, double grade){
        studentGrades.put(name, grade);
        System.out.println("Student: " + studentGrades.get(name) + " added Successfully");
    }

    public void displayStudents(){
        for (Map.Entry<String, Double> e : studentGrades.entrySet()){
            System.out.println(e);
        }
    }

    public void updateStudents(String name, double newGrade){
        if( studentGrades.containsKey(name) ){
            studentGrades.put(name, newGrade);
            System.out.println("New grade for " + name + " is added successfully");
            return;
        }

        System.out.println("Student not found! ");
    }

    public void searchGrade(String name){
        if( studentGrades.containsKey(name) ){
            System.out.println(studentGrades.getOrDefault(name, null));
            return;
        }

        System.out.println("Student not found! ");
    }

}


public class program1 {

    public static void main(String[] args) {

        GradeTracker tracker = new GradeTracker();
        Scanner scan = new Scanner(System.in);

        String textBlock = """
                Options:
                1. Add Student
                2. Get Student Grade
                3. Update Student Grade
                4. Display All Grades
                5. Exit
                
                Choose an option:
                """;


        while (true){
            System.out.print(textBlock);

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter student grade: ");
                    double grade = scan.nextDouble();
                    tracker.addStudents(name, grade);
                    break;

                case 2:
                    System.out.print("Enter student name: ");
                    String searchName = scan.nextLine();
                    tracker.searchGrade(searchName);
                    break;

                case 3:
                    System.out.print("Enter student name: ");
                    String updateName = scan.nextLine();
                    System.out.print("Enter new grade: ");
                    double newGrade = scan.nextDouble();
                    tracker.updateStudents(updateName, newGrade);
                    break;

                case 4:
                    tracker.displayStudents();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid option");
            }

        }

    }

}
