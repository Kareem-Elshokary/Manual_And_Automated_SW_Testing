/*
    - The word ‘polymorphism’ means ‘having many forms’.
    - It allows methods to take many forms.
    - Polymorphism types:
        Compiler-Time.
        Run-Time.
*/

class Car {

    // Fields
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    // Constructor
    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    //Methods
    public void startEngine(){
        System.out.println("The car's engine is starting");
    }
    public void accelerate(){
        System.out.println("the car is accelerating");
    }
    public void brake(){
        System.out.println("The car is braking");
    }

    public String getName() {
        return name;
    }
    public int getCylinders() {
        return cylinders;
    }

}


class Ford extends Car {

    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.print("Ford -> ");
        super.startEngine();
    }

    @Override
    public void accelerate() {
        System.out.print("Ford -> ");
        super.accelerate();
    }

    @Override
    public void brake() {
        System.out.print("Ford -> ");
        super.brake();
    }

}


class Mitsubishi extends Car {

    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.print("Mitsubishi -> ");
        super.startEngine();
    }

    @Override
    public void accelerate() {
        System.out.print("Mitsubishi -> ");
        super.accelerate();
    }

    @Override
    public void brake() {
        System.out.print("Mitsubishi -> ");
        super.brake();
    }

}


public class Polymorphism {

    public static void main(String[] args) {

//        Car car = new Car("Base", 4);
//        car.startEngine();
//        car.accelerate();
//        car.brake();
//        System.out.println(car.getCylinders());
        Car car;

        car = new Mitsubishi("Outlander VRX 4WD", 4);
        car.startEngine();
        car.accelerate();
        car.brake();
        System.out.println(car.getCylinders());

        car = new Ford("Falcon",8);
        car.startEngine();
        car.accelerate();
        car.brake();
        System.out.println(car.getCylinders());
    }

}
