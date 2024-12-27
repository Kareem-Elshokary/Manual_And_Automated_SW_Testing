/*
 * Java Masterclass
 * Description: OOP - Encapsulation
 * Author     : Kareem Abdelkader
 *
 * Encapsulation ensures that the internal representation of an object (fields & methods)
 * is hidden, and access to that data is controlled through well-defined interfaces.
 *
 * */

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Kareem A. Mohamed", "23/7/2001",
                "Arabic - Math - English", 11);

        System.out.println(student);
    }
}
