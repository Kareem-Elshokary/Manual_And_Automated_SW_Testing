/*
    Java Masterclass
    Kareem Abdelkader
    Create a system to manage students, allowing dynamic additions, deletions, and searching
*/


import java.util.ArrayList;
import java.util.Scanner;

//Superclass for student information
class Student {

    private String sName;
    private int sID;
    private int sAge;
    private String sContact;
    private double sGPA;

    // Get & Set student name
    public String getsName() {
        return sName;
    }
    public void setsName(String sName) {
        this.sName = sName;
    }

    // Get & Set student id
    public int getsID() {
        return sID;
    }
    public void setsID(int sID) {
        this.sID = sID;
    }

    // Get & Set student age
    public int getsAge() {
        return sAge;
    }
    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    // Get & Set student contact info
    public String getsContact() {
        return sContact;
    }
    public void setsContact(String sContact) {
        this.sContact = sContact;
    }

    // Get & Set student GPA
    public double getsGPA() {
        return sGPA;
    }
    public void setsGPA(double sGPA) {
        this.sGPA = sGPA;
    }

    // Print student details
    public String sDetails(){
        return (getsID()+ ". "+ getsName()+ ", Age: "+ getsAge()+ ", Contact info: "
                          + getsContact()+ "\n" +"   GPA: "+ getsGPA()+ "\n");
    }

}



//Subclass for student management system
class SMS extends Student {

    //initialization of array lists of students
    ArrayList<Student> studentMS = new ArrayList<>();


    //Method to add a student
    public void addStudent(int id, String name, String contact, int age, double gpa){
        Student studentToAdd = new Student();

        studentToAdd.setsID(id);
        studentToAdd.setsName(name);
        studentToAdd.setsContact(contact);
        studentToAdd.setsAge(age);
        studentToAdd.setsGPA(gpa);

        studentMS.add(studentToAdd);
        System.out.println("The student was added successfully");
    }


    //Method to display all students
    public void showAllStudents(){

        for(Student s : studentMS){
            System.out.println(s.sDetails());
        }
    }


    //Method to remove a student
    public void removeStudent(int id){

        for(Student s : studentMS){

            if(s.getsID() == id){
                studentMS.remove(s);
                System.out.println("Student with ID "+ id + " removed successfully");
            } else {
                System.out.println("Can not find this ID");
            }
        }

    }


    //Method to update a student
    public void updateStudent(int id, int operation){
        Scanner scan = new Scanner(System.in);

        for(Student s : studentMS){

            if(s.getsID() == id){
                switch (operation){
                    case 1:
                        System.out.println("Enter new name: ");
                        s.setsName(scan.nextLine());
                        break;
                    case 2:
                        System.out.println("Enter new age: ");
                        s.setsAge(scan.nextInt());
                        break;
                    case 3:
                        System.out.println("Enter new contact info: ");
                        s.setsContact(scan.nextLine());
                        break;
                    case 4:
                        System.out.println("Enter new GPA: ");
                        s.setsGPA(scan.nextDouble());
                        break;
                    default:
                        System.out.println("Wrong selected action");
                        break;
                }

            } else {
                System.out.println("Can not find this ID");
            }
        }

    }


    //Method to get a specific student by ID
    public void getStudent(int id){

        for(Student s : studentMS){

            if(s.getsID() == id){
                System.out.println(s.sDetails());
            } else {
                System.out.println("Can not find this ID");
            }
        }

    }

}



public class program1 {

    static Scanner input = new Scanner(System.in);
    static SMS sms = new SMS();
    static boolean flag = true;


    public static void main(String[] args) {

        String actionsBlock = """
                Welcome to the student management system......
                1- press (a) to add a student
                2- press (r) to remove a student
                3- press (s) to search for a student
                4- press (u) to update a student info
                5- press (v) to view all student list
                6- press (e) to exit
                """;

        String operationInfo = """
            1. Update Name
            2. Update Age
            4. Update Contact info
            3. Update GPA
            """;


        while (flag) {
            System.out.println("-----------------------------------------------------");
            System.out.print(actionsBlock);
            char action = input.next().charAt(0);

            switch (action) {
                case 'a':
                    System.out.println("----- Add new student -----");

                    System.out.println("Enter the ID: ");
                    int id = input.nextInt();
                    System.out.println("Enter the name: ");
                    String name = input.nextLine();
                    System.out.println("Enter the contact info: ");
                    String contact = input.nextLine();
                    System.out.println("Enter the age: ");
                    int age = input.nextInt();
                    System.out.println("Enter the GPA: ");
                    double gpa = input.nextDouble();

                    sms.addStudent(id, name, contact, age, gpa);
                    break;

                case 'r':
                    System.out.println("----- Remove student -----");

                    System.out.println("Enter the ID: ");
                    int idToRemove = input.nextInt();

                    sms.removeStudent(idToRemove);
                    break;

                case 'v':
                    System.out.println("------ Students list ------");

                    sms.showAllStudents();
                    break;

                case 'u':
                    System.out.println("------ Update student info ------");

                    System.out.println("Enter the ID: ");
                    int idToUpdate = input.nextInt();

                    System.out.print(operationInfo);
                    int choose = input.nextInt();

                    sms.updateStudent(idToUpdate,choose);
                    break;

                case 's':
                    System.out.println("----- Search student -----");

                    System.out.println("Enter the ID: ");
                    int idToSearch = input.nextInt();

                    sms.getStudent(idToSearch);
                    break;

                case 'e':
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }


        }

    }

}
