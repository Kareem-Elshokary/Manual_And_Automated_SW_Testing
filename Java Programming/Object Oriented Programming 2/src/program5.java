abstract class Shape {
    abstract double calculateArea();
    abstract void displayArea();
}

class Circle extends Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    void displayArea() {
        System.out.println("Circle with radius of " + radius + ", area = " + calculateArea());
    }
}


class Rectangle extends Shape {
    public double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length*width;
    }

    @Override
    void displayArea() {
        System.out.println("Rectangle area " + length + "*" + width + " = " + calculateArea());
    }
}

public class program5 {

    public static void main(String[] args) {

        Circle circle = new Circle(6.5);
        circle.displayArea();

        Rectangle rectangle = new Rectangle(10, 5.5);
        rectangle.displayArea();
    }

}
