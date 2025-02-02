
public class OOP_Concepts {

    /*
        - OOPs (Object-Oriented Programming) is a programming paradigm based on the concept of objects,
        which can contain data in the form of fields (attributes or properties) and code in the form of procedures
        (methods or functions).
        - In Java, OOPs concepts include encapsulation, inheritance, polymorphism, and abstraction.
    */


    /*
       Class is the blueprint of an object. It is used to create objects.
       No memory is allocated when a class is declared.
       A class can only be declared once.
    */

    //Properties
    String studentName;
    int studentID;
    double studentDegree;


    //Methods
    public void setStudent(String name, int id, double degree){
        studentName = name;
        studentID   = id;
        studentDegree = degree;
    }

    public void getStudent(){
        System.out.println(studentID);
        System.out.println(studentName);
        System.out.println(studentDegree);
    }

}


class Main {

    public static void main(String[] args) {

        /*
        An object is a basic unit of Object-Oriented Programming that represents real-life entities
        Memory is allocated as soon as an object is created.
        Objects can be created many times as per requirement.
        */
        OOP_Concepts student1 = new OOP_Concepts();
        OOP_Concepts student2 = new OOP_Concepts();
        OOP_Concepts student3 = new OOP_Concepts();

        student1.setStudent("Kareem Abdelkader", 1, 90);
        student1.getStudent();

    }

}