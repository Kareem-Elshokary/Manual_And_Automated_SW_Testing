/*
  - Abstraction is the process of hiding the implementation details and only showing
    the essential functionality or features to the user.
  - Implementation of abstraction is done using abstract classes and interface.
*/


abstract class Shape {
    String name;
    String color;

    Shape(String n, String c){
        name = n;
        color = c;
    }

    abstract double area();
    abstract String details();
}


class Circle extends Shape {

    //Fields
    double radius;

    //Constructor
    Circle(String name, String color, double r){
        super(name,color);
        radius = r;
    }


    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String details() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", radius=" + radius +
                "} " + super.toString();
    }
}


class Rectangle extends Shape {

    //Fields
    double length, width;

    //Constructor
    Rectangle(String name, String color, double l, double w){
        super(name, color);
        length = l;
        width = w;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    public String details() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}


public class Abstraction {

    public static void main(String[] args) {

        Shape shape1 = new Circle("Circle", "Red", 6);
        Shape shape2 = new Rectangle("Rectangle", "Yellow", 10, 4);

        System.out.println(shape1.details());
        System.out.println(shape1.area());

        System.out.println(shape2.details());
        System.out.println(shape2.area());
    }

}
