/*
 * Java Masterclass
 * Kareem El-Shokary
 * Create an overloaded method for calculating the area of a circle, rectangle, and triangle
 * */


public class task3 {

    public static void main(String[] args) {
        area(12);
        area(5,3);
        area(6,3,true);
    }

    //Method to calculate the area of a circle
    public static void area(double radius){
        double area = Math.PI * radius;
        System.out.println("Area = " + area);
    }

    //Method to calculate the area of a rectangle
    public static void area(double length, double width){
        double area = length * width;
        System.out.println("Area = " + area);
    }

    //Method to calculate the area of a triangle
    public static void area(double height, double base, boolean isTriangle){
        double area = 0.5 * height * base;
        System.out.println("Area = " + area);
    }

}
