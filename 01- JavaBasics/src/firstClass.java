/*
* Java Masterclass
* Description: Java Basics
* Author     : Kareem Abdelkader
* */

public class firstClass {

    public static void main(String[] args) {

        // Variables
        /*
        * datatype varName;   declaration, variable can only be declared once
        * can declare multiple variables of the same data type in a single statement by using a comma
        */

        // Primitive Data Types
        System.out.println("Integers Data Types");
        System.out.println("    byte... " +"range: " + Byte.MIN_VALUE +" to "+ Byte.MAX_VALUE);
        System.out.println("    short... " +"range: " + Short.MIN_VALUE +" to "+ Short.MAX_VALUE);
        System.out.println("    int... " +"range: " + Integer.MIN_VALUE +" to "+ Integer.MAX_VALUE);
        System.out.println("    long... " +"range: " + Long.MIN_VALUE +" to "+ Long.MAX_VALUE);

        System.out.println("Real Data Types");
        System.out.println("    float... " +"range: " + Float.MIN_VALUE +" to "+ Float.MAX_VALUE);
        System.out.println("    double... " +"range: " + Double.MIN_VALUE +" to "+ Double.MAX_VALUE);

        System.out.println("Character Data Type");
        System.out.println("    char...");

        System.out.println("Boolean Data Types");
        System.out.println("    boolean... true/false");

        // Variable Initialization
        int   myIntVar = 10;
        float myFloatVar = 3.142f;
        char  myCharVar = 'K';

        System.out.println("Variables are: " + myIntVar + myFloatVar + myCharVar);

        // Type Casting
        double myDoubleVar = myIntVar + 5;       //Implicit
        int result = (int) (myFloatVar + 5);     //Explicit
        System.out.println(myDoubleVar);
        System.out.println(result);
    }
}
