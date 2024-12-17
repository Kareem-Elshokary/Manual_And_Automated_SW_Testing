/*
 * Java Masterclass
 * Description: OOP - Polymorphism
 * Author     : Kareem Abdelkader
 *
 * Polymorphism allows objects/methods to take on multiple forms through overloading,
 * overriding, abstraction, or interface.
 *
 * */

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Base", 4);
        car.startEngine();
        car.accelerate();
        car.brake();
        System.out.println(car.getCylinders());

        car = new Mitsubishi("Outlander VRX 4WD", 4);
        car.startEngine();
        car.accelerate();
        car.brake();

        car = new Holden("Commodore", 6);
        car.startEngine();
        car.accelerate();
        car.brake();

        car = new Ford("Falcon",8);
        car.startEngine();
        car.accelerate();
        car.brake();
        System.out.println(car.getCylinders());

    }
}
