public class Car {

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
