public class Ford extends Car {

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
